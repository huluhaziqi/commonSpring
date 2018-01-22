package com.lin.commonspring.dao;


import com.lin.commonspring.dao.generated.PlaybackConcatMapper;
import com.lin.commonspring.model.entity.PlaybackConcatEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayBackConcatDao extends PlaybackConcatMapper {

    @Select("select duration from playback_concat where liveroom_id = #{liveroom_id}")
    Integer getDurationByLiveroomId(@Param("liveroom_id") long liveroomId);

    @Select({"select liveroom_id, file_id, url, duration, create_time, update_time",
            "from playback_concat where liveroom_id in (${liveroomIds})"})
    List<PlaybackConcatEntity> getListByIds(@Param("liveroomIds") String liveroomIds);

    @Select("select liveroom_id,file_id,url,duration,create_time,update_time " +
            "from playback_concat where file_id = #{file_id} order by create_time desc limit 1 ")
    PlaybackConcatEntity getByFileId(@Param("file_id") String fileId);

    @Select("select file_id " +
            "from playback_concat where liveroom_id = #{liveroomId}")
    String getFileByLiveroomId(@Param("liveroomId") Long liveroomId);


}
