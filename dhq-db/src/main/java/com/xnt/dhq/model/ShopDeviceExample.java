package com.xnt.dhq.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShopDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopDeviceExample() {
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

        public Criteria andShopDeviceIdIsNull() {
            addCriterion("shop_device_id is null");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdIsNotNull() {
            addCriterion("shop_device_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdEqualTo(Integer value) {
            addCriterion("shop_device_id =", value, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdNotEqualTo(Integer value) {
            addCriterion("shop_device_id <>", value, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdGreaterThan(Integer value) {
            addCriterion("shop_device_id >", value, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_device_id >=", value, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdLessThan(Integer value) {
            addCriterion("shop_device_id <", value, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_device_id <=", value, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdIn(List<Integer> values) {
            addCriterion("shop_device_id in", values, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdNotIn(List<Integer> values) {
            addCriterion("shop_device_id not in", values, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_device_id between", value1, value2, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_device_id not between", value1, value2, "shopDeviceId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusIsNull() {
            addCriterion("shop_device_status is null");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusIsNotNull() {
            addCriterion("shop_device_status is not null");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusEqualTo(String value) {
            addCriterion("shop_device_status =", value, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusNotEqualTo(String value) {
            addCriterion("shop_device_status <>", value, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusGreaterThan(String value) {
            addCriterion("shop_device_status >", value, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("shop_device_status >=", value, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusLessThan(String value) {
            addCriterion("shop_device_status <", value, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusLessThanOrEqualTo(String value) {
            addCriterion("shop_device_status <=", value, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusLike(String value) {
            addCriterion("shop_device_status like", value, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusNotLike(String value) {
            addCriterion("shop_device_status not like", value, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusIn(List<String> values) {
            addCriterion("shop_device_status in", values, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusNotIn(List<String> values) {
            addCriterion("shop_device_status not in", values, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusBetween(String value1, String value2) {
            addCriterion("shop_device_status between", value1, value2, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andShopDeviceStatusNotBetween(String value1, String value2) {
            addCriterion("shop_device_status not between", value1, value2, "shopDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceIsNull() {
            addCriterion("chargeid_of_shop_device is null");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceIsNotNull() {
            addCriterion("chargeid_of_shop_device is not null");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceEqualTo(Integer value) {
            addCriterion("chargeid_of_shop_device =", value, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceNotEqualTo(Integer value) {
            addCriterion("chargeid_of_shop_device <>", value, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceGreaterThan(Integer value) {
            addCriterion("chargeid_of_shop_device >", value, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeid_of_shop_device >=", value, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceLessThan(Integer value) {
            addCriterion("chargeid_of_shop_device <", value, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceLessThanOrEqualTo(Integer value) {
            addCriterion("chargeid_of_shop_device <=", value, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceIn(List<Integer> values) {
            addCriterion("chargeid_of_shop_device in", values, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceNotIn(List<Integer> values) {
            addCriterion("chargeid_of_shop_device not in", values, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceBetween(Integer value1, Integer value2) {
            addCriterion("chargeid_of_shop_device between", value1, value2, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andChargeidOfShopDeviceNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeid_of_shop_device not between", value1, value2, "chargeidOfShopDevice");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkIsNull() {
            addCriterion("shop_device_remark is null");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkIsNotNull() {
            addCriterion("shop_device_remark is not null");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkEqualTo(String value) {
            addCriterion("shop_device_remark =", value, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkNotEqualTo(String value) {
            addCriterion("shop_device_remark <>", value, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkGreaterThan(String value) {
            addCriterion("shop_device_remark >", value, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("shop_device_remark >=", value, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkLessThan(String value) {
            addCriterion("shop_device_remark <", value, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkLessThanOrEqualTo(String value) {
            addCriterion("shop_device_remark <=", value, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkLike(String value) {
            addCriterion("shop_device_remark like", value, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkNotLike(String value) {
            addCriterion("shop_device_remark not like", value, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkIn(List<String> values) {
            addCriterion("shop_device_remark in", values, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkNotIn(List<String> values) {
            addCriterion("shop_device_remark not in", values, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkBetween(String value1, String value2) {
            addCriterion("shop_device_remark between", value1, value2, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andShopDeviceRemarkNotBetween(String value1, String value2) {
            addCriterion("shop_device_remark not between", value1, value2, "shopDeviceRemark");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Integer value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Integer value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Integer value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Integer value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Integer> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Integer> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
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