package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.StatMiniVideoEntity;
import com.lin.commonspring.model.entity.StatMiniVideoEntityExample;
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

public interface StatMiniVideoMapper {
    @SelectProvider(type=StatMiniVideoSqlProvider.class, method="countByExample")
    long countByExample(StatMiniVideoEntityExample example);

    @DeleteProvider(type=StatMiniVideoSqlProvider.class, method="deleteByExample")
    int deleteByExample(StatMiniVideoEntityExample example);

    @Delete({
        "delete from stat_mini_video",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long miniVideoId);

    @Insert({
        "insert into stat_mini_video (mini_video_id, total_vv, ",
        "app_vv, wap_vv, pc_vv, ",
        "robot_vv, like_count)",
        "values (#{miniVideoId,jdbcType=BIGINT}, #{totalVv,jdbcType=BIGINT}, ",
        "#{appVv,jdbcType=BIGINT}, #{wapVv,jdbcType=BIGINT}, #{pcVv,jdbcType=BIGINT}, ",
        "#{robotVv,jdbcType=BIGINT}, #{likeCount,jdbcType=BIGINT})"
    })
    int insert(StatMiniVideoEntity record);

    @InsertProvider(type=StatMiniVideoSqlProvider.class, method="insertSelective")
    int insertSelective(StatMiniVideoEntity record);

    @SelectProvider(type=StatMiniVideoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="total_vv", property="totalVv", jdbcType=JdbcType.BIGINT),
        @Result(column="app_vv", property="appVv", jdbcType=JdbcType.BIGINT),
        @Result(column="wap_vv", property="wapVv", jdbcType=JdbcType.BIGINT),
        @Result(column="pc_vv", property="pcVv", jdbcType=JdbcType.BIGINT),
        @Result(column="robot_vv", property="robotVv", jdbcType=JdbcType.BIGINT),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.BIGINT)
    })
    List<StatMiniVideoEntity> selectByExample(StatMiniVideoEntityExample example);

    @Select({
        "select",
        "mini_video_id, total_vv, app_vv, wap_vv, pc_vv, robot_vv, like_count",
        "from stat_mini_video",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="total_vv", property="totalVv", jdbcType=JdbcType.BIGINT),
        @Result(column="app_vv", property="appVv", jdbcType=JdbcType.BIGINT),
        @Result(column="wap_vv", property="wapVv", jdbcType=JdbcType.BIGINT),
        @Result(column="pc_vv", property="pcVv", jdbcType=JdbcType.BIGINT),
        @Result(column="robot_vv", property="robotVv", jdbcType=JdbcType.BIGINT),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.BIGINT)
    })
    StatMiniVideoEntity selectByPrimaryKey(Long miniVideoId);

    @UpdateProvider(type=StatMiniVideoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") StatMiniVideoEntity record, @Param("example") StatMiniVideoEntityExample example);

    @UpdateProvider(type=StatMiniVideoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") StatMiniVideoEntity record, @Param("example") StatMiniVideoEntityExample example);

    @UpdateProvider(type=StatMiniVideoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StatMiniVideoEntity record);

    @Update({
        "update stat_mini_video",
        "set total_vv = #{totalVv,jdbcType=BIGINT},",
          "app_vv = #{appVv,jdbcType=BIGINT},",
          "wap_vv = #{wapVv,jdbcType=BIGINT},",
          "pc_vv = #{pcVv,jdbcType=BIGINT},",
          "robot_vv = #{robotVv,jdbcType=BIGINT},",
          "like_count = #{likeCount,jdbcType=BIGINT}",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(StatMiniVideoEntity record);
}