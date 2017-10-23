package com.example.administrator.retrofitdemo.bean;

/**
 * Created by Administrator on 2017/10/23.
 */

public class Update {

    /**
     * status : 0
     * desc : 成功
     * need_update : 1
     * apk_url : http://voole.com/upgrade/apk/sssss
     * app_version : 12
     */

    private int status;
    private String desc;
    private int need_update;
    private String apk_url;
    private int app_version;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getNeed_update() {
        return need_update;
    }

    public void setNeed_update(int need_update) {
        this.need_update = need_update;
    }

    public String getApk_url() {
        return apk_url;
    }

    public void setApk_url(String apk_url) {
        this.apk_url = apk_url;
    }

    public int getApp_version() {
        return app_version;
    }

    public void setApp_version(int app_version) {
        this.app_version = app_version;
    }

    @Override
    public String toString() {
        return "Update{" +
                "status=" + status +
                ", desc='" + desc + '\'' +
                ", need_update=" + need_update +
                ", apk_url='" + apk_url + '\'' +
                ", app_version=" + app_version +
                '}';
    }
}
