package com.lin.commonspring.redisdao;


import com.lin.commonspring.model.entity.StatMiniVideoEntity;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Set;

@Repository
public class StatMiniVideoRedisDao {

    @Resource
    private JedisService jedisService;

    private static final String STAT_MINI_VIDEO_HASHKEY = "STAT_MINI_VIDEO_%s";

    private static final String STAT_MINI_VIDEO_TOTAL_VV_HASHFIELD = "STAT_MINI_VIDEO_TOTAL_VV";
    private static final String STAT_MINI_VIDEO_APP_VV_HASHFIELD = "STAT_MINI_VIDEO_APP_VV";
    private static final String STAT_MINI_VIDEO_PC_VV_HASHFIELD = "STAT_MINI_VIDEO_WAP_VV";
    private static final String STAT_MINI_VIDEO_WAP_VV_HASHFIELD = "STAT_MINI_VIDEO_PC_VV";
    private static final String STAT_MINI_VIDEO_ROBOT_VV_HASHFIELD = "STAT_MINI_VIDEO_ROBOT_VV";
    private static final String STAT_MINI_VIDEO_LIKE_COUNT_HASHFIELD = "STAT_MINI_VIDEO_LIKE_COUNT";

    //一段时间活跃的小视频
    private static final String DURATION_ACTIVE_MINI_VIDEO_SETKEY = "DURATION_ACTIVE_MINI_VIDEO_%s";

    //时间段活跃小视频
    public int addDurationActiveMiniVideoId(String timeKey ,long miniVideoId){
        Long result = jedisService.executePersist(jedis -> jedis.sadd( String.format(DURATION_ACTIVE_MINI_VIDEO_SETKEY, timeKey), String.valueOf(miniVideoId)));
        return result.intValue();
    }

    public Set<String> getDurationActiveIdSetByTimeKey(String timeKey){
        return jedisService.executePersist(jedis -> jedis.smembers(String.format(DURATION_ACTIVE_MINI_VIDEO_SETKEY, timeKey)));
    }

    public Set<String> getDurationActiveIdSetByTimeKeys(String... keys){
        return jedisService.executePersist(jedis -> jedis.sunion(keys));
    }

    public Set<String> getRedisByKeys(String keys){
        return jedisService.executePersist(jedis -> jedis.keys(keys));
    }

    //totalVv
    public int getTotalVv(long miniVideoId) {
        String totalVvStr = jedisService.executePersist(jedis -> jedis.hget(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_TOTAL_VV_HASHFIELD));
        return NumberUtils.toInt(totalVvStr, -1);
    }

    public Integer incrTotalVv(long miniVideoId, int newCount) {
        Long totalVv = jedisService.executePersist(jedis -> jedis.hincrBy(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_TOTAL_VV_HASHFIELD, newCount));
        return totalVv.intValue();
    }

    public void updateTotalVv(long miniVideoId, int newCount) {
        jedisService.executePersist(jedis -> jedis.hset(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_TOTAL_VV_HASHFIELD, String.valueOf(newCount)));
    }

    //appVv
    public int getAppVv(long miniVideoId) {
        String appVvStr = jedisService.executePersist(jedis -> jedis.hget(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_APP_VV_HASHFIELD));
        return NumberUtils.toInt(appVvStr, -1);
    }

    public Integer incrAppVv(long miniVideoId, int newCount) {
        Long appVv = jedisService.executePersist(jedis -> jedis.hincrBy(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_APP_VV_HASHFIELD, newCount));
        return appVv.intValue();
    }

    public void updateAppVv(long miniVideoId, int newCount) {
        jedisService.executePersist(jedis -> jedis.hset(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_APP_VV_HASHFIELD, String.valueOf(newCount)));
    }

    //wapVv
    public int getWapVv(long miniVideoId) {
        String wapVvStr = jedisService.executePersist(jedis -> jedis.hget(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_WAP_VV_HASHFIELD));
        return NumberUtils.toInt(wapVvStr, -1);
    }

