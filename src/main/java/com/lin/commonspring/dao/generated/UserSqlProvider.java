package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.UserEntity;
import com.lin.commonspring.model.entity.UserEntityExample.Criteria;
import com.lin.commonspring.model.entity.UserEntityExample.Criterion;
import com.lin.commonspring.model.entity.UserEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String countByExample(UserEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getJob() != null) {
            sql.VALUES("job", "#{job,jdbcType=VARCHAR}");
        }
        
        if (record.getContactMobile() != null) {
            sql.VALUES("contact_mobile", "#{contactMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getContactWechat() != null) {
            sql.VALUES("contact_wechat", "#{contactWechat,jdbcType=VARCHAR}");
        }
        
        if (record.getShowContactMobile() != null) {
            sql.VALUES("show_contact_mobile", "#{showContactMobile,jdbcType=TINYINT}");
        }
        
        if (record.getShowContactWechat() != null) {
            sql.VALUES("show_contact_wechat", "#{showContactWechat,jdbcType=TINYINT}");
        }
        
        if (record.getPassedHostApplicationId() != null) {
            sql.VALUES("passed_host_application_id", "#{passedHostApplicationId,jdbcType=BIGINT}");
        }
        
        if (record.getPendingHostApplicationId() != null) {
            sql.VALUES("pending_host_application_id", "#{pendingHostApplicationId,jdbcType=BIGINT}");
        }
        
        if (record.getTotalAudienceCount() != null) {
            sql.VALUES("total_audience_count", "#{totalAudienceCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLiveroomCount() != null) {
            sql.VALUES("total_liveroom_count", "#{totalLiveroomCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLikeCount() != null) {
            sql.VALUES("total_like_count", "#{totalLikeCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalBuildingCount() != null) {
            sql.VALUES("total_building_count", "#{totalBuildingCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalActivitySubscribeCount() != null) {
            sql.VALUES("total_activity_subscribe_count", "#{totalActivitySubscribeCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLiveDuration() != null) {
            sql.VALUES("total_live_duration", "#{totalLiveDuration,jdbcType=BIGINT}");
        }
        
        if (record.getApplicationUpdateTime() != null) {
            sql.VALUES("application_update_time", "#{applicationUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProvinceId() != null) {
            sql.VALUES("province_id", "#{provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("status");
        sql.SELECT("name");
        sql.SELECT("title");
        sql.SELECT("job");
        sql.SELECT("contact_mobile");
        sql.SELECT("contact_wechat");
        sql.SELECT("show_contact_mobile");
        sql.SELECT("show_contact_wechat");
        sql.SELECT("passed_host_application_id");
        sql.SELECT("pending_host_application_id");
        sql.SELECT("total_audience_count");
        sql.SELECT("total_liveroom_count");
        sql.SELECT("total_like_count");
        sql.SELECT("total_building_count");
        sql.SELECT("total_activity_subscribe_count");
        sql.SELECT("total_live_duration");
        sql.SELECT("application_update_time");
        sql.SELECT("province_id");
        sql.SELECT("city_id");
        sql.FROM("user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserEntity record = (UserEntity) parameter.get("record");
        UserEntityExample example = (UserEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getJob() != null) {
            sql.SET("job = #{record.job,jdbcType=VARCHAR}");
        }
        
        if (record.getContactMobile() != null) {
            sql.SET("contact_mobile = #{record.contactMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getContactWechat() != null) {
            sql.SET("contact_wechat = #{record.contactWechat,jdbcType=VARCHAR}");
        }
        
        if (record.getShowContactMobile() != null) {
            sql.SET("show_contact_mobile = #{record.showContactMobile,jdbcType=TINYINT}");
        }
        
        if (record.getShowContactWechat() != null) {
            sql.SET("show_contact_wechat = #{record.showContactWechat,jdbcType=TINYINT}");
        }
        
        if (record.getPassedHostApplicationId() != null) {
            sql.SET("passed_host_application_id = #{record.passedHostApplicationId,jdbcType=BIGINT}");
        }
        
        if (record.getPendingHostApplicationId() != null) {
            sql.SET("pending_host_application_id = #{record.pendingHostApplicationId,jdbcType=BIGINT}");
        }
        
        if (record.getTotalAudienceCount() != null) {
            sql.SET("total_audience_count = #{record.totalAudienceCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLiveroomCount() != null) {
            sql.SET("total_liveroom_count = #{record.totalLiveroomCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLikeCount() != null) {
            sql.SET("total_like_count = #{record.totalLikeCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalBuildingCount() != null) {
            sql.SET("total_building_count = #{record.totalBuildingCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalActivitySubscribeCount() != null) {
            sql.SET("total_activity_subscribe_count = #{record.totalActivitySubscribeCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLiveDuration() != null) {
            sql.SET("total_live_duration = #{record.totalLiveDuration,jdbcType=BIGINT}");
        }
        
        if (record.getApplicationUpdateTime() != null) {
            sql.SET("application_update_time = #{record.applicationUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProvinceId() != null) {
            sql.SET("province_id = #{record.provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("job = #{record.job,jdbcType=VARCHAR}");
        sql.SET("contact_mobile = #{record.contactMobile,jdbcType=VARCHAR}");
        sql.SET("contact_wechat = #{record.contactWechat,jdbcType=VARCHAR}");
        sql.SET("show_contact_mobile = #{record.showContactMobile,jdbcType=TINYINT}");
        sql.SET("show_contact_wechat = #{record.showContactWechat,jdbcType=TINYINT}");
        sql.SET("passed_host_application_id = #{record.passedHostApplicationId,jdbcType=BIGINT}");
        sql.SET("pending_host_application_id = #{record.pendingHostApplicationId,jdbcType=BIGINT}");
        sql.SET("total_audience_count = #{record.totalAudienceCount,jdbcType=BIGINT}");
        sql.SET("total_liveroom_count = #{record.totalLiveroomCount,jdbcType=BIGINT}");
        sql.SET("total_like_count = #{record.totalLikeCount,jdbcType=BIGINT}");
        sql.SET("total_building_count = #{record.totalBuildingCount,jdbcType=BIGINT}");
        sql.SET("total_activity_subscribe_count = #{record.totalActivitySubscribeCount,jdbcType=BIGINT}");
        sql.SET("total_live_duration = #{record.totalLiveDuration,jdbcType=BIGINT}");
        sql.SET("application_update_time = #{record.applicationUpdateTime,jdbcType=TIMESTAMP}");
        sql.SET("province_id = #{record.provinceId,jdbcType=INTEGER}");
        sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        
        UserEntityExample example = (UserEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getJob() != null) {
            sql.SET("job = #{job,jdbcType=VARCHAR}");
        }
        
        if (record.getContactMobile() != null) {
            sql.SET("contact_mobile = #{contactMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getContactWechat() != null) {
            sql.SET("contact_wechat = #{contactWechat,jdbcType=VARCHAR}");
        }
        
        if (record.getShowContactMobile() != null) {
            sql.SET("show_contact_mobile = #{showContactMobile,jdbcType=TINYINT}");
        }
        
        if (record.getShowContactWechat() != null) {
            sql.SET("show_contact_wechat = #{showContactWechat,jdbcType=TINYINT}");
        }
        
        if (record.getPassedHostApplicationId() != null) {
            sql.SET("passed_host_application_id = #{passedHostApplicationId,jdbcType=BIGINT}");
        }
        
        if (record.getPendingHostApplicationId() != null) {
            sql.SET("pending_host_application_id = #{pendingHostApplicationId,jdbcType=BIGINT}");
        }
        
        if (record.getTotalAudienceCount() != null) {
            sql.SET("total_audience_count = #{totalAudienceCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLiveroomCount() != null) {
            sql.SET("total_liveroom_count = #{totalLiveroomCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLikeCount() != null) {
            sql.SET("total_like_count = #{totalLikeCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalBuildingCount() != null) {
            sql.SET("total_building_count = #{totalBuildingCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalActivitySubscribeCount() != null) {
            sql.SET("total_activity_subscribe_count = #{totalActivitySubscribeCount,jdbcType=BIGINT}");
        }
        
        if (record.getTotalLiveDuration() != null) {
            sql.SET("total_live_duration = #{totalLiveDuration,jdbcType=BIGINT}");
        }
        
        if (record.getApplicationUpdateTime() != null) {
            sql.SET("application_update_time = #{applicationUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProvinceId() != null) {
            sql.SET("province_id = #{provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{cityId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserEntityExample example, boolean includeExamplePhrase) {
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