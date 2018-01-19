package com.lin.commonspring.dao;

import com.lin.commonspring.dao.generated.MiniVideoTagMapper;
import com.lin.commonspring.model.entity.MiniVideoTagEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MiniVideoTagDao extends MiniVideoTagMapper {
    @Delete({
            "delete from mini_video_tag",
            "where mini_video_id = #{miniVideoId}"
    })
    int deleteByMiniVideoId(Long id);

    @Select("select id, mini_video_id, tag_id, status from mini_video_tag where mini_video_id = #{miniVideoId}")
    List<MiniVideoTagEntity> getByMiniVideoId(@Param("miniVideoId") long miniVideoId);
}
