package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoRecordEntity;
import com.lin.commonspring.model.entity.MiniVideoRecordEntityExample.Criteria;
import com.lin.commonspring.model.entity.MiniVideoRecordEntityExample.Criterion;
import com.lin.commonspring.model.entity.MiniVideoRecordEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MiniVideoRecordSqlProvider {

    public String countByExample(MiniVideoRecordEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("mini_video_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MiniVideoRecordEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("mini_video_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MiniVideoRecordEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mini_video_record");
        
        if (record.getMiniVideoId() != null) {
            sql.VALUES("mini_video_id", "#{miniVideoId,jdbcType=BIGINT}");
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
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDuration() != null) {
            sql.VALUES("duration", "#{duration,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MiniVideoRecordEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("mini_video_id");
        } else {
            sql.SELECT("mini_video_id");
        }
        sql.SELECT("file_id");
        sql.SELECT("url");
        sql.SELECT("origin_url");
        sql.SELECT("mp4_10_url");
        sql.SELECT("mp4_20_url");
        sql.SELECT("mp4_30_url");
        sql.SELECT("mp4_40_url");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("duration");
        sql.FROM("mini_video_record");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MiniVideoRecordEntity record = (MiniVideoRecordEntity) parameter.get("record");
        MiniVideoRecordEntityExample example = (MiniVideoRecordEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("mini_video_record");
        
        if (record.getMiniVideoId() != null) {
            sql.SET("mini_video_id = #{record.miniVideoId,jdbcType=BIGINT}");
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
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDuration() != null) {
            sql.SET("duration = #{record.duration,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("mini_video_record");
        
        sql.SET("mini_video_id = #{record.miniVideoId,jdbcType=BIGINT}");
        sql.SET("file_id = #{record.fileId,jdbcType=VARCHAR}");
        sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        sql.SET("origin_url = #{record.originUrl,jdbcType=VARCHAR}");
        sql.SET("mp4_10_url = #{record.mp410Url,jdbcType=VARCHAR}");
        sql.SET("mp4_20_url = #{record.mp420Url,jdbcType=VARCHAR}");
        sql.SET("mp4_30_url = #{record.mp430Url,jdbcType=VARCHAR}");
        sql.SET("mp4_40_url = #{record.mp440Url,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("duration = #{record.duration,jdbcType=BIGINT}");
        
        MiniVideoRecordEntityExample example = (MiniVideoRecordEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MiniVideoRecordEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("mini_video_record");
        
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
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDuration() != null) {
            sql.SET("duration = #{duration,jdbcType=BIGINT}");
        }
        
        sql.WHERE("mini_video_id = #{miniVideoId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MiniVideoRecordEntityExample example, boolean includeExamplePhrase) {
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