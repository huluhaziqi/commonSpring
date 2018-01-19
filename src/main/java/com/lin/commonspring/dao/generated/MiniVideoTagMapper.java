package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoTagEntity;
import com.lin.commonspring.model.entity.MiniVideoTagEntityExample;
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

public interface MiniVideoTagMapper {
    @SelectProvider(type=MiniVideoTagSqlProvider.class, method="countByExample")
    long countByExample(MiniVideoTagEntityExample example);

    @DeleteProvider(type=MiniVideoTagSqlProvider.class, method="deleteByExample")
    int deleteByExample(MiniVideoTagEntityExample example);

    @Delete({
        "delete from mini_video_tag",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into mini_video_tag (id, mini_video_id, ",
        "tag_id, status)",
        "values (#{id,jdbcType=BIGINT}, #{miniVideoId,jdbcType=BIGINT}, ",
        "#{tagId,jdbcType=BIGINT}, #{status,jdbcType=TINYINT})"
    })
    int insert(MiniVideoTagEntity record);

    @InsertProvider(type=MiniVideoTagSqlProvider.class, method="insertSelective")
    int insertSelective(MiniVideoTagEntity record);

    @SelectProvider(type=MiniVideoTagSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    List<MiniVideoTagEntity> selectByExample(MiniVideoTagEntityExample example);

    @Select({
        "select",
        "id, mini_video_id, tag_id, status",
        "from mini_video_tag",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mini_video_id", property="miniVideoId", jdbcType=JdbcType.BIGINT),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    MiniVideoTagEntity selectByPrimaryKey(Long id);

    @UpdateProvider(type=MiniVideoTagSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MiniVideoTagEntity record, @Param("example") MiniVideoTagEntityExample example);

    @UpdateProvider(type=MiniVideoTagSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MiniVideoTagEntity record, @Param("example") MiniVideoTagEntityExample example);

    @UpdateProvider(type=MiniVideoTagSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MiniVideoTagEntity record);

    @Update({
        "update mini_video_tag",
        "set mini_video_id = #{miniVideoId,jdbcType=BIGINT},",
          "tag_id = #{tagId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MiniVideoTagEntity record);
}