package com.example.administrator.retrofitdemo.OkHttp;

import com.example.administrator.retrofitdemo.Interface.APIInterface;
import com.example.administrator.retrofitdemo.bean.ProgramInfo;
import com.example.administrator.retrofitdemo.bean.Update;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/10/19.
 */

public class RetrofitUtil {
    private static RetrofitUtil retrofitUtil;
    private Gson gson;
    private Retrofit retrofit;
    private static final String BASE_URL = "http://10.5.6.107:18080/";

    private RetrofitUtil() {
        gson = new GsonBuilder()
                //配置你的Gson
                .setDateFormat("yyyy-MM-dd hh:mm:ss")
                .create();

        retrofit = new Retrofit.Builder()
                .client(OkHttpUtil.getInatance().getOkHttpClient())//设置okhttp
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//提供RxJava支持，如果没有提供响应的支持(RxJava,Call),则会跑出异常。
                .addConverterFactory(GsonConverterFactory.create(gson))//因为这里和后台是通过json交互,所以需要创建一个GsonConverterFactory,可以添加多种序列化Factory
                .baseUrl(BASE_URL)
                .build();
    }

    public static RetrofitUtil getInatance() {
        if (retrofitUtil == null) {
            synchronized (RetrofitUtil.class) {
                if (retrofitUtil == null) {
                    retrofitUtil = new RetrofitUtil();
                }
            }
        }
        return retrofitUtil;
    }

    /**
     * 获取Retrofit
     * @return
     */
    public Retrofit getRetrofit() {
        return retrofit;
    }

    /**
     * 异步获取节目单
     * @param al_id
     * @param hid
     * @param uid
     * @param callback
     */
    public void getProgramInfo(String al_id,String hid,String uid,Callback callback){
        APIInterface service = retrofit.create(APIInterface.class);
        Call<ProgramInfo> model = service.getProgramInfo(al_id,hid,uid);
        model.enqueue(callback);
    }

    /**
     * 异步获取升级信息
     * @param channel_id
     * @param app_id
     * @param app_version
     * @param mac
     * @param callback
     */
    public void getUpdatesInfo(String channel_id,String app_id,String app_version,String mac,Callback callback){
        APIInterface service = retrofit.create(APIInterface.class);
        Call<Update> model = service.getUpdate(channel_id,app_id,app_version,mac);
        model.enqueue(callback);
    }
}
