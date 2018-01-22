package com.lin.commonspring.exception;

public class GeneralErrorException extends AbstractBaseException {

    public GeneralErrorException(int code, String msg) {
        super(code, msg);
    }

    public GeneralErrorException(GeneralErrorExceptionEnum errorExceptionEnum) {
        super(errorExceptionEnum.code, errorExceptionEnum.msg);
    }

    public enum GeneralErrorExceptionEnum {
        COMMON_INPUT_ERROR(200000, "服务器开小差"),
        COMMON_INPUT_INVALID(100001, "服务器开小差了,请稍后再试"),  // 输入数据错误
        COMMON_ENTITY_NOT_EXIST(100002, "服务器开小差了,请稍后再试"),   // 无法找到指定的数据
        COMMON_JSON_ILLEGAL(100003, "服务器开小差了,请稍后再试"),// json数据转换错误
        KVSTORE_ERROR(100004, "服务器开小差了,请稍后再试"), // 缓存请求失败
        IMAGE_ERROR(100005, "服务器开小差了,请稍后再试"),   // 处理图片时发生错误
        CAN_NOT_OPERATE_BCZ_SYSTEM_ERROR(100006, "系统维护中，暂时无法修改"),
        APP_NEED_UPDATE(100009, "请更新客户端版本，获取全新功能哦"),
        REQUEST_SIGN_CHECK_FAILED(100010, "请求验证失败"),
        ;
        String message;
        int code;

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
