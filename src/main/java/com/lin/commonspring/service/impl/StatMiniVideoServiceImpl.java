package com.lin.commonspring.service.impl;

import com.lin.commonspring.dao.StatMiniVideoDao;
import com.lin.commonspring.enums.MiniVideoPlatformEnum;
import com.lin.commonspring.model.entity.StatMiniVideoEntity;
import com.lin.commonspring.redisdao.StatMiniVideoRedisDao;
import com.lin.commonspring.service.StatMiniVideoService;
import com.lin.commonspring.util.TimeUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Date;
import java.util.Set;

@Service
public class StatMiniVideoServiceImpl implements StatMiniVideoService {

    @Resource
    private StatMiniVideoDao statMiniVideoDao;

    @Resource
    private StatMiniVideoRedisDao statMiniVideoRedisDao;

    private Date next10minute;
    private String currentTimekey;

    @PostConstruct
    public void init() {
        Date currentTime = TimeUtils.getCurrentTenMinute().getTime();
        next10minute = TimeUtils.getNextTenMinute().getTime();
        currentTimekey = TimeUtils.getMinuteKey(currentTime);
    }

    //添加某时刻活跃的小视频
    @Override
    public void addDurationMiniVideoId(long miniVideoId) {
        checkoutIime();
        statMiniVideoRedisDao.addDurationActiveMiniVideoId(currentTimekey, miniVideoId);
    }

    //获取某时刻活跃的小视频
    @Override
    public Set<String> getDurationIdSet(String timeKey) {
        return statMiniVideoRedisDao.getDurationActiveIdSetByTimeKey(timeKey);
    }

    //获取某日所有的活跃小视频
    @Override
    public Set<String> getDurationIdSetByDateKey(String dateKey) {
        String DURATION_ACTIVE_MINI_VIDEO_SETKEY = "DURATION_ACTIVE_MINI_VIDEO_%s*";
        Set<String> setString = statMiniVideoRedisDao.getRedisByKeys(String.format(DURATION_ACTIVE_MINI_VIDEO_SETKEY, dateKey));
        String[] keys = setString.toArray(new String[setString.size()]);
        return statMiniVideoRedisDao.getDurationActiveIdSetByTimeKeys(keys);
    }

    private void checkoutIime() {
        // 增加十分钟内直播间访问记录
        Date now = new Date();
        if (now.getTime() > next10minute.getTime()) {
            currentTimekey = TimeUtils.getMinuteKey(TimeUtils.getCurrentTenMinute().getTime());
            next10minute = TimeUtils.getNextTenMinute().getTime();
        }
    }

