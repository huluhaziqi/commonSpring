package com.lin.commonspring.exception;

public class AbstractBaseException extends RuntimeException {

    private static final long serialVersionUID = 23794273982374L;

    private int code;

    private String msg;

    public AbstractBaseException(int code, String msg) {
        super(msg, null, false, false);
        this.code = code;
        this.msg = msg;
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
