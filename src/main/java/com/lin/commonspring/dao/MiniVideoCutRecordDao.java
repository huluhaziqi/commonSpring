package com.lin.commonspring.dao;

import com.lin.commonspring.dao.generated.MiniVideoCutRecordMapper;
import com.lin.commonspring.model.entity.MiniVideoCutRecordEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface MiniVideoCutRecordDao extends MiniVideoCutRecordMapper {

    @Select("select id, liveroom_id,mini_video_id," +
            "vod_task_id, origin_file_id," +
            "new_file_id, status," +
            "create_time, update_time from mini_video_cut_record where vod_task_id = #{vodTaskId}")
    MiniVideoCutRecordEntity getByVodTaskId(String vodTaskId);

    //更新miniVideoId
    @Update("update mini_video_cut_record set mini_video_id = #{miniVideoId} where vod_task_id = #{vodTaskId}")
    void updateMiniVideoIdByVodTaskId(@Param("miniVideoId") long miniVideoId, @Param("vodTaskId") String vodTaskId);

    @Select("select id, liveroom_id,mini_video_id," +
            "vod_task_id, origin_file_id," +
            "new_file_id, status," +
            "create_time, update_time from mini_video_cut_record where liveroom_id = #{liveroomId} and " +
            "status in (1,2)")
    //处于剪切中或者转码中的小视频任务
    List<MiniVideoCutRecordEntity> getUnHandledEntity(@Param("liveroomId") long liveroomId);
}
