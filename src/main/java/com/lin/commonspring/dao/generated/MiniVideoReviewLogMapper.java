package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoReviewLogEntity;
import com.lin.commonspring.model.entity.MiniVideoReviewLogEntityExample;
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

public interface MiniVideoReviewLogMapper {
    @SelectProvider(type=MiniVideoReviewLogSqlProvider.class, method="countByExample")
    long countByExample(MiniVideoReviewLogEntityExample example);

    @DeleteProvider(type=MiniVideoReviewLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(MiniVideoReviewLogEntityExample example);

    @Delete({
        "delete from mini_video_review_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into mini_video_review_log (id, mini_video_id, ",
        "status, reviewer_name, ",
        "info, create_time)",
        "values (#{id,jdbcType=BIGINT}, #{miniVideoId,jdbcType=BIGINT}, ",
        "#{status,jdbcType=TINYINT}, #{reviewerName,jdbcType=VARCHAR}, ",
        "#{info,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(MiniVideoReviewLogEntity record);

    @InsertProvider(type=MiniVideoReviewLogSqlProvider.class, method="insertSelective")
    int insertSelective(MiniVideoReviewLogEntity record);

    @SelectProvider(type=MiniVideoReviewLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="reviewer_name", property="reviewerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="info", property="info", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MiniVideoReviewLogEntity> selectByExample(MiniVideoReviewLogEntityExample example);

    @Select({
        "select",
        "id, mini_video_id, status, reviewer_name, info, create_time",
        "from mini_video_review_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="reviewer_name", property="reviewerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="info", property="info", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    MiniVideoReviewLogEntity selectByPrimaryKey(Long id);

    @UpdateProvider(type=MiniVideoReviewLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MiniVideoReviewLogEntity record, @Param("example") MiniVideoReviewLogEntityExample example);

    @UpdateProvider(type=MiniVideoReviewLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MiniVideoReviewLogEntity record, @Param("example") MiniVideoReviewLogEntityExample example);

    @UpdateProvider(type=MiniVideoReviewLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MiniVideoReviewLogEntity record);

    @Update({
        "update mini_video_review_log",
        "set mini_video_id = #{miniVideoId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=TINYINT},",
          "reviewer_name = #{reviewerName,jdbcType=VARCHAR},",
          "info = #{info,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MiniVideoReviewLogEntity record);
}