package com.lin.commonspring.exception;

public class MiniVideoStateException extends AbstractBaseException {


    private static final long serialVersionUID = -611026773324234300L;

    public MiniVideoStateException(MiniVideoStateException.MiniVideoStateExceptionEnum miniVideoStateExceptionEnum) {
        super(miniVideoStateExceptionEnum.code, miniVideoStateExceptionEnum.message);
    }

    public MiniVideoStateException(MiniVideoStateException.MiniVideoStateExceptionEnum miniVideoStateExceptionEnum, String logMsg) {
        super(miniVideoStateExceptionEnum.code, miniVideoStateExceptionEnum.message, logMsg);
    }

    //13xxxx
    public enum MiniVideoStateExceptionEnum {

        MINI_VIDEO_USER_NICKNAME_FORBIDDEN(130000, "用户昵称涉嫌违规，请遵守直播规范"),
        MINI_VIDEO_ORIGIN_LIVEROOM_NOT_EXIST(130001, "该小视频源直播不存在，看看其它的吧"),
        MINI_VIDEO_TITLE_FORBIDDEN(130002, "小视频标题涉嫌违规，请遵守直播规范"),
        MINI_VIDEO_LIVEROOM_CUT_IS_EXIST(130003, "当前小视频的源直播间有正在剪切的任务"),
        MINI_VIDEO_CUT_TASK_FAIL(130004, "当前小视频剪辑任务失败"),
        MINI_VIDEO_COVER_CAN_NOT_BE_NULL(130005, "当前小视频封面不能为空"),
        ;

        int code;
        String message;

        MiniVideoStateExceptionEnum(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}
