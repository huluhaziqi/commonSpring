package com.lin.commonspring.service;

import com.lin.commonspring.enums.MiniVideoPlatformEnum;
import com.lin.commonspring.model.entity.StatMiniVideoEntity;

import java.util.Set;

public interface StatMiniVideoService {

    void increaseTotalVv(long miniVideoId, int count);

    void increaseAppVv(long miniVideoId, int count);

    void increaseWapVv(long miniVideoId, int count);

    void increasePcVv(long miniVideoId, int count);

    void increaseRobotVv(long miniVideoId, int count);

    void increaseLikeCount(long miniVideoId, int count);


    long getTotalVv(long miniVideoId);

    long getAppVv(long miniVideoId);

    long getWapVv(long miniVideoId);

    long getPcVv(long miniVideoId);

    long getRobotVv(long miniVideoId);

    long getLikeCount(long miniVideoId);


    void updateTotalVv(long miniVideoId, int count);

    void updateAppVv(long miniVideoId, int count);

    void updateWapVv(long miniVideoId, int count);

    void updatePcVv(long miniVideoId, int count);

    void updateRobotVv(long miniVideoId, int count);

    void updateLikeCount(long miniVideoId, int count);

    void incVv(long miniVideoId, Integer newVv, MiniVideoPlatformEnum miniVideoPlatformEnum);

    void addDurationMiniVideoId(long miniVideoId);

    Set<String> getDurationIdSet(String timeKey);

    Set<String> getDurationIdSetByDateKey(String dateKey);

    StatMiniVideoEntity getByMiniVideoId(long miniVideoId);

    void updateFromRedisToDb(long miniVideoId);

    void insertStatMiniVideo(long miniVideoId);
}
