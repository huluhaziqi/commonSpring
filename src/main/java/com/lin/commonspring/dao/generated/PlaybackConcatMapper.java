package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.PlaybackConcatEntity;
import com.lin.commonspring.model.entity.PlaybackConcatEntityExample;
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

public interface PlaybackConcatMapper {
    @SelectProvider(type=PlaybackConcatSqlProvider.class, method="countByExample")
    long countByExample(PlaybackConcatEntityExample example);

    @DeleteProvider(type=PlaybackConcatSqlProvider.class, method="deleteByExample")
    int deleteByExample(PlaybackConcatEntityExample example);

    @Delete({
        "delete from playback_concat",
        "where liveroom_id = #{liveroomId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long liveroomId);

    @Insert({
        "insert into playback_concat (liveroom_id, file_id, ",
        "url, origin_url, ",
        "mp4_10_url, mp4_20_url, ",
        "mp4_30_url, mp4_40_url, ",
        "hls_10_url, hls_20_url, ",
        "hls_30_url, hls_40_url, ",
        "flv_10046_url, flv_10047_url, ",
        "flv_10048_url, flv_10049_url, ",
        "duration, create_time, ",
        "update_time)",
        "values (#{liveroomId,jdbcType=BIGINT}, #{fileId,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{originUrl,jdbcType=VARCHAR}, ",
        "#{mp410Url,jdbcType=VARCHAR}, #{mp420Url,jdbcType=VARCHAR}, ",
        "#{mp430Url,jdbcType=VARCHAR}, #{mp440Url,jdbcType=VARCHAR}, ",
        "#{hls10Url,jdbcType=VARCHAR}, #{hls20Url,jdbcType=VARCHAR}, ",
        "#{hls30Url,jdbcType=VARCHAR}, #{hls40Url,jdbcType=VARCHAR}, ",
        "#{flv10046Url,jdbcType=VARCHAR}, #{flv10047Url,jdbcType=VARCHAR}, ",
        "#{flv10048Url,jdbcType=VARCHAR}, #{flv10049Url,jdbcType=VARCHAR}, ",
        "#{duration,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(PlaybackConcatEntity record);

    @InsertProvider(type=PlaybackConcatSqlProvider.class, method="insertSelective")
    int insertSelective(PlaybackConcatEntity record);

    @SelectProvider(type=PlaybackConcatSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="liveroom_id", property="liveroomId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="origin_url", property="originUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_10_url", property="mp410Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_20_url", property="mp420Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_30_url", property="mp430Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_40_url", property="mp440Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="hls_10_url", property="hls10Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="hls_20_url", property="hls20Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="hls_30_url", property="hls30Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="hls_40_url", property="hls40Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="flv_10046_url", property="flv10046Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="flv_10047_url", property="flv10047Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="flv_10048_url", property="flv10048Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="flv_10049_url", property="flv10049Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PlaybackConcatEntity> selectByExample(PlaybackConcatEntityExample example);

    @Select({
        "select",
        "liveroom_id, file_id, url, origin_url, mp4_10_url, mp4_20_url, mp4_30_url, mp4_40_url, ",
        "hls_10_url, hls_20_url, hls_30_url, hls_40_url, flv_10046_url, flv_10047_url, ",
        "flv_10048_url, flv_10049_url, duration, create_time, update_time",
        "from playback_concat",
        "where liveroom_id = #{liveroomId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="liveroom_id", property="liveroomId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="origin_url", property="originUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_10_url", property="mp410Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_20_url", property="mp420Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_30_url", property="mp430Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="mp4_40_url", property="mp440Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="hls_10_url", property="hls10Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="hls_20_url", property="hls20Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="hls_30_url", property="hls30Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="hls_40_url", property="hls40Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="flv_10046_url", property="flv10046Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="flv_10047_url", property="flv10047Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="flv_10048_url", property="flv10048Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="flv_10049_url", property="flv10049Url", jdbcType=JdbcType.VARCHAR),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PlaybackConcatEntity selectByPrimaryKey(Long liveroomId);

    @UpdateProvider(type=PlaybackConcatSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PlaybackConcatEntity record, @Param("example") PlaybackConcatEntityExample example);

    @UpdateProvider(type=PlaybackConcatSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PlaybackConcatEntity record, @Param("example") PlaybackConcatEntityExample example);

    @UpdateProvider(type=PlaybackConcatSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlaybackConcatEntity record);

    @Update({
        "update playback_concat",
        "set file_id = #{fileId,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "origin_url = #{originUrl,jdbcType=VARCHAR},",
          "mp4_10_url = #{mp410Url,jdbcType=VARCHAR},",
          "mp4_20_url = #{mp420Url,jdbcType=VARCHAR},",
          "mp4_30_url = #{mp430Url,jdbcType=VARCHAR},",
          "mp4_40_url = #{mp440Url,jdbcType=VARCHAR},",
          "hls_10_url = #{hls10Url,jdbcType=VARCHAR},",
          "hls_20_url = #{hls20Url,jdbcType=VARCHAR},",
          "hls_30_url = #{hls30Url,jdbcType=VARCHAR},",
          "hls_40_url = #{hls40Url,jdbcType=VARCHAR},",
          "flv_10046_url = #{flv10046Url,jdbcType=VARCHAR},",
          "flv_10047_url = #{flv10047Url,jdbcType=VARCHAR},",
          "flv_10048_url = #{flv10048Url,jdbcType=VARCHAR},",
          "flv_10049_url = #{flv10049Url,jdbcType=VARCHAR},",
          "duration = #{duration,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where liveroom_id = #{liveroomId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PlaybackConcatEntity record);
}