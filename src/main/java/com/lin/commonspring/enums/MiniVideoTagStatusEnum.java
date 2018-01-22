package com.lin.commonspring.enums;

public enum  MiniVideoTagStatusEnum {

    NORMAL(1), DELETED(-1);

    private byte type;

    MiniVideoTagStatusEnum(int type) {
        this.type = (byte) type;
    }

    public byte getValue() {
        return this.type;
    }
}
