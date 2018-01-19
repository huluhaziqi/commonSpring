package com.lin.commonspring.dao;

import com.lin.commonspring.dao.generated.MiniVideoMapper;
import com.lin.commonspring.model.entity.MiniVideoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface MiniVideoDao extends MiniVideoMapper {

    @Insert("insert into mini_video (type, liveroom_id, host_id, " +
            "status, title, info, " +
            "img_path, " +
            "city_id, create_time, update_time)" +
            "values (#{type, jdbcType=TINYINT}, #{liveroomId,jdbcType=BIGINT}, #{hostId,jdbcType=BIGINT}, " +
            "#{status,jdbcType=TINYINT}, #{title,jdbcType=VARCHAR}, #{info,jdbcType=VARCHAR}, " +
            "#{imgPath,jdbcType=VARCHAR}, " +
            "#{cityId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, " +
            "#{updateTime,jdbcType=TIMESTAMP}) on duplicate key update liveroom_id = #{liveroomId}," +
            "host_id = #{hostId}, status=#{status}, title=#{title}, info=#{info}," +
            "img_path=#{imgPath},img_partial_path=#{imgPartialPath},city_id=#{cityId}," +
            "create_time=#{createTime},update_time=#{updateTime}")
    void insertOrUpdate(MiniVideoEntity miniVideoEntity);

    @Select("select type, liveroom_id,host_id,status,title,info,img_path,img_partial_path,city_id," +
            "create_time,update_time from mini_video where status in (${statusList})")
    List<MiniVideoEntity> getByStatus(String statuslist);

    @Insert("insert into mini_video (id,type, liveroom_id, host_id, " +
            "status, title, info, " +
            "img_path, " +
            "city_id, create_time, update_time)" +
            "values (#{id,jdbcType=BIGINT},#{type,jdbcType=TINYINT}, #{liveroomId,jdbcType=BIGINT}, #{hostId,jdbcType=BIGINT}, " +
            "#{status,jdbcType=TINYINT}, #{title,jdbcType=VARCHAR}, #{info,jdbcType=VARCHAR}, " +
            "#{imgPath,jdbcType=VARCHAR}, " +
            "#{cityId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, " +
            "#{updateTime,jdbcType=TIMESTAMP})")
    void insertWithPrimaryKey(MiniVideoEntity miniVideoEntity);

    @Select("select id, type, liveroom_id, host_id, status, title, info, img_path, city_id," +
            "create_time, update_time from mini_video order by id desc limit #{offset},#{limit}")
    List<MiniVideoEntity> getListByPage(@Param("offset") int offset, @Param("limit") int limit);

    @Select("select * from mini_video where id in (${ids})")
    List<MiniVideoEntity> getByIds(String ids);

    @Select("<script> " +
            "select * from `mini_video` video inner join `mini_video_tag` tag on video.id = tag.mini_video_id" +
            "<where>" +
            "<if test=\"id != null\">and video.id = #{id} </if>" +
            "<if test=\"status != null\">and video.status = #{status} </if>" +
            "<if test=\"cityIds != null\">and video.city_id in (${cityIds}) </if>" +
            "<if test=\"hostId != null\">and video.host_id = #{hostId} </if>" +
            "<if test=\"title != null\">" +
            "<bind name=\"pattern\" value=\"'%' + title + '%'\" />" +
            "and video.title like #{pattern} " +
            "</if>" +
            "<if test=\"startTime != null and endTime != null\">" +
            "and video.create_time between #{startTime} and #{endTime} </if>" +
            "<if test=\"tagId != null\">and tag.tag_id = #{tagId} </if>" +
            "</where>" +
            "order by video.id desc limit #{limitStart},#{limit}" +
            "</script>")
    List<MiniVideoEntity> listForAdmin(@Param("id") Long id, @Param("status") Byte status, @Param("cityIds") String cityIds,
                                       @Param("hostId") Long hostId, @Param("title") String title, @Param("tagId") Integer tagId,
                                       @Param("startTime") Date startTime, @Param("endTime") Date endTime, @Param("limitStart") Integer limitStart,
                                       @Param("limit") Integer limit);

    @Select("<script> " +
            "select count(1) from `mini_video` video inner join `mini_video_tag` tag on video.id = tag.mini_video_id" +
            "<where>" +
            "<if test=\"id != null\">and video.id = #{id} </if>" +
            "<if test=\"status != null\">and video.status = #{status} </if>" +
            "<if test=\"cityIds != null \">and video.city_id in (${cityIds}) </if>" +
            "<if test=\"hostId != null\">and video.host_id = #{hostId} </if>" +
            "<if test=\"title != null\">" +
            "<bind name=\"pattern\" value=\"'%' + title + '%'\" />" +
            "and video.title like #{pattern} " +
            "</if>" +
            "<if test=\"startTime != null and endTime != null\">" +
            "and video.create_time between #{startTime} and #{endTime} </if>" +
            "<if test=\"tagId != null\">and tag.tag_id = #{tagId} </if>" +
            "</where>" +
            "</script>")
    int countForAdmin(@Param("id") Long id, @Param("status") Byte status, @Param("cityIds") String cityIds,
                      @Param("hostId") Long hostId, @Param("title") String title, @Param("tagId") Integer tagId,
                      @Param("startTime") Date startTime, @Param("endTime") Date endTime);
}
