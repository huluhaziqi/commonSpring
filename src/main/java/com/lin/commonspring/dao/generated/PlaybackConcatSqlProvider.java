package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.PlaybackConcatEntity;
import com.lin.commonspring.model.entity.PlaybackConcatEntityExample.Criteria;
import com.lin.commonspring.model.entity.PlaybackConcatEntityExample.Criterion;
import com.lin.commonspring.model.entity.PlaybackConcatEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PlaybackConcatSqlProvider {

    public String countByExample(PlaybackConcatEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("playback_concat");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PlaybackConcatEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("playback_concat");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PlaybackConcatEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("playback_concat");
        
        if (record.getLiveroomId() != null) {
            sql.VALUES("liveroom_id", "#{liveroomId,jdbcType=BIGINT}");
        }
        
        if (record.getFileId() != null) {
            sql.VALUES("file_id", "#{fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginUrl() != null) {
            sql.VALUES("origin_url", "#{originUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMp410Url() != null) {
            sql.VALUES("mp4_10_url", "#{mp410Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp420Url() != null) {
            sql.VALUES("mp4_20_url", "#{mp420Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp430Url() != null) {
            sql.VALUES("mp4_30_url", "#{mp430Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp440Url() != null) {
            sql.VALUES("mp4_40_url", "#{mp440Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls10Url() != null) {
            sql.VALUES("hls_10_url", "#{hls10Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls20Url() != null) {
            sql.VALUES("hls_20_url", "#{hls20Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls30Url() != null) {
            sql.VALUES("hls_30_url", "#{hls30Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls40Url() != null) {
            sql.VALUES("hls_40_url", "#{hls40Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10046Url() != null) {
            sql.VALUES("flv_10046_url", "#{flv10046Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10047Url() != null) {
            sql.VALUES("flv_10047_url", "#{flv10047Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10048Url() != null) {
            sql.VALUES("flv_10048_url", "#{flv10048Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10049Url() != null) {
            sql.VALUES("flv_10049_url", "#{flv10049Url,jdbcType=VARCHAR}");
        }
        
        if (record.getDuration() != null) {
            sql.VALUES("duration", "#{duration,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PlaybackConcatEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("liveroom_id");
        } else {
            sql.SELECT("liveroom_id");
        }
        sql.SELECT("file_id");
        sql.SELECT("url");
        sql.SELECT("origin_url");
        sql.SELECT("mp4_10_url");
        sql.SELECT("mp4_20_url");
        sql.SELECT("mp4_30_url");
        sql.SELECT("mp4_40_url");
        sql.SELECT("hls_10_url");
        sql.SELECT("hls_20_url");
        sql.SELECT("hls_30_url");
        sql.SELECT("hls_40_url");
        sql.SELECT("flv_10046_url");
        sql.SELECT("flv_10047_url");
        sql.SELECT("flv_10048_url");
        sql.SELECT("flv_10049_url");
        sql.SELECT("duration");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("playback_concat");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PlaybackConcatEntity record = (PlaybackConcatEntity) parameter.get("record");
        PlaybackConcatEntityExample example = (PlaybackConcatEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("playback_concat");
        
        if (record.getLiveroomId() != null) {
            sql.SET("liveroom_id = #{record.liveroomId,jdbcType=BIGINT}");
        }
        
        if (record.getFileId() != null) {
            sql.SET("file_id = #{record.fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginUrl() != null) {
            sql.SET("origin_url = #{record.originUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMp410Url() != null) {
            sql.SET("mp4_10_url = #{record.mp410Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp420Url() != null) {
            sql.SET("mp4_20_url = #{record.mp420Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp430Url() != null) {
            sql.SET("mp4_30_url = #{record.mp430Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp440Url() != null) {
            sql.SET("mp4_40_url = #{record.mp440Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls10Url() != null) {
            sql.SET("hls_10_url = #{record.hls10Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls20Url() != null) {
            sql.SET("hls_20_url = #{record.hls20Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls30Url() != null) {
            sql.SET("hls_30_url = #{record.hls30Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls40Url() != null) {
            sql.SET("hls_40_url = #{record.hls40Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10046Url() != null) {
            sql.SET("flv_10046_url = #{record.flv10046Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10047Url() != null) {
            sql.SET("flv_10047_url = #{record.flv10047Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10048Url() != null) {
            sql.SET("flv_10048_url = #{record.flv10048Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10049Url() != null) {
            sql.SET("flv_10049_url = #{record.flv10049Url,jdbcType=VARCHAR}");
        }
        
        if (record.getDuration() != null) {
            sql.SET("duration = #{record.duration,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("playback_concat");
        
        sql.SET("liveroom_id = #{record.liveroomId,jdbcType=BIGINT}");
        sql.SET("file_id = #{record.fileId,jdbcType=VARCHAR}");
        sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        sql.SET("origin_url = #{record.originUrl,jdbcType=VARCHAR}");
        sql.SET("mp4_10_url = #{record.mp410Url,jdbcType=VARCHAR}");
        sql.SET("mp4_20_url = #{record.mp420Url,jdbcType=VARCHAR}");
        sql.SET("mp4_30_url = #{record.mp430Url,jdbcType=VARCHAR}");
        sql.SET("mp4_40_url = #{record.mp440Url,jdbcType=VARCHAR}");
        sql.SET("hls_10_url = #{record.hls10Url,jdbcType=VARCHAR}");
        sql.SET("hls_20_url = #{record.hls20Url,jdbcType=VARCHAR}");
        sql.SET("hls_30_url = #{record.hls30Url,jdbcType=VARCHAR}");
        sql.SET("hls_40_url = #{record.hls40Url,jdbcType=VARCHAR}");
        sql.SET("flv_10046_url = #{record.flv10046Url,jdbcType=VARCHAR}");
        sql.SET("flv_10047_url = #{record.flv10047Url,jdbcType=VARCHAR}");
        sql.SET("flv_10048_url = #{record.flv10048Url,jdbcType=VARCHAR}");
        sql.SET("flv_10049_url = #{record.flv10049Url,jdbcType=VARCHAR}");
        sql.SET("duration = #{record.duration,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        PlaybackConcatEntityExample example = (PlaybackConcatEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PlaybackConcatEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("playback_concat");
        
        if (record.getFileId() != null) {
            sql.SET("file_id = #{fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginUrl() != null) {
            sql.SET("origin_url = #{originUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMp410Url() != null) {
            sql.SET("mp4_10_url = #{mp410Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp420Url() != null) {
            sql.SET("mp4_20_url = #{mp420Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp430Url() != null) {
            sql.SET("mp4_30_url = #{mp430Url,jdbcType=VARCHAR}");
        }
        
        if (record.getMp440Url() != null) {
            sql.SET("mp4_40_url = #{mp440Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls10Url() != null) {
            sql.SET("hls_10_url = #{hls10Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls20Url() != null) {
            sql.SET("hls_20_url = #{hls20Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls30Url() != null) {
            sql.SET("hls_30_url = #{hls30Url,jdbcType=VARCHAR}");
        }
        
        if (record.getHls40Url() != null) {
            sql.SET("hls_40_url = #{hls40Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10046Url() != null) {
            sql.SET("flv_10046_url = #{flv10046Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10047Url() != null) {
            sql.SET("flv_10047_url = #{flv10047Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10048Url() != null) {
            sql.SET("flv_10048_url = #{flv10048Url,jdbcType=VARCHAR}");
        }
        
        if (record.getFlv10049Url() != null) {
            sql.SET("flv_10049_url = #{flv10049Url,jdbcType=VARCHAR}");
        }
        
        if (record.getDuration() != null) {
            sql.SET("duration = #{duration,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("liveroom_id = #{liveroomId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PlaybackConcatEntityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}