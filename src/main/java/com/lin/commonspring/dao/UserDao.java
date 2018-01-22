package com.lin.commonspring.dao;

import com.lin.commonspring.dao.generated.UserMapper;
import com.lin.commonspring.model.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao extends UserMapper {

        @Insert({
                "insert ignore into user (id, status, name, ",
                "contact_mobile, contact_wechat, ",
                "show_contact_mobile, show_contact_wechat, ",
                "passed_host_application_id, pending_host_application_id, ",
                "total_audience_count, total_liveroom_count, ",
                "total_like_count, total_building_count, ",
                "total_activity_subscribe_count, total_live_duration, ",
                "application_update_time, province_id, ",
                "city_id)",
                "values (#{id,jdbcType=BIGINT}, #{status,jdbcType=TINYINT}, #{name,jdbcType=VARCHAR}, ",
                "#{contactMobile,jdbcType=VARCHAR}, #{contactWechat,jdbcType=VARCHAR}, ",
                "#{showContactMobile,jdbcType=BIT}, #{showContactWechat,jdbcType=BIT}, ",
                "#{passedHostApplicationId,jdbcType=BIGINT}, #{pendingHostApplicationId,jdbcType=BIGINT}, ",
                "#{totalAudienceCount,jdbcType=BIGINT}, #{totalLiveroomCount,jdbcType=BIGINT}, ",
                "#{totalLikeCount,jdbcType=BIGINT}, #{totalBuildingCount,jdbcType=BIGINT}, ",
                "#{totalActivitySubscribeCount,jdbcType=BIGINT}, #{totalLiveDuration,jdbcType=BIGINT}, ",
                "#{applicationUpdateTime,jdbcType=TIMESTAMP}, #{provinceId,jdbcType=INTEGER}, ",
                "#{cityId,jdbcType=INTEGER})"
        })
        int insertOnDuplicateIgnore(UserEntity record);

        @Select("SELECT * FROM user WHERE id in(${userIds})")
        List<UserEntity> getByIds(@Param("userIds") String userIds);

        @Select("SELECT * FROM user ORDER BY id DESC LIMIT #{offset},#{limit}")
        List<UserEntity> getByPaging(@Param("offset") int offset, @Param("limit") int limit);

        @Select("SELECT * FROM user WHERE status = #{status} LIMIT #{offset},#{limit}")
        List<UserEntity> getByStatus(@Param("status") byte status, @Param("offset") int offset, @Param("limit") int limit);

        @Select("SELECT count(*) FROM user WHERE status = #{status}")
        int getCountByStatus(@Param("status") byte status);

        @Update("UPDATE user SET pending_host_application_id = null WHERE id = #{userId}")
        void updatePendingIdToNull(@Param("userId") long userId);

        @Update("UPDATE user SET passed_host_application_id = null WHERE id = #{userId}")
        void updatePassedIdToNull(@Param("userId") long userId);


        @Update("UPDATE user SET total_liveroom_count = total_liveroom_count + #{increaseCount} WHERE id = #{userId}")
        void increaseLiveroomCount(@Param("userId") long userId, @Param("increaseCount") int increaseCount);


        @Update("UPDATE user SET total_audience_count = total_audience_count + #{increaseCount} WHERE id = #{userId}")
        void increaseAudienceCount(@Param("userId") long userId, @Param("increaseCount") int increaseCount);


        @Update("UPDATE user SET total_building_count = total_building_count + #{increaseCount} WHERE id = #{userId}")
        void increaseBuildingCount(@Param("userId") long userId, @Param("increaseCount") int increaseCount);


        @Update("UPDATE user SET total_activity_subscribe_count = total_activity_subscribe_count + #{increaseCount} WHERE id = #{userId}")
        void increaseActivitySubscribeCount(@Param("userId") long userId, @Param("increaseCount") int increaseCount);


        @Update("UPDATE user SET total_like_count = total_like_count + #{increaseCount} WHERE id = #{userId}")
        void increaseLikeCount(@Param("userId") long userId, @Param("increaseCount") int increaseCount);


        @Update("UPDATE user SET total_live_duration = total_live_duration + #{increaseCount} WHERE id = #{userId}")
        void increaseLiveDuration(@Param("userId") long userId, @Param("increaseCount") int increaseCount);

        @MapKey("cityId")
        @Select("SELECT city_id as cityId, COUNT(1) as userCount FROM user WHERE STATUS = 2 GROUP BY city_id")
        Map<Integer, Map<String, Object>> getLiveroomCountByCity();

        @Select("select id from user where city_id = #{cityId} and status = #{status} " +
                "and application_update_time >= #{startDate} and application_update_time <= #{endDate}")
        List<Long> getNewUserOfApplicationPassByDates(@Param("cityId") int cityId,@Param("status") int status, @Param("startDate") String startDate,@Param("endDate") String endDate);

    }