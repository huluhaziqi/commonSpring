package com.lin.commonspring.enums;

public enum MiniVideoStatusEnum {

    DELETE(-1), //删除
    CUT(1), //剪切中
    TRANSCODE(2),   //转码中
    REVIEW(3),    //审核中
    PASS(4),    //审核通过
    CUT_FAILED(5), //剪切失败
    TRANSCODE_FAILED(6), //转码失败
    BANNED(7);  //审核驳回

    private byte status;

    MiniVideoStatusEnum(int status) {
        this.status = (byte) status;
    }

    public byte getValue() {
        return status;
    }
}
