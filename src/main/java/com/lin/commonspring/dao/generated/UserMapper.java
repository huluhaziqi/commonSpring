package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.UserEntity;
import com.lin.commonspring.model.entity.UserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserEntityExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserEntityExample example);

    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user (id, status, ",
        "name, title, job, ",
        "contact_mobile, contact_wechat, ",
        "show_contact_mobile, show_contact_wechat, ",
        "passed_host_application_id, pending_host_application_id, ",
        "total_audience_count, total_liveroom_count, ",
        "total_like_count, total_building_count, ",
        "total_activity_subscribe_count, total_live_duration, ",
        "application_update_time, province_id, ",
        "city_id)",
        "values (#{id,jdbcType=BIGINT}, #{status,jdbcType=TINYINT}, ",
        "#{name,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, #{job,jdbcType=VARCHAR}, ",
        "#{contactMobile,jdbcType=VARCHAR}, #{contactWechat,jdbcType=VARCHAR}, ",
        "#{showContactMobile,jdbcType=TINYINT}, #{showContactWechat,jdbcType=TINYINT}, ",
        "#{passedHostApplicationId,jdbcType=BIGINT}, #{pendingHostApplicationId,jdbcType=BIGINT}, ",
        "#{totalAudienceCount,jdbcType=BIGINT}, #{totalLiveroomCount,jdbcType=BIGINT}, ",
        "#{totalLikeCount,jdbcType=BIGINT}, #{totalBuildingCount,jdbcType=BIGINT}, ",
        "#{totalActivitySubscribeCount,jdbcType=BIGINT}, #{totalLiveDuration,jdbcType=BIGINT}, ",
        "#{applicationUpdateTime,jdbcType=TIMESTAMP}, #{provinceId,jdbcType=INTEGER}, ",
        "#{cityId,jdbcType=INTEGER})"
    })
    int insert(UserEntity record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(UserEntity record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_mobile", property="contactMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_wechat", property="contactWechat", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_contact_mobile", property="showContactMobile", jdbcType=JdbcType.TINYINT),
        @Result(column="show_contact_wechat", property="showContactWechat", jdbcType=JdbcType.TINYINT),
        @Result(column="passed_host_application_id", property="passedHostApplicationId", jdbcType=JdbcType.BIGINT),
        @Result(column="pending_host_application_id", property="pendingHostApplicationId", jdbcType=JdbcType.BIGINT),
        @Result(column="total_audience_count", property="totalAudienceCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_liveroom_count", property="totalLiveroomCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_like_count", property="totalLikeCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_building_count", property="totalBuildingCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_activity_subscribe_count", property="totalActivitySubscribeCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_live_duration", property="totalLiveDuration", jdbcType=JdbcType.BIGINT),
        @Result(column="application_update_time", property="applicationUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.INTEGER),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER)
    })
    List<UserEntity> selectByExample(UserEntityExample example);

    @Select({
        "select",
        "id, status, name, title, job, contact_mobile, contact_wechat, show_contact_mobile, ",
        "show_contact_wechat, passed_host_application_id, pending_host_application_id, ",
        "total_audience_count, total_liveroom_count, total_like_count, total_building_count, ",
        "total_activity_subscribe_count, total_live_duration, application_update_time, ",
        "province_id, city_id",
        "from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_mobile", property="contactMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="contact_wechat", property="contactWechat", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_contact_mobile", property="showContactMobile", jdbcType=JdbcType.TINYINT),
        @Result(column="show_contact_wechat", property="showContactWechat", jdbcType=JdbcType.TINYINT),
        @Result(column="passed_host_application_id", property="passedHostApplicationId", jdbcType=JdbcType.BIGINT),
        @Result(column="pending_host_application_id", property="pendingHostApplicationId", jdbcType=JdbcType.BIGINT),
        @Result(column="total_audience_count", property="totalAudienceCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_liveroom_count", property="totalLiveroomCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_like_count", property="totalLikeCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_building_count", property="totalBuildingCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_activity_subscribe_count", property="totalActivitySubscribeCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_live_duration", property="totalLiveDuration", jdbcType=JdbcType.BIGINT),
        @Result(column="application_update_time", property="applicationUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.INTEGER),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER)
    })
    UserEntity selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserEntity record);

    @Update({
        "update user",
        "set status = #{status,jdbcType=TINYINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "job = #{job,jdbcType=VARCHAR},",
          "contact_mobile = #{contactMobile,jdbcType=VARCHAR},",
          "contact_wechat = #{contactWechat,jdbcType=VARCHAR},",
          "show_contact_mobile = #{showContactMobile,jdbcType=TINYINT},",
          "show_contact_wechat = #{showContactWechat,jdbcType=TINYINT},",
          "passed_host_application_id = #{passedHostApplicationId,jdbcType=BIGINT},",
          "pending_host_application_id = #{pendingHostApplicationId,jdbcType=BIGINT},",
          "total_audience_count = #{totalAudienceCount,jdbcType=BIGINT},",
          "total_liveroom_count = #{totalLiveroomCount,jdbcType=BIGINT},",
          "total_like_count = #{totalLikeCount,jdbcType=BIGINT},",
          "total_building_count = #{totalBuildingCount,jdbcType=BIGINT},",
          "total_activity_subscribe_count = #{totalActivitySubscribeCount,jdbcType=BIGINT},",
          "total_live_duration = #{totalLiveDuration,jdbcType=BIGINT},",
          "application_update_time = #{applicationUpdateTime,jdbcType=TIMESTAMP},",
          "province_id = #{provinceId,jdbcType=INTEGER},",
          "city_id = #{cityId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserEntity record);
}