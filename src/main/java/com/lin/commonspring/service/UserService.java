package com.lin.commonspring.service;

import com.lin.commonspring.model.biz.account.User;
import com.lin.commonspring.model.entity.UserEntity;

public interface UserService {

    UserEntity getById(long uid);

    User getUser(long userId);

    UserEntity getUserEntity(long userId);
}
