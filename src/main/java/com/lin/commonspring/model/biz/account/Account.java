package com.lin.commonspring.model.biz.account;

import java.util.List;

public class Account {
    private long uid;
    private String nickName;
    private String avatar;
    private Long birthDay;
    private int gender;
    private String mobile;
    private int city;   //  这两个字段不准确，不再存了。
    private int province;   //
    private int accreditStatus;
    private int changeStatus;
    private int accreditRoleType;
    private List<Integer> accreditRoleTypeList;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Long birthDay) {
        this.birthDay = birthDay;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(int changeStatus) {
        this.changeStatus = changeStatus;
    }

    public int getAccreditStatus() {
        return accreditStatus;
    }

    public void setAccreditStatus(int accreditStatus) {
        this.accreditStatus = accreditStatus;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }


    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getAccreditRoleType() {
        return accreditRoleType;
    }

    public void setAccreditRoleType(int accreditRoleType) {
        this.accreditRoleType = accreditRoleType;
    }

    public List<Integer> getAccreditRoleTypeList() {
        return accreditRoleTypeList;
    }

    public void setAccreditRoleTypeList(List<Integer> accreditRoleTypeList) {
        this.accreditRoleTypeList = accreditRoleTypeList;
    }
}
