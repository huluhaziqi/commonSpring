package com.lin.commonspring.dao;

import com.lin.commonspring.dao.generated.StatMiniVideoMapper;
import com.lin.commonspring.model.entity.StatMiniVideoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StatMiniVideoDao extends StatMiniVideoMapper {

    @Insert("insert into stat_mini_video (mini_video_id, total_vv," +
            "app_vv, wap_vv, pc_vv,robot_vv, like_count) values(#{miniVideoId},#{totalVv}," +
            "#{appVv},#{wapVv},#{pcVv},#{robotVv},#{likeCount}) on duplicate key update " +
            "total_vv = #{totalVv}, app_vv = #{appVv}, wap_vv = #{wapVv}, pc_vv = #{pcVv}," +
            "robot_vv = #{robotVv}, like_count = #{likeCount} ")
    void insertOrUpdate(StatMiniVideoEntity entity);

    @Select("select total_vv from stat_mini_video where mini_video_id = #{miniVideoId}")
    Long getTotalVvById(@Param("miniVideoId") long miniVideoId);

    @Select("select app_vv from stat_mini_video where mini_video_id = #{miniVideoId}")
    Long getAppVvById(@Param("miniVideoId") long miniVideoId);

    @Select("select wap_vv from stat_mini_video where mini_video_id = #{miniVideoId}")
    Long getWapVvById(@Param("miniVideoId") long miniVideoId);

    @Select("select pc_vv from stat_mini_video where mini_video_id = #{miniVideoId}")
    Long getPcVvById(@Param("miniVideoId") long miniVideoId);

    @Select("select robot_vv from stat_mini_video where mini_video_id = #{miniVideoId}")
    Long getRobotVvById(@Param("miniVideoId") long miniVideoId);

    @Select("select like_count from stat_mini_video where mini_video_id = #{miniVideoId}")
    Long getLikeCountById(@Param("miniVideoId") long miniVideoId);

}
