package com.lin.commonspring.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiWrapView {

    @JsonProperty("code")
    private int code = 200;

    @JsonProperty("msg")
    private String msg = "成功";

    @JsonProperty("data")
    private Object data;

    public ApiWrapView() {
    }

    public ApiWrapView(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
