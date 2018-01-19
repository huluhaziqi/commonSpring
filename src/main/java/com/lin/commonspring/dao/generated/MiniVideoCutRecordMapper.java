package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoCutRecordEntity;
import com.lin.commonspring.model.entity.MiniVideoCutRecordEntityExample;
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

public interface MiniVideoCutRecordMapper {
    @SelectProvider(type=MiniVideoCutRecordSqlProvider.class, method="countByExample")
    long countByExample(MiniVideoCutRecordEntityExample example);

    @DeleteProvider(type=MiniVideoCutRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(MiniVideoCutRecordEntityExample example);

    @Delete({
        "delete from mini_video_cut_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into mini_video_cut_record (id, liveroom_id, ",
        "mini_video_id, vod_task_id, ",
        "origin_file_id, new_file_id, ",
        "status, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=BIGINT}, #{liveroomId,jdbcType=BIGINT}, ",
        "#{miniVideoId,jdbcType=BIGINT}, #{vodTaskId,jdbcType=VARCHAR}, ",
        "#{originFileId,jdbcType=VARCHAR}, #{newFileId,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(MiniVideoCutRecordEntity record);

    @InsertProvider(type=MiniVideoCutRecordSqlProvider.class, method="insertSelective")
    int insertSelective(MiniVideoCutRecordEntity record);

    @SelectProvider(type=MiniVideoCutRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="liveroom_id", property="liveroomId", jdbcType=JdbcType.BIGINT),
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT),
        @Result(column="vod_task_id", property="vodTaskId", jdbcType=JdbcType.VARCHAR),
        @Result(column="origin_file_id", property="originFileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="new_file_id", property="newFileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MiniVideoCutRecordEntity> selectByExample(MiniVideoCutRecordEntityExample example);

    @Select({
        "select",
        "id, liveroom_id, mini_video_id, vod_task_id, origin_file_id, new_file_id, status, ",
        "create_time, update_time",
        "from mini_video_cut_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="liveroom_id", property="liveroomId", jdbcType=JdbcType.BIGINT),
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT),
        @Result(column="vod_task_id", property="vodTaskId", jdbcType=JdbcType.VARCHAR),
        @Result(column="origin_file_id", property="originFileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="new_file_id", property="newFileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    MiniVideoCutRecordEntity selectByPrimaryKey(Long id);

    @UpdateProvider(type=MiniVideoCutRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MiniVideoCutRecordEntity record, @Param("example") MiniVideoCutRecordEntityExample example);

    @UpdateProvider(type=MiniVideoCutRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MiniVideoCutRecordEntity record, @Param("example") MiniVideoCutRecordEntityExample example);

    @UpdateProvider(type=MiniVideoCutRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MiniVideoCutRecordEntity record);

    @Update({
        "update mini_video_cut_record",
        "set liveroom_id = #{liveroomId,jdbcType=BIGINT},",
          "mini_video_id = #{miniVideoId,jdbcType=BIGINT},",
          "vod_task_id = #{vodTaskId,jdbcType=VARCHAR},",
          "origin_file_id = #{originFileId,jdbcType=VARCHAR},",
          "new_file_id = #{newFileId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MiniVideoCutRecordEntity record);
}