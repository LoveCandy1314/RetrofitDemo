package com.example.administrator.retrofitdemo.OkHttp;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by lichao on 2017/10/23.
 * Okhttp 封装
 */

public class OkHttpUtil {
    private OkHttpClient client;
    private static OkHttpUtil okHttpUtil;
    public static OkHttpUtil getInatance() {
        if (okHttpUtil == null) {
            synchronized (OkHttpUtil.class) {
                if (okHttpUtil == null) {
                    okHttpUtil = new OkHttpUtil();
                }
            }
        }
        return okHttpUtil;
    }

    private OkHttpUtil(){
        client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))//注册一个本地应用拦截器,这里有好几个状态． BASIC / HEADERS / BODY　公共参数，头信息，日志拦截
                .retryOnConnectionFailure(true)//是否自动重连
                .connectTimeout(15, TimeUnit.SECONDS)//设置连接超时
                .readTimeout(10,TimeUnit.SECONDS)//设置读超时
                .writeTimeout(10,TimeUnit.SECONDS)//设置写超时
                .addNetworkInterceptor(new LoggingInterceptor())//注册一个网络拦截器
                .build();//构建okhttp
    }

    /**
     * 获取OkhttpClient对象
     * @return
     */
    public OkHttpClient getOkHttpClient(){
        if (client==null){
            throw  new NullPointerException("please getInatance OkHttpUtil");
        }else {
            return  this.client;
        }
    }
}
