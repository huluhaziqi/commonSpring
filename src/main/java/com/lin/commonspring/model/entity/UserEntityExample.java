package com.lin.commonspring.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserEntityExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNull() {
            addCriterion("contact_mobile is null");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNotNull() {
            addCriterion("contact_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andContactMobileEqualTo(String value) {
            addCriterion("contact_mobile =", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotEqualTo(String value) {
            addCriterion("contact_mobile <>", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThan(String value) {
            addCriterion("contact_mobile >", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("contact_mobile >=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThan(String value) {
            addCriterion("contact_mobile <", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThanOrEqualTo(String value) {
            addCriterion("contact_mobile <=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLike(String value) {
            addCriterion("contact_mobile like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotLike(String value) {
            addCriterion("contact_mobile not like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileIn(List<String> values) {
            addCriterion("contact_mobile in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotIn(List<String> values) {
            addCriterion("contact_mobile not in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileBetween(String value1, String value2) {
            addCriterion("contact_mobile between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotBetween(String value1, String value2) {
            addCriterion("contact_mobile not between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactWechatIsNull() {
            addCriterion("contact_wechat is null");
            return (Criteria) this;
        }

        public Criteria andContactWechatIsNotNull() {
            addCriterion("contact_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andContactWechatEqualTo(String value) {
            addCriterion("contact_wechat =", value, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatNotEqualTo(String value) {
            addCriterion("contact_wechat <>", value, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatGreaterThan(String value) {
            addCriterion("contact_wechat >", value, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatGreaterThanOrEqualTo(String value) {
            addCriterion("contact_wechat >=", value, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatLessThan(String value) {
            addCriterion("contact_wechat <", value, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatLessThanOrEqualTo(String value) {
            addCriterion("contact_wechat <=", value, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatLike(String value) {
            addCriterion("contact_wechat like", value, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatNotLike(String value) {
            addCriterion("contact_wechat not like", value, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatIn(List<String> values) {
            addCriterion("contact_wechat in", values, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatNotIn(List<String> values) {
            addCriterion("contact_wechat not in", values, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatBetween(String value1, String value2) {
            addCriterion("contact_wechat between", value1, value2, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andContactWechatNotBetween(String value1, String value2) {
            addCriterion("contact_wechat not between", value1, value2, "contactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileIsNull() {
            addCriterion("show_contact_mobile is null");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileIsNotNull() {
            addCriterion("show_contact_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileEqualTo(Byte value) {
            addCriterion("show_contact_mobile =", value, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileNotEqualTo(Byte value) {
            addCriterion("show_contact_mobile <>", value, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileGreaterThan(Byte value) {
            addCriterion("show_contact_mobile >", value, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_contact_mobile >=", value, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileLessThan(Byte value) {
            addCriterion("show_contact_mobile <", value, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileLessThanOrEqualTo(Byte value) {
            addCriterion("show_contact_mobile <=", value, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileIn(List<Byte> values) {
            addCriterion("show_contact_mobile in", values, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileNotIn(List<Byte> values) {
            addCriterion("show_contact_mobile not in", values, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileBetween(Byte value1, Byte value2) {
            addCriterion("show_contact_mobile between", value1, value2, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactMobileNotBetween(Byte value1, Byte value2) {
            addCriterion("show_contact_mobile not between", value1, value2, "showContactMobile");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatIsNull() {
            addCriterion("show_contact_wechat is null");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatIsNotNull() {
            addCriterion("show_contact_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatEqualTo(Byte value) {
            addCriterion("show_contact_wechat =", value, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatNotEqualTo(Byte value) {
            addCriterion("show_contact_wechat <>", value, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatGreaterThan(Byte value) {
            addCriterion("show_contact_wechat >", value, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_contact_wechat >=", value, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatLessThan(Byte value) {
            addCriterion("show_contact_wechat <", value, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatLessThanOrEqualTo(Byte value) {
            addCriterion("show_contact_wechat <=", value, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatIn(List<Byte> values) {
            addCriterion("show_contact_wechat in", values, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatNotIn(List<Byte> values) {
            addCriterion("show_contact_wechat not in", values, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatBetween(Byte value1, Byte value2) {
            addCriterion("show_contact_wechat between", value1, value2, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andShowContactWechatNotBetween(Byte value1, Byte value2) {
            addCriterion("show_contact_wechat not between", value1, value2, "showContactWechat");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdIsNull() {
            addCriterion("passed_host_application_id is null");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdIsNotNull() {
            addCriterion("passed_host_application_id is not null");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdEqualTo(Long value) {
            addCriterion("passed_host_application_id =", value, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdNotEqualTo(Long value) {
            addCriterion("passed_host_application_id <>", value, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdGreaterThan(Long value) {
            addCriterion("passed_host_application_id >", value, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("passed_host_application_id >=", value, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdLessThan(Long value) {
            addCriterion("passed_host_application_id <", value, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdLessThanOrEqualTo(Long value) {
            addCriterion("passed_host_application_id <=", value, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdIn(List<Long> values) {
            addCriterion("passed_host_application_id in", values, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdNotIn(List<Long> values) {
            addCriterion("passed_host_application_id not in", values, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdBetween(Long value1, Long value2) {
            addCriterion("passed_host_application_id between", value1, value2, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPassedHostApplicationIdNotBetween(Long value1, Long value2) {
            addCriterion("passed_host_application_id not between", value1, value2, "passedHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdIsNull() {
            addCriterion("pending_host_application_id is null");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdIsNotNull() {
            addCriterion("pending_host_application_id is not null");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdEqualTo(Long value) {
            addCriterion("pending_host_application_id =", value, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdNotEqualTo(Long value) {
            addCriterion("pending_host_application_id <>", value, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdGreaterThan(Long value) {
            addCriterion("pending_host_application_id >", value, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pending_host_application_id >=", value, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdLessThan(Long value) {
            addCriterion("pending_host_application_id <", value, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdLessThanOrEqualTo(Long value) {
            addCriterion("pending_host_application_id <=", value, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdIn(List<Long> values) {
            addCriterion("pending_host_application_id in", values, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdNotIn(List<Long> values) {
            addCriterion("pending_host_application_id not in", values, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdBetween(Long value1, Long value2) {
            addCriterion("pending_host_application_id between", value1, value2, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andPendingHostApplicationIdNotBetween(Long value1, Long value2) {
            addCriterion("pending_host_application_id not between", value1, value2, "pendingHostApplicationId");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountIsNull() {
            addCriterion("total_audience_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountIsNotNull() {
            addCriterion("total_audience_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountEqualTo(Long value) {
            addCriterion("total_audience_count =", value, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountNotEqualTo(Long value) {
            addCriterion("total_audience_count <>", value, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountGreaterThan(Long value) {
            addCriterion("total_audience_count >", value, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_audience_count >=", value, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountLessThan(Long value) {
            addCriterion("total_audience_count <", value, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountLessThanOrEqualTo(Long value) {
            addCriterion("total_audience_count <=", value, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountIn(List<Long> values) {
            addCriterion("total_audience_count in", values, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountNotIn(List<Long> values) {
            addCriterion("total_audience_count not in", values, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountBetween(Long value1, Long value2) {
            addCriterion("total_audience_count between", value1, value2, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalAudienceCountNotBetween(Long value1, Long value2) {
            addCriterion("total_audience_count not between", value1, value2, "totalAudienceCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountIsNull() {
            addCriterion("total_liveroom_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountIsNotNull() {
            addCriterion("total_liveroom_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountEqualTo(Long value) {
            addCriterion("total_liveroom_count =", value, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountNotEqualTo(Long value) {
            addCriterion("total_liveroom_count <>", value, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountGreaterThan(Long value) {
            addCriterion("total_liveroom_count >", value, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_liveroom_count >=", value, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountLessThan(Long value) {
            addCriterion("total_liveroom_count <", value, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountLessThanOrEqualTo(Long value) {
            addCriterion("total_liveroom_count <=", value, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountIn(List<Long> values) {
            addCriterion("total_liveroom_count in", values, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountNotIn(List<Long> values) {
            addCriterion("total_liveroom_count not in", values, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountBetween(Long value1, Long value2) {
            addCriterion("total_liveroom_count between", value1, value2, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveroomCountNotBetween(Long value1, Long value2) {
            addCriterion("total_liveroom_count not between", value1, value2, "totalLiveroomCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountIsNull() {
            addCriterion("total_like_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountIsNotNull() {
            addCriterion("total_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountEqualTo(Long value) {
            addCriterion("total_like_count =", value, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountNotEqualTo(Long value) {
            addCriterion("total_like_count <>", value, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountGreaterThan(Long value) {
            addCriterion("total_like_count >", value, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_like_count >=", value, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountLessThan(Long value) {
            addCriterion("total_like_count <", value, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountLessThanOrEqualTo(Long value) {
            addCriterion("total_like_count <=", value, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountIn(List<Long> values) {
            addCriterion("total_like_count in", values, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountNotIn(List<Long> values) {
            addCriterion("total_like_count not in", values, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountBetween(Long value1, Long value2) {
            addCriterion("total_like_count between", value1, value2, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLikeCountNotBetween(Long value1, Long value2) {
            addCriterion("total_like_count not between", value1, value2, "totalLikeCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountIsNull() {
            addCriterion("total_building_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountIsNotNull() {
            addCriterion("total_building_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountEqualTo(Long value) {
            addCriterion("total_building_count =", value, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountNotEqualTo(Long value) {
            addCriterion("total_building_count <>", value, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountGreaterThan(Long value) {
            addCriterion("total_building_count >", value, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_building_count >=", value, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountLessThan(Long value) {
            addCriterion("total_building_count <", value, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountLessThanOrEqualTo(Long value) {
            addCriterion("total_building_count <=", value, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountIn(List<Long> values) {
            addCriterion("total_building_count in", values, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountNotIn(List<Long> values) {
            addCriterion("total_building_count not in", values, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountBetween(Long value1, Long value2) {
            addCriterion("total_building_count between", value1, value2, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalBuildingCountNotBetween(Long value1, Long value2) {
            addCriterion("total_building_count not between", value1, value2, "totalBuildingCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountIsNull() {
            addCriterion("total_activity_subscribe_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountIsNotNull() {
            addCriterion("total_activity_subscribe_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountEqualTo(Long value) {
            addCriterion("total_activity_subscribe_count =", value, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountNotEqualTo(Long value) {
            addCriterion("total_activity_subscribe_count <>", value, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountGreaterThan(Long value) {
            addCriterion("total_activity_subscribe_count >", value, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_activity_subscribe_count >=", value, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountLessThan(Long value) {
            addCriterion("total_activity_subscribe_count <", value, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountLessThanOrEqualTo(Long value) {
            addCriterion("total_activity_subscribe_count <=", value, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountIn(List<Long> values) {
            addCriterion("total_activity_subscribe_count in", values, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountNotIn(List<Long> values) {
            addCriterion("total_activity_subscribe_count not in", values, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountBetween(Long value1, Long value2) {
            addCriterion("total_activity_subscribe_count between", value1, value2, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalActivitySubscribeCountNotBetween(Long value1, Long value2) {
            addCriterion("total_activity_subscribe_count not between", value1, value2, "totalActivitySubscribeCount");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationIsNull() {
            addCriterion("total_live_duration is null");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationIsNotNull() {
            addCriterion("total_live_duration is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationEqualTo(Long value) {
            addCriterion("total_live_duration =", value, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationNotEqualTo(Long value) {
            addCriterion("total_live_duration <>", value, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationGreaterThan(Long value) {
            addCriterion("total_live_duration >", value, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("total_live_duration >=", value, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationLessThan(Long value) {
            addCriterion("total_live_duration <", value, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationLessThanOrEqualTo(Long value) {
            addCriterion("total_live_duration <=", value, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationIn(List<Long> values) {
            addCriterion("total_live_duration in", values, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationNotIn(List<Long> values) {
            addCriterion("total_live_duration not in", values, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationBetween(Long value1, Long value2) {
            addCriterion("total_live_duration between", value1, value2, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andTotalLiveDurationNotBetween(Long value1, Long value2) {
            addCriterion("total_live_duration not between", value1, value2, "totalLiveDuration");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeIsNull() {
            addCriterion("application_update_time is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeIsNotNull() {
            addCriterion("application_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeEqualTo(Date value) {
            addCriterion("application_update_time =", value, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeNotEqualTo(Date value) {
            addCriterion("application_update_time <>", value, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeGreaterThan(Date value) {
            addCriterion("application_update_time >", value, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("application_update_time >=", value, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeLessThan(Date value) {
            addCriterion("application_update_time <", value, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("application_update_time <=", value, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeIn(List<Date> values) {
            addCriterion("application_update_time in", values, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeNotIn(List<Date> values) {
            addCriterion("application_update_time not in", values, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("application_update_time between", value1, value2, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andApplicationUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("application_update_time not between", value1, value2, "applicationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
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