package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoBuildingEntity;
import com.lin.commonspring.model.entity.MiniVideoBuildingEntityExample;
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

public interface MiniVideoBuildingMapper {
    @SelectProvider(type=MiniVideoBuildingSqlProvider.class, method="countByExample")
    long countByExample(MiniVideoBuildingEntityExample example);

    @DeleteProvider(type=MiniVideoBuildingSqlProvider.class, method="deleteByExample")
    int deleteByExample(MiniVideoBuildingEntityExample example);

    @Delete({
        "delete from mini_video_building",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into mini_video_building (id, mini_video_id, ",
        "building_id, status, ",
        "update_time, building_type)",
        "values (#{id,jdbcType=BIGINT}, #{miniVideoId,jdbcType=BIGINT}, ",
        "#{buildingId,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{buildingType,jdbcType=TINYINT})"
    })
    int insert(MiniVideoBuildingEntity record);

    @InsertProvider(type=MiniVideoBuildingSqlProvider.class, method="insertSelective")
    int insertSelective(MiniVideoBuildingEntity record);

    @SelectProvider(type=MiniVideoBuildingSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT),
        @Result(column="building_id", property="buildingId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="building_type", property="buildingType", jdbcType=JdbcType.TINYINT)
    })
    List<MiniVideoBuildingEntity> selectByExample(MiniVideoBuildingEntityExample example);

    @Select({
        "select",
        "id, mini_video_id, building_id, status, update_time, building_type",
        "from mini_video_building",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT),
        @Result(column="building_id", property="buildingId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="building_type", property="buildingType", jdbcType=JdbcType.TINYINT)
    })
    MiniVideoBuildingEntity selectByPrimaryKey(Long id);

    @UpdateProvider(type=MiniVideoBuildingSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MiniVideoBuildingEntity record, @Param("example") MiniVideoBuildingEntityExample example);

    @UpdateProvider(type=MiniVideoBuildingSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MiniVideoBuildingEntity record, @Param("example") MiniVideoBuildingEntityExample example);

    @UpdateProvider(type=MiniVideoBuildingSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MiniVideoBuildingEntity record);

    @Update({
        "update mini_video_building",
        "set mini_video_id = #{miniVideoId,jdbcType=BIGINT},",
          "building_id = #{buildingId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "building_type = #{buildingType,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MiniVideoBuildingEntity record);
}