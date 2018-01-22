package com.lin.commonspring.enums;

public enum  MiniVideoPlatformEnum {

    UNKNOWN(-1), ALL(0), APP(1), WAP(2), PC(3)
            ;
    private int platform;

    MiniVideoPlatformEnum(int platform){
        this.platform = platform;
    }

    public int getValue() {
        return this.platform;
    }
}
