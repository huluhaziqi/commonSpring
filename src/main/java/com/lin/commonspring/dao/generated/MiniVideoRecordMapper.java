package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoRecordEntity;
import com.lin.commonspring.model.entity.MiniVideoRecordEntityExample;
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

public interface MiniVideoRecordMapper {
    @SelectProvider(type=MiniVideoRecordSqlProvider.class, method="countByExample")
    long countByExample(MiniVideoRecordEntityExample example);

    @DeleteProvider(type=MiniVideoRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(MiniVideoRecordEntityExample example);

    @Delete({
        "delete from mini_video_record",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long miniVideoId);

    @Insert({
        "insert into mini_video_record (mini_video_id, file_id, ",
        "url, origin_url, ",
        "mp4_10_url, mp4_20_url, ",
        "mp4_30_url, mp4_40_url, ",
        "create_time, update_time, ",
        "duration)",
        "values (#{miniVideoId,jdbcType=BIGINT}, #{fileId,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{originUrl,jdbcType=VARCHAR}, ",
        "#{mp410Url,jdbcType=VARCHAR}, #{mp420Url,jdbcType=VARCHAR}, ",
        "#{mp430Url,jdbcType=VARCHAR}, #{mp440Url,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{duration,jdbcType=BIGINT})"
    })
    int insert(MiniVideoRecordEntity record);

    @InsertProvider(type=MiniVideoRecordSqlProvider.class, method="insertSelective")
    int insertSelective(MiniVideoRecordEntity record);

    @SelectProvider(type=MiniVideoRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="origin_url", property="originUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_10_url", property="mp410Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_20_url", property="mp420Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_30_url", property="mp430Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_40_url", property="mp440Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="duration", property="duration", jdbcType=JdbcType.BIGINT)
    })
    List<MiniVideoRecordEntity> selectByExample(MiniVideoRecordEntityExample example);

    @Select({
        "select",
        "mini_video_id, file_id, url, origin_url, mp4_10_url, mp4_20_url, mp4_30_url, ",
        "mp4_40_url, create_time, update_time, duration",
        "from mini_video_record",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="origin_url", property="originUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_10_url", property="mp410Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_20_url", property="mp420Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_30_url", property="mp430Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_40_url", property="mp440Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="duration", property="duration", jdbcType=JdbcType.BIGINT)
    })
    MiniVideoRecordEntity selectByPrimaryKey(Long miniVideoId);

    @UpdateProvider(type=MiniVideoRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MiniVideoRecordEntity record, @Param("example") MiniVideoRecordEntityExample example);

    @UpdateProvider(type=MiniVideoRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MiniVideoRecordEntity record, @Param("example") MiniVideoRecordEntityExample example);

    @UpdateProvider(type=MiniVideoRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MiniVideoRecordEntity record);

    @Update({
        "update mini_video_record",
        "set file_id = #{fileId,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "origin_url = #{originUrl,jdbcType=VARCHAR},",
          "mp4_10_url = #{mp410Url,jdbcType=VARCHAR},",
          "mp4_20_url = #{mp420Url,jdbcType=VARCHAR},",
          "mp4_30_url = #{mp430Url,jdbcType=VARCHAR},",
          "mp4_40_url = #{mp440Url,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "duration = #{duration,jdbcType=BIGINT}",
        "where mini_video_id = #{miniVideoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MiniVideoRecordEntity record);
}