    public Integer incrWapVv(long miniVideoId, int newCount) {
        Long wapVv = jedisService.executePersist(jedis -> jedis.hincrBy(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_WAP_VV_HASHFIELD, newCount));
        return wapVv.intValue();
    }

    public void updateWapVv(long miniVideoId, int newCount) {
        jedisService.executePersist(jedis -> jedis.hset(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_WAP_VV_HASHFIELD, String.valueOf(newCount)));
    }

    //pcVv
    public int getPcVv(long miniVideoId) {
        String pcVvStr = jedisService.executePersist(jedis -> jedis.hget(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_PC_VV_HASHFIELD));
        return NumberUtils.toInt(pcVvStr, -1);
    }

    public Integer incrPcVv(long miniVideoId, int newCount) {
        Long pcVv = jedisService.executePersist(jedis -> jedis.hincrBy(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_PC_VV_HASHFIELD, newCount));
        return pcVv.intValue();
    }

    public void updatePcVv(long miniVideoId, int newCount) {
        jedisService.executePersist(jedis -> jedis.hset(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_PC_VV_HASHFIELD, String.valueOf(newCount)));
    }

    //robotVv
    public int getRobotVv(long miniVideoId) {
        String robotVvStr = jedisService.executePersist(jedis -> jedis.hget(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_ROBOT_VV_HASHFIELD));
        return NumberUtils.toInt(robotVvStr, -1);
    }

    public Integer incrRobotVv(long miniVideoId, int newCount) {
        Long robotVv = jedisService.executePersist(jedis -> jedis.hincrBy(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_ROBOT_VV_HASHFIELD, newCount));
        return robotVv.intValue();
    }

    public void updateRobotVv(long miniVideoId, int newCount) {
        jedisService.executePersist(jedis -> jedis.hset(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_ROBOT_VV_HASHFIELD, String.valueOf(newCount)));
    }

    //likeCount
    public int getLikeCount(long miniVideoId) {
        String likeCountStr = jedisService.executePersist(jedis -> jedis.hget(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_LIKE_COUNT_HASHFIELD));
        return NumberUtils.toInt(likeCountStr, -1);
    }

    public Integer incrLikeCount(long miniVideoId, int newCount) {
        Long likeCount = jedisService.executePersist(jedis -> jedis.hincrBy(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_LIKE_COUNT_HASHFIELD, newCount));
        return likeCount.intValue();
    }

    public void updateLikeCount(long miniVideoId, int newCount) {
        jedisService.executePersist(jedis -> jedis.hset(String.format(STAT_MINI_VIDEO_HASHKEY, miniVideoId),
                STAT_MINI_VIDEO_LIKE_COUNT_HASHFIELD, String.valueOf(newCount)));
    }

    public StatMiniVideoEntity getEntityFromRedis(long miniVideoId) {
        Map<String, String> map = jedisService.executePersist(jedis -> jedis.hgetAll(String.format(STAT_MINI_VIDEO_HASHKEY,
                miniVideoId)));
        StatMiniVideoEntity entity = new StatMiniVideoEntity();
        if (MapUtils.isEmpty(map)) {
            return null;
        }
        entity.setMiniVideoId(miniVideoId);
        entity.setTotalVv(NumberUtils.toLong(map.get(STAT_MINI_VIDEO_TOTAL_VV_HASHFIELD), 0));
        entity.setAppVv(NumberUtils.toLong(map.get(STAT_MINI_VIDEO_APP_VV_HASHFIELD), 0));
        entity.setWapVv(NumberUtils.toLong(map.get(STAT_MINI_VIDEO_WAP_VV_HASHFIELD), 0));
        entity.setPcVv(NumberUtils.toLong(map.get(STAT_MINI_VIDEO_PC_VV_HASHFIELD), 0));
        entity.setRobotVv(NumberUtils.toLong(map.get(STAT_MINI_VIDEO_ROBOT_VV_HASHFIELD), 0));
        entity.setLikeCount(NumberUtils.toLong(map.get(STAT_MINI_VIDEO_LIKE_COUNT_HASHFIELD), 0));
        return entity;
    }
}
