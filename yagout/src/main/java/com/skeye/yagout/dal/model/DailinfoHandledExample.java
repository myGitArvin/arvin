package com.skeye.yagout.dal.model;

import java.util.ArrayList;
import java.util.List;

public class DailinfoHandledExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public DailinfoHandledExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdslaccountIsNull() {
            addCriterion("AdslAccount is null");
            return (Criteria) this;
        }

        public Criteria andAdslaccountIsNotNull() {
            addCriterion("AdslAccount is not null");
            return (Criteria) this;
        }

        public Criteria andAdslaccountEqualTo(String value) {
            addCriterion("AdslAccount =", value, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountNotEqualTo(String value) {
            addCriterion("AdslAccount <>", value, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountGreaterThan(String value) {
            addCriterion("AdslAccount >", value, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountGreaterThanOrEqualTo(String value) {
            addCriterion("AdslAccount >=", value, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountLessThan(String value) {
            addCriterion("AdslAccount <", value, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountLessThanOrEqualTo(String value) {
            addCriterion("AdslAccount <=", value, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountLike(String value) {
            addCriterion("AdslAccount like", value, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountNotLike(String value) {
            addCriterion("AdslAccount not like", value, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountIn(List<String> values) {
            addCriterion("AdslAccount in", values, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountNotIn(List<String> values) {
            addCriterion("AdslAccount not in", values, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountBetween(String value1, String value2) {
            addCriterion("AdslAccount between", value1, value2, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andAdslaccountNotBetween(String value1, String value2) {
            addCriterion("AdslAccount not between", value1, value2, "adslaccount");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("Passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("Passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("Passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("Passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("Passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("Passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("Passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("Passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("Passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("Passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("Passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("Passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("Passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("Passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andDailtimeIsNull() {
            addCriterion("DailTime is null");
            return (Criteria) this;
        }

        public Criteria andDailtimeIsNotNull() {
            addCriterion("DailTime is not null");
            return (Criteria) this;
        }

        public Criteria andDailtimeEqualTo(Integer value) {
            addCriterion("DailTime =", value, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeNotEqualTo(Integer value) {
            addCriterion("DailTime <>", value, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeGreaterThan(Integer value) {
            addCriterion("DailTime >", value, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DailTime >=", value, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeLessThan(Integer value) {
            addCriterion("DailTime <", value, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeLessThanOrEqualTo(Integer value) {
            addCriterion("DailTime <=", value, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeIn(List<Integer> values) {
            addCriterion("DailTime in", values, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeNotIn(List<Integer> values) {
            addCriterion("DailTime not in", values, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeBetween(Integer value1, Integer value2) {
            addCriterion("DailTime between", value1, value2, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("DailTime not between", value1, value2, "dailtime");
            return (Criteria) this;
        }

        public Criteria andDailipIsNull() {
            addCriterion("DailIP is null");
            return (Criteria) this;
        }

        public Criteria andDailipIsNotNull() {
            addCriterion("DailIP is not null");
            return (Criteria) this;
        }

        public Criteria andDailipEqualTo(Integer value) {
            addCriterion("DailIP =", value, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipNotEqualTo(Integer value) {
            addCriterion("DailIP <>", value, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipGreaterThan(Integer value) {
            addCriterion("DailIP >", value, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipGreaterThanOrEqualTo(Integer value) {
            addCriterion("DailIP >=", value, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipLessThan(Integer value) {
            addCriterion("DailIP <", value, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipLessThanOrEqualTo(Integer value) {
            addCriterion("DailIP <=", value, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipIn(List<Integer> values) {
            addCriterion("DailIP in", values, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipNotIn(List<Integer> values) {
            addCriterion("DailIP not in", values, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipBetween(Integer value1, Integer value2) {
            addCriterion("DailIP between", value1, value2, "dailip");
            return (Criteria) this;
        }

        public Criteria andDailipNotBetween(Integer value1, Integer value2) {
            addCriterion("DailIP not between", value1, value2, "dailip");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNull() {
            addCriterion("SessionID is null");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNotNull() {
            addCriterion("SessionID is not null");
            return (Criteria) this;
        }

        public Criteria andSessionidEqualTo(Integer value) {
            addCriterion("SessionID =", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotEqualTo(Integer value) {
            addCriterion("SessionID <>", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThan(Integer value) {
            addCriterion("SessionID >", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SessionID >=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThan(Integer value) {
            addCriterion("SessionID <", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThanOrEqualTo(Integer value) {
            addCriterion("SessionID <=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidIn(List<Integer> values) {
            addCriterion("SessionID in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotIn(List<Integer> values) {
            addCriterion("SessionID not in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidBetween(Integer value1, Integer value2) {
            addCriterion("SessionID between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotBetween(Integer value1, Integer value2) {
            addCriterion("SessionID not between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andDailtypeIsNull() {
            addCriterion("DailType is null");
            return (Criteria) this;
        }

        public Criteria andDailtypeIsNotNull() {
            addCriterion("DailType is not null");
            return (Criteria) this;
        }

        public Criteria andDailtypeEqualTo(Integer value) {
            addCriterion("DailType =", value, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeNotEqualTo(Integer value) {
            addCriterion("DailType <>", value, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeGreaterThan(Integer value) {
            addCriterion("DailType >", value, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DailType >=", value, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeLessThan(Integer value) {
            addCriterion("DailType <", value, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeLessThanOrEqualTo(Integer value) {
            addCriterion("DailType <=", value, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeIn(List<Integer> values) {
            addCriterion("DailType in", values, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeNotIn(List<Integer> values) {
            addCriterion("DailType not in", values, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeBetween(Integer value1, Integer value2) {
            addCriterion("DailType between", value1, value2, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DailType not between", value1, value2, "dailtype");
            return (Criteria) this;
        }

        public Criteria andDailmacIsNull() {
            addCriterion("DailMac is null");
            return (Criteria) this;
        }

        public Criteria andDailmacIsNotNull() {
            addCriterion("DailMac is not null");
            return (Criteria) this;
        }

        public Criteria andDailmacEqualTo(String value) {
            addCriterion("DailMac =", value, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacNotEqualTo(String value) {
            addCriterion("DailMac <>", value, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacGreaterThan(String value) {
            addCriterion("DailMac >", value, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacGreaterThanOrEqualTo(String value) {
            addCriterion("DailMac >=", value, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacLessThan(String value) {
            addCriterion("DailMac <", value, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacLessThanOrEqualTo(String value) {
            addCriterion("DailMac <=", value, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacLike(String value) {
            addCriterion("DailMac like", value, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacNotLike(String value) {
            addCriterion("DailMac not like", value, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacIn(List<String> values) {
            addCriterion("DailMac in", values, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacNotIn(List<String> values) {
            addCriterion("DailMac not in", values, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacBetween(String value1, String value2) {
            addCriterion("DailMac between", value1, value2, "dailmac");
            return (Criteria) this;
        }

        public Criteria andDailmacNotBetween(String value1, String value2) {
            addCriterion("DailMac not between", value1, value2, "dailmac");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dailinfo_handled
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dailinfo_handled
     *
     * @mbggenerated
     */
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