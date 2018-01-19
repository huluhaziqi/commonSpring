package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoCutRecordEntity;
import com.lin.commonspring.model.entity.MiniVideoCutRecordEntityExample.Criteria;
import com.lin.commonspring.model.entity.MiniVideoCutRecordEntityExample.Criterion;
import com.lin.commonspring.model.entity.MiniVideoCutRecordEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MiniVideoCutRecordSqlProvider {

    public String countByExample(MiniVideoCutRecordEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("mini_video_cut_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MiniVideoCutRecordEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("mini_video_cut_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MiniVideoCutRecordEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mini_video_cut_record");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getLiveroomId() != null) {
            sql.VALUES("liveroom_id", "#{liveroomId,jdbcType=BIGINT}");
        }
        
        if (record.getMiniVideoId() != null) {
            sql.VALUES("mini_video_id", "#{miniVideoId,jdbcType=BIGINT}");
        }
        
        if (record.getVodTaskId() != null) {
            sql.VALUES("vod_task_id", "#{vodTaskId,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginFileId() != null) {
            sql.VALUES("origin_file_id", "#{originFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getNewFileId() != null) {
            sql.VALUES("new_file_id", "#{newFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MiniVideoCutRecordEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("liveroom_id");
        sql.SELECT("mini_video_id");
        sql.SELECT("vod_task_id");
        sql.SELECT("origin_file_id");
        sql.SELECT("new_file_id");
        sql.SELECT("status");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("mini_video_cut_record");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MiniVideoCutRecordEntity record = (MiniVideoCutRecordEntity) parameter.get("record");
        MiniVideoCutRecordEntityExample example = (MiniVideoCutRecordEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("mini_video_cut_record");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getLiveroomId() != null) {
            sql.SET("liveroom_id = #{record.liveroomId,jdbcType=BIGINT}");
        }
        
        if (record.getMiniVideoId() != null) {
            sql.SET("mini_video_id = #{record.miniVideoId,jdbcType=BIGINT}");
        }
        
        if (record.getVodTaskId() != null) {
            sql.SET("vod_task_id = #{record.vodTaskId,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginFileId() != null) {
            sql.SET("origin_file_id = #{record.originFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getNewFileId() != null) {
            sql.SET("new_file_id = #{record.newFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
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
        sql.UPDATE("mini_video_cut_record");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("liveroom_id = #{record.liveroomId,jdbcType=BIGINT}");
        sql.SET("mini_video_id = #{record.miniVideoId,jdbcType=BIGINT}");
        sql.SET("vod_task_id = #{record.vodTaskId,jdbcType=VARCHAR}");
        sql.SET("origin_file_id = #{record.originFileId,jdbcType=VARCHAR}");
        sql.SET("new_file_id = #{record.newFileId,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        MiniVideoCutRecordEntityExample example = (MiniVideoCutRecordEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MiniVideoCutRecordEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("mini_video_cut_record");
        
        if (record.getLiveroomId() != null) {
            sql.SET("liveroom_id = #{liveroomId,jdbcType=BIGINT}");
        }
        
        if (record.getMiniVideoId() != null) {
            sql.SET("mini_video_id = #{miniVideoId,jdbcType=BIGINT}");
        }
        
        if (record.getVodTaskId() != null) {
            sql.SET("vod_task_id = #{vodTaskId,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginFileId() != null) {
            sql.SET("origin_file_id = #{originFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getNewFileId() != null) {
            sql.SET("new_file_id = #{newFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MiniVideoCutRecordEntityExample example, boolean includeExamplePhrase) {
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