package com.lin.commonspring.redisdao;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class BuildingRedisDao {

    private static final String CACHE_USER_PROVINCE_CITY_MAP = "CACHE_USER_PROVINCE_CITY_MAP";

    //Building相关缓存数据过期时间
    private static final int BUILDING_CACHE_EXPIRES_SECONDS = 60 * 5;
    @Resource
    private JedisService jedisService;
    /**
     * CacheCityAndProvinceMap
     */
    public String getCacheCityAndProvinceMap() {
        return jedisService.executePersist(jedis -> jedis.get(CACHE_USER_PROVINCE_CITY_MAP));
    }

    public String setCacheCityAndProvinceMap(String cacheCityAndProvinceMap) {
        //设置缓存键值和过期时间
        return jedisService.executePersist(jedis -> jedis.setex(CACHE_USER_PROVINCE_CITY_MAP, BUILDING_CACHE_EXPIRES_SECONDS, cacheCityAndProvinceMap));
    }

}
