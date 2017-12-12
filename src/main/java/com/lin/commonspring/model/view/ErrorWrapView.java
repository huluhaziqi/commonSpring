package com.lin.commonspring.model.view;

public class ErrorWrapView {

    private int code;

    private String msg;

    public ErrorWrapView(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ErrorWrapView() {
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
}
