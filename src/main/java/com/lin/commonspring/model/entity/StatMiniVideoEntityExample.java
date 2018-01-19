package com.lin.commonspring.model.entity;

import java.util.ArrayList;
import java.util.List;

public class StatMiniVideoEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatMiniVideoEntityExample() {
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

        public Criteria andTotalVvIsNull() {
            addCriterion("total_vv is null");
            return (Criteria) this;
        }

        public Criteria andTotalVvIsNotNull() {
            addCriterion("total_vv is not null");
            return (Criteria) this;
        }

        public Criteria andTotalVvEqualTo(Long value) {
            addCriterion("total_vv =", value, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvNotEqualTo(Long value) {
            addCriterion("total_vv <>", value, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvGreaterThan(Long value) {
            addCriterion("total_vv >", value, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvGreaterThanOrEqualTo(Long value) {
            addCriterion("total_vv >=", value, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvLessThan(Long value) {
            addCriterion("total_vv <", value, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvLessThanOrEqualTo(Long value) {
            addCriterion("total_vv <=", value, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvIn(List<Long> values) {
            addCriterion("total_vv in", values, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvNotIn(List<Long> values) {
            addCriterion("total_vv not in", values, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvBetween(Long value1, Long value2) {
            addCriterion("total_vv between", value1, value2, "totalVv");
            return (Criteria) this;
        }

        public Criteria andTotalVvNotBetween(Long value1, Long value2) {
            addCriterion("total_vv not between", value1, value2, "totalVv");
            return (Criteria) this;
        }

        public Criteria andAppVvIsNull() {
            addCriterion("app_vv is null");
            return (Criteria) this;
        }

        public Criteria andAppVvIsNotNull() {
            addCriterion("app_vv is not null");
            return (Criteria) this;
        }

        public Criteria andAppVvEqualTo(Long value) {
            addCriterion("app_vv =", value, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvNotEqualTo(Long value) {
            addCriterion("app_vv <>", value, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvGreaterThan(Long value) {
            addCriterion("app_vv >", value, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvGreaterThanOrEqualTo(Long value) {
            addCriterion("app_vv >=", value, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvLessThan(Long value) {
            addCriterion("app_vv <", value, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvLessThanOrEqualTo(Long value) {
            addCriterion("app_vv <=", value, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvIn(List<Long> values) {
            addCriterion("app_vv in", values, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvNotIn(List<Long> values) {
            addCriterion("app_vv not in", values, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvBetween(Long value1, Long value2) {
            addCriterion("app_vv between", value1, value2, "appVv");
            return (Criteria) this;
        }

        public Criteria andAppVvNotBetween(Long value1, Long value2) {
            addCriterion("app_vv not between", value1, value2, "appVv");
            return (Criteria) this;
        }

        public Criteria andWapVvIsNull() {
            addCriterion("wap_vv is null");
            return (Criteria) this;
        }

        public Criteria andWapVvIsNotNull() {
            addCriterion("wap_vv is not null");
            return (Criteria) this;
        }

        public Criteria andWapVvEqualTo(Long value) {
            addCriterion("wap_vv =", value, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvNotEqualTo(Long value) {
            addCriterion("wap_vv <>", value, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvGreaterThan(Long value) {
            addCriterion("wap_vv >", value, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvGreaterThanOrEqualTo(Long value) {
            addCriterion("wap_vv >=", value, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvLessThan(Long value) {
            addCriterion("wap_vv <", value, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvLessThanOrEqualTo(Long value) {
            addCriterion("wap_vv <=", value, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvIn(List<Long> values) {
            addCriterion("wap_vv in", values, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvNotIn(List<Long> values) {
            addCriterion("wap_vv not in", values, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvBetween(Long value1, Long value2) {
            addCriterion("wap_vv between", value1, value2, "wapVv");
            return (Criteria) this;
        }

        public Criteria andWapVvNotBetween(Long value1, Long value2) {
            addCriterion("wap_vv not between", value1, value2, "wapVv");
            return (Criteria) this;
        }

        public Criteria andPcVvIsNull() {
            addCriterion("pc_vv is null");
            return (Criteria) this;
        }

        public Criteria andPcVvIsNotNull() {
            addCriterion("pc_vv is not null");
            return (Criteria) this;
        }

        public Criteria andPcVvEqualTo(Long value) {
            addCriterion("pc_vv =", value, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvNotEqualTo(Long value) {
            addCriterion("pc_vv <>", value, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvGreaterThan(Long value) {
            addCriterion("pc_vv >", value, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvGreaterThanOrEqualTo(Long value) {
            addCriterion("pc_vv >=", value, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvLessThan(Long value) {
            addCriterion("pc_vv <", value, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvLessThanOrEqualTo(Long value) {
            addCriterion("pc_vv <=", value, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvIn(List<Long> values) {
            addCriterion("pc_vv in", values, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvNotIn(List<Long> values) {
            addCriterion("pc_vv not in", values, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvBetween(Long value1, Long value2) {
            addCriterion("pc_vv between", value1, value2, "pcVv");
            return (Criteria) this;
        }

        public Criteria andPcVvNotBetween(Long value1, Long value2) {
            addCriterion("pc_vv not between", value1, value2, "pcVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvIsNull() {
            addCriterion("robot_vv is null");
            return (Criteria) this;
        }

        public Criteria andRobotVvIsNotNull() {
            addCriterion("robot_vv is not null");
            return (Criteria) this;
        }

        public Criteria andRobotVvEqualTo(Long value) {
            addCriterion("robot_vv =", value, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvNotEqualTo(Long value) {
            addCriterion("robot_vv <>", value, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvGreaterThan(Long value) {
            addCriterion("robot_vv >", value, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvGreaterThanOrEqualTo(Long value) {
            addCriterion("robot_vv >=", value, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvLessThan(Long value) {
            addCriterion("robot_vv <", value, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvLessThanOrEqualTo(Long value) {
            addCriterion("robot_vv <=", value, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvIn(List<Long> values) {
            addCriterion("robot_vv in", values, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvNotIn(List<Long> values) {
            addCriterion("robot_vv not in", values, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvBetween(Long value1, Long value2) {
            addCriterion("robot_vv between", value1, value2, "robotVv");
            return (Criteria) this;
        }

        public Criteria andRobotVvNotBetween(Long value1, Long value2) {
            addCriterion("robot_vv not between", value1, value2, "robotVv");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNull() {
            addCriterion("like_count is null");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNotNull() {
            addCriterion("like_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCountEqualTo(Long value) {
            addCriterion("like_count =", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotEqualTo(Long value) {
            addCriterion("like_count <>", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThan(Long value) {
            addCriterion("like_count >", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("like_count >=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThan(Long value) {
            addCriterion("like_count <", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThanOrEqualTo(Long value) {
            addCriterion("like_count <=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIn(List<Long> values) {
            addCriterion("like_count in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotIn(List<Long> values) {
            addCriterion("like_count not in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountBetween(Long value1, Long value2) {
            addCriterion("like_count between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotBetween(Long value1, Long value2) {
            addCriterion("like_count not between", value1, value2, "likeCount");
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