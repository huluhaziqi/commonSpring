package com.lin.commonspring.enums;

public enum MiniVideoCutStatusEnum {

    CUT(1),
    TRANSCODE(2),
    FINISH(3),
    CUT_FAILED(4),
    TRANSCODE_FAILED(5);

    private byte status;

    MiniVideoCutStatusEnum(int status) {
        this.status = (byte) status;
    }

    public byte getValue() {
        return status;
    }

}
