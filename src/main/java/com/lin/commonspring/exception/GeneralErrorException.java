package com.lin.commonspring.exception;

public class GeneralErrorException extends AbstractBaseException {

    public GeneralErrorException(int code, String msg) {
        super(code, msg);
    }

    public GeneralErrorException(GeneralErrorExceptionEnum errorExceptionEnum) {
        super(errorExceptionEnum.code, errorExceptionEnum.msg);
    }

    public enum GeneralErrorExceptionEnum {
        COMMON_INPUT_ERROR(200000, "服务器开小差");

        private int code;

        private String msg;

        GeneralErrorExceptionEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
