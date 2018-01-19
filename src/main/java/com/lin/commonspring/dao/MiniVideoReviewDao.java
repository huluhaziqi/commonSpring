package com.lin.commonspring.dao;

import com.lin.commonspring.model.entity.MiniVideoReviewEntity;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface MiniVideoReviewDao {

    @Insert("insert into `mini_video_review` (mini_video_id, status, create_time) " +
            "values (#{miniVideoId}, #{status}, #{createTime})")
    int insert(MiniVideoReviewEntity entity);

    @Update("update city_app set seq = #{seq} where city_id = #{cityId}")
    int updateReviewStatus(@Param("miniVideoId") Long miniVideoId, @Param("status") Byte status,
                           @Param("reviewerName") String reviewerName, @Param("info") String info,
                           @Param("updateTime") Date updateTime);

    @Select("select * from `mini_video_review` where mini_video_id = #{miniVideoId}")
    MiniVideoReviewEntity selectByMiniVideoId(@Param("miniVideoId") Long miniVideoId);

    @Select("<script> " +
            "select * from `mini_video_review` " +
            "<where>" +
            "<if test=\"status != null\">and status = #{status} </if>" +
            "<if test=\"reviewerName != null\">" +
            "<bind name=\"pattern\" value=\"'%' + reviewerName + '%'\" />" +
            "and reviewer_name like #{reviewerName} " +
            "</if>" +
            "</where>" +
            "order by id desc limit #{limitStart},#{limit}" +
            "</script>")
    List<MiniVideoReviewEntity> listForAdmin(@Param("status") Byte status, @Param("reviewerName") String reviewerName,
                                             @Param("limitStart") Integer limitStart, @Param("limit") Integer limit);

    @Select("<script> " +
            "select count(1) from `mini_video_review` " +
            "<where>" +
            "<if test=\"status != null\">and status = #{status} </if>" +
            "<if test=\"reviewerName != null\">" +
            "<bind name=\"pattern\" value=\"'%' + reviewerName + '%'\" />" +
            "and reviewer_name like #{reviewerName} " +
            "</if>" +
            "</where>" +
            "</script>")
    int countForAdmin(@Param("status") Byte status, @Param("reviewerName") String reviewerName);
}
