package com.lin.commonspring.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MiniVideoCutRecordEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MiniVideoCutRecordEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdIsNull() {
            addCriterion("liveroom_id is null");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdIsNotNull() {
            addCriterion("liveroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdEqualTo(Long value) {
            addCriterion("liveroom_id =", value, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdNotEqualTo(Long value) {
            addCriterion("liveroom_id <>", value, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdGreaterThan(Long value) {
            addCriterion("liveroom_id >", value, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("liveroom_id >=", value, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdLessThan(Long value) {
            addCriterion("liveroom_id <", value, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdLessThanOrEqualTo(Long value) {
            addCriterion("liveroom_id <=", value, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdIn(List<Long> values) {
            addCriterion("liveroom_id in", values, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdNotIn(List<Long> values) {
            addCriterion("liveroom_id not in", values, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdBetween(Long value1, Long value2) {
            addCriterion("liveroom_id between", value1, value2, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andLiveroomIdNotBetween(Long value1, Long value2) {
            addCriterion("liveroom_id not between", value1, value2, "liveroomId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdIsNull() {
            addCriterion("mini_video_id is null");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdIsNotNull() {
            addCriterion("mini_video_id is not null");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdEqualTo(Long value) {
            addCriterion("mini_video_id =", value, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdNotEqualTo(Long value) {
            addCriterion("mini_video_id <>", value, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdGreaterThan(Long value) {
            addCriterion("mini_video_id >", value, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mini_video_id >=", value, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdLessThan(Long value) {
            addCriterion("mini_video_id <", value, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdLessThanOrEqualTo(Long value) {
            addCriterion("mini_video_id <=", value, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdIn(List<Long> values) {
            addCriterion("mini_video_id in", values, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdNotIn(List<Long> values) {
            addCriterion("mini_video_id not in", values, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdBetween(Long value1, Long value2) {
            addCriterion("mini_video_id between", value1, value2, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andMiniVideoIdNotBetween(Long value1, Long value2) {
            addCriterion("mini_video_id not between", value1, value2, "miniVideoId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdIsNull() {
            addCriterion("vod_task_id is null");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdIsNotNull() {
            addCriterion("vod_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdEqualTo(String value) {
            addCriterion("vod_task_id =", value, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdNotEqualTo(String value) {
            addCriterion("vod_task_id <>", value, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdGreaterThan(String value) {
            addCriterion("vod_task_id >", value, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("vod_task_id >=", value, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdLessThan(String value) {
            addCriterion("vod_task_id <", value, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdLessThanOrEqualTo(String value) {
            addCriterion("vod_task_id <=", value, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdLike(String value) {
            addCriterion("vod_task_id like", value, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdNotLike(String value) {
            addCriterion("vod_task_id not like", value, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdIn(List<String> values) {
            addCriterion("vod_task_id in", values, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdNotIn(List<String> values) {
            addCriterion("vod_task_id not in", values, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdBetween(String value1, String value2) {
            addCriterion("vod_task_id between", value1, value2, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andVodTaskIdNotBetween(String value1, String value2) {
            addCriterion("vod_task_id not between", value1, value2, "vodTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdIsNull() {
            addCriterion("origin_file_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdIsNotNull() {
            addCriterion("origin_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdEqualTo(String value) {
            addCriterion("origin_file_id =", value, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdNotEqualTo(String value) {
            addCriterion("origin_file_id <>", value, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdGreaterThan(String value) {
            addCriterion("origin_file_id >", value, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("origin_file_id >=", value, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdLessThan(String value) {
            addCriterion("origin_file_id <", value, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdLessThanOrEqualTo(String value) {
            addCriterion("origin_file_id <=", value, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdLike(String value) {
            addCriterion("origin_file_id like", value, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdNotLike(String value) {
            addCriterion("origin_file_id not like", value, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdIn(List<String> values) {
            addCriterion("origin_file_id in", values, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdNotIn(List<String> values) {
            addCriterion("origin_file_id not in", values, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdBetween(String value1, String value2) {
            addCriterion("origin_file_id between", value1, value2, "originFileId");
            return (Criteria) this;
        }

        public Criteria andOriginFileIdNotBetween(String value1, String value2) {
            addCriterion("origin_file_id not between", value1, value2, "originFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdIsNull() {
            addCriterion("new_file_id is null");
            return (Criteria) this;
        }

        public Criteria andNewFileIdIsNotNull() {
            addCriterion("new_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewFileIdEqualTo(String value) {
            addCriterion("new_file_id =", value, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdNotEqualTo(String value) {
            addCriterion("new_file_id <>", value, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdGreaterThan(String value) {
            addCriterion("new_file_id >", value, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_file_id >=", value, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdLessThan(String value) {
            addCriterion("new_file_id <", value, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdLessThanOrEqualTo(String value) {
            addCriterion("new_file_id <=", value, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdLike(String value) {
            addCriterion("new_file_id like", value, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdNotLike(String value) {
            addCriterion("new_file_id not like", value, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdIn(List<String> values) {
            addCriterion("new_file_id in", values, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdNotIn(List<String> values) {
            addCriterion("new_file_id not in", values, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdBetween(String value1, String value2) {
            addCriterion("new_file_id between", value1, value2, "newFileId");
            return (Criteria) this;
        }

        public Criteria andNewFileIdNotBetween(String value1, String value2) {
            addCriterion("new_file_id not between", value1, value2, "newFileId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}