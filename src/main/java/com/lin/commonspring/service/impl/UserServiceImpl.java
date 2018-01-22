package com.lin.commonspring.service.impl;

import com.lin.commonspring.dao.UserDao;
import com.lin.commonspring.model.biz.account.Account;
import com.lin.commonspring.model.biz.account.User;
import com.lin.commonspring.model.entity.UserEntity;
import com.lin.commonspring.model.view.CityAndProvinceMapView;
import com.lin.commonspring.service.BuildingService;
import com.lin.commonspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private BuildingService buildingService;

    @Override
    public UserEntity getById(long uid) {
        return null;
    }

    @Override
    public User getUser(long userId) {
        UserEntity userEntity = getUserEntity(userId);
        User user = new User(userEntity);
        // attach city
        CityAndProvinceMapView cityAndProvinceMap = buildingService.getCityAndProvinceMap();
        if (cityAndProvinceMap.getCityMap().get(user.getCity()) != null) {
            user.setCityStr(cityAndProvinceMap.getCityMap().get(user.getCity()).getCityName());
        }
        if (cityAndProvinceMap.getProvinceMap().get(user.getProvince()) != null) {
            user.setProvinceStr(cityAndProvinceMap.getProvinceMap().get(user.getProvince()).getProvinceName());
        }
        return user;
    }

    @Override
    public UserEntity getUserEntity(long userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
