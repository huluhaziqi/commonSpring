package com.lin.commonspring.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lin.commonspring.model.view.CityAndProvinceMapView;
import com.lin.commonspring.redisdao.BuildingRedisDao;
import com.lin.commonspring.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.lin.commonspring.util.JsonUtils.jsonStr2Obj;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRedisDao buildingRedisDao;

    @Override
    public CityAndProvinceMapView getCityAndProvinceMap() {
        //查看Redis缓存中是否存在数据
        String cacheCityAndProvinceMap = buildingRedisDao.getCacheCityAndProvinceMap();
        if (cacheCityAndProvinceMap != null) {
            return jsonStr2Obj(cacheCityAndProvinceMap, new TypeReference<CityAndProvinceMapView>() {
            });
        }
        CityAndProvinceMapView cityAndProvinceMapVO = new CityAndProvinceMapView();

        return cityAndProvinceMapVO;
    }
}
