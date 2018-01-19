package com.lin.commonspring.dao;


import com.lin.commonspring.dao.generated.MiniVideoBuildingMapper;
import com.lin.commonspring.model.entity.MiniVideoBuildingEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MiniVideoBuildingDao extends MiniVideoBuildingMapper {

    @Update("update mini_video_building set status = -1 where mini_video_id = #{miniVideoId} and status = 1")
    void deleteByMiniVideoId(@Param("miniVideoId") long miniVideoId);

    @Insert("insert into mini_video_building (mini_video_id,building_id,status,update_time,building_type) " +
            "values (#{miniVideoId},#{buildingId},#{status},#{updateTime},#{buildingType}) on duplicate key " +
            "update mini_video_id = #{miniVideoId}, building_id = #{buildingId},status = #{status}," +
            " update_time = #{updateTime},building_type = #{buildingType} ")
    void insertOrUpdate(MiniVideoBuildingEntity miniVideoBuildingEntity);
}
