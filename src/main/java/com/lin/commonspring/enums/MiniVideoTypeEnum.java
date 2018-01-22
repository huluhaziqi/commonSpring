package com.lin.commonspring.enums;

public enum MiniVideoTypeEnum {
    FROM_CUT(1),
    FROM_LIVE(2),;

    private byte value;

    MiniVideoTypeEnum(int value) {
        this.value = (byte) value;
    }

    public byte getValue() {
        return value;
    }
}
