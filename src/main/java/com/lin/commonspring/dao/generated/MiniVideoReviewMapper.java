package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoReviewEntity;
import com.lin.commonspring.model.entity.MiniVideoReviewEntityExample;
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

public interface MiniVideoReviewMapper {
    @SelectProvider(type=MiniVideoReviewSqlProvider.class, method="countByExample")
    long countByExample(MiniVideoReviewEntityExample example);

    @DeleteProvider(type=MiniVideoReviewSqlProvider.class, method="deleteByExample")
    int deleteByExample(MiniVideoReviewEntityExample example);

    @Delete({
        "delete from mini_video_review",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long miniVideoId);

    @Insert({
        "insert into mini_video_review (mini_video_id, status, ",
        "reviewer_name, info, ",
        "create_time, update_time)",
        "values (#{miniVideoId,jdbcType=BIGINT}, #{status,jdbcType=TINYINT}, ",
        "#{reviewerName,jdbcType=VARCHAR}, #{info,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(MiniVideoReviewEntity record);

    @InsertProvider(type=MiniVideoReviewSqlProvider.class, method="insertSelective")
    int insertSelective(MiniVideoReviewEntity record);

    @SelectProvider(type=MiniVideoReviewSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="reviewer_name", property="reviewerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="info", property="info", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MiniVideoReviewEntity> selectByExample(MiniVideoReviewEntityExample example);

    @Select({
        "select",
        "mini_video_id, status, reviewer_name, info, create_time, update_time",
        "from mini_video_review",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="reviewer_name", property="reviewerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="info", property="info", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    MiniVideoReviewEntity selectByPrimaryKey(Long miniVideoId);

    @UpdateProvider(type=MiniVideoReviewSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MiniVideoReviewEntity record, @Param("example") MiniVideoReviewEntityExample example);

    @UpdateProvider(type=MiniVideoReviewSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MiniVideoReviewEntity record, @Param("example") MiniVideoReviewEntityExample example);

    @UpdateProvider(type=MiniVideoReviewSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MiniVideoReviewEntity record);

    @Update({
        "update mini_video_review",
        "set status = #{status,jdbcType=TINYINT},",
          "reviewer_name = #{reviewerName,jdbcType=VARCHAR},",
          "info = #{info,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MiniVideoReviewEntity record);
}