package com.lin.commonspring.exception;

public class UserStateException extends AbstractBaseException {

    public UserStateException(UserStateExceptionEnum userStateExceptionEnum, String msg) {
        super(userStateExceptionEnum.code, msg);
    }

    public UserStateException(UserStateExceptionEnum exceptionEnum) {
        super(exceptionEnum.code, exceptionEnum.msg);
    }

    public enum UserStateExceptionEnum {
        USER_NOT_LOGIN(100000, "用户未登录"),
        USER_LOGIN_EXPIRED(100001, "用户登录过期，请重新登录"),
        USER_NOT_EXIST(100002, "用户不存在"),
        USER_HOST_APPLICATION_NEEDED(100003, "host application needed"),
        USER_ADMIN_NEEDED(100004, "admin needed"),
        USER_COOKIE_EXPIRED(100005, "USER_COOKIE_EXPIRED"),
        USER_COMMON_ERROR(100006, "通用错误"),
        USER_FROZEN(100007, "用户封禁"),
        USER_PROTOCOL_LOCK(100008, "同意相关协议");

        private int code;

        private String msg;

        UserStateExceptionEnum(int code, String msg) {

        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
