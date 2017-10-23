package com.example.administrator.retrofitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.administrator.retrofitdemo.OkHttp.RetrofitUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends Activity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                RetrofitUtil.getInatance().getProgramInfo("9", "4", "1", new Callback() {
                    @Override
                    public void onResponse(Call call, Response response) {
                        Log.d("lichao","success....." + response.body().toString());
                    }

                    @Override
                    public void onFailure(Call call, Throwable t) {
                        Log.d("lichao","fail....." +t.getMessage());
        //                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT).show();
                        textView.setText(t.getMessage());
                    }
                });


    }
}
