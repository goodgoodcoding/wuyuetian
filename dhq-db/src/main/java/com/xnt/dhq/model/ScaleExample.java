package com.xnt.dhq.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScaleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andScaleIdIsNull() {
            addCriterion("scale_id is null");
            return (Criteria) this;
        }

        public Criteria andScaleIdIsNotNull() {
            addCriterion("scale_id is not null");
            return (Criteria) this;
        }

        public Criteria andScaleIdEqualTo(Integer value) {
            addCriterion("scale_id =", value, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdNotEqualTo(Integer value) {
            addCriterion("scale_id <>", value, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdGreaterThan(Integer value) {
            addCriterion("scale_id >", value, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scale_id >=", value, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdLessThan(Integer value) {
            addCriterion("scale_id <", value, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("scale_id <=", value, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdIn(List<Integer> values) {
            addCriterion("scale_id in", values, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdNotIn(List<Integer> values) {
            addCriterion("scale_id not in", values, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdBetween(Integer value1, Integer value2) {
            addCriterion("scale_id between", value1, value2, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scale_id not between", value1, value2, "scaleId");
            return (Criteria) this;
        }

        public Criteria andScaleNameIsNull() {
            addCriterion("scale_name is null");
            return (Criteria) this;
        }

        public Criteria andScaleNameIsNotNull() {
            addCriterion("scale_name is not null");
            return (Criteria) this;
        }

        public Criteria andScaleNameEqualTo(String value) {
            addCriterion("scale_name =", value, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameNotEqualTo(String value) {
            addCriterion("scale_name <>", value, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameGreaterThan(String value) {
            addCriterion("scale_name >", value, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameGreaterThanOrEqualTo(String value) {
            addCriterion("scale_name >=", value, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameLessThan(String value) {
            addCriterion("scale_name <", value, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameLessThanOrEqualTo(String value) {
            addCriterion("scale_name <=", value, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameLike(String value) {
            addCriterion("scale_name like", value, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameNotLike(String value) {
            addCriterion("scale_name not like", value, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameIn(List<String> values) {
            addCriterion("scale_name in", values, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameNotIn(List<String> values) {
            addCriterion("scale_name not in", values, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameBetween(String value1, String value2) {
            addCriterion("scale_name between", value1, value2, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleNameNotBetween(String value1, String value2) {
            addCriterion("scale_name not between", value1, value2, "scaleName");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidIsNull() {
            addCriterion("scale_typeId is null");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidIsNotNull() {
            addCriterion("scale_typeId is not null");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidEqualTo(Integer value) {
            addCriterion("scale_typeId =", value, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidNotEqualTo(Integer value) {
            addCriterion("scale_typeId <>", value, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidGreaterThan(Integer value) {
            addCriterion("scale_typeId >", value, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scale_typeId >=", value, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidLessThan(Integer value) {
            addCriterion("scale_typeId <", value, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("scale_typeId <=", value, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidIn(List<Integer> values) {
            addCriterion("scale_typeId in", values, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidNotIn(List<Integer> values) {
            addCriterion("scale_typeId not in", values, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidBetween(Integer value1, Integer value2) {
            addCriterion("scale_typeId between", value1, value2, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andScaleTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("scale_typeId not between", value1, value2, "scaleTypeid");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIsNull() {
            addCriterion("designer_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIsNotNull() {
            addCriterion("designer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerIdEqualTo(Integer value) {
            addCriterion("designer_id =", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotEqualTo(Integer value) {
            addCriterion("designer_id <>", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdGreaterThan(Integer value) {
            addCriterion("designer_id >", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("designer_id >=", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdLessThan(Integer value) {
            addCriterion("designer_id <", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdLessThanOrEqualTo(Integer value) {
            addCriterion("designer_id <=", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIn(List<Integer> values) {
            addCriterion("designer_id in", values, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotIn(List<Integer> values) {
            addCriterion("designer_id not in", values, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdBetween(Integer value1, Integer value2) {
            addCriterion("designer_id between", value1, value2, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("designer_id not between", value1, value2, "designerId");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartIsNull() {
            addCriterion("suitable_agestart is null");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartIsNotNull() {
            addCriterion("suitable_agestart is not null");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartEqualTo(Integer value) {
            addCriterion("suitable_agestart =", value, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartNotEqualTo(Integer value) {
            addCriterion("suitable_agestart <>", value, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartGreaterThan(Integer value) {
            addCriterion("suitable_agestart >", value, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartGreaterThanOrEqualTo(Integer value) {
            addCriterion("suitable_agestart >=", value, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartLessThan(Integer value) {
            addCriterion("suitable_agestart <", value, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartLessThanOrEqualTo(Integer value) {
            addCriterion("suitable_agestart <=", value, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartIn(List<Integer> values) {
            addCriterion("suitable_agestart in", values, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartNotIn(List<Integer> values) {
            addCriterion("suitable_agestart not in", values, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartBetween(Integer value1, Integer value2) {
            addCriterion("suitable_agestart between", value1, value2, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgestartNotBetween(Integer value1, Integer value2) {
            addCriterion("suitable_agestart not between", value1, value2, "suitableAgestart");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendIsNull() {
            addCriterion("suitable_ageend is null");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendIsNotNull() {
            addCriterion("suitable_ageend is not null");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendEqualTo(Integer value) {
            addCriterion("suitable_ageend =", value, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendNotEqualTo(Integer value) {
            addCriterion("suitable_ageend <>", value, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendGreaterThan(Integer value) {
            addCriterion("suitable_ageend >", value, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendGreaterThanOrEqualTo(Integer value) {
            addCriterion("suitable_ageend >=", value, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendLessThan(Integer value) {
            addCriterion("suitable_ageend <", value, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendLessThanOrEqualTo(Integer value) {
            addCriterion("suitable_ageend <=", value, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendIn(List<Integer> values) {
            addCriterion("suitable_ageend in", values, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendNotIn(List<Integer> values) {
            addCriterion("suitable_ageend not in", values, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendBetween(Integer value1, Integer value2) {
            addCriterion("suitable_ageend between", value1, value2, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andSuitableAgeendNotBetween(Integer value1, Integer value2) {
            addCriterion("suitable_ageend not between", value1, value2, "suitableAgeend");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Integer value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Integer value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Integer value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Integer value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Integer> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Integer> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Integer value1, Integer value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
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