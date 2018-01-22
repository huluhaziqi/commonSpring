package com.lin.commonspring.dao;


import com.lin.commonspring.dao.generated.VideoTagMapper;
import com.lin.commonspring.model.entity.VideoTagEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface VideoTagDao extends VideoTagMapper {

    @Select("select id, status, type, name, create_time,seq FROM video_tag WHERE name = #{name}")
    VideoTagEntity getByName(@Param("name") String name);

    @Select("select id, status, type, name, create_time,seq FROM video_tag WHERE id = #{id}")
    VideoTagEntity getById(@Param("id") Integer id);

    @Select("select video_tag.id, video_tag.status, video_tag.type, video_tag.name, video_tag.create_time,video_tag.seq " +
            "from video_tag inner join mini_video_tag on video_tag.id = mini_video_tag.tag_id where video_tag.status != -1 " +
            "and mini_video_tag.status != -1 and mini_video_tag.mini_video_id = #{miniVideoId}")
    List<VideoTagEntity> getTagsByMiniVideoId(@Param("miniVideoId") long miniVideoId);

    @Select("select mini_video_tag.mini_video_id from mini_video_tag inner join video_tag"
            + " on video_tag.id = mini_video_id.tag_id " + " where video_tag.status != -1 and mini_video_id.status != -1 "
            + " and mini_video_id.tag_id= #{tagId}")
    List<Long> getMiniVideoIdsByTagId(@Param("tagId") int tagId);

    @Select("select id,status,type,name,create_time,seq from video_tag  where status != -1 order by seq asc")
    List<VideoTagEntity> getAllTags();

    @Update("update video_tag set `status` = -1 where id = #{id}")
    void deleteTag(@Param("id") int tagId);
}
