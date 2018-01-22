package com.lin.commonspring.service.impl;

import com.lin.commonspring.dao.*;
import com.lin.commonspring.enums.MiniVideoCutStatusEnum;
import com.lin.commonspring.enums.MiniVideoTagStatusEnum;
import com.lin.commonspring.model.PagingInterface;
import com.lin.commonspring.model.biz.miniVideo.MiniVideoForAdmin;
import com.lin.commonspring.model.entity.*;
import com.lin.commonspring.model.view.CityAndProvinceMapView;
import com.lin.commonspring.service.*;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class MiniVideoServiceImpl implements MiniVideoService {

    @Value("${qcloudcos.bucketBaseUrl}")
    private String bucketBaseUrl;

    @Autowired
    private MiniVideoCutRecordDao miniVideoCutRecordDao;

    @Autowired
    private MiniVideoTagDao miniVideoTagDao;

    @Autowired
    private VideoTagDao videoTagDao;

    @Autowired
    private MiniVideoRecordDao miniVideoRecordDao;

    @Autowired
    private MiniVideoBuildingDao miniVideoBuildingDao;

    @Autowired
    private SequenceService sequenceService;

    @Autowired
    private MiniVideoDao miniVideoDao;

    @Autowired
    private StatMiniVideoService statMiniVideoService;

    @Autowired
    private MiniVideoReviewService miniVideoReviewService;

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private UserService userService;

    private static final String MINI_VIDEO_SEQUENCE_TABLE_NAME = "mini_video";
    private static final Logger logger = LoggerFactory.getLogger(MiniVideoServiceImpl.class);

    @Override
    public void createMiniVideoCutRecord(Long liveroomId, String fileId, String vodTaskId) {
        MiniVideoCutRecordEntity entity = miniVideoCutRecordDao.getByVodTaskId(vodTaskId);
        if (entity == null) {
            entity = new MiniVideoCutRecordEntity();
            entity.setLiveroomId(liveroomId);
            entity.setOriginFileId(fileId);
            entity.setVodTaskId(vodTaskId);
            entity.setStatus(MiniVideoCutStatusEnum.CUT.getValue());
            Date date = new Date();
            entity.setCreateTime(date);
            entity.setUpdateTime(date);
            //
            miniVideoCutRecordDao.insertSelective(entity);
        } else {
            entity.setVodTaskId(vodTaskId);
            entity.setStatus(MiniVideoCutStatusEnum.CUT.getValue());
            entity.setUpdateTime(new Date());
            miniVideoCutRecordDao.updateByPrimaryKeySelective(entity);
        }

    }

    @Override
    public Long createMiniVideo(MiniVideoEntity miniVideoEntity, long uid, List<Integer> tagIdList,
                                List<String> buildingIdList, int buildingType, String vodTaskId) {
        long miniVideoId = sequenceService.getNexIdByTableName(MINI_VIDEO_SEQUENCE_TABLE_NAME);
        try {
            //更新插入miniVideoEntity
            miniVideoEntity.setId(miniVideoId);
            miniVideoDao.insertWithPrimaryKey(miniVideoEntity);
            //插入miniVideoRecord表
            MiniVideoRecordEntity miniVideoRecordEntity = new MiniVideoRecordEntity();
            miniVideoRecordEntity.setMiniVideoId(miniVideoId);
            miniVideoRecordEntity.setCreateTime(new Timestamp(System.currentTimeMillis()));
            miniVideoRecordDao.insert(miniVideoRecordEntity);
            //标签
            if (!CollectionUtils.isEmpty(tagIdList)) {
                updateMiniVideoTag(miniVideoId, tagIdList);
            }
            //楼盘
            if (buildingIdList != null && !buildingIdList.isEmpty()) {
                updateMiniVideoRelateBuilding(miniVideoId, buildingIdList, buildingType);
            }
            statMiniVideoService.insertStatMiniVideo(miniVideoId);
            //更新miniVideoId
            miniVideoCutRecordDao.updateMiniVideoIdByVodTaskId(miniVideoId, vodTaskId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return miniVideoId;
    }

    @Override
    public List<VideoTagEntity> getAllTags() {
        return videoTagDao.getAllTags();
    }

    @Override
    public List<MiniVideoCutRecordEntity> getUnHandledEntity(long liveroomId) {
        List<MiniVideoCutRecordEntity> entities = miniVideoCutRecordDao.getUnHandledEntity(liveroomId);
        return entities;
    }

    @Override
    public MiniVideoEntity getEntityById(Long miniVideoId) {
        return miniVideoDao.selectByPrimaryKey(miniVideoId);
    }

    @Override
    public void updateReviewStatus(Long miniVideoId, Byte status) {

    }

    @Override
    public Map<Long, MiniVideoForAdmin> getMiniVideoForAdminMap(List<Long> ids) {
        List<MiniVideoEntity> entities = miniVideoDao.getByIds(StringUtils.join(ids, ","));
        if(CollectionUtils.isEmpty(entities)) {
            return new HashMap<>();
        }
        List<MiniVideoForAdmin> admins = convertEntityToForAdmin(entities);
        return admins.stream().collect(Collectors.toMap(MiniVideoForAdmin::getId, MiniVideoForAdmin -> MiniVideoForAdmin));
    }

    @Override
    public List<MiniVideoForAdmin> listMiniVideoForAdmin(Long id, Byte status, List<Integer> cityIdList, Long hostId,
                                                         String title, Integer tagId, Date startTime, Date endTime,
                                                         PagingInterface pagingInterface) {
        String cityIds = StringUtils.join(cityIdList, ",");
        if(StringUtils.isEmpty(cityIds)) {
            cityIds = null;
        }
        List<MiniVideoEntity> entities = miniVideoDao.listForAdmin(id, status, cityIds, hostId, title, tagId, startTime,
                endTime, pagingInterface.getOffset(), pagingInterface.getLimit());
        return convertEntityToForAdmin(entities);
    }

    @Override
    public int countMiniVideoForAdmin(Long id, Byte status, List<Integer> cityIdList, Long hostId, String title,
                                      Integer tagId, Date startTime, Date endTime) {
        String cityIds = StringUtils.join(cityIdList, ",");
        if(StringUtils.isEmpty(cityIds)) {
            cityIds = null;
        }
        return miniVideoDao.countForAdmin(id, status, cityIds, hostId, title, tagId, startTime, endTime);
    }

    //更新小视频绑定的标签
    private void updateMiniVideoTag(long miniVideoId, List<Integer> tagIdList) {
        //去重
        Set<Integer> set = new HashSet<>(tagIdList);
        tagIdList.clear();
        tagIdList.addAll(set);
        //修改
        miniVideoTagDao.deleteByMiniVideoId(miniVideoId);
        for (Integer tagId : tagIdList) {
            VideoTagEntity videoTagEntity = videoTagDao.getById(tagId);
            if (videoTagEntity != null) {
                MiniVideoTagEntity entity = new MiniVideoTagEntity();
                entity.setMiniVideoId(miniVideoId);
                entity.setTagId(videoTagEntity.getId());
                entity.setStatus(MiniVideoTagStatusEnum.NORMAL.getValue());
                miniVideoTagDao.insert(entity);
            }
        }
    }

    //更新小视频绑定的楼盘
    private void updateMiniVideoRelateBuilding(long miniVideoId, List<String> buildingIds, int buildingType) {
        miniVideoBuildingDao.deleteByMiniVideoId(miniVideoId);
        for (String buildingId : buildingIds) {
            MiniVideoBuildingEntity entity = new MiniVideoBuildingEntity();
            entity.setBuildingId(buildingId);
            entity.setStatus((byte) 1);
            entity.setMiniVideoId(miniVideoId);
            entity.setBuildingType((byte) buildingType);
            entity.setUpdateTime(new Timestamp(System.currentTimeMillis()));
            miniVideoBuildingDao.insertOrUpdate(entity);
        }
    }

    private List<MiniVideoForAdmin> convertEntityToForAdmin(List<MiniVideoEntity> entities) {
        if (CollectionUtils.isEmpty(entities)) {
            return new ArrayList<>();
        }
        List<MiniVideoForAdmin> result = new ArrayList<>();
        CityAndProvinceMapView cityAndProvinceMap = buildingService.getCityAndProvinceMap();
        for (MiniVideoEntity entity : entities) {
            MiniVideoForAdmin miniVideoForAdmin = new MiniVideoForAdmin(entity);
            //城市
            if (cityAndProvinceMap.getCityMap().get(miniVideoForAdmin.getCityId()) != null) {
                miniVideoForAdmin.setCityStr(cityAndProvinceMap.getCityMap().get(miniVideoForAdmin.getCityId()).getCityName());
            }
            //主播
            miniVideoForAdmin.setHost(userService.getUser(entity.getHostId()));
            //视频信息
            miniVideoForAdmin.setRecord(miniVideoRecordDao.selectByPrimaryKey(entity.getId()));
            //封面
            miniVideoForAdmin.setImgUrl(bucketBaseUrl + entity.getImgPath());
            //绑定楼盘

            //标签
            result.add(miniVideoForAdmin);
        }
        return result;
    }
}