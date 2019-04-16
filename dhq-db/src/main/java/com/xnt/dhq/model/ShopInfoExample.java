package com.xnt.dhq.model;

import java.util.ArrayList;
import java.util.List;

public class ShopInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopInfoExample() {
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

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("shop_type like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("shop_type not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNull() {
            addCriterion("shop_desc is null");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNotNull() {
            addCriterion("shop_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShopDescEqualTo(String value) {
            addCriterion("shop_desc =", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotEqualTo(String value) {
            addCriterion("shop_desc <>", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThan(String value) {
            addCriterion("shop_desc >", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThanOrEqualTo(String value) {
            addCriterion("shop_desc >=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThan(String value) {
            addCriterion("shop_desc <", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThanOrEqualTo(String value) {
            addCriterion("shop_desc <=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLike(String value) {
            addCriterion("shop_desc like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotLike(String value) {
            addCriterion("shop_desc not like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescIn(List<String> values) {
            addCriterion("shop_desc in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotIn(List<String> values) {
            addCriterion("shop_desc not in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescBetween(String value1, String value2) {
            addCriterion("shop_desc between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotBetween(String value1, String value2) {
            addCriterion("shop_desc not between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceIsNull() {
            addCriterion("shop_location_province is null");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceIsNotNull() {
            addCriterion("shop_location_province is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceEqualTo(String value) {
            addCriterion("shop_location_province =", value, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceNotEqualTo(String value) {
            addCriterion("shop_location_province <>", value, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceGreaterThan(String value) {
            addCriterion("shop_location_province >", value, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("shop_location_province >=", value, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceLessThan(String value) {
            addCriterion("shop_location_province <", value, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceLessThanOrEqualTo(String value) {
            addCriterion("shop_location_province <=", value, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceLike(String value) {
            addCriterion("shop_location_province like", value, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceNotLike(String value) {
            addCriterion("shop_location_province not like", value, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceIn(List<String> values) {
            addCriterion("shop_location_province in", values, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceNotIn(List<String> values) {
            addCriterion("shop_location_province not in", values, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceBetween(String value1, String value2) {
            addCriterion("shop_location_province between", value1, value2, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationProvinceNotBetween(String value1, String value2) {
            addCriterion("shop_location_province not between", value1, value2, "shopLocationProvince");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityIsNull() {
            addCriterion("shop_location_city is null");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityIsNotNull() {
            addCriterion("shop_location_city is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityEqualTo(String value) {
            addCriterion("shop_location_city =", value, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityNotEqualTo(String value) {
            addCriterion("shop_location_city <>", value, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityGreaterThan(String value) {
            addCriterion("shop_location_city >", value, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityGreaterThanOrEqualTo(String value) {
            addCriterion("shop_location_city >=", value, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityLessThan(String value) {
            addCriterion("shop_location_city <", value, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityLessThanOrEqualTo(String value) {
            addCriterion("shop_location_city <=", value, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityLike(String value) {
            addCriterion("shop_location_city like", value, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityNotLike(String value) {
            addCriterion("shop_location_city not like", value, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityIn(List<String> values) {
            addCriterion("shop_location_city in", values, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityNotIn(List<String> values) {
            addCriterion("shop_location_city not in", values, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityBetween(String value1, String value2) {
            addCriterion("shop_location_city between", value1, value2, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationCityNotBetween(String value1, String value2) {
            addCriterion("shop_location_city not between", value1, value2, "shopLocationCity");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictIsNull() {
            addCriterion("shop_location_district is null");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictIsNotNull() {
            addCriterion("shop_location_district is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictEqualTo(String value) {
            addCriterion("shop_location_district =", value, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictNotEqualTo(String value) {
            addCriterion("shop_location_district <>", value, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictGreaterThan(String value) {
            addCriterion("shop_location_district >", value, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("shop_location_district >=", value, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictLessThan(String value) {
            addCriterion("shop_location_district <", value, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictLessThanOrEqualTo(String value) {
            addCriterion("shop_location_district <=", value, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictLike(String value) {
            addCriterion("shop_location_district like", value, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictNotLike(String value) {
            addCriterion("shop_location_district not like", value, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictIn(List<String> values) {
            addCriterion("shop_location_district in", values, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictNotIn(List<String> values) {
            addCriterion("shop_location_district not in", values, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictBetween(String value1, String value2) {
            addCriterion("shop_location_district between", value1, value2, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDistrictNotBetween(String value1, String value2) {
            addCriterion("shop_location_district not between", value1, value2, "shopLocationDistrict");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailIsNull() {
            addCriterion("shop_location_detail is null");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailIsNotNull() {
            addCriterion("shop_location_detail is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailEqualTo(String value) {
            addCriterion("shop_location_detail =", value, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailNotEqualTo(String value) {
            addCriterion("shop_location_detail <>", value, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailGreaterThan(String value) {
            addCriterion("shop_location_detail >", value, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailGreaterThanOrEqualTo(String value) {
            addCriterion("shop_location_detail >=", value, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailLessThan(String value) {
            addCriterion("shop_location_detail <", value, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailLessThanOrEqualTo(String value) {
            addCriterion("shop_location_detail <=", value, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailLike(String value) {
            addCriterion("shop_location_detail like", value, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailNotLike(String value) {
            addCriterion("shop_location_detail not like", value, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailIn(List<String> values) {
            addCriterion("shop_location_detail in", values, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailNotIn(List<String> values) {
            addCriterion("shop_location_detail not in", values, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailBetween(String value1, String value2) {
            addCriterion("shop_location_detail between", value1, value2, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopLocationDetailNotBetween(String value1, String value2) {
            addCriterion("shop_location_detail not between", value1, value2, "shopLocationDetail");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNull() {
            addCriterion("shop_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNotNull() {
            addCriterion("shop_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneEqualTo(String value) {
            addCriterion("shop_phone =", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotEqualTo(String value) {
            addCriterion("shop_phone <>", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThan(String value) {
            addCriterion("shop_phone >", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_phone >=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThan(String value) {
            addCriterion("shop_phone <", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_phone <=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLike(String value) {
            addCriterion("shop_phone like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotLike(String value) {
            addCriterion("shop_phone not like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIn(List<String> values) {
            addCriterion("shop_phone in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotIn(List<String> values) {
            addCriterion("shop_phone not in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneBetween(String value1, String value2) {
            addCriterion("shop_phone between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotBetween(String value1, String value2) {
            addCriterion("shop_phone not between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopSizeIsNull() {
            addCriterion("shop_size is null");
            return (Criteria) this;
        }

        public Criteria andShopSizeIsNotNull() {
            addCriterion("shop_size is not null");
            return (Criteria) this;
        }

        public Criteria andShopSizeEqualTo(Integer value) {
            addCriterion("shop_size =", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeNotEqualTo(Integer value) {
            addCriterion("shop_size <>", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeGreaterThan(Integer value) {
            addCriterion("shop_size >", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_size >=", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeLessThan(Integer value) {
            addCriterion("shop_size <", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeLessThanOrEqualTo(Integer value) {
            addCriterion("shop_size <=", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeIn(List<Integer> values) {
            addCriterion("shop_size in", values, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeNotIn(List<Integer> values) {
            addCriterion("shop_size not in", values, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeBetween(Integer value1, Integer value2) {
            addCriterion("shop_size between", value1, value2, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_size not between", value1, value2, "shopSize");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumIsNull() {
            addCriterion("employee_num is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumIsNotNull() {
            addCriterion("employee_num is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumEqualTo(Integer value) {
            addCriterion("employee_num =", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumNotEqualTo(Integer value) {
            addCriterion("employee_num <>", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumGreaterThan(Integer value) {
            addCriterion("employee_num >", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_num >=", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumLessThan(Integer value) {
            addCriterion("employee_num <", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumLessThanOrEqualTo(Integer value) {
            addCriterion("employee_num <=", value, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumIn(List<Integer> values) {
            addCriterion("employee_num in", values, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumNotIn(List<Integer> values) {
            addCriterion("employee_num not in", values, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumBetween(Integer value1, Integer value2) {
            addCriterion("employee_num between", value1, value2, "employeeNum");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_num not between", value1, value2, "employeeNum");
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