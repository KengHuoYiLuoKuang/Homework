package com.sms.wyy;

import java.util.List;

public class QueryResultInfo {
    private int error_code;
    private String reason;
    private List<Result> result;


    public List<Result> getResult() {
        return result;
    }
    public void setResult(List<Result> result) {
        this.result = result;
    }


    public class Result {

        private String content;
        private String hashId;
        private int unixtime;
        private String updatetime;



        @Override
            public String toString() {
                return "DetailsList [content=" + content + ", hashId=" + hashId + ", unixtime=" + unixtime + ", updatetime=" + updatetime+"]";
            }

        public void setContent(String content) {
            this.content = content;
        }
        public String getContent() {
            return content;
        }

    }

    @Override
    public String toString() {
        return "QueryResultInfo [error_code=" + error_code + ", reason=" + reason + ", result=" + result.toString() + "]";
    }

}

