package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.StatMiniVideoEntity;
import com.lin.commonspring.model.entity.StatMiniVideoEntityExample.Criteria;
import com.lin.commonspring.model.entity.StatMiniVideoEntityExample.Criterion;
import com.lin.commonspring.model.entity.StatMiniVideoEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class StatMiniVideoSqlProvider {

    public String countByExample(StatMiniVideoEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("stat_mini_video");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(StatMiniVideoEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("stat_mini_video");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(StatMiniVideoEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("stat_mini_video");
        
        if (record.getMiniVideoId() != null) {
            sql.VALUES("mini_video_id", "#{miniVideoId,jdbcType=BIGINT}");
        }
        
        if (record.getTotalVv() != null) {
            sql.VALUES("total_vv", "#{totalVv,jdbcType=BIGINT}");
        }
        
        if (record.getAppVv() != null) {
            sql.VALUES("app_vv", "#{appVv,jdbcType=BIGINT}");
        }
        
        if (record.getWapVv() != null) {
            sql.VALUES("wap_vv", "#{wapVv,jdbcType=BIGINT}");
        }
        
        if (record.getPcVv() != null) {
            sql.VALUES("pc_vv", "#{pcVv,jdbcType=BIGINT}");
        }
        
        if (record.getRobotVv() != null) {
            sql.VALUES("robot_vv", "#{robotVv,jdbcType=BIGINT}");
        }
        
        if (record.getLikeCount() != null) {
            sql.VALUES("like_count", "#{likeCount,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(StatMiniVideoEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("mini_video_id");
        } else {
            sql.SELECT("mini_video_id");
        }
        sql.SELECT("total_vv");
        sql.SELECT("app_vv");
        sql.SELECT("wap_vv");
        sql.SELECT("pc_vv");
        sql.SELECT("robot_vv");
        sql.SELECT("like_count");
        sql.FROM("stat_mini_video");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        StatMiniVideoEntity record = (StatMiniVideoEntity) parameter.get("record");
        StatMiniVideoEntityExample example = (StatMiniVideoEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("stat_mini_video");
        
        if (record.getMiniVideoId() != null) {
            sql.SET("mini_video_id = #{record.miniVideoId,jdbcType=BIGINT}");
        }
        
        if (record.getTotalVv() != null) {
            sql.SET("total_vv = #{record.totalVv,jdbcType=BIGINT}");
        }
        
        if (record.getAppVv() != null) {
            sql.SET("app_vv = #{record.appVv,jdbcType=BIGINT}");
        }
        
        if (record.getWapVv() != null) {
            sql.SET("wap_vv = #{record.wapVv,jdbcType=BIGINT}");
        }
        
        if (record.getPcVv() != null) {
            sql.SET("pc_vv = #{record.pcVv,jdbcType=BIGINT}");
        }
        
        if (record.getRobotVv() != null) {
            sql.SET("robot_vv = #{record.robotVv,jdbcType=BIGINT}");
        }
        
        if (record.getLikeCount() != null) {
            sql.SET("like_count = #{record.likeCount,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("stat_mini_video");
        
        sql.SET("mini_video_id = #{record.miniVideoId,jdbcType=BIGINT}");
        sql.SET("total_vv = #{record.totalVv,jdbcType=BIGINT}");
        sql.SET("app_vv = #{record.appVv,jdbcType=BIGINT}");
        sql.SET("wap_vv = #{record.wapVv,jdbcType=BIGINT}");
        sql.SET("pc_vv = #{record.pcVv,jdbcType=BIGINT}");
        sql.SET("robot_vv = #{record.robotVv,jdbcType=BIGINT}");
        sql.SET("like_count = #{record.likeCount,jdbcType=BIGINT}");
        
        StatMiniVideoEntityExample example = (StatMiniVideoEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(StatMiniVideoEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("stat_mini_video");
        
        if (record.getTotalVv() != null) {
            sql.SET("total_vv = #{totalVv,jdbcType=BIGINT}");
        }
        
        if (record.getAppVv() != null) {
            sql.SET("app_vv = #{appVv,jdbcType=BIGINT}");
        }
        
        if (record.getWapVv() != null) {
            sql.SET("wap_vv = #{wapVv,jdbcType=BIGINT}");
        }
        
        if (record.getPcVv() != null) {
            sql.SET("pc_vv = #{pcVv,jdbcType=BIGINT}");
        }
        
        if (record.getRobotVv() != null) {
            sql.SET("robot_vv = #{robotVv,jdbcType=BIGINT}");
        }
        
        if (record.getLikeCount() != null) {
            sql.SET("like_count = #{likeCount,jdbcType=BIGINT}");
        }
        
        sql.WHERE("mini_video_id = #{miniVideoId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, StatMiniVideoEntityExample example, boolean includeExamplePhrase) {
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