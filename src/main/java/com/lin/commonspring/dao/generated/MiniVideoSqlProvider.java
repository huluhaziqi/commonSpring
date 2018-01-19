package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.MiniVideoEntity;
import com.lin.commonspring.model.entity.MiniVideoEntityExample.Criteria;
import com.lin.commonspring.model.entity.MiniVideoEntityExample.Criterion;
import com.lin.commonspring.model.entity.MiniVideoEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MiniVideoSqlProvider {

    public String countByExample(MiniVideoEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("mini_video");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MiniVideoEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("mini_video");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MiniVideoEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mini_video");
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=TINYINT}");
        }
        
        if (record.getLiveroomId() != null) {
            sql.VALUES("liveroom_id", "#{liveroomId,jdbcType=BIGINT}");
        }
        
        if (record.getHostId() != null) {
            sql.VALUES("host_id", "#{hostId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getInfo() != null) {
            sql.VALUES("info", "#{info,jdbcType=VARCHAR}");
        }
        
        if (record.getImgPath() != null) {
            sql.VALUES("img_path", "#{imgPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MiniVideoEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("type");
        sql.SELECT("liveroom_id");
        sql.SELECT("host_id");
        sql.SELECT("status");
        sql.SELECT("title");
        sql.SELECT("info");
        sql.SELECT("img_path");
        sql.SELECT("city_id");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("mini_video");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MiniVideoEntity record = (MiniVideoEntity) parameter.get("record");
        MiniVideoEntityExample example = (MiniVideoEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("mini_video");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=TINYINT}");
        }
        
        if (record.getLiveroomId() != null) {
            sql.SET("liveroom_id = #{record.liveroomId,jdbcType=BIGINT}");
        }
        
        if (record.getHostId() != null) {
            sql.SET("host_id = #{record.hostId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getInfo() != null) {
            sql.SET("info = #{record.info,jdbcType=VARCHAR}");
        }
        
        if (record.getImgPath() != null) {
            sql.SET("img_path = #{record.imgPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
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
        sql.UPDATE("mini_video");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("type = #{record.type,jdbcType=TINYINT}");
        sql.SET("liveroom_id = #{record.liveroomId,jdbcType=BIGINT}");
        sql.SET("host_id = #{record.hostId,jdbcType=BIGINT}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("info = #{record.info,jdbcType=VARCHAR}");
        sql.SET("img_path = #{record.imgPath,jdbcType=VARCHAR}");
        sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        MiniVideoEntityExample example = (MiniVideoEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MiniVideoEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("mini_video");
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=TINYINT}");
        }
        
        if (record.getLiveroomId() != null) {
            sql.SET("liveroom_id = #{liveroomId,jdbcType=BIGINT}");
        }
        
        if (record.getHostId() != null) {
            sql.SET("host_id = #{hostId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getInfo() != null) {
            sql.SET("info = #{info,jdbcType=VARCHAR}");
        }
        
        if (record.getImgPath() != null) {
            sql.SET("img_path = #{imgPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{cityId,jdbcType=INTEGER}");
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

    protected void applyWhere(SQL sql, MiniVideoEntityExample example, boolean includeExamplePhrase) {
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