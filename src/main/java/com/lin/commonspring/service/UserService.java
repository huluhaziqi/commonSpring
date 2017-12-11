package com.lin.commonspring.service;

import com.lin.commonspring.model.entity.UserEntity;

public interface UserService {

    UserEntity getById(long uid);
}
