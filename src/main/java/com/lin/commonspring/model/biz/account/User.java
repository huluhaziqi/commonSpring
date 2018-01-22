package com.lin.commonspring.model.biz.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lin.commonspring.enums.UserStatusEnum;
import com.lin.commonspring.model.entity.UserEntity;
import org.springframework.beans.BeanUtils;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @JsonProperty("id")
    private long id;

    // COPY 账号系统字段
    @JsonProperty("userName")
    private String userName;

    @JsonProperty("nickName")
    private String nickName;

    @JsonProperty("avatar")
    private String avatar;

    @JsonProperty("birthDay")
    private Long birthDay;

    @JsonProperty("gender")
    private int gender;

    @JsonProperty("mobile")
    private String mobile;

    @JsonProperty("city")
    private int city;               //ID，从接口拿

    @JsonProperty("province")
    private int province;           //ID，从接口拿

    @JsonProperty("accreditStatus")
    private int accreditStatus;

    @JsonProperty("changeStatus")
    private int changeStatus;

    @JsonProperty("accreditRoleType")
    private int accreditRoleType;

    @JsonProperty("accreditRoleTypeList")
    private List<Integer> accreditRoleTypeList;

    // extra
    @JsonProperty("cityStr")
    private String cityStr;         //拼的城市名字字符串

    @JsonProperty("provinceStr")
    private String provinceStr;

    @JsonProperty("isHost")
    private Boolean isHost;

    @JsonProperty("status")
    private Byte status;

    @JsonProperty("title")
    private String title;

    @JsonProperty("name")
    private String name;

    @JsonProperty("contactMobile")
    private String contactMobile;

    @JsonProperty("contactWechat")
    private String contactWechat;

    @JsonProperty("showContactMobile")
    private Byte showContactMobile;

    @JsonProperty("showContactWechat")
    private Byte showContactWechat;

    @JsonProperty("profileUrl")
    private String profileUrl;

    public User(UserEntity userEntity) {
        if (userEntity != null) {
            BeanUtils.copyProperties(userEntity, this);
            isHost = userEntity.getStatus() == UserStatusEnum.APPLICATION_PASSED.getValue();
            if (userEntity.getCityId() !=null) {
                city = userEntity.getCityId();
            }
            if (userEntity.getProvinceId() !=null) {
                province = userEntity.getProvinceId();
            }
            showContactMobile = showContactMobile == null ? 0 : showContactMobile;
            showContactWechat = showContactWechat == null ? 0 : showContactWechat;
        } else {
            isHost = false;
            status = UserStatusEnum.NORMAL.getValue();
        }

    }

    public User() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public int getAccreditStatus() {
        return accreditStatus;
    }

    public void setAccreditStatus(int accreditStatus) {
        this.accreditStatus = accreditStatus;
    }

    public int getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(int changeStatus) {
        this.changeStatus = changeStatus;
    }

    public String getCityStr() {
        return cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
    }

    public String getProvinceStr() {
        return provinceStr;
    }

    public void setProvinceStr(String provinceStr) {
        this.provinceStr = provinceStr;
    }

    public Boolean getIsHost() {
        return isHost;
    }

    public void setIsHost(Boolean isHost) {
        this.isHost = isHost;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactWechat() {
        return contactWechat;
    }

    public void setContactWechat(String contactWechat) {
        this.contactWechat = contactWechat;
    }

    public Byte getShowContactMobile() {
        return showContactMobile;
    }

    public void setShowContactMobile(Byte showContactMobile) {
        this.showContactMobile = showContactMobile;
    }

    public Byte getShowContactWechat() {
        return showContactWechat;
    }

    public void setShowContactWechat(Byte showContactWechat) {
        this.showContactWechat = showContactWechat;
    }

    public int getAccreditRoleType() {
        return accreditRoleType;
    }

    public void setAccreditRoleType(int accreditRoleType) {
        this.accreditRoleType = accreditRoleType;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public List<Integer> getAccreditRoleTypeList() {
        return accreditRoleTypeList;
    }

    public void setAccreditRoleTypeList(List<Integer> accreditRoleTypeList) {
        this.accreditRoleTypeList = accreditRoleTypeList;
    }
}
