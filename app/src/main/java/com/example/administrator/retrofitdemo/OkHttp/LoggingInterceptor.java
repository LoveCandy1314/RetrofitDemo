package com.example.administrator.retrofitdemo.OkHttp;

import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by lichao on 2017/10/23.
 * 自定义的okhttp拦截器
 */

public  class LoggingInterceptor implements Interceptor {
    @Override public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();

        long t1 = System.nanoTime();
        Log.d("lichao","request.url is " +  request.url() + " chain.connection( )  " + chain.connection() + "  request.headers() " +request.headers());
        Response response = chain.proceed(request);
        long t2 = System.nanoTime();
        Log.d("lichao","Received.url is " +  request.url() + " cost time is "+(t2 - t1) / 1e6d);
        return response;
    }
}

