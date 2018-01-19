package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoEntity;
import com.lin.commonspring.model.entity.MiniVideoEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MiniVideoMapper {
    @SelectProvider(type=MiniVideoSqlProvider.class, method="countByExample")
    long countByExample(MiniVideoEntityExample example);

    @DeleteProvider(type=MiniVideoSqlProvider.class, method="deleteByExample")
    int deleteByExample(MiniVideoEntityExample example);

    @Delete({
        "delete from mini_video",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into mini_video (type, liveroom_id, ",
        "host_id, status, title, ",
        "info, img_path, city_id, ",
        "create_time, update_time)",
        "values (#{type,jdbcType=TINYINT}, #{liveroomId,jdbcType=BIGINT}, ",
        "#{hostId,jdbcType=BIGINT}, #{status,jdbcType=TINYINT}, #{title,jdbcType=VARCHAR}, ",
        "#{info,jdbcType=VARCHAR}, #{imgPath,jdbcType=VARCHAR}, #{cityId,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(MiniVideoEntity record);

    @InsertProvider(type=MiniVideoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(MiniVideoEntity record);

    @SelectProvider(type=MiniVideoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="liveroom_id", property="liveroomId", jdbcType=JdbcType.BIGINT),
        @Result(column="host_id", property="hostId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="info", property="info", jdbcType=JdbcType.VARCHAR),
        @Result(column="img_path", property="imgPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MiniVideoEntity> selectByExample(MiniVideoEntityExample example);

    @Select({
        "select",
        "id, type, liveroom_id, host_id, status, title, info, img_path, city_id, create_time, ",
        "update_time",
        "from mini_video",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="liveroom_id", property="liveroomId", jdbcType=JdbcType.BIGINT),
        @Result(column="host_id", property="hostId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="info", property="info", jdbcType=JdbcType.VARCHAR),
        @Result(column="img_path", property="imgPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    MiniVideoEntity selectByPrimaryKey(Long id);

    @UpdateProvider(type=MiniVideoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MiniVideoEntity record, @Param("example") MiniVideoEntityExample example);

    @UpdateProvider(type=MiniVideoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MiniVideoEntity record, @Param("example") MiniVideoEntityExample example);

    @UpdateProvider(type=MiniVideoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MiniVideoEntity record);

    @Update({
        "update mini_video",
        "set type = #{type,jdbcType=TINYINT},",
          "liveroom_id = #{liveroomId,jdbcType=BIGINT},",
          "host_id = #{hostId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=TINYINT},",
          "title = #{title,jdbcType=VARCHAR},",
          "info = #{info,jdbcType=VARCHAR},",
          "img_path = #{imgPath,jdbcType=VARCHAR},",
          "city_id = #{cityId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MiniVideoEntity record);
}