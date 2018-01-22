package com.lin.commonspring.enums;


public enum MiniVideoReviewStatusEnum {
    INVALID(-1), //无效。待审核，正在审核时被用户删除，则置为无效状态
    WAIT(0),    //待审核
    REVIEWING(1),   //正在审核
    PASS(2),    //通过
    DENY(3),    //驳回，通过状态下可二次驳回
    GIVEUPREVIEW(4); //放弃审核任务，任务进入待审核状态

    private byte value;

    MiniVideoReviewStatusEnum(int value) { this.value = (byte)value; }

    public byte getValue() { return value; }

}