    @Override
    public void increaseTotalVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.incrTotalVv(miniVideoId, count);
    }

    @Override
    public void increaseAppVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.incrAppVv(miniVideoId, count);
    }

    @Override
    public void increaseWapVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.incrWapVv(miniVideoId, count);
    }

    @Override
    public void increasePcVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.incrPcVv(miniVideoId, count);
    }

    @Override
    public void increaseRobotVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.incrRobotVv(miniVideoId, count);
    }


    @Override
    public void increaseLikeCount(long miniVideoId, int count) {
        statMiniVideoRedisDao.incrLikeCount(miniVideoId, count);
    }

    @Override
    public long getTotalVv(long miniVideoId) {
        long totalVv = statMiniVideoRedisDao.getTotalVv(miniVideoId);
        if (totalVv < 0) {
            totalVv = statMiniVideoDao.getTotalVvById(miniVideoId);
        }
        return totalVv <= 0 ? 0 : totalVv;
    }

    @Override
    public long getAppVv(long miniVideoId) {
        long appVv = statMiniVideoRedisDao.getAppVv(miniVideoId);
        if (appVv < 0) {
            appVv = statMiniVideoDao.getAppVvById(miniVideoId);
        }
        return appVv <= 0 ? 0 : appVv;
    }

    @Override
    public long getWapVv(long miniVideoId) {
        long wapVv = statMiniVideoRedisDao.getWapVv(miniVideoId);
        if (wapVv < 0) {
            wapVv = statMiniVideoDao.getWapVvById(miniVideoId);
        }
        return wapVv <= 0 ? 0 : wapVv;
    }

    @Override
    public long getPcVv(long miniVideoId) {
        long pcVv = statMiniVideoRedisDao.getPcVv(miniVideoId);
        if (pcVv < 0) {
            pcVv = statMiniVideoDao.getPcVvById(miniVideoId);
        }
        return pcVv <= 0 ? 0 : pcVv;
    }

    @Override
    public long getRobotVv(long miniVideoId) {
        long robotVv = statMiniVideoRedisDao.getRobotVv(miniVideoId);
        if (robotVv < 0) {
            robotVv = statMiniVideoDao.getRobotVvById(miniVideoId);
        }
        return robotVv <= 0 ? 0 : robotVv;
    }

    @Override
    public long getLikeCount(long miniVideoId) {
        long likeCount = statMiniVideoRedisDao.getLikeCount(miniVideoId);
        if (likeCount < 0) {
            likeCount = statMiniVideoDao.getLikeCountById(miniVideoId);
        }
        return likeCount <= 0 ? 0 : likeCount;
    }

    @Override
    public void updateTotalVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.updateTotalVv(miniVideoId, count);
        StatMiniVideoEntity entity = statMiniVideoDao.selectByPrimaryKey(miniVideoId);
        if (entity == null) {
            entity = new StatMiniVideoEntity();
            entity.setMiniVideoId(miniVideoId);
        }
        entity.setTotalVv((long) count);
        statMiniVideoDao.updateByPrimaryKey(entity);
    }

    @Override
    public void updateAppVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.updateAppVv(miniVideoId, count);
        StatMiniVideoEntity entity = statMiniVideoDao.selectByPrimaryKey(miniVideoId);
        if (entity == null) {
            entity = new StatMiniVideoEntity();
            entity.setMiniVideoId(miniVideoId);
        }
        entity.setAppVv((long) count);
        statMiniVideoDao.updateByPrimaryKey(entity);
    }

    @Override
    public void updateWapVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.updateWapVv(miniVideoId, count);
        StatMiniVideoEntity entity = statMiniVideoDao.selectByPrimaryKey(miniVideoId);
        if (entity == null) {
            entity = new StatMiniVideoEntity();
            entity.setMiniVideoId(miniVideoId);
        }
        entity.setAppVv((long) count);
        statMiniVideoDao.updateByPrimaryKey(entity);
    }

    @Override
    public void updatePcVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.updatePcVv(miniVideoId, count);
        StatMiniVideoEntity entity = statMiniVideoDao.selectByPrimaryKey(miniVideoId);
        if (entity == null) {
            entity = new StatMiniVideoEntity();
            entity.setMiniVideoId(miniVideoId);
        }
        entity.setPcVv((long) count);
        statMiniVideoDao.updateByPrimaryKey(entity);
    }

    @Override
    public void updateRobotVv(long miniVideoId, int count) {
        statMiniVideoRedisDao.updateRobotVv(miniVideoId, count);
        StatMiniVideoEntity entity = statMiniVideoDao.selectByPrimaryKey(miniVideoId);
        if (entity == null) {
            entity = new StatMiniVideoEntity();
            entity.setMiniVideoId(miniVideoId);
        }
        entity.setRobotVv((long) count);
        statMiniVideoDao.updateByPrimaryKey(entity);
    }

    @Override
    public void updateLikeCount(long miniVideoId, int count) {
        statMiniVideoRedisDao.updateLikeCount(miniVideoId, count);
        StatMiniVideoEntity entity = statMiniVideoDao.selectByPrimaryKey(miniVideoId);
        if (entity == null) {
            entity = new StatMiniVideoEntity();
            entity.setMiniVideoId(miniVideoId);
        }
        entity.setLikeCount((long) count);
        statMiniVideoDao.updateByPrimaryKey(entity);
    }

    @Override
    public void incVv(long miniVideoId, Integer newVv, MiniVideoPlatformEnum miniVideoPlatformEnum) {
        switch (miniVideoPlatformEnum) {
            case APP:
                statMiniVideoRedisDao.incrAppVv(miniVideoId, newVv);
                break;
            case WAP:
                statMiniVideoRedisDao.incrWapVv(miniVideoId, newVv);
                break;
            case PC:
                statMiniVideoRedisDao.incrPcVv(miniVideoId, newVv);
                break;
            default:
                break;
        }
        statMiniVideoRedisDao.incrTotalVv(miniVideoId, newVv);
    }

    @Override
    public StatMiniVideoEntity getByMiniVideoId(long miniVideoId) {
        StatMiniVideoEntity entity = statMiniVideoRedisDao.getEntityFromRedis(miniVideoId);
        if (entity == null) {
            entity = statMiniVideoDao.selectByPrimaryKey(miniVideoId);
        }
        return entity;
    }

    @Override
    public void updateFromRedisToDb(long miniVideoId) {
        StatMiniVideoEntity entityFromDb = statMiniVideoDao.selectByPrimaryKey(miniVideoId);
        if (entityFromDb == null) {
            entityFromDb = new StatMiniVideoEntity(miniVideoId, true);
        }
        StatMiniVideoEntity entity = statMiniVideoRedisDao.getEntityFromRedis(miniVideoId);
        if (entity != null) {
            entityFromDb.setTotalVv(Math.max(entityFromDb.getTotalVv(), entity.getTotalVv()));
            entityFromDb.setAppVv(Math.max(entityFromDb.getAppVv(), entity.getAppVv()));
            entityFromDb.setWapVv(Math.max(entityFromDb.getWapVv(), entity.getWapVv()));
            entityFromDb.setPcVv(Math.max(entityFromDb.getPcVv(), entity.getPcVv()));
            entityFromDb.setRobotVv(Math.max(entityFromDb.getRobotVv(), entity.getRobotVv()));
            entityFromDb.setLikeCount(Math.max(entityFromDb.getLikeCount(), entity.getLikeCount()));
        }
        statMiniVideoDao.insertOrUpdate(entityFromDb);
    }

    @Override
    public void insertStatMiniVideo(long miniVideoId) {
        StatMiniVideoEntity entity = new StatMiniVideoEntity(miniVideoId, true);
        statMiniVideoDao.insert(entity);
        updateFromRedisToDb(miniVideoId);
    }
}
