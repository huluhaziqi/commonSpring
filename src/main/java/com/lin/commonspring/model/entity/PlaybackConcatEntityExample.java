package com.lin.commonspring.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlaybackConcatEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaybackConcatEntityExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIsNull() {
            addCriterion("origin_url is null");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIsNotNull() {
            addCriterion("origin_url is not null");
            return (Criteria) this;
        }

        public Criteria andOriginUrlEqualTo(String value) {
            addCriterion("origin_url =", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotEqualTo(String value) {
            addCriterion("origin_url <>", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlGreaterThan(String value) {
            addCriterion("origin_url >", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlGreaterThanOrEqualTo(String value) {
            addCriterion("origin_url >=", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLessThan(String value) {
            addCriterion("origin_url <", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLessThanOrEqualTo(String value) {
            addCriterion("origin_url <=", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLike(String value) {
            addCriterion("origin_url like", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotLike(String value) {
            addCriterion("origin_url not like", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIn(List<String> values) {
            addCriterion("origin_url in", values, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotIn(List<String> values) {
            addCriterion("origin_url not in", values, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlBetween(String value1, String value2) {
            addCriterion("origin_url between", value1, value2, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotBetween(String value1, String value2) {
            addCriterion("origin_url not between", value1, value2, "originUrl");
            return (Criteria) this;
        }

        public Criteria andMp410UrlIsNull() {
            addCriterion("mp4_10_url is null");
            return (Criteria) this;
        }

        public Criteria andMp410UrlIsNotNull() {
            addCriterion("mp4_10_url is not null");
            return (Criteria) this;
        }

        public Criteria andMp410UrlEqualTo(String value) {
            addCriterion("mp4_10_url =", value, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlNotEqualTo(String value) {
            addCriterion("mp4_10_url <>", value, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlGreaterThan(String value) {
            addCriterion("mp4_10_url >", value, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlGreaterThanOrEqualTo(String value) {
            addCriterion("mp4_10_url >=", value, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlLessThan(String value) {
            addCriterion("mp4_10_url <", value, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlLessThanOrEqualTo(String value) {
            addCriterion("mp4_10_url <=", value, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlLike(String value) {
            addCriterion("mp4_10_url like", value, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlNotLike(String value) {
            addCriterion("mp4_10_url not like", value, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlIn(List<String> values) {
            addCriterion("mp4_10_url in", values, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlNotIn(List<String> values) {
            addCriterion("mp4_10_url not in", values, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlBetween(String value1, String value2) {
            addCriterion("mp4_10_url between", value1, value2, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp410UrlNotBetween(String value1, String value2) {
            addCriterion("mp4_10_url not between", value1, value2, "mp410Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlIsNull() {
            addCriterion("mp4_20_url is null");
            return (Criteria) this;
        }

        public Criteria andMp420UrlIsNotNull() {
            addCriterion("mp4_20_url is not null");
            return (Criteria) this;
        }

        public Criteria andMp420UrlEqualTo(String value) {
            addCriterion("mp4_20_url =", value, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlNotEqualTo(String value) {
            addCriterion("mp4_20_url <>", value, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlGreaterThan(String value) {
            addCriterion("mp4_20_url >", value, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlGreaterThanOrEqualTo(String value) {
            addCriterion("mp4_20_url >=", value, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlLessThan(String value) {
            addCriterion("mp4_20_url <", value, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlLessThanOrEqualTo(String value) {
            addCriterion("mp4_20_url <=", value, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlLike(String value) {
            addCriterion("mp4_20_url like", value, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlNotLike(String value) {
            addCriterion("mp4_20_url not like", value, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlIn(List<String> values) {
            addCriterion("mp4_20_url in", values, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlNotIn(List<String> values) {
            addCriterion("mp4_20_url not in", values, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlBetween(String value1, String value2) {
            addCriterion("mp4_20_url between", value1, value2, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp420UrlNotBetween(String value1, String value2) {
            addCriterion("mp4_20_url not between", value1, value2, "mp420Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlIsNull() {
            addCriterion("mp4_30_url is null");
            return (Criteria) this;
        }

        public Criteria andMp430UrlIsNotNull() {
            addCriterion("mp4_30_url is not null");
            return (Criteria) this;
        }

        public Criteria andMp430UrlEqualTo(String value) {
            addCriterion("mp4_30_url =", value, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlNotEqualTo(String value) {
            addCriterion("mp4_30_url <>", value, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlGreaterThan(String value) {
            addCriterion("mp4_30_url >", value, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlGreaterThanOrEqualTo(String value) {
            addCriterion("mp4_30_url >=", value, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlLessThan(String value) {
            addCriterion("mp4_30_url <", value, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlLessThanOrEqualTo(String value) {
            addCriterion("mp4_30_url <=", value, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlLike(String value) {
            addCriterion("mp4_30_url like", value, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlNotLike(String value) {
            addCriterion("mp4_30_url not like", value, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlIn(List<String> values) {
            addCriterion("mp4_30_url in", values, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlNotIn(List<String> values) {
            addCriterion("mp4_30_url not in", values, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlBetween(String value1, String value2) {
            addCriterion("mp4_30_url between", value1, value2, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp430UrlNotBetween(String value1, String value2) {
            addCriterion("mp4_30_url not between", value1, value2, "mp430Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlIsNull() {
            addCriterion("mp4_40_url is null");
            return (Criteria) this;
        }

        public Criteria andMp440UrlIsNotNull() {
            addCriterion("mp4_40_url is not null");
            return (Criteria) this;
        }

        public Criteria andMp440UrlEqualTo(String value) {
            addCriterion("mp4_40_url =", value, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlNotEqualTo(String value) {
            addCriterion("mp4_40_url <>", value, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlGreaterThan(String value) {
            addCriterion("mp4_40_url >", value, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlGreaterThanOrEqualTo(String value) {
            addCriterion("mp4_40_url >=", value, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlLessThan(String value) {
            addCriterion("mp4_40_url <", value, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlLessThanOrEqualTo(String value) {
            addCriterion("mp4_40_url <=", value, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlLike(String value) {
            addCriterion("mp4_40_url like", value, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlNotLike(String value) {
            addCriterion("mp4_40_url not like", value, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlIn(List<String> values) {
            addCriterion("mp4_40_url in", values, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlNotIn(List<String> values) {
            addCriterion("mp4_40_url not in", values, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlBetween(String value1, String value2) {
            addCriterion("mp4_40_url between", value1, value2, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andMp440UrlNotBetween(String value1, String value2) {
            addCriterion("mp4_40_url not between", value1, value2, "mp440Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlIsNull() {
            addCriterion("hls_10_url is null");
            return (Criteria) this;
        }

        public Criteria andHls10UrlIsNotNull() {
            addCriterion("hls_10_url is not null");
            return (Criteria) this;
        }

        public Criteria andHls10UrlEqualTo(String value) {
            addCriterion("hls_10_url =", value, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlNotEqualTo(String value) {
            addCriterion("hls_10_url <>", value, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlGreaterThan(String value) {
            addCriterion("hls_10_url >", value, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlGreaterThanOrEqualTo(String value) {
            addCriterion("hls_10_url >=", value, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlLessThan(String value) {
            addCriterion("hls_10_url <", value, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlLessThanOrEqualTo(String value) {
            addCriterion("hls_10_url <=", value, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlLike(String value) {
            addCriterion("hls_10_url like", value, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlNotLike(String value) {
            addCriterion("hls_10_url not like", value, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlIn(List<String> values) {
            addCriterion("hls_10_url in", values, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlNotIn(List<String> values) {
            addCriterion("hls_10_url not in", values, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlBetween(String value1, String value2) {
            addCriterion("hls_10_url between", value1, value2, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls10UrlNotBetween(String value1, String value2) {
            addCriterion("hls_10_url not between", value1, value2, "hls10Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlIsNull() {
            addCriterion("hls_20_url is null");
            return (Criteria) this;
        }

        public Criteria andHls20UrlIsNotNull() {
            addCriterion("hls_20_url is not null");
            return (Criteria) this;
        }

        public Criteria andHls20UrlEqualTo(String value) {
            addCriterion("hls_20_url =", value, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlNotEqualTo(String value) {
            addCriterion("hls_20_url <>", value, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlGreaterThan(String value) {
            addCriterion("hls_20_url >", value, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlGreaterThanOrEqualTo(String value) {
            addCriterion("hls_20_url >=", value, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlLessThan(String value) {
            addCriterion("hls_20_url <", value, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlLessThanOrEqualTo(String value) {
            addCriterion("hls_20_url <=", value, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlLike(String value) {
            addCriterion("hls_20_url like", value, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlNotLike(String value) {
            addCriterion("hls_20_url not like", value, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlIn(List<String> values) {
            addCriterion("hls_20_url in", values, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlNotIn(List<String> values) {
            addCriterion("hls_20_url not in", values, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlBetween(String value1, String value2) {
            addCriterion("hls_20_url between", value1, value2, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls20UrlNotBetween(String value1, String value2) {
            addCriterion("hls_20_url not between", value1, value2, "hls20Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlIsNull() {
            addCriterion("hls_30_url is null");
            return (Criteria) this;
        }

        public Criteria andHls30UrlIsNotNull() {
            addCriterion("hls_30_url is not null");
            return (Criteria) this;
        }

        public Criteria andHls30UrlEqualTo(String value) {
            addCriterion("hls_30_url =", value, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlNotEqualTo(String value) {
            addCriterion("hls_30_url <>", value, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlGreaterThan(String value) {
            addCriterion("hls_30_url >", value, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlGreaterThanOrEqualTo(String value) {
            addCriterion("hls_30_url >=", value, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlLessThan(String value) {
            addCriterion("hls_30_url <", value, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlLessThanOrEqualTo(String value) {
            addCriterion("hls_30_url <=", value, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlLike(String value) {
            addCriterion("hls_30_url like", value, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlNotLike(String value) {
            addCriterion("hls_30_url not like", value, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlIn(List<String> values) {
            addCriterion("hls_30_url in", values, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlNotIn(List<String> values) {
            addCriterion("hls_30_url not in", values, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlBetween(String value1, String value2) {
            addCriterion("hls_30_url between", value1, value2, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls30UrlNotBetween(String value1, String value2) {
            addCriterion("hls_30_url not between", value1, value2, "hls30Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlIsNull() {
            addCriterion("hls_40_url is null");
            return (Criteria) this;
        }

        public Criteria andHls40UrlIsNotNull() {
            addCriterion("hls_40_url is not null");
            return (Criteria) this;
        }

        public Criteria andHls40UrlEqualTo(String value) {
            addCriterion("hls_40_url =", value, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlNotEqualTo(String value) {
            addCriterion("hls_40_url <>", value, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlGreaterThan(String value) {
            addCriterion("hls_40_url >", value, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlGreaterThanOrEqualTo(String value) {
            addCriterion("hls_40_url >=", value, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlLessThan(String value) {
            addCriterion("hls_40_url <", value, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlLessThanOrEqualTo(String value) {
            addCriterion("hls_40_url <=", value, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlLike(String value) {
            addCriterion("hls_40_url like", value, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlNotLike(String value) {
            addCriterion("hls_40_url not like", value, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlIn(List<String> values) {
            addCriterion("hls_40_url in", values, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlNotIn(List<String> values) {
            addCriterion("hls_40_url not in", values, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlBetween(String value1, String value2) {
            addCriterion("hls_40_url between", value1, value2, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andHls40UrlNotBetween(String value1, String value2) {
            addCriterion("hls_40_url not between", value1, value2, "hls40Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlIsNull() {
            addCriterion("flv_10046_url is null");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlIsNotNull() {
            addCriterion("flv_10046_url is not null");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlEqualTo(String value) {
            addCriterion("flv_10046_url =", value, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlNotEqualTo(String value) {
            addCriterion("flv_10046_url <>", value, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlGreaterThan(String value) {
            addCriterion("flv_10046_url >", value, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlGreaterThanOrEqualTo(String value) {
            addCriterion("flv_10046_url >=", value, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlLessThan(String value) {
            addCriterion("flv_10046_url <", value, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlLessThanOrEqualTo(String value) {
            addCriterion("flv_10046_url <=", value, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlLike(String value) {
            addCriterion("flv_10046_url like", value, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlNotLike(String value) {
            addCriterion("flv_10046_url not like", value, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlIn(List<String> values) {
            addCriterion("flv_10046_url in", values, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlNotIn(List<String> values) {
            addCriterion("flv_10046_url not in", values, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlBetween(String value1, String value2) {
            addCriterion("flv_10046_url between", value1, value2, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10046UrlNotBetween(String value1, String value2) {
            addCriterion("flv_10046_url not between", value1, value2, "flv10046Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlIsNull() {
            addCriterion("flv_10047_url is null");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlIsNotNull() {
            addCriterion("flv_10047_url is not null");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlEqualTo(String value) {
            addCriterion("flv_10047_url =", value, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlNotEqualTo(String value) {
            addCriterion("flv_10047_url <>", value, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlGreaterThan(String value) {
            addCriterion("flv_10047_url >", value, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlGreaterThanOrEqualTo(String value) {
            addCriterion("flv_10047_url >=", value, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlLessThan(String value) {
            addCriterion("flv_10047_url <", value, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlLessThanOrEqualTo(String value) {
            addCriterion("flv_10047_url <=", value, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlLike(String value) {
            addCriterion("flv_10047_url like", value, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlNotLike(String value) {
            addCriterion("flv_10047_url not like", value, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlIn(List<String> values) {
            addCriterion("flv_10047_url in", values, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlNotIn(List<String> values) {
            addCriterion("flv_10047_url not in", values, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlBetween(String value1, String value2) {
            addCriterion("flv_10047_url between", value1, value2, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10047UrlNotBetween(String value1, String value2) {
            addCriterion("flv_10047_url not between", value1, value2, "flv10047Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlIsNull() {
            addCriterion("flv_10048_url is null");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlIsNotNull() {
            addCriterion("flv_10048_url is not null");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlEqualTo(String value) {
            addCriterion("flv_10048_url =", value, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlNotEqualTo(String value) {
            addCriterion("flv_10048_url <>", value, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlGreaterThan(String value) {
            addCriterion("flv_10048_url >", value, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlGreaterThanOrEqualTo(String value) {
            addCriterion("flv_10048_url >=", value, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlLessThan(String value) {
            addCriterion("flv_10048_url <", value, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlLessThanOrEqualTo(String value) {
            addCriterion("flv_10048_url <=", value, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlLike(String value) {
            addCriterion("flv_10048_url like", value, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlNotLike(String value) {
            addCriterion("flv_10048_url not like", value, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlIn(List<String> values) {
            addCriterion("flv_10048_url in", values, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlNotIn(List<String> values) {
            addCriterion("flv_10048_url not in", values, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlBetween(String value1, String value2) {
            addCriterion("flv_10048_url between", value1, value2, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10048UrlNotBetween(String value1, String value2) {
            addCriterion("flv_10048_url not between", value1, value2, "flv10048Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlIsNull() {
            addCriterion("flv_10049_url is null");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlIsNotNull() {
            addCriterion("flv_10049_url is not null");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlEqualTo(String value) {
            addCriterion("flv_10049_url =", value, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlNotEqualTo(String value) {
            addCriterion("flv_10049_url <>", value, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlGreaterThan(String value) {
            addCriterion("flv_10049_url >", value, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlGreaterThanOrEqualTo(String value) {
            addCriterion("flv_10049_url >=", value, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlLessThan(String value) {
            addCriterion("flv_10049_url <", value, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlLessThanOrEqualTo(String value) {
            addCriterion("flv_10049_url <=", value, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlLike(String value) {
            addCriterion("flv_10049_url like", value, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlNotLike(String value) {
            addCriterion("flv_10049_url not like", value, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlIn(List<String> values) {
            addCriterion("flv_10049_url in", values, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlNotIn(List<String> values) {
            addCriterion("flv_10049_url not in", values, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlBetween(String value1, String value2) {
            addCriterion("flv_10049_url between", value1, value2, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andFlv10049UrlNotBetween(String value1, String value2) {
            addCriterion("flv_10049_url not between", value1, value2, "flv10049Url");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
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