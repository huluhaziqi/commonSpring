package com.lin.commonspring.dao;

import com.lin.commonspring.dao.generated.MiniVideoRecordMapper;
import com.lin.commonspring.model.entity.MiniVideoRecordEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MiniVideoRecordDao extends MiniVideoRecordMapper {

    @Select({
            "select",
            "mini_video_id, file_id, url, origin_url, mp4_10_url, mp4_20_url, mp4_30_url, ",
            "mp4_40_url, create_time, update_time, duration",
            "from mini_video_record",
            "where file_id = #{fileId}"
    })
    MiniVideoRecordEntity getByFileId(@Param("fileId") String fileId);

    @Select({
            "select",
            "mini_video_id ",
            "from mini_video_record",
            "where file_id = #{fileId}"
    })
    Long getMiniVideoIdByFileId(@Param("fileId") String fileId);
}
