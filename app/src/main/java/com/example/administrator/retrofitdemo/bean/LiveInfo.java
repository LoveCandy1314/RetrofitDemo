package com.example.administrator.retrofitdemo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/19.
 */

public class LiveInfo  {


    /**
     * status : 0
     * desc : 成功
     * data : {"al_id":"0","al_parent":"#","text":"央视","childen":[{"al_id":"1","al_childen":"1","text":"cctv1"},{"al_id":"2","al_childen":"2","text":"cctv2"}]}
     */

    private int status;
    private String desc;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * al_id : 0
         * al_parent : #
         * text : 央视
         * childen : [{"al_id":"1","al_childen":"1","text":"cctv1"},{"al_id":"2","al_childen":"2","text":"cctv2"}]
         */

        private String al_id;
        private String al_parent;
        private String text;
        private List<ChildenBean> childen;

        public String getAl_id() {
            return al_id;
        }

        public void setAl_id(String al_id) {
            this.al_id = al_id;
        }

        public String getAl_parent() {
            return al_parent;
        }

        public void setAl_parent(String al_parent) {
            this.al_parent = al_parent;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public List<ChildenBean> getChilden() {
            return childen;
        }

        public void setChilden(List<ChildenBean> childen) {
            this.childen = childen;
        }

        public static class ChildenBean {
            /**
             * al_id : 1
             * al_childen : 1
             * text : cctv1
             */

            private String al_id;
            private String al_childen;
            private String text;

            public String getAl_id() {
                return al_id;
            }

            public void setAl_id(String al_id) {
                this.al_id = al_id;
            }

            public String getAl_childen() {
                return al_childen;
            }

            public void setAl_childen(String al_childen) {
                this.al_childen = al_childen;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            @Override
            public String toString() {
                return "ChildenBean{" +
                        "al_id='" + al_id + '\'' +
                        ", al_childen='" + al_childen + '\'' +
                        ", text='" + text + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "al_id='" + al_id + '\'' +
                    ", al_parent='" + al_parent + '\'' +
                    ", text='" + text + '\'' +
                    ", childen=" + childen +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LiveInfo{" +
                "status=" + status +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }
}
