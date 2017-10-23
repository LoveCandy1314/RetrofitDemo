package com.example.administrator.retrofitdemo.Interface;

import com.example.administrator.retrofitdemo.bean.ProgramInfo;
import com.example.administrator.retrofitdemo.bean.Update;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2017/9/28.
 */

public interface APIInterface {
    /**
     * 获取节目单
     * @param al_id
     * @param hid
     * @param uid
     * @return
     */
    @POST("/program/{al_id}/{hid}/{uid}")
    Call<ProgramInfo> getProgramInfo(@Path("al_id") String al_id, @Path("hid") String hid, @Path("uid") String uid);

    /**
     * 获取升级
     * @param channel_id
     * @param app_id
     * @param app_version
     * @param mac
     * @return
     */
    @GET("/upgrade/{channel_id}/{app_id}/{app_version}/{mac}")
    Call<Update> getUpdate(@Path("channel_id") String channel_id, @Path("app_id") String app_id, @Path("app_version") String app_version, @Path("mac") String mac);

    /**
     * method 表示请的方法，不区分大小写
     * path表示路径
     * hasBody表示是否有请求体
     * @param channel_id
     * @param app_id
     * @return
     */
    @HTTP(method = "get", path = "/upgrade/{channel_id}/{app_id}",hasBody = false)
    Call<Update> getUpdate(@Path("channel_id") String channel_id, @Path("app_id") String app_id);

    /**
     * 使用全路径复写baseUrl，适用于非统一baseUrl的场景。
     * @param url
     * @return
     */
    @GET
    Call<Update> getUpdate(@Url String url );
}