package com.lin.commonspring.enums;

public enum UserStatusEnum {

    APPLICATION_PENDING(1),
    APPLICATION_PASSED(2),
    APPLICATION_DENIED(3),
    FROZEN(4),
    NORMAL(5),
    PROTOCOL_LACK(6);

    private byte value;

    UserStatusEnum(int value) {
        this.value = (byte) value;
    }

    public Byte getValue() {
        return value;
    }
}
