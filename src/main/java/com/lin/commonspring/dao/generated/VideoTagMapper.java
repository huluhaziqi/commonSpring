package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.VideoTagEntity;
import com.lin.commonspring.model.entity.VideoTagEntityExample;
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

public interface VideoTagMapper {
    @SelectProvider(type=VideoTagSqlProvider.class, method="countByExample")
    long countByExample(VideoTagEntityExample example);

    @DeleteProvider(type=VideoTagSqlProvider.class, method="deleteByExample")
    int deleteByExample(VideoTagEntityExample example);

    @Delete({
        "delete from video_tag",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into video_tag (id, status, ",
        "type, name, create_time, ",
        "seq)",
        "values (#{id,jdbcType=BIGINT}, #{status,jdbcType=TINYINT}, ",
        "#{type,jdbcType=TINYINT}, #{name,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{seq,jdbcType=TINYINT})"
    })
    int insert(VideoTagEntity record);

    @InsertProvider(type=VideoTagSqlProvider.class, method="insertSelective")
    int insertSelective(VideoTagEntity record);

    @SelectProvider(type=VideoTagSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="seq", property="seq", jdbcType=JdbcType.TINYINT)
    })
    List<VideoTagEntity> selectByExample(VideoTagEntityExample example);

    @Select({
        "select",
        "id, status, type, name, create_time, seq",
        "from video_tag",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="seq", property="seq", jdbcType=JdbcType.TINYINT)
    })
    VideoTagEntity selectByPrimaryKey(Long id);

    @UpdateProvider(type=VideoTagSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") VideoTagEntity record, @Param("example") VideoTagEntityExample example);

    @UpdateProvider(type=VideoTagSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") VideoTagEntity record, @Param("example") VideoTagEntityExample example);

    @UpdateProvider(type=VideoTagSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(VideoTagEntity record);

    @Update({
        "update video_tag",
        "set status = #{status,jdbcType=TINYINT},",
          "type = #{type,jdbcType=TINYINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "seq = #{seq,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(VideoTagEntity record);
}