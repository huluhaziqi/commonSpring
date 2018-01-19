package com.lin.commonspring.dao;

import com.lin.commonspring.model.entity.MiniVideoReviewLogEntity;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface MiniVideoReviewLogDao {


    @Insert("insert into `mini_video_review_log` (mini_video_id, status, reviewer_name, info, create_time) " +
            "values (#{miniVideoId}, #{status}, #{reviewerName}, #{info}, #{createTime})")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(MiniVideoReviewLogEntity entity);

    @Select("<script> " +
            "select * from `mini_video_review_log` " +
            "<where>" +
            "<if test=\"status != null\">and status = #{status} </if>" +
            "<if test=\"reviewerName != null\">" +
            "<bind name=\"pattern\" value=\"'%' + reviewerName + '%'\" />" +
            "and reviewer_name like #{pattern} " +
            "</if>" +
            "<if test=\"startTime != null and endTime != null\">" +
            "and create_time between #{startTime} and #{endTime} </if>" +
            "</where>" +
            "order by id desc limit #{limitStart},#{limit}" +
            "</script>")
    List<MiniVideoReviewLogEntity> listForAdmin(@Param("status") Byte status, @Param("startTime") Date startTime,
                                                @Param("endTime") Date endTime, @Param("reviewerName") String reviewerName,
                                                @Param("limitStart") Integer limitStart, @Param("limit") Integer limit);

    @Select("<script> " +
            "select count(1) from `mini_video_review_log` " +
            "<where>" +
            "<if test=\"status != null\">and status = #{status} </if>" +
            "<if test=\"reviewerName != null\">" +
            "<bind name=\"pattern\" value=\"'%' + reviewerName + '%'\" />" +
            "and reviewer_name like #{pattern} " +
            "</if>" +
            "<if test=\"startTime != null and endTime != null\">" +
            "and create_time between #{startTime} and #{endTime} </if>" +
            "</where>" +
            "</script>")
    int countForAdmin(@Param("status") Byte status, @Param("startTime") Date startTime,
                      @Param("endTime") Date endTime, @Param("reviewerName") String reviewerName);
}
