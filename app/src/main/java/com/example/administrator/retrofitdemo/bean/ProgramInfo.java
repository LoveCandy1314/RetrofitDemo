package com.example.administrator.retrofitdemo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/19.
 */

public class ProgramInfo {

    /**
     * status : 0
     * desc : 成功
     * data : [{"time":"09:20","text":"新闻联播"},{"time":"10:20","text":"足球"}]
     */

    private int status;
    private String desc;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * time : 09:20
         * text : 新闻联播
         */

        private String time;
        private String text;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "time='" + time + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ProgramInfo{" +
                "status=" + status +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }
}
