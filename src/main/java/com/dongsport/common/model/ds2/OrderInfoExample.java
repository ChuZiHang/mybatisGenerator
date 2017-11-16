package com.dongsport.common.model.ds2;

import com.dongsport.common.plugin.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    private String dialect = "mysql";

    private static final long serialVersionUID = 1L;

    public OrderInfoExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    public void setDialect(String dialect) {
        this.dialect=dialect;
    }

    public String getDialect() {
        return dialect;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        private static final long serialVersionUID = 1L;

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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andIsSplitIsNull() {
            addCriterion("is_split is null");
            return (Criteria) this;
        }

        public Criteria andIsSplitIsNotNull() {
            addCriterion("is_split is not null");
            return (Criteria) this;
        }

        public Criteria andIsSplitEqualTo(Integer value) {
            addCriterion("is_split =", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotEqualTo(Integer value) {
            addCriterion("is_split <>", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitGreaterThan(Integer value) {
            addCriterion("is_split >", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_split >=", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitLessThan(Integer value) {
            addCriterion("is_split <", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitLessThanOrEqualTo(Integer value) {
            addCriterion("is_split <=", value, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitIn(List<Integer> values) {
            addCriterion("is_split in", values, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotIn(List<Integer> values) {
            addCriterion("is_split not in", values, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitBetween(Integer value1, Integer value2) {
            addCriterion("is_split between", value1, value2, "isSplit");
            return (Criteria) this;
        }

        public Criteria andIsSplitNotBetween(Integer value1, Integer value2) {
            addCriterion("is_split not between", value1, value2, "isSplit");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Integer value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Integer value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Integer value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Integer value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Integer> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Integer> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Integer value1, Integer value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(Double value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(Double value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(Double value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(Double value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<Double> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<Double> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Long value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Long value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Long value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Long value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Long> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Long> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Long value1, Long value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdIsNull() {
            addCriterion("order_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdIsNotNull() {
            addCriterion("order_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdEqualTo(Long value) {
            addCriterion("order_cust_id =", value, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdNotEqualTo(Long value) {
            addCriterion("order_cust_id <>", value, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdGreaterThan(Long value) {
            addCriterion("order_cust_id >", value, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_cust_id >=", value, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdLessThan(Long value) {
            addCriterion("order_cust_id <", value, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdLessThanOrEqualTo(Long value) {
            addCriterion("order_cust_id <=", value, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdIn(List<Long> values) {
            addCriterion("order_cust_id in", values, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdNotIn(List<Long> values) {
            addCriterion("order_cust_id not in", values, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdBetween(Long value1, Long value2) {
            addCriterion("order_cust_id between", value1, value2, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andOrderCustIdNotBetween(Long value1, Long value2) {
            addCriterion("order_cust_id not between", value1, value2, "orderCustId");
            return (Criteria) this;
        }

        public Criteria andTravelDateIsNull() {
            addCriterion("travel_date is null");
            return (Criteria) this;
        }

        public Criteria andTravelDateIsNotNull() {
            addCriterion("travel_date is not null");
            return (Criteria) this;
        }

        public Criteria andTravelDateEqualTo(Date value) {
            addCriterion("travel_date =", value, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateNotEqualTo(Date value) {
            addCriterion("travel_date <>", value, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateGreaterThan(Date value) {
            addCriterion("travel_date >", value, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("travel_date >=", value, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateLessThan(Date value) {
            addCriterion("travel_date <", value, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateLessThanOrEqualTo(Date value) {
            addCriterion("travel_date <=", value, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateIn(List<Date> values) {
            addCriterion("travel_date in", values, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateNotIn(List<Date> values) {
            addCriterion("travel_date not in", values, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateBetween(Date value1, Date value2) {
            addCriterion("travel_date between", value1, value2, "travelDate");
            return (Criteria) this;
        }

        public Criteria andTravelDateNotBetween(Date value1, Date value2) {
            addCriterion("travel_date not between", value1, value2, "travelDate");
            return (Criteria) this;
        }

        public Criteria andGetTypeIsNull() {
            addCriterion("get_type is null");
            return (Criteria) this;
        }

        public Criteria andGetTypeIsNotNull() {
            addCriterion("get_type is not null");
            return (Criteria) this;
        }

        public Criteria andGetTypeEqualTo(Integer value) {
            addCriterion("get_type =", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotEqualTo(Integer value) {
            addCriterion("get_type <>", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeGreaterThan(Integer value) {
            addCriterion("get_type >", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_type >=", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeLessThan(Integer value) {
            addCriterion("get_type <", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("get_type <=", value, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeIn(List<Integer> values) {
            addCriterion("get_type in", values, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotIn(List<Integer> values) {
            addCriterion("get_type not in", values, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeBetween(Integer value1, Integer value2) {
            addCriterion("get_type between", value1, value2, "getType");
            return (Criteria) this;
        }

        public Criteria andGetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("get_type not between", value1, value2, "getType");
            return (Criteria) this;
        }

        public Criteria andGetPriceIsNull() {
            addCriterion("get_price is null");
            return (Criteria) this;
        }

        public Criteria andGetPriceIsNotNull() {
            addCriterion("get_price is not null");
            return (Criteria) this;
        }

        public Criteria andGetPriceEqualTo(Double value) {
            addCriterion("get_price =", value, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceNotEqualTo(Double value) {
            addCriterion("get_price <>", value, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceGreaterThan(Double value) {
            addCriterion("get_price >", value, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("get_price >=", value, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceLessThan(Double value) {
            addCriterion("get_price <", value, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceLessThanOrEqualTo(Double value) {
            addCriterion("get_price <=", value, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceIn(List<Double> values) {
            addCriterion("get_price in", values, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceNotIn(List<Double> values) {
            addCriterion("get_price not in", values, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceBetween(Double value1, Double value2) {
            addCriterion("get_price between", value1, value2, "getPrice");
            return (Criteria) this;
        }

        public Criteria andGetPriceNotBetween(Double value1, Double value2) {
            addCriterion("get_price not between", value1, value2, "getPrice");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRefundSetIsNull() {
            addCriterion("refund_set is null");
            return (Criteria) this;
        }

        public Criteria andRefundSetIsNotNull() {
            addCriterion("refund_set is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSetEqualTo(Integer value) {
            addCriterion("refund_set =", value, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetNotEqualTo(Integer value) {
            addCriterion("refund_set <>", value, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetGreaterThan(Integer value) {
            addCriterion("refund_set >", value, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_set >=", value, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetLessThan(Integer value) {
            addCriterion("refund_set <", value, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetLessThanOrEqualTo(Integer value) {
            addCriterion("refund_set <=", value, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetIn(List<Integer> values) {
            addCriterion("refund_set in", values, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetNotIn(List<Integer> values) {
            addCriterion("refund_set not in", values, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetBetween(Integer value1, Integer value2) {
            addCriterion("refund_set between", value1, value2, "refundSet");
            return (Criteria) this;
        }

        public Criteria andRefundSetNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_set not between", value1, value2, "refundSet");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNull() {
            addCriterion("confirm_date is null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNotNull() {
            addCriterion("confirm_date is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateEqualTo(Date value) {
            addCriterion("confirm_date =", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotEqualTo(Date value) {
            addCriterion("confirm_date <>", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThan(Date value) {
            addCriterion("confirm_date >", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_date >=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThan(Date value) {
            addCriterion("confirm_date <", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("confirm_date <=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIn(List<Date> values) {
            addCriterion("confirm_date in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotIn(List<Date> values) {
            addCriterion("confirm_date not in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateBetween(Date value1, Date value2) {
            addCriterion("confirm_date between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("confirm_date not between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayIsNull() {
            addCriterion("is_onlinepay is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayIsNotNull() {
            addCriterion("is_onlinepay is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayEqualTo(Integer value) {
            addCriterion("is_onlinepay =", value, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayNotEqualTo(Integer value) {
            addCriterion("is_onlinepay <>", value, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayGreaterThan(Integer value) {
            addCriterion("is_onlinepay >", value, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_onlinepay >=", value, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayLessThan(Integer value) {
            addCriterion("is_onlinepay <", value, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayLessThanOrEqualTo(Integer value) {
            addCriterion("is_onlinepay <=", value, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayIn(List<Integer> values) {
            addCriterion("is_onlinepay in", values, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayNotIn(List<Integer> values) {
            addCriterion("is_onlinepay not in", values, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayBetween(Integer value1, Integer value2) {
            addCriterion("is_onlinepay between", value1, value2, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andIsOnlinepayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_onlinepay not between", value1, value2, "isOnlinepay");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNull() {
            addCriterion("link_man is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNotNull() {
            addCriterion("link_man is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManEqualTo(String value) {
            addCriterion("link_man =", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotEqualTo(String value) {
            addCriterion("link_man <>", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThan(String value) {
            addCriterion("link_man >", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("link_man >=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThan(String value) {
            addCriterion("link_man <", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThanOrEqualTo(String value) {
            addCriterion("link_man <=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLike(String value) {
            addCriterion("link_man like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotLike(String value) {
            addCriterion("link_man not like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManIn(List<String> values) {
            addCriterion("link_man in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotIn(List<String> values) {
            addCriterion("link_man not in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManBetween(String value1, String value2) {
            addCriterion("link_man between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotBetween(String value1, String value2) {
            addCriterion("link_man not between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNull() {
            addCriterion("link_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNotNull() {
            addCriterion("link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneEqualTo(String value) {
            addCriterion("link_phone =", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotEqualTo(String value) {
            addCriterion("link_phone <>", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThan(String value) {
            addCriterion("link_phone >", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("link_phone >=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThan(String value) {
            addCriterion("link_phone <", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("link_phone <=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLike(String value) {
            addCriterion("link_phone like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotLike(String value) {
            addCriterion("link_phone not like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIn(List<String> values) {
            addCriterion("link_phone in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotIn(List<String> values) {
            addCriterion("link_phone not in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneBetween(String value1, String value2) {
            addCriterion("link_phone between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("link_phone not between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkAddressIsNull() {
            addCriterion("link_address is null");
            return (Criteria) this;
        }

        public Criteria andLinkAddressIsNotNull() {
            addCriterion("link_address is not null");
            return (Criteria) this;
        }

        public Criteria andLinkAddressEqualTo(String value) {
            addCriterion("link_address =", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressNotEqualTo(String value) {
            addCriterion("link_address <>", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressGreaterThan(String value) {
            addCriterion("link_address >", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("link_address >=", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressLessThan(String value) {
            addCriterion("link_address <", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressLessThanOrEqualTo(String value) {
            addCriterion("link_address <=", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressLike(String value) {
            addCriterion("link_address like", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressNotLike(String value) {
            addCriterion("link_address not like", value, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressIn(List<String> values) {
            addCriterion("link_address in", values, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressNotIn(List<String> values) {
            addCriterion("link_address not in", values, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressBetween(String value1, String value2) {
            addCriterion("link_address between", value1, value2, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkAddressNotBetween(String value1, String value2) {
            addCriterion("link_address not between", value1, value2, "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIsNull() {
            addCriterion("link_code is null");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIsNotNull() {
            addCriterion("link_code is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCodeEqualTo(String value) {
            addCriterion("link_code =", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotEqualTo(String value) {
            addCriterion("link_code <>", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeGreaterThan(String value) {
            addCriterion("link_code >", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("link_code >=", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLessThan(String value) {
            addCriterion("link_code <", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLessThanOrEqualTo(String value) {
            addCriterion("link_code <=", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLike(String value) {
            addCriterion("link_code like", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotLike(String value) {
            addCriterion("link_code not like", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIn(List<String> values) {
            addCriterion("link_code in", values, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotIn(List<String> values) {
            addCriterion("link_code not in", values, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeBetween(String value1, String value2) {
            addCriterion("link_code between", value1, value2, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotBetween(String value1, String value2) {
            addCriterion("link_code not between", value1, value2, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNull() {
            addCriterion("link_email is null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNotNull() {
            addCriterion("link_email is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailEqualTo(String value) {
            addCriterion("link_email =", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotEqualTo(String value) {
            addCriterion("link_email <>", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThan(String value) {
            addCriterion("link_email >", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThanOrEqualTo(String value) {
            addCriterion("link_email >=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThan(String value) {
            addCriterion("link_email <", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThanOrEqualTo(String value) {
            addCriterion("link_email <=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLike(String value) {
            addCriterion("link_email like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotLike(String value) {
            addCriterion("link_email not like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIn(List<String> values) {
            addCriterion("link_email in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotIn(List<String> values) {
            addCriterion("link_email not in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailBetween(String value1, String value2) {
            addCriterion("link_email between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotBetween(String value1, String value2) {
            addCriterion("link_email not between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeIsNull() {
            addCriterion("link_credit_type is null");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeIsNotNull() {
            addCriterion("link_credit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeEqualTo(Integer value) {
            addCriterion("link_credit_type =", value, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeNotEqualTo(Integer value) {
            addCriterion("link_credit_type <>", value, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeGreaterThan(Integer value) {
            addCriterion("link_credit_type >", value, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_credit_type >=", value, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeLessThan(Integer value) {
            addCriterion("link_credit_type <", value, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeLessThanOrEqualTo(Integer value) {
            addCriterion("link_credit_type <=", value, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeIn(List<Integer> values) {
            addCriterion("link_credit_type in", values, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeNotIn(List<Integer> values) {
            addCriterion("link_credit_type not in", values, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeBetween(Integer value1, Integer value2) {
            addCriterion("link_credit_type between", value1, value2, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("link_credit_type not between", value1, value2, "linkCreditType");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoIsNull() {
            addCriterion("link_credit_no is null");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoIsNotNull() {
            addCriterion("link_credit_no is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoEqualTo(String value) {
            addCriterion("link_credit_no =", value, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoNotEqualTo(String value) {
            addCriterion("link_credit_no <>", value, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoGreaterThan(String value) {
            addCriterion("link_credit_no >", value, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoGreaterThanOrEqualTo(String value) {
            addCriterion("link_credit_no >=", value, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoLessThan(String value) {
            addCriterion("link_credit_no <", value, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoLessThanOrEqualTo(String value) {
            addCriterion("link_credit_no <=", value, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoLike(String value) {
            addCriterion("link_credit_no like", value, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoNotLike(String value) {
            addCriterion("link_credit_no not like", value, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoIn(List<String> values) {
            addCriterion("link_credit_no in", values, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoNotIn(List<String> values) {
            addCriterion("link_credit_no not in", values, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoBetween(String value1, String value2) {
            addCriterion("link_credit_no between", value1, value2, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoNotBetween(String value1, String value2) {
            addCriterion("link_credit_no not between", value1, value2, "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("pay_money is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(Double value) {
            addCriterion("pay_money =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(Double value) {
            addCriterion("pay_money <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(Double value) {
            addCriterion("pay_money >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_money >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(Double value) {
            addCriterion("pay_money <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(Double value) {
            addCriterion("pay_money <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<Double> values) {
            addCriterion("pay_money in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<Double> values) {
            addCriterion("pay_money not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(Double value1, Double value2) {
            addCriterion("pay_money between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(Double value1, Double value2) {
            addCriterion("pay_money not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNull() {
            addCriterion("is_confirm is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNotNull() {
            addCriterion("is_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmEqualTo(Integer value) {
            addCriterion("is_confirm =", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotEqualTo(Integer value) {
            addCriterion("is_confirm <>", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThan(Integer value) {
            addCriterion("is_confirm >", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_confirm >=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThan(Integer value) {
            addCriterion("is_confirm <", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("is_confirm <=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIn(List<Integer> values) {
            addCriterion("is_confirm in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotIn(List<Integer> values) {
            addCriterion("is_confirm not in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmBetween(Integer value1, Integer value2) {
            addCriterion("is_confirm between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("is_confirm not between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIsNull() {
            addCriterion("confirm_user is null");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIsNotNull() {
            addCriterion("confirm_user is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmUserEqualTo(String value) {
            addCriterion("confirm_user =", value, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNotEqualTo(String value) {
            addCriterion("confirm_user <>", value, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserGreaterThan(String value) {
            addCriterion("confirm_user >", value, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_user >=", value, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserLessThan(String value) {
            addCriterion("confirm_user <", value, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserLessThanOrEqualTo(String value) {
            addCriterion("confirm_user <=", value, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserLike(String value) {
            addCriterion("confirm_user like", value, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNotLike(String value) {
            addCriterion("confirm_user not like", value, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserIn(List<String> values) {
            addCriterion("confirm_user in", values, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNotIn(List<String> values) {
            addCriterion("confirm_user not in", values, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserBetween(String value1, String value2) {
            addCriterion("confirm_user between", value1, value2, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andConfirmUserNotBetween(String value1, String value2) {
            addCriterion("confirm_user not between", value1, value2, "confirmUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserIsNull() {
            addCriterion("cancel_user is null");
            return (Criteria) this;
        }

        public Criteria andCancelUserIsNotNull() {
            addCriterion("cancel_user is not null");
            return (Criteria) this;
        }

        public Criteria andCancelUserEqualTo(String value) {
            addCriterion("cancel_user =", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserNotEqualTo(String value) {
            addCriterion("cancel_user <>", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserGreaterThan(String value) {
            addCriterion("cancel_user >", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_user >=", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserLessThan(String value) {
            addCriterion("cancel_user <", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserLessThanOrEqualTo(String value) {
            addCriterion("cancel_user <=", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserLike(String value) {
            addCriterion("cancel_user like", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserNotLike(String value) {
            addCriterion("cancel_user not like", value, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserIn(List<String> values) {
            addCriterion("cancel_user in", values, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserNotIn(List<String> values) {
            addCriterion("cancel_user not in", values, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserBetween(String value1, String value2) {
            addCriterion("cancel_user between", value1, value2, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserNotBetween(String value1, String value2) {
            addCriterion("cancel_user not between", value1, value2, "cancelUser");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNull() {
            addCriterion("finish_date is null");
            return (Criteria) this;
        }

        public Criteria andFinishDateIsNotNull() {
            addCriterion("finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinishDateEqualTo(Date value) {
            addCriterion("finish_date =", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotEqualTo(Date value) {
            addCriterion("finish_date <>", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThan(Date value) {
            addCriterion("finish_date >", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_date >=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThan(Date value) {
            addCriterion("finish_date <", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("finish_date <=", value, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateIn(List<Date> values) {
            addCriterion("finish_date in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotIn(List<Date> values) {
            addCriterion("finish_date not in", values, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateBetween(Date value1, Date value2) {
            addCriterion("finish_date between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("finish_date not between", value1, value2, "finishDate");
            return (Criteria) this;
        }

        public Criteria andFinishNumIsNull() {
            addCriterion("finish_num is null");
            return (Criteria) this;
        }

        public Criteria andFinishNumIsNotNull() {
            addCriterion("finish_num is not null");
            return (Criteria) this;
        }

        public Criteria andFinishNumEqualTo(Integer value) {
            addCriterion("finish_num =", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumNotEqualTo(Integer value) {
            addCriterion("finish_num <>", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumGreaterThan(Integer value) {
            addCriterion("finish_num >", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_num >=", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumLessThan(Integer value) {
            addCriterion("finish_num <", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumLessThanOrEqualTo(Integer value) {
            addCriterion("finish_num <=", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumIn(List<Integer> values) {
            addCriterion("finish_num in", values, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumNotIn(List<Integer> values) {
            addCriterion("finish_num not in", values, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumBetween(Integer value1, Integer value2) {
            addCriterion("finish_num between", value1, value2, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_num not between", value1, value2, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyIsNull() {
            addCriterion("finish_money is null");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyIsNotNull() {
            addCriterion("finish_money is not null");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyEqualTo(Double value) {
            addCriterion("finish_money =", value, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyNotEqualTo(Double value) {
            addCriterion("finish_money <>", value, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyGreaterThan(Double value) {
            addCriterion("finish_money >", value, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("finish_money >=", value, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyLessThan(Double value) {
            addCriterion("finish_money <", value, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyLessThanOrEqualTo(Double value) {
            addCriterion("finish_money <=", value, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyIn(List<Double> values) {
            addCriterion("finish_money in", values, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyNotIn(List<Double> values) {
            addCriterion("finish_money not in", values, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyBetween(Double value1, Double value2) {
            addCriterion("finish_money between", value1, value2, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andFinishMoneyNotBetween(Double value1, Double value2) {
            addCriterion("finish_money not between", value1, value2, "finishMoney");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayUserIsNull() {
            addCriterion("pay_user is null");
            return (Criteria) this;
        }

        public Criteria andPayUserIsNotNull() {
            addCriterion("pay_user is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserEqualTo(String value) {
            addCriterion("pay_user =", value, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserNotEqualTo(String value) {
            addCriterion("pay_user <>", value, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserGreaterThan(String value) {
            addCriterion("pay_user >", value, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserGreaterThanOrEqualTo(String value) {
            addCriterion("pay_user >=", value, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserLessThan(String value) {
            addCriterion("pay_user <", value, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserLessThanOrEqualTo(String value) {
            addCriterion("pay_user <=", value, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserLike(String value) {
            addCriterion("pay_user like", value, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserNotLike(String value) {
            addCriterion("pay_user not like", value, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserIn(List<String> values) {
            addCriterion("pay_user in", values, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserNotIn(List<String> values) {
            addCriterion("pay_user not in", values, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserBetween(String value1, String value2) {
            addCriterion("pay_user between", value1, value2, "payUser");
            return (Criteria) this;
        }

        public Criteria andPayUserNotBetween(String value1, String value2) {
            addCriterion("pay_user not between", value1, value2, "payUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserIsNull() {
            addCriterion("finish_user is null");
            return (Criteria) this;
        }

        public Criteria andFinishUserIsNotNull() {
            addCriterion("finish_user is not null");
            return (Criteria) this;
        }

        public Criteria andFinishUserEqualTo(String value) {
            addCriterion("finish_user =", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotEqualTo(String value) {
            addCriterion("finish_user <>", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserGreaterThan(String value) {
            addCriterion("finish_user >", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserGreaterThanOrEqualTo(String value) {
            addCriterion("finish_user >=", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserLessThan(String value) {
            addCriterion("finish_user <", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserLessThanOrEqualTo(String value) {
            addCriterion("finish_user <=", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserLike(String value) {
            addCriterion("finish_user like", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotLike(String value) {
            addCriterion("finish_user not like", value, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserIn(List<String> values) {
            addCriterion("finish_user in", values, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotIn(List<String> values) {
            addCriterion("finish_user not in", values, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserBetween(String value1, String value2) {
            addCriterion("finish_user between", value1, value2, "finishUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserNotBetween(String value1, String value2) {
            addCriterion("finish_user not between", value1, value2, "finishUser");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(Integer value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(Integer value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(Integer value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(Integer value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(Integer value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<Integer> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<Integer> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(Integer value1, Integer value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andSendContentIsNull() {
            addCriterion("send_content is null");
            return (Criteria) this;
        }

        public Criteria andSendContentIsNotNull() {
            addCriterion("send_content is not null");
            return (Criteria) this;
        }

        public Criteria andSendContentEqualTo(String value) {
            addCriterion("send_content =", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentNotEqualTo(String value) {
            addCriterion("send_content <>", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentGreaterThan(String value) {
            addCriterion("send_content >", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentGreaterThanOrEqualTo(String value) {
            addCriterion("send_content >=", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentLessThan(String value) {
            addCriterion("send_content <", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentLessThanOrEqualTo(String value) {
            addCriterion("send_content <=", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentLike(String value) {
            addCriterion("send_content like", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentNotLike(String value) {
            addCriterion("send_content not like", value, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentIn(List<String> values) {
            addCriterion("send_content in", values, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentNotIn(List<String> values) {
            addCriterion("send_content not in", values, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentBetween(String value1, String value2) {
            addCriterion("send_content between", value1, value2, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendContentNotBetween(String value1, String value2) {
            addCriterion("send_content not between", value1, value2, "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Date value) {
            addCriterion("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Date value) {
            addCriterion("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Date value) {
            addCriterion("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Date value) {
            addCriterion("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Date value) {
            addCriterion("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Date> values) {
            addCriterion("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Date> values) {
            addCriterion("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Date value1, Date value2) {
            addCriterion("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Date value1, Date value2) {
            addCriterion("send_date not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendUserIsNull() {
            addCriterion("send_user is null");
            return (Criteria) this;
        }

        public Criteria andSendUserIsNotNull() {
            addCriterion("send_user is not null");
            return (Criteria) this;
        }

        public Criteria andSendUserEqualTo(String value) {
            addCriterion("send_user =", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserNotEqualTo(String value) {
            addCriterion("send_user <>", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserGreaterThan(String value) {
            addCriterion("send_user >", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserGreaterThanOrEqualTo(String value) {
            addCriterion("send_user >=", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserLessThan(String value) {
            addCriterion("send_user <", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserLessThanOrEqualTo(String value) {
            addCriterion("send_user <=", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserLike(String value) {
            addCriterion("send_user like", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserNotLike(String value) {
            addCriterion("send_user not like", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserIn(List<String> values) {
            addCriterion("send_user in", values, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserNotIn(List<String> values) {
            addCriterion("send_user not in", values, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserBetween(String value1, String value2) {
            addCriterion("send_user between", value1, value2, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserNotBetween(String value1, String value2) {
            addCriterion("send_user not between", value1, value2, "sendUser");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyIsNull() {
            addCriterion("cancel_money is null");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyIsNotNull() {
            addCriterion("cancel_money is not null");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyEqualTo(Double value) {
            addCriterion("cancel_money =", value, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyNotEqualTo(Double value) {
            addCriterion("cancel_money <>", value, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyGreaterThan(Double value) {
            addCriterion("cancel_money >", value, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cancel_money >=", value, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyLessThan(Double value) {
            addCriterion("cancel_money <", value, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cancel_money <=", value, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyIn(List<Double> values) {
            addCriterion("cancel_money in", values, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyNotIn(List<Double> values) {
            addCriterion("cancel_money not in", values, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyBetween(Double value1, Double value2) {
            addCriterion("cancel_money between", value1, value2, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andCancelMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cancel_money not between", value1, value2, "cancelMoney");
            return (Criteria) this;
        }

        public Criteria andIsEditIsNull() {
            addCriterion("is_edit is null");
            return (Criteria) this;
        }

        public Criteria andIsEditIsNotNull() {
            addCriterion("is_edit is not null");
            return (Criteria) this;
        }

        public Criteria andIsEditEqualTo(Integer value) {
            addCriterion("is_edit =", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotEqualTo(Integer value) {
            addCriterion("is_edit <>", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditGreaterThan(Integer value) {
            addCriterion("is_edit >", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_edit >=", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLessThan(Integer value) {
            addCriterion("is_edit <", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLessThanOrEqualTo(Integer value) {
            addCriterion("is_edit <=", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditIn(List<Integer> values) {
            addCriterion("is_edit in", values, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotIn(List<Integer> values) {
            addCriterion("is_edit not in", values, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditBetween(Integer value1, Integer value2) {
            addCriterion("is_edit between", value1, value2, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotBetween(Integer value1, Integer value2) {
            addCriterion("is_edit not between", value1, value2, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsCancelIsNull() {
            addCriterion("is_cancel is null");
            return (Criteria) this;
        }

        public Criteria andIsCancelIsNotNull() {
            addCriterion("is_cancel is not null");
            return (Criteria) this;
        }

        public Criteria andIsCancelEqualTo(Integer value) {
            addCriterion("is_cancel =", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelNotEqualTo(Integer value) {
            addCriterion("is_cancel <>", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelGreaterThan(Integer value) {
            addCriterion("is_cancel >", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_cancel >=", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelLessThan(Integer value) {
            addCriterion("is_cancel <", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelLessThanOrEqualTo(Integer value) {
            addCriterion("is_cancel <=", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelIn(List<Integer> values) {
            addCriterion("is_cancel in", values, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelNotIn(List<Integer> values) {
            addCriterion("is_cancel not in", values, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelBetween(Integer value1, Integer value2) {
            addCriterion("is_cancel between", value1, value2, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_cancel not between", value1, value2, "isCancel");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateIsNull() {
            addCriterion("sendmsg_date is null");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateIsNotNull() {
            addCriterion("sendmsg_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateEqualTo(Date value) {
            addCriterion("sendmsg_date =", value, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateNotEqualTo(Date value) {
            addCriterion("sendmsg_date <>", value, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateGreaterThan(Date value) {
            addCriterion("sendmsg_date >", value, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sendmsg_date >=", value, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateLessThan(Date value) {
            addCriterion("sendmsg_date <", value, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateLessThanOrEqualTo(Date value) {
            addCriterion("sendmsg_date <=", value, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateIn(List<Date> values) {
            addCriterion("sendmsg_date in", values, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateNotIn(List<Date> values) {
            addCriterion("sendmsg_date not in", values, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateBetween(Date value1, Date value2) {
            addCriterion("sendmsg_date between", value1, value2, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andSendmsgDateNotBetween(Date value1, Date value2) {
            addCriterion("sendmsg_date not between", value1, value2, "sendmsgDate");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("ticket_type is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("ticket_type is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(Integer value) {
            addCriterion("ticket_type =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(Integer value) {
            addCriterion("ticket_type <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(Integer value) {
            addCriterion("ticket_type >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_type >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(Integer value) {
            addCriterion("ticket_type <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_type <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<Integer> values) {
            addCriterion("ticket_type in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<Integer> values) {
            addCriterion("ticket_type not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(Integer value1, Integer value2) {
            addCriterion("ticket_type between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_type not between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdIsNull() {
            addCriterion("interface_order_id is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdIsNotNull() {
            addCriterion("interface_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdEqualTo(String value) {
            addCriterion("interface_order_id =", value, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdNotEqualTo(String value) {
            addCriterion("interface_order_id <>", value, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdGreaterThan(String value) {
            addCriterion("interface_order_id >", value, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("interface_order_id >=", value, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdLessThan(String value) {
            addCriterion("interface_order_id <", value, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdLessThanOrEqualTo(String value) {
            addCriterion("interface_order_id <=", value, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdLike(String value) {
            addCriterion("interface_order_id like", value, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdNotLike(String value) {
            addCriterion("interface_order_id not like", value, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdIn(List<String> values) {
            addCriterion("interface_order_id in", values, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdNotIn(List<String> values) {
            addCriterion("interface_order_id not in", values, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdBetween(String value1, String value2) {
            addCriterion("interface_order_id between", value1, value2, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdNotBetween(String value1, String value2) {
            addCriterion("interface_order_id not between", value1, value2, "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdIsNull() {
            addCriterion("interface_id is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdIsNotNull() {
            addCriterion("interface_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdEqualTo(String value) {
            addCriterion("interface_id =", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdNotEqualTo(String value) {
            addCriterion("interface_id <>", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdGreaterThan(String value) {
            addCriterion("interface_id >", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("interface_id >=", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdLessThan(String value) {
            addCriterion("interface_id <", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdLessThanOrEqualTo(String value) {
            addCriterion("interface_id <=", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdLike(String value) {
            addCriterion("interface_id like", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdNotLike(String value) {
            addCriterion("interface_id not like", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdIn(List<String> values) {
            addCriterion("interface_id in", values, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdNotIn(List<String> values) {
            addCriterion("interface_id not in", values, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdBetween(String value1, String value2) {
            addCriterion("interface_id between", value1, value2, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdNotBetween(String value1, String value2) {
            addCriterion("interface_id not between", value1, value2, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateIsNull() {
            addCriterion("interface_edit_state is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateIsNotNull() {
            addCriterion("interface_edit_state is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateEqualTo(Integer value) {
            addCriterion("interface_edit_state =", value, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateNotEqualTo(Integer value) {
            addCriterion("interface_edit_state <>", value, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateGreaterThan(Integer value) {
            addCriterion("interface_edit_state >", value, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("interface_edit_state >=", value, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateLessThan(Integer value) {
            addCriterion("interface_edit_state <", value, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateLessThanOrEqualTo(Integer value) {
            addCriterion("interface_edit_state <=", value, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateIn(List<Integer> values) {
            addCriterion("interface_edit_state in", values, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateNotIn(List<Integer> values) {
            addCriterion("interface_edit_state not in", values, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateBetween(Integer value1, Integer value2) {
            addCriterion("interface_edit_state between", value1, value2, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andInterfaceEditStateNotBetween(Integer value1, Integer value2) {
            addCriterion("interface_edit_state not between", value1, value2, "interfaceEditState");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordIsNull() {
            addCriterion("order_password is null");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordIsNotNull() {
            addCriterion("order_password is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordEqualTo(String value) {
            addCriterion("order_password =", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordNotEqualTo(String value) {
            addCriterion("order_password <>", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordGreaterThan(String value) {
            addCriterion("order_password >", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("order_password >=", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordLessThan(String value) {
            addCriterion("order_password <", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordLessThanOrEqualTo(String value) {
            addCriterion("order_password <=", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordLike(String value) {
            addCriterion("order_password like", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordNotLike(String value) {
            addCriterion("order_password not like", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordIn(List<String> values) {
            addCriterion("order_password in", values, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordNotIn(List<String> values) {
            addCriterion("order_password not in", values, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordBetween(String value1, String value2) {
            addCriterion("order_password between", value1, value2, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordNotBetween(String value1, String value2) {
            addCriterion("order_password not between", value1, value2, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andIsSingleIsNull() {
            addCriterion("is_single is null");
            return (Criteria) this;
        }

        public Criteria andIsSingleIsNotNull() {
            addCriterion("is_single is not null");
            return (Criteria) this;
        }

        public Criteria andIsSingleEqualTo(Integer value) {
            addCriterion("is_single =", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotEqualTo(Integer value) {
            addCriterion("is_single <>", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleGreaterThan(Integer value) {
            addCriterion("is_single >", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_single >=", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleLessThan(Integer value) {
            addCriterion("is_single <", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleLessThanOrEqualTo(Integer value) {
            addCriterion("is_single <=", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleIn(List<Integer> values) {
            addCriterion("is_single in", values, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotIn(List<Integer> values) {
            addCriterion("is_single not in", values, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleBetween(Integer value1, Integer value2) {
            addCriterion("is_single between", value1, value2, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_single not between", value1, value2, "isSingle");
            return (Criteria) this;
        }

        public Criteria andParentCustIdIsNull() {
            addCriterion("parent_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCustIdIsNotNull() {
            addCriterion("parent_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCustIdEqualTo(Long value) {
            addCriterion("parent_cust_id =", value, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdNotEqualTo(Long value) {
            addCriterion("parent_cust_id <>", value, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdGreaterThan(Long value) {
            addCriterion("parent_cust_id >", value, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_cust_id >=", value, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdLessThan(Long value) {
            addCriterion("parent_cust_id <", value, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_cust_id <=", value, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdIn(List<Long> values) {
            addCriterion("parent_cust_id in", values, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdNotIn(List<Long> values) {
            addCriterion("parent_cust_id not in", values, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdBetween(Long value1, Long value2) {
            addCriterion("parent_cust_id between", value1, value2, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andParentCustIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_cust_id not between", value1, value2, "parentCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdIsNull() {
            addCriterion("interface_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdIsNotNull() {
            addCriterion("interface_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdEqualTo(String value) {
            addCriterion("interface_prod_id =", value, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdNotEqualTo(String value) {
            addCriterion("interface_prod_id <>", value, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdGreaterThan(String value) {
            addCriterion("interface_prod_id >", value, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdGreaterThanOrEqualTo(String value) {
            addCriterion("interface_prod_id >=", value, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdLessThan(String value) {
            addCriterion("interface_prod_id <", value, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdLessThanOrEqualTo(String value) {
            addCriterion("interface_prod_id <=", value, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdLike(String value) {
            addCriterion("interface_prod_id like", value, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdNotLike(String value) {
            addCriterion("interface_prod_id not like", value, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdIn(List<String> values) {
            addCriterion("interface_prod_id in", values, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdNotIn(List<String> values) {
            addCriterion("interface_prod_id not in", values, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdBetween(String value1, String value2) {
            addCriterion("interface_prod_id between", value1, value2, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdNotBetween(String value1, String value2) {
            addCriterion("interface_prod_id not between", value1, value2, "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdIsNull() {
            addCriterion("send_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdIsNotNull() {
            addCriterion("send_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdEqualTo(Integer value) {
            addCriterion("send_msg_id =", value, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdNotEqualTo(Integer value) {
            addCriterion("send_msg_id <>", value, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdGreaterThan(Integer value) {
            addCriterion("send_msg_id >", value, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_msg_id >=", value, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdLessThan(Integer value) {
            addCriterion("send_msg_id <", value, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_msg_id <=", value, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdIn(List<Integer> values) {
            addCriterion("send_msg_id in", values, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdNotIn(List<Integer> values) {
            addCriterion("send_msg_id not in", values, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("send_msg_id between", value1, value2, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andSendMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_msg_id not between", value1, value2, "sendMsgId");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyIsNull() {
            addCriterion("mem_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyIsNotNull() {
            addCriterion("mem_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyEqualTo(Double value) {
            addCriterion("mem_pay_money =", value, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyNotEqualTo(Double value) {
            addCriterion("mem_pay_money <>", value, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyGreaterThan(Double value) {
            addCriterion("mem_pay_money >", value, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("mem_pay_money >=", value, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyLessThan(Double value) {
            addCriterion("mem_pay_money <", value, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyLessThanOrEqualTo(Double value) {
            addCriterion("mem_pay_money <=", value, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyIn(List<Double> values) {
            addCriterion("mem_pay_money in", values, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyNotIn(List<Double> values) {
            addCriterion("mem_pay_money not in", values, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyBetween(Double value1, Double value2) {
            addCriterion("mem_pay_money between", value1, value2, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemPayMoneyNotBetween(Double value1, Double value2) {
            addCriterion("mem_pay_money not between", value1, value2, "memPayMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyIsNull() {
            addCriterion("mem_order_money is null");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyIsNotNull() {
            addCriterion("mem_order_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyEqualTo(Double value) {
            addCriterion("mem_order_money =", value, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyNotEqualTo(Double value) {
            addCriterion("mem_order_money <>", value, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyGreaterThan(Double value) {
            addCriterion("mem_order_money >", value, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("mem_order_money >=", value, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyLessThan(Double value) {
            addCriterion("mem_order_money <", value, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("mem_order_money <=", value, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyIn(List<Double> values) {
            addCriterion("mem_order_money in", values, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyNotIn(List<Double> values) {
            addCriterion("mem_order_money not in", values, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("mem_order_money between", value1, value2, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andMemOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("mem_order_money not between", value1, value2, "memOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyIsNull() {
            addCriterion("old_mem_order_money is null");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyIsNotNull() {
            addCriterion("old_mem_order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyEqualTo(Double value) {
            addCriterion("old_mem_order_money =", value, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyNotEqualTo(Double value) {
            addCriterion("old_mem_order_money <>", value, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyGreaterThan(Double value) {
            addCriterion("old_mem_order_money >", value, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("old_mem_order_money >=", value, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyLessThan(Double value) {
            addCriterion("old_mem_order_money <", value, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("old_mem_order_money <=", value, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyIn(List<Double> values) {
            addCriterion("old_mem_order_money in", values, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyNotIn(List<Double> values) {
            addCriterion("old_mem_order_money not in", values, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("old_mem_order_money between", value1, value2, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andOldMemOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("old_mem_order_money not between", value1, value2, "oldMemOrderMoney");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeIsNull() {
            addCriterion("pay_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeIsNotNull() {
            addCriterion("pay_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeEqualTo(Double value) {
            addCriterion("pay_service_fee =", value, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeNotEqualTo(Double value) {
            addCriterion("pay_service_fee <>", value, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeGreaterThan(Double value) {
            addCriterion("pay_service_fee >", value, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_service_fee >=", value, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeLessThan(Double value) {
            addCriterion("pay_service_fee <", value, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeLessThanOrEqualTo(Double value) {
            addCriterion("pay_service_fee <=", value, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeIn(List<Double> values) {
            addCriterion("pay_service_fee in", values, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeNotIn(List<Double> values) {
            addCriterion("pay_service_fee not in", values, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeBetween(Double value1, Double value2) {
            addCriterion("pay_service_fee between", value1, value2, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andPayServiceFeeNotBetween(Double value1, Double value2) {
            addCriterion("pay_service_fee not between", value1, value2, "payServiceFee");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Integer value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Integer value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Integer value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Integer value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Integer> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Integer> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andIsPackageIsNull() {
            addCriterion("is_package is null");
            return (Criteria) this;
        }

        public Criteria andIsPackageIsNotNull() {
            addCriterion("is_package is not null");
            return (Criteria) this;
        }

        public Criteria andIsPackageEqualTo(Integer value) {
            addCriterion("is_package =", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotEqualTo(Integer value) {
            addCriterion("is_package <>", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageGreaterThan(Integer value) {
            addCriterion("is_package >", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_package >=", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageLessThan(Integer value) {
            addCriterion("is_package <", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageLessThanOrEqualTo(Integer value) {
            addCriterion("is_package <=", value, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageIn(List<Integer> values) {
            addCriterion("is_package in", values, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotIn(List<Integer> values) {
            addCriterion("is_package not in", values, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageBetween(Integer value1, Integer value2) {
            addCriterion("is_package between", value1, value2, "isPackage");
            return (Criteria) this;
        }

        public Criteria andIsPackageNotBetween(Integer value1, Integer value2) {
            addCriterion("is_package not between", value1, value2, "isPackage");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateIsNull() {
            addCriterion("end_travel_date is null");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateIsNotNull() {
            addCriterion("end_travel_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateEqualTo(Date value) {
            addCriterion("end_travel_date =", value, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateNotEqualTo(Date value) {
            addCriterion("end_travel_date <>", value, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateGreaterThan(Date value) {
            addCriterion("end_travel_date >", value, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_travel_date >=", value, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateLessThan(Date value) {
            addCriterion("end_travel_date <", value, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateLessThanOrEqualTo(Date value) {
            addCriterion("end_travel_date <=", value, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateIn(List<Date> values) {
            addCriterion("end_travel_date in", values, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateNotIn(List<Date> values) {
            addCriterion("end_travel_date not in", values, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateBetween(Date value1, Date value2) {
            addCriterion("end_travel_date between", value1, value2, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andEndTravelDateNotBetween(Date value1, Date value2) {
            addCriterion("end_travel_date not between", value1, value2, "endTravelDate");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdIsNull() {
            addCriterion("cancel_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdIsNotNull() {
            addCriterion("cancel_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdEqualTo(Long value) {
            addCriterion("cancel_cust_id =", value, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdNotEqualTo(Long value) {
            addCriterion("cancel_cust_id <>", value, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdGreaterThan(Long value) {
            addCriterion("cancel_cust_id >", value, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cancel_cust_id >=", value, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdLessThan(Long value) {
            addCriterion("cancel_cust_id <", value, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdLessThanOrEqualTo(Long value) {
            addCriterion("cancel_cust_id <=", value, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdIn(List<Long> values) {
            addCriterion("cancel_cust_id in", values, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdNotIn(List<Long> values) {
            addCriterion("cancel_cust_id not in", values, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdBetween(Long value1, Long value2) {
            addCriterion("cancel_cust_id between", value1, value2, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelCustIdNotBetween(Long value1, Long value2) {
            addCriterion("cancel_cust_id not between", value1, value2, "cancelCustId");
            return (Criteria) this;
        }

        public Criteria andCancelStateIsNull() {
            addCriterion("cancel_state is null");
            return (Criteria) this;
        }

        public Criteria andCancelStateIsNotNull() {
            addCriterion("cancel_state is not null");
            return (Criteria) this;
        }

        public Criteria andCancelStateEqualTo(Integer value) {
            addCriterion("cancel_state =", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateNotEqualTo(Integer value) {
            addCriterion("cancel_state <>", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateGreaterThan(Integer value) {
            addCriterion("cancel_state >", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_state >=", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateLessThan(Integer value) {
            addCriterion("cancel_state <", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_state <=", value, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateIn(List<Integer> values) {
            addCriterion("cancel_state in", values, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateNotIn(List<Integer> values) {
            addCriterion("cancel_state not in", values, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateBetween(Integer value1, Integer value2) {
            addCriterion("cancel_state between", value1, value2, "cancelState");
            return (Criteria) this;
        }

        public Criteria andCancelStateNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_state not between", value1, value2, "cancelState");
            return (Criteria) this;
        }

        public Criteria andPrintDateIsNull() {
            addCriterion("print_date is null");
            return (Criteria) this;
        }

        public Criteria andPrintDateIsNotNull() {
            addCriterion("print_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrintDateEqualTo(Date value) {
            addCriterion("print_date =", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotEqualTo(Date value) {
            addCriterion("print_date <>", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateGreaterThan(Date value) {
            addCriterion("print_date >", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateGreaterThanOrEqualTo(Date value) {
            addCriterion("print_date >=", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateLessThan(Date value) {
            addCriterion("print_date <", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateLessThanOrEqualTo(Date value) {
            addCriterion("print_date <=", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateIn(List<Date> values) {
            addCriterion("print_date in", values, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotIn(List<Date> values) {
            addCriterion("print_date not in", values, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateBetween(Date value1, Date value2) {
            addCriterion("print_date between", value1, value2, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotBetween(Date value1, Date value2) {
            addCriterion("print_date not between", value1, value2, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintUserIsNull() {
            addCriterion("print_user is null");
            return (Criteria) this;
        }

        public Criteria andPrintUserIsNotNull() {
            addCriterion("print_user is not null");
            return (Criteria) this;
        }

        public Criteria andPrintUserEqualTo(String value) {
            addCriterion("print_user =", value, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserNotEqualTo(String value) {
            addCriterion("print_user <>", value, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserGreaterThan(String value) {
            addCriterion("print_user >", value, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserGreaterThanOrEqualTo(String value) {
            addCriterion("print_user >=", value, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserLessThan(String value) {
            addCriterion("print_user <", value, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserLessThanOrEqualTo(String value) {
            addCriterion("print_user <=", value, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserLike(String value) {
            addCriterion("print_user like", value, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserNotLike(String value) {
            addCriterion("print_user not like", value, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserIn(List<String> values) {
            addCriterion("print_user in", values, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserNotIn(List<String> values) {
            addCriterion("print_user not in", values, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserBetween(String value1, String value2) {
            addCriterion("print_user between", value1, value2, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintUserNotBetween(String value1, String value2) {
            addCriterion("print_user not between", value1, value2, "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeIsNull() {
            addCriterion("print_excode is null");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeIsNotNull() {
            addCriterion("print_excode is not null");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeEqualTo(String value) {
            addCriterion("print_excode =", value, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeNotEqualTo(String value) {
            addCriterion("print_excode <>", value, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeGreaterThan(String value) {
            addCriterion("print_excode >", value, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeGreaterThanOrEqualTo(String value) {
            addCriterion("print_excode >=", value, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeLessThan(String value) {
            addCriterion("print_excode <", value, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeLessThanOrEqualTo(String value) {
            addCriterion("print_excode <=", value, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeLike(String value) {
            addCriterion("print_excode like", value, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeNotLike(String value) {
            addCriterion("print_excode not like", value, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeIn(List<String> values) {
            addCriterion("print_excode in", values, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeNotIn(List<String> values) {
            addCriterion("print_excode not in", values, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeBetween(String value1, String value2) {
            addCriterion("print_excode between", value1, value2, "printExcode");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeNotBetween(String value1, String value2) {
            addCriterion("print_excode not between", value1, value2, "printExcode");
            return (Criteria) this;
        }

        public Criteria andSendContent1IsNull() {
            addCriterion("send_content1 is null");
            return (Criteria) this;
        }

        public Criteria andSendContent1IsNotNull() {
            addCriterion("send_content1 is not null");
            return (Criteria) this;
        }

        public Criteria andSendContent1EqualTo(String value) {
            addCriterion("send_content1 =", value, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1NotEqualTo(String value) {
            addCriterion("send_content1 <>", value, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1GreaterThan(String value) {
            addCriterion("send_content1 >", value, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1GreaterThanOrEqualTo(String value) {
            addCriterion("send_content1 >=", value, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1LessThan(String value) {
            addCriterion("send_content1 <", value, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1LessThanOrEqualTo(String value) {
            addCriterion("send_content1 <=", value, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1Like(String value) {
            addCriterion("send_content1 like", value, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1NotLike(String value) {
            addCriterion("send_content1 not like", value, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1In(List<String> values) {
            addCriterion("send_content1 in", values, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1NotIn(List<String> values) {
            addCriterion("send_content1 not in", values, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1Between(String value1, String value2) {
            addCriterion("send_content1 between", value1, value2, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent1NotBetween(String value1, String value2) {
            addCriterion("send_content1 not between", value1, value2, "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent2IsNull() {
            addCriterion("send_content2 is null");
            return (Criteria) this;
        }

        public Criteria andSendContent2IsNotNull() {
            addCriterion("send_content2 is not null");
            return (Criteria) this;
        }

        public Criteria andSendContent2EqualTo(String value) {
            addCriterion("send_content2 =", value, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2NotEqualTo(String value) {
            addCriterion("send_content2 <>", value, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2GreaterThan(String value) {
            addCriterion("send_content2 >", value, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2GreaterThanOrEqualTo(String value) {
            addCriterion("send_content2 >=", value, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2LessThan(String value) {
            addCriterion("send_content2 <", value, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2LessThanOrEqualTo(String value) {
            addCriterion("send_content2 <=", value, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2Like(String value) {
            addCriterion("send_content2 like", value, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2NotLike(String value) {
            addCriterion("send_content2 not like", value, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2In(List<String> values) {
            addCriterion("send_content2 in", values, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2NotIn(List<String> values) {
            addCriterion("send_content2 not in", values, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2Between(String value1, String value2) {
            addCriterion("send_content2 between", value1, value2, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andSendContent2NotBetween(String value1, String value2) {
            addCriterion("send_content2 not between", value1, value2, "sendContent2");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNull() {
            addCriterion("is_print is null");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNotNull() {
            addCriterion("is_print is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrintEqualTo(Integer value) {
            addCriterion("is_print =", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotEqualTo(Integer value) {
            addCriterion("is_print <>", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThan(Integer value) {
            addCriterion("is_print >", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_print >=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThan(Integer value) {
            addCriterion("is_print <", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThanOrEqualTo(Integer value) {
            addCriterion("is_print <=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintIn(List<Integer> values) {
            addCriterion("is_print in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotIn(List<Integer> values) {
            addCriterion("is_print not in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintBetween(Integer value1, Integer value2) {
            addCriterion("is_print between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotBetween(Integer value1, Integer value2) {
            addCriterion("is_print not between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2IsNull() {
            addCriterion("print_excode2 is null");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2IsNotNull() {
            addCriterion("print_excode2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2EqualTo(String value) {
            addCriterion("print_excode2 =", value, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2NotEqualTo(String value) {
            addCriterion("print_excode2 <>", value, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2GreaterThan(String value) {
            addCriterion("print_excode2 >", value, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2GreaterThanOrEqualTo(String value) {
            addCriterion("print_excode2 >=", value, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2LessThan(String value) {
            addCriterion("print_excode2 <", value, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2LessThanOrEqualTo(String value) {
            addCriterion("print_excode2 <=", value, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2Like(String value) {
            addCriterion("print_excode2 like", value, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2NotLike(String value) {
            addCriterion("print_excode2 not like", value, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2In(List<String> values) {
            addCriterion("print_excode2 in", values, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2NotIn(List<String> values) {
            addCriterion("print_excode2 not in", values, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2Between(String value1, String value2) {
            addCriterion("print_excode2 between", value1, value2, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2NotBetween(String value1, String value2) {
            addCriterion("print_excode2 not between", value1, value2, "printExcode2");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIsNull() {
            addCriterion("account_money is null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIsNotNull() {
            addCriterion("account_money is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyEqualTo(Double value) {
            addCriterion("account_money =", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotEqualTo(Double value) {
            addCriterion("account_money <>", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyGreaterThan(Double value) {
            addCriterion("account_money >", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("account_money >=", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLessThan(Double value) {
            addCriterion("account_money <", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLessThanOrEqualTo(Double value) {
            addCriterion("account_money <=", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIn(List<Double> values) {
            addCriterion("account_money in", values, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotIn(List<Double> values) {
            addCriterion("account_money not in", values, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyBetween(Double value1, Double value2) {
            addCriterion("account_money between", value1, value2, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotBetween(Double value1, Double value2) {
            addCriterion("account_money not between", value1, value2, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNull() {
            addCriterion("account_date is null");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNotNull() {
            addCriterion("account_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDateEqualTo(Date value) {
            addCriterion("account_date =", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotEqualTo(Date value) {
            addCriterion("account_date <>", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThan(Date value) {
            addCriterion("account_date >", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThanOrEqualTo(Date value) {
            addCriterion("account_date >=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThan(Date value) {
            addCriterion("account_date <", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThanOrEqualTo(Date value) {
            addCriterion("account_date <=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateIn(List<Date> values) {
            addCriterion("account_date in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotIn(List<Date> values) {
            addCriterion("account_date not in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateBetween(Date value1, Date value2) {
            addCriterion("account_date between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotBetween(Date value1, Date value2) {
            addCriterion("account_date not between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdIsNull() {
            addCriterion("account_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdIsNotNull() {
            addCriterion("account_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdEqualTo(String value) {
            addCriterion("account_user_id =", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdNotEqualTo(String value) {
            addCriterion("account_user_id <>", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdGreaterThan(String value) {
            addCriterion("account_user_id >", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_user_id >=", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdLessThan(String value) {
            addCriterion("account_user_id <", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdLessThanOrEqualTo(String value) {
            addCriterion("account_user_id <=", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdLike(String value) {
            addCriterion("account_user_id like", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdNotLike(String value) {
            addCriterion("account_user_id not like", value, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdIn(List<String> values) {
            addCriterion("account_user_id in", values, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdNotIn(List<String> values) {
            addCriterion("account_user_id not in", values, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdBetween(String value1, String value2) {
            addCriterion("account_user_id between", value1, value2, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdNotBetween(String value1, String value2) {
            addCriterion("account_user_id not between", value1, value2, "accountUserId");
            return (Criteria) this;
        }

        public Criteria andProdDetailIsNull() {
            addCriterion("prod_detail is null");
            return (Criteria) this;
        }

        public Criteria andProdDetailIsNotNull() {
            addCriterion("prod_detail is not null");
            return (Criteria) this;
        }

        public Criteria andProdDetailEqualTo(String value) {
            addCriterion("prod_detail =", value, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailNotEqualTo(String value) {
            addCriterion("prod_detail <>", value, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailGreaterThan(String value) {
            addCriterion("prod_detail >", value, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailGreaterThanOrEqualTo(String value) {
            addCriterion("prod_detail >=", value, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailLessThan(String value) {
            addCriterion("prod_detail <", value, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailLessThanOrEqualTo(String value) {
            addCriterion("prod_detail <=", value, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailLike(String value) {
            addCriterion("prod_detail like", value, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailNotLike(String value) {
            addCriterion("prod_detail not like", value, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailIn(List<String> values) {
            addCriterion("prod_detail in", values, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailNotIn(List<String> values) {
            addCriterion("prod_detail not in", values, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailBetween(String value1, String value2) {
            addCriterion("prod_detail between", value1, value2, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andProdDetailNotBetween(String value1, String value2) {
            addCriterion("prod_detail not between", value1, value2, "prodDetail");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyIsNull() {
            addCriterion("agent_return_money is null");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyIsNotNull() {
            addCriterion("agent_return_money is not null");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyEqualTo(Double value) {
            addCriterion("agent_return_money =", value, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyNotEqualTo(Double value) {
            addCriterion("agent_return_money <>", value, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyGreaterThan(Double value) {
            addCriterion("agent_return_money >", value, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("agent_return_money >=", value, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyLessThan(Double value) {
            addCriterion("agent_return_money <", value, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyLessThanOrEqualTo(Double value) {
            addCriterion("agent_return_money <=", value, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyIn(List<Double> values) {
            addCriterion("agent_return_money in", values, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyNotIn(List<Double> values) {
            addCriterion("agent_return_money not in", values, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyBetween(Double value1, Double value2) {
            addCriterion("agent_return_money between", value1, value2, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnMoneyNotBetween(Double value1, Double value2) {
            addCriterion("agent_return_money not between", value1, value2, "agentReturnMoney");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateIsNull() {
            addCriterion("agent_return_date is null");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateIsNotNull() {
            addCriterion("agent_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateEqualTo(Date value) {
            addCriterion("agent_return_date =", value, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateNotEqualTo(Date value) {
            addCriterion("agent_return_date <>", value, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateGreaterThan(Date value) {
            addCriterion("agent_return_date >", value, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("agent_return_date >=", value, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateLessThan(Date value) {
            addCriterion("agent_return_date <", value, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateLessThanOrEqualTo(Date value) {
            addCriterion("agent_return_date <=", value, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateIn(List<Date> values) {
            addCriterion("agent_return_date in", values, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateNotIn(List<Date> values) {
            addCriterion("agent_return_date not in", values, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateBetween(Date value1, Date value2) {
            addCriterion("agent_return_date between", value1, value2, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnDateNotBetween(Date value1, Date value2) {
            addCriterion("agent_return_date not between", value1, value2, "agentReturnDate");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdIsNull() {
            addCriterion("agent_return_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdIsNotNull() {
            addCriterion("agent_return_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdEqualTo(String value) {
            addCriterion("agent_return_user_id =", value, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdNotEqualTo(String value) {
            addCriterion("agent_return_user_id <>", value, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdGreaterThan(String value) {
            addCriterion("agent_return_user_id >", value, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_return_user_id >=", value, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdLessThan(String value) {
            addCriterion("agent_return_user_id <", value, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdLessThanOrEqualTo(String value) {
            addCriterion("agent_return_user_id <=", value, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdLike(String value) {
            addCriterion("agent_return_user_id like", value, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdNotLike(String value) {
            addCriterion("agent_return_user_id not like", value, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdIn(List<String> values) {
            addCriterion("agent_return_user_id in", values, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdNotIn(List<String> values) {
            addCriterion("agent_return_user_id not in", values, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdBetween(String value1, String value2) {
            addCriterion("agent_return_user_id between", value1, value2, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdNotBetween(String value1, String value2) {
            addCriterion("agent_return_user_id not between", value1, value2, "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIsNull() {
            addCriterion("order_memo is null");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIsNotNull() {
            addCriterion("order_memo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMemoEqualTo(String value) {
            addCriterion("order_memo =", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotEqualTo(String value) {
            addCriterion("order_memo <>", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoGreaterThan(String value) {
            addCriterion("order_memo >", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoGreaterThanOrEqualTo(String value) {
            addCriterion("order_memo >=", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLessThan(String value) {
            addCriterion("order_memo <", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLessThanOrEqualTo(String value) {
            addCriterion("order_memo <=", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLike(String value) {
            addCriterion("order_memo like", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotLike(String value) {
            addCriterion("order_memo not like", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIn(List<String> values) {
            addCriterion("order_memo in", values, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotIn(List<String> values) {
            addCriterion("order_memo not in", values, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoBetween(String value1, String value2) {
            addCriterion("order_memo between", value1, value2, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotBetween(String value1, String value2) {
            addCriterion("order_memo not between", value1, value2, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderFilesIsNull() {
            addCriterion("order_files is null");
            return (Criteria) this;
        }

        public Criteria andOrderFilesIsNotNull() {
            addCriterion("order_files is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFilesEqualTo(String value) {
            addCriterion("order_files =", value, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesNotEqualTo(String value) {
            addCriterion("order_files <>", value, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesGreaterThan(String value) {
            addCriterion("order_files >", value, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesGreaterThanOrEqualTo(String value) {
            addCriterion("order_files >=", value, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesLessThan(String value) {
            addCriterion("order_files <", value, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesLessThanOrEqualTo(String value) {
            addCriterion("order_files <=", value, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesLike(String value) {
            addCriterion("order_files like", value, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesNotLike(String value) {
            addCriterion("order_files not like", value, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesIn(List<String> values) {
            addCriterion("order_files in", values, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesNotIn(List<String> values) {
            addCriterion("order_files not in", values, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesBetween(String value1, String value2) {
            addCriterion("order_files between", value1, value2, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andOrderFilesNotBetween(String value1, String value2) {
            addCriterion("order_files not between", value1, value2, "orderFiles");
            return (Criteria) this;
        }

        public Criteria andIsSend2IsNull() {
            addCriterion("is_send2 is null");
            return (Criteria) this;
        }

        public Criteria andIsSend2IsNotNull() {
            addCriterion("is_send2 is not null");
            return (Criteria) this;
        }

        public Criteria andIsSend2EqualTo(Integer value) {
            addCriterion("is_send2 =", value, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2NotEqualTo(Integer value) {
            addCriterion("is_send2 <>", value, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2GreaterThan(Integer value) {
            addCriterion("is_send2 >", value, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2GreaterThanOrEqualTo(Integer value) {
            addCriterion("is_send2 >=", value, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2LessThan(Integer value) {
            addCriterion("is_send2 <", value, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2LessThanOrEqualTo(Integer value) {
            addCriterion("is_send2 <=", value, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2In(List<Integer> values) {
            addCriterion("is_send2 in", values, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2NotIn(List<Integer> values) {
            addCriterion("is_send2 not in", values, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2Between(Integer value1, Integer value2) {
            addCriterion("is_send2 between", value1, value2, "isSend2");
            return (Criteria) this;
        }

        public Criteria andIsSend2NotBetween(Integer value1, Integer value2) {
            addCriterion("is_send2 not between", value1, value2, "isSend2");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateIsNull() {
            addCriterion("need_sendmsg_date is null");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateIsNotNull() {
            addCriterion("need_sendmsg_date is not null");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateEqualTo(Date value) {
            addCriterion("need_sendmsg_date =", value, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateNotEqualTo(Date value) {
            addCriterion("need_sendmsg_date <>", value, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateGreaterThan(Date value) {
            addCriterion("need_sendmsg_date >", value, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateGreaterThanOrEqualTo(Date value) {
            addCriterion("need_sendmsg_date >=", value, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateLessThan(Date value) {
            addCriterion("need_sendmsg_date <", value, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateLessThanOrEqualTo(Date value) {
            addCriterion("need_sendmsg_date <=", value, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateIn(List<Date> values) {
            addCriterion("need_sendmsg_date in", values, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateNotIn(List<Date> values) {
            addCriterion("need_sendmsg_date not in", values, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateBetween(Date value1, Date value2) {
            addCriterion("need_sendmsg_date between", value1, value2, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andNeedSendmsgDateNotBetween(Date value1, Date value2) {
            addCriterion("need_sendmsg_date not between", value1, value2, "needSendmsgDate");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdIsNull() {
            addCriterion("merge_order_id is null");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdIsNotNull() {
            addCriterion("merge_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdEqualTo(Integer value) {
            addCriterion("merge_order_id =", value, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdNotEqualTo(Integer value) {
            addCriterion("merge_order_id <>", value, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdGreaterThan(Integer value) {
            addCriterion("merge_order_id >", value, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merge_order_id >=", value, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdLessThan(Integer value) {
            addCriterion("merge_order_id <", value, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("merge_order_id <=", value, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdIn(List<Integer> values) {
            addCriterion("merge_order_id in", values, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdNotIn(List<Integer> values) {
            addCriterion("merge_order_id not in", values, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("merge_order_id between", value1, value2, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andMergeOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merge_order_id not between", value1, value2, "mergeOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(Integer value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(Integer value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(Integer value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(Integer value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(Integer value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<Integer> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<Integer> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(Integer value1, Integer value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andPayMinuteIsNull() {
            addCriterion("pay_minute is null");
            return (Criteria) this;
        }

        public Criteria andPayMinuteIsNotNull() {
            addCriterion("pay_minute is not null");
            return (Criteria) this;
        }

        public Criteria andPayMinuteEqualTo(Integer value) {
            addCriterion("pay_minute =", value, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteNotEqualTo(Integer value) {
            addCriterion("pay_minute <>", value, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteGreaterThan(Integer value) {
            addCriterion("pay_minute >", value, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_minute >=", value, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteLessThan(Integer value) {
            addCriterion("pay_minute <", value, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("pay_minute <=", value, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteIn(List<Integer> values) {
            addCriterion("pay_minute in", values, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteNotIn(List<Integer> values) {
            addCriterion("pay_minute not in", values, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteBetween(Integer value1, Integer value2) {
            addCriterion("pay_minute between", value1, value2, "payMinute");
            return (Criteria) this;
        }

        public Criteria andPayMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_minute not between", value1, value2, "payMinute");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserIsNull() {
            addCriterion("sendmsg_user is null");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserIsNotNull() {
            addCriterion("sendmsg_user is not null");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserEqualTo(String value) {
            addCriterion("sendmsg_user =", value, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserNotEqualTo(String value) {
            addCriterion("sendmsg_user <>", value, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserGreaterThan(String value) {
            addCriterion("sendmsg_user >", value, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserGreaterThanOrEqualTo(String value) {
            addCriterion("sendmsg_user >=", value, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserLessThan(String value) {
            addCriterion("sendmsg_user <", value, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserLessThanOrEqualTo(String value) {
            addCriterion("sendmsg_user <=", value, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserLike(String value) {
            addCriterion("sendmsg_user like", value, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserNotLike(String value) {
            addCriterion("sendmsg_user not like", value, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserIn(List<String> values) {
            addCriterion("sendmsg_user in", values, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserNotIn(List<String> values) {
            addCriterion("sendmsg_user not in", values, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserBetween(String value1, String value2) {
            addCriterion("sendmsg_user between", value1, value2, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserNotBetween(String value1, String value2) {
            addCriterion("sendmsg_user not between", value1, value2, "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeIsNull() {
            addCriterion("account_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeIsNotNull() {
            addCriterion("account_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeEqualTo(Integer value) {
            addCriterion("account_currency_type =", value, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeNotEqualTo(Integer value) {
            addCriterion("account_currency_type <>", value, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeGreaterThan(Integer value) {
            addCriterion("account_currency_type >", value, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_currency_type >=", value, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeLessThan(Integer value) {
            addCriterion("account_currency_type <", value, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("account_currency_type <=", value, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeIn(List<Integer> values) {
            addCriterion("account_currency_type in", values, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeNotIn(List<Integer> values) {
            addCriterion("account_currency_type not in", values, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeBetween(Integer value1, Integer value2) {
            addCriterion("account_currency_type between", value1, value2, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountCurrencyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_currency_type not between", value1, value2, "accountCurrencyType");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateIsNull() {
            addCriterion("account_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateIsNotNull() {
            addCriterion("account_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateEqualTo(Double value) {
            addCriterion("account_exchange_rate =", value, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateNotEqualTo(Double value) {
            addCriterion("account_exchange_rate <>", value, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateGreaterThan(Double value) {
            addCriterion("account_exchange_rate >", value, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateGreaterThanOrEqualTo(Double value) {
            addCriterion("account_exchange_rate >=", value, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateLessThan(Double value) {
            addCriterion("account_exchange_rate <", value, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateLessThanOrEqualTo(Double value) {
            addCriterion("account_exchange_rate <=", value, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateIn(List<Double> values) {
            addCriterion("account_exchange_rate in", values, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateNotIn(List<Double> values) {
            addCriterion("account_exchange_rate not in", values, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateBetween(Double value1, Double value2) {
            addCriterion("account_exchange_rate between", value1, value2, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountExchangeRateNotBetween(Double value1, Double value2) {
            addCriterion("account_exchange_rate not between", value1, value2, "accountExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2IsNull() {
            addCriterion("account_money2 is null");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2IsNotNull() {
            addCriterion("account_money2 is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2EqualTo(Double value) {
            addCriterion("account_money2 =", value, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2NotEqualTo(Double value) {
            addCriterion("account_money2 <>", value, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2GreaterThan(Double value) {
            addCriterion("account_money2 >", value, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2GreaterThanOrEqualTo(Double value) {
            addCriterion("account_money2 >=", value, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2LessThan(Double value) {
            addCriterion("account_money2 <", value, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2LessThanOrEqualTo(Double value) {
            addCriterion("account_money2 <=", value, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2In(List<Double> values) {
            addCriterion("account_money2 in", values, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2NotIn(List<Double> values) {
            addCriterion("account_money2 not in", values, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2Between(Double value1, Double value2) {
            addCriterion("account_money2 between", value1, value2, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAccountMoney2NotBetween(Double value1, Double value2) {
            addCriterion("account_money2 not between", value1, value2, "accountMoney2");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNull() {
            addCriterion("settle_type is null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNotNull() {
            addCriterion("settle_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeEqualTo(String value) {
            addCriterion("settle_type =", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotEqualTo(String value) {
            addCriterion("settle_type <>", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThan(String value) {
            addCriterion("settle_type >", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("settle_type >=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThan(String value) {
            addCriterion("settle_type <", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThanOrEqualTo(String value) {
            addCriterion("settle_type <=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLike(String value) {
            addCriterion("settle_type like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotLike(String value) {
            addCriterion("settle_type not like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIn(List<String> values) {
            addCriterion("settle_type in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotIn(List<String> values) {
            addCriterion("settle_type not in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeBetween(String value1, String value2) {
            addCriterion("settle_type between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotBetween(String value1, String value2) {
            addCriterion("settle_type not between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andIsStockIsNull() {
            addCriterion("is_stock is null");
            return (Criteria) this;
        }

        public Criteria andIsStockIsNotNull() {
            addCriterion("is_stock is not null");
            return (Criteria) this;
        }

        public Criteria andIsStockEqualTo(Integer value) {
            addCriterion("is_stock =", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockNotEqualTo(Integer value) {
            addCriterion("is_stock <>", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockGreaterThan(Integer value) {
            addCriterion("is_stock >", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_stock >=", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockLessThan(Integer value) {
            addCriterion("is_stock <", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockLessThanOrEqualTo(Integer value) {
            addCriterion("is_stock <=", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockIn(List<Integer> values) {
            addCriterion("is_stock in", values, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockNotIn(List<Integer> values) {
            addCriterion("is_stock not in", values, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockBetween(Integer value1, Integer value2) {
            addCriterion("is_stock between", value1, value2, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockNotBetween(Integer value1, Integer value2) {
            addCriterion("is_stock not between", value1, value2, "isStock");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdIsNull() {
            addCriterion("from_area_id is null");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdIsNotNull() {
            addCriterion("from_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdEqualTo(Integer value) {
            addCriterion("from_area_id =", value, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdNotEqualTo(Integer value) {
            addCriterion("from_area_id <>", value, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdGreaterThan(Integer value) {
            addCriterion("from_area_id >", value, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_area_id >=", value, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdLessThan(Integer value) {
            addCriterion("from_area_id <", value, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_area_id <=", value, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdIn(List<Integer> values) {
            addCriterion("from_area_id in", values, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdNotIn(List<Integer> values) {
            addCriterion("from_area_id not in", values, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("from_area_id between", value1, value2, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andFromAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_area_id not between", value1, value2, "fromAreaId");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishIsNull() {
            addCriterion("is_autofinish is null");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishIsNotNull() {
            addCriterion("is_autofinish is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishEqualTo(Integer value) {
            addCriterion("is_autofinish =", value, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishNotEqualTo(Integer value) {
            addCriterion("is_autofinish <>", value, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishGreaterThan(Integer value) {
            addCriterion("is_autofinish >", value, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_autofinish >=", value, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishLessThan(Integer value) {
            addCriterion("is_autofinish <", value, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishLessThanOrEqualTo(Integer value) {
            addCriterion("is_autofinish <=", value, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishIn(List<Integer> values) {
            addCriterion("is_autofinish in", values, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishNotIn(List<Integer> values) {
            addCriterion("is_autofinish not in", values, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishBetween(Integer value1, Integer value2) {
            addCriterion("is_autofinish between", value1, value2, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andIsAutofinishNotBetween(Integer value1, Integer value2) {
            addCriterion("is_autofinish not between", value1, value2, "isAutofinish");
            return (Criteria) this;
        }

        public Criteria andPriceCodexIsNull() {
            addCriterion("price_codex is null");
            return (Criteria) this;
        }

        public Criteria andPriceCodexIsNotNull() {
            addCriterion("price_codex is not null");
            return (Criteria) this;
        }

        public Criteria andPriceCodexEqualTo(String value) {
            addCriterion("price_codex =", value, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexNotEqualTo(String value) {
            addCriterion("price_codex <>", value, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexGreaterThan(String value) {
            addCriterion("price_codex >", value, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexGreaterThanOrEqualTo(String value) {
            addCriterion("price_codex >=", value, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexLessThan(String value) {
            addCriterion("price_codex <", value, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexLessThanOrEqualTo(String value) {
            addCriterion("price_codex <=", value, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexLike(String value) {
            addCriterion("price_codex like", value, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexNotLike(String value) {
            addCriterion("price_codex not like", value, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexIn(List<String> values) {
            addCriterion("price_codex in", values, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexNotIn(List<String> values) {
            addCriterion("price_codex not in", values, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexBetween(String value1, String value2) {
            addCriterion("price_codex between", value1, value2, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andPriceCodexNotBetween(String value1, String value2) {
            addCriterion("price_codex not between", value1, value2, "priceCodex");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdIsNull() {
            addCriterion("order_source_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdIsNotNull() {
            addCriterion("order_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdEqualTo(String value) {
            addCriterion("order_source_id =", value, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdNotEqualTo(String value) {
            addCriterion("order_source_id <>", value, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdGreaterThan(String value) {
            addCriterion("order_source_id >", value, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_source_id >=", value, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdLessThan(String value) {
            addCriterion("order_source_id <", value, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdLessThanOrEqualTo(String value) {
            addCriterion("order_source_id <=", value, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdLike(String value) {
            addCriterion("order_source_id like", value, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdNotLike(String value) {
            addCriterion("order_source_id not like", value, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdIn(List<String> values) {
            addCriterion("order_source_id in", values, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdNotIn(List<String> values) {
            addCriterion("order_source_id not in", values, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdBetween(String value1, String value2) {
            addCriterion("order_source_id between", value1, value2, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdNotBetween(String value1, String value2) {
            addCriterion("order_source_id not between", value1, value2, "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andCancelNumIsNull() {
            addCriterion("cancel_num is null");
            return (Criteria) this;
        }

        public Criteria andCancelNumIsNotNull() {
            addCriterion("cancel_num is not null");
            return (Criteria) this;
        }

        public Criteria andCancelNumEqualTo(Integer value) {
            addCriterion("cancel_num =", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumNotEqualTo(Integer value) {
            addCriterion("cancel_num <>", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumGreaterThan(Integer value) {
            addCriterion("cancel_num >", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_num >=", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumLessThan(Integer value) {
            addCriterion("cancel_num <", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_num <=", value, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumIn(List<Integer> values) {
            addCriterion("cancel_num in", values, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumNotIn(List<Integer> values) {
            addCriterion("cancel_num not in", values, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumBetween(Integer value1, Integer value2) {
            addCriterion("cancel_num between", value1, value2, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andCancelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_num not between", value1, value2, "cancelNum");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyIsNull() {
            addCriterion("cash_coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyIsNotNull() {
            addCriterion("cash_coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyEqualTo(Double value) {
            addCriterion("cash_coupon_money =", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyNotEqualTo(Double value) {
            addCriterion("cash_coupon_money <>", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyGreaterThan(Double value) {
            addCriterion("cash_coupon_money >", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cash_coupon_money >=", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyLessThan(Double value) {
            addCriterion("cash_coupon_money <", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cash_coupon_money <=", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyIn(List<Double> values) {
            addCriterion("cash_coupon_money in", values, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyNotIn(List<Double> values) {
            addCriterion("cash_coupon_money not in", values, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyBetween(Double value1, Double value2) {
            addCriterion("cash_coupon_money between", value1, value2, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cash_coupon_money not between", value1, value2, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusIsNull() {
            addCriterion("cash_coupon_status is null");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusIsNotNull() {
            addCriterion("cash_coupon_status is not null");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusEqualTo(Integer value) {
            addCriterion("cash_coupon_status =", value, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusNotEqualTo(Integer value) {
            addCriterion("cash_coupon_status <>", value, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusGreaterThan(Integer value) {
            addCriterion("cash_coupon_status >", value, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash_coupon_status >=", value, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusLessThan(Integer value) {
            addCriterion("cash_coupon_status <", value, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cash_coupon_status <=", value, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusIn(List<Integer> values) {
            addCriterion("cash_coupon_status in", values, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusNotIn(List<Integer> values) {
            addCriterion("cash_coupon_status not in", values, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusBetween(Integer value1, Integer value2) {
            addCriterion("cash_coupon_status between", value1, value2, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cash_coupon_status not between", value1, value2, "cashCouponStatus");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoIsNull() {
            addCriterion("cash_coupon_no is null");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoIsNotNull() {
            addCriterion("cash_coupon_no is not null");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoEqualTo(Long value) {
            addCriterion("cash_coupon_no =", value, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoNotEqualTo(Long value) {
            addCriterion("cash_coupon_no <>", value, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoGreaterThan(Long value) {
            addCriterion("cash_coupon_no >", value, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoGreaterThanOrEqualTo(Long value) {
            addCriterion("cash_coupon_no >=", value, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoLessThan(Long value) {
            addCriterion("cash_coupon_no <", value, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoLessThanOrEqualTo(Long value) {
            addCriterion("cash_coupon_no <=", value, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoIn(List<Long> values) {
            addCriterion("cash_coupon_no in", values, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoNotIn(List<Long> values) {
            addCriterion("cash_coupon_no not in", values, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoBetween(Long value1, Long value2) {
            addCriterion("cash_coupon_no between", value1, value2, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponNoNotBetween(Long value1, Long value2) {
            addCriterion("cash_coupon_no not between", value1, value2, "cashCouponNo");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateIsNull() {
            addCriterion("cash_coupon_date is null");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateIsNotNull() {
            addCriterion("cash_coupon_date is not null");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateEqualTo(Date value) {
            addCriterion("cash_coupon_date =", value, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateNotEqualTo(Date value) {
            addCriterion("cash_coupon_date <>", value, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateGreaterThan(Date value) {
            addCriterion("cash_coupon_date >", value, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cash_coupon_date >=", value, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateLessThan(Date value) {
            addCriterion("cash_coupon_date <", value, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateLessThanOrEqualTo(Date value) {
            addCriterion("cash_coupon_date <=", value, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateIn(List<Date> values) {
            addCriterion("cash_coupon_date in", values, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateNotIn(List<Date> values) {
            addCriterion("cash_coupon_date not in", values, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateBetween(Date value1, Date value2) {
            addCriterion("cash_coupon_date between", value1, value2, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andCashCouponDateNotBetween(Date value1, Date value2) {
            addCriterion("cash_coupon_date not between", value1, value2, "cashCouponDate");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyIsNull() {
            addCriterion("mem_cancel_money is null");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyIsNotNull() {
            addCriterion("mem_cancel_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyEqualTo(Double value) {
            addCriterion("mem_cancel_money =", value, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyNotEqualTo(Double value) {
            addCriterion("mem_cancel_money <>", value, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyGreaterThan(Double value) {
            addCriterion("mem_cancel_money >", value, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("mem_cancel_money >=", value, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyLessThan(Double value) {
            addCriterion("mem_cancel_money <", value, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyLessThanOrEqualTo(Double value) {
            addCriterion("mem_cancel_money <=", value, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyIn(List<Double> values) {
            addCriterion("mem_cancel_money in", values, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyNotIn(List<Double> values) {
            addCriterion("mem_cancel_money not in", values, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyBetween(Double value1, Double value2) {
            addCriterion("mem_cancel_money between", value1, value2, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andMemCancelMoneyNotBetween(Double value1, Double value2) {
            addCriterion("mem_cancel_money not between", value1, value2, "memCancelMoney");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeIsNull() {
            addCriterion("order_venue_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeIsNotNull() {
            addCriterion("order_venue_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeEqualTo(Double value) {
            addCriterion("order_venue_fee =", value, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeNotEqualTo(Double value) {
            addCriterion("order_venue_fee <>", value, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeGreaterThan(Double value) {
            addCriterion("order_venue_fee >", value, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("order_venue_fee >=", value, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeLessThan(Double value) {
            addCriterion("order_venue_fee <", value, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeLessThanOrEqualTo(Double value) {
            addCriterion("order_venue_fee <=", value, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeIn(List<Double> values) {
            addCriterion("order_venue_fee in", values, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeNotIn(List<Double> values) {
            addCriterion("order_venue_fee not in", values, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeBetween(Double value1, Double value2) {
            addCriterion("order_venue_fee between", value1, value2, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andOrderVenueFeeNotBetween(Double value1, Double value2) {
            addCriterion("order_venue_fee not between", value1, value2, "orderVenueFee");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNull() {
            addCriterion("is_change is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNotNull() {
            addCriterion("is_change is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeEqualTo(Integer value) {
            addCriterion("is_change =", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotEqualTo(Integer value) {
            addCriterion("is_change <>", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThan(Integer value) {
            addCriterion("is_change >", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_change >=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThan(Integer value) {
            addCriterion("is_change <", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThanOrEqualTo(Integer value) {
            addCriterion("is_change <=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeIn(List<Integer> values) {
            addCriterion("is_change in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotIn(List<Integer> values) {
            addCriterion("is_change not in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeBetween(Integer value1, Integer value2) {
            addCriterion("is_change between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_change not between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andEditCustIdIsNull() {
            addCriterion("edit_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andEditCustIdIsNotNull() {
            addCriterion("edit_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andEditCustIdEqualTo(Integer value) {
            addCriterion("edit_cust_id =", value, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdNotEqualTo(Integer value) {
            addCriterion("edit_cust_id <>", value, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdGreaterThan(Integer value) {
            addCriterion("edit_cust_id >", value, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_cust_id >=", value, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdLessThan(Integer value) {
            addCriterion("edit_cust_id <", value, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("edit_cust_id <=", value, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdIn(List<Integer> values) {
            addCriterion("edit_cust_id in", values, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdNotIn(List<Integer> values) {
            addCriterion("edit_cust_id not in", values, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdBetween(Integer value1, Integer value2) {
            addCriterion("edit_cust_id between", value1, value2, "editCustId");
            return (Criteria) this;
        }

        public Criteria andEditCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_cust_id not between", value1, value2, "editCustId");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Integer value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Integer value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Integer value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Integer value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Integer value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Integer> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Integer> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Integer value1, Integer value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Integer value1, Integer value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateIsNull() {
            addCriterion("inferface_check_state is null");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateIsNotNull() {
            addCriterion("inferface_check_state is not null");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateEqualTo(Integer value) {
            addCriterion("inferface_check_state =", value, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateNotEqualTo(Integer value) {
            addCriterion("inferface_check_state <>", value, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateGreaterThan(Integer value) {
            addCriterion("inferface_check_state >", value, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("inferface_check_state >=", value, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateLessThan(Integer value) {
            addCriterion("inferface_check_state <", value, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateLessThanOrEqualTo(Integer value) {
            addCriterion("inferface_check_state <=", value, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateIn(List<Integer> values) {
            addCriterion("inferface_check_state in", values, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateNotIn(List<Integer> values) {
            addCriterion("inferface_check_state not in", values, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateBetween(Integer value1, Integer value2) {
            addCriterion("inferface_check_state between", value1, value2, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andInferfaceCheckStateNotBetween(Integer value1, Integer value2) {
            addCriterion("inferface_check_state not between", value1, value2, "inferfaceCheckState");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyIsNull() {
            addCriterion("mem_point_money is null");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyIsNotNull() {
            addCriterion("mem_point_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyEqualTo(Double value) {
            addCriterion("mem_point_money =", value, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyNotEqualTo(Double value) {
            addCriterion("mem_point_money <>", value, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyGreaterThan(Double value) {
            addCriterion("mem_point_money >", value, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("mem_point_money >=", value, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyLessThan(Double value) {
            addCriterion("mem_point_money <", value, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyLessThanOrEqualTo(Double value) {
            addCriterion("mem_point_money <=", value, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyIn(List<Double> values) {
            addCriterion("mem_point_money in", values, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyNotIn(List<Double> values) {
            addCriterion("mem_point_money not in", values, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyBetween(Double value1, Double value2) {
            addCriterion("mem_point_money between", value1, value2, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andMemPointMoneyNotBetween(Double value1, Double value2) {
            addCriterion("mem_point_money not between", value1, value2, "memPointMoney");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeIsNull() {
            addCriterion("all_pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeIsNotNull() {
            addCriterion("all_pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeEqualTo(Double value) {
            addCriterion("all_pay_fee =", value, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeNotEqualTo(Double value) {
            addCriterion("all_pay_fee <>", value, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeGreaterThan(Double value) {
            addCriterion("all_pay_fee >", value, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("all_pay_fee >=", value, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeLessThan(Double value) {
            addCriterion("all_pay_fee <", value, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeLessThanOrEqualTo(Double value) {
            addCriterion("all_pay_fee <=", value, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeIn(List<Double> values) {
            addCriterion("all_pay_fee in", values, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeNotIn(List<Double> values) {
            addCriterion("all_pay_fee not in", values, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeBetween(Double value1, Double value2) {
            addCriterion("all_pay_fee between", value1, value2, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andAllPayFeeNotBetween(Double value1, Double value2) {
            addCriterion("all_pay_fee not between", value1, value2, "allPayFee");
            return (Criteria) this;
        }

        public Criteria andCustMemoIsNull() {
            addCriterion("cust_memo is null");
            return (Criteria) this;
        }

        public Criteria andCustMemoIsNotNull() {
            addCriterion("cust_memo is not null");
            return (Criteria) this;
        }

        public Criteria andCustMemoEqualTo(String value) {
            addCriterion("cust_memo =", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotEqualTo(String value) {
            addCriterion("cust_memo <>", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoGreaterThan(String value) {
            addCriterion("cust_memo >", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_memo >=", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLessThan(String value) {
            addCriterion("cust_memo <", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLessThanOrEqualTo(String value) {
            addCriterion("cust_memo <=", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLike(String value) {
            addCriterion("cust_memo like", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotLike(String value) {
            addCriterion("cust_memo not like", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoIn(List<String> values) {
            addCriterion("cust_memo in", values, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotIn(List<String> values) {
            addCriterion("cust_memo not in", values, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoBetween(String value1, String value2) {
            addCriterion("cust_memo between", value1, value2, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotBetween(String value1, String value2) {
            addCriterion("cust_memo not between", value1, value2, "custMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoIsNull() {
            addCriterion("account_inner_memo is null");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoIsNotNull() {
            addCriterion("account_inner_memo is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoEqualTo(String value) {
            addCriterion("account_inner_memo =", value, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoNotEqualTo(String value) {
            addCriterion("account_inner_memo <>", value, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoGreaterThan(String value) {
            addCriterion("account_inner_memo >", value, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoGreaterThanOrEqualTo(String value) {
            addCriterion("account_inner_memo >=", value, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoLessThan(String value) {
            addCriterion("account_inner_memo <", value, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoLessThanOrEqualTo(String value) {
            addCriterion("account_inner_memo <=", value, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoLike(String value) {
            addCriterion("account_inner_memo like", value, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoNotLike(String value) {
            addCriterion("account_inner_memo not like", value, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoIn(List<String> values) {
            addCriterion("account_inner_memo in", values, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoNotIn(List<String> values) {
            addCriterion("account_inner_memo not in", values, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoBetween(String value1, String value2) {
            addCriterion("account_inner_memo between", value1, value2, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoNotBetween(String value1, String value2) {
            addCriterion("account_inner_memo not between", value1, value2, "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoIsNull() {
            addCriterion("inner_memo is null");
            return (Criteria) this;
        }

        public Criteria andInnerMemoIsNotNull() {
            addCriterion("inner_memo is not null");
            return (Criteria) this;
        }

        public Criteria andInnerMemoEqualTo(String value) {
            addCriterion("inner_memo =", value, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoNotEqualTo(String value) {
            addCriterion("inner_memo <>", value, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoGreaterThan(String value) {
            addCriterion("inner_memo >", value, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoGreaterThanOrEqualTo(String value) {
            addCriterion("inner_memo >=", value, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoLessThan(String value) {
            addCriterion("inner_memo <", value, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoLessThanOrEqualTo(String value) {
            addCriterion("inner_memo <=", value, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoLike(String value) {
            addCriterion("inner_memo like", value, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoNotLike(String value) {
            addCriterion("inner_memo not like", value, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoIn(List<String> values) {
            addCriterion("inner_memo in", values, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoNotIn(List<String> values) {
            addCriterion("inner_memo not in", values, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoBetween(String value1, String value2) {
            addCriterion("inner_memo between", value1, value2, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoNotBetween(String value1, String value2) {
            addCriterion("inner_memo not between", value1, value2, "innerMemo");
            return (Criteria) this;
        }

        public Criteria andAdjustIsNull() {
            addCriterion("adjust is null");
            return (Criteria) this;
        }

        public Criteria andAdjustIsNotNull() {
            addCriterion("adjust is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustEqualTo(String value) {
            addCriterion("adjust =", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustNotEqualTo(String value) {
            addCriterion("adjust <>", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustGreaterThan(String value) {
            addCriterion("adjust >", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustGreaterThanOrEqualTo(String value) {
            addCriterion("adjust >=", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustLessThan(String value) {
            addCriterion("adjust <", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustLessThanOrEqualTo(String value) {
            addCriterion("adjust <=", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustLike(String value) {
            addCriterion("adjust like", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustNotLike(String value) {
            addCriterion("adjust not like", value, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustIn(List<String> values) {
            addCriterion("adjust in", values, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustNotIn(List<String> values) {
            addCriterion("adjust not in", values, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustBetween(String value1, String value2) {
            addCriterion("adjust between", value1, value2, "adjust");
            return (Criteria) this;
        }

        public Criteria andAdjustNotBetween(String value1, String value2) {
            addCriterion("adjust not between", value1, value2, "adjust");
            return (Criteria) this;
        }

        public Criteria andChangeStateIsNull() {
            addCriterion("change_state is null");
            return (Criteria) this;
        }

        public Criteria andChangeStateIsNotNull() {
            addCriterion("change_state is not null");
            return (Criteria) this;
        }

        public Criteria andChangeStateEqualTo(Integer value) {
            addCriterion("change_state =", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateNotEqualTo(Integer value) {
            addCriterion("change_state <>", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateGreaterThan(Integer value) {
            addCriterion("change_state >", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_state >=", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateLessThan(Integer value) {
            addCriterion("change_state <", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateLessThanOrEqualTo(Integer value) {
            addCriterion("change_state <=", value, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateIn(List<Integer> values) {
            addCriterion("change_state in", values, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateNotIn(List<Integer> values) {
            addCriterion("change_state not in", values, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateBetween(Integer value1, Integer value2) {
            addCriterion("change_state between", value1, value2, "changeState");
            return (Criteria) this;
        }

        public Criteria andChangeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("change_state not between", value1, value2, "changeState");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNull() {
            addCriterion("apply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNotNull() {
            addCriterion("apply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdEqualTo(String value) {
            addCriterion("apply_user_id =", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotEqualTo(String value) {
            addCriterion("apply_user_id <>", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThan(String value) {
            addCriterion("apply_user_id >", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_id >=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThan(String value) {
            addCriterion("apply_user_id <", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThanOrEqualTo(String value) {
            addCriterion("apply_user_id <=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLike(String value) {
            addCriterion("apply_user_id like", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotLike(String value) {
            addCriterion("apply_user_id not like", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIn(List<String> values) {
            addCriterion("apply_user_id in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotIn(List<String> values) {
            addCriterion("apply_user_id not in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdBetween(String value1, String value2) {
            addCriterion("apply_user_id between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotBetween(String value1, String value2) {
            addCriterion("apply_user_id not between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyIsNull() {
            addCriterion("return_custom_money is null");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyIsNotNull() {
            addCriterion("return_custom_money is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyEqualTo(Double value) {
            addCriterion("return_custom_money =", value, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyNotEqualTo(Double value) {
            addCriterion("return_custom_money <>", value, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyGreaterThan(Double value) {
            addCriterion("return_custom_money >", value, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("return_custom_money >=", value, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyLessThan(Double value) {
            addCriterion("return_custom_money <", value, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyLessThanOrEqualTo(Double value) {
            addCriterion("return_custom_money <=", value, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyIn(List<Double> values) {
            addCriterion("return_custom_money in", values, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyNotIn(List<Double> values) {
            addCriterion("return_custom_money not in", values, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyBetween(Double value1, Double value2) {
            addCriterion("return_custom_money between", value1, value2, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andReturnCustomMoneyNotBetween(Double value1, Double value2) {
            addCriterion("return_custom_money not between", value1, value2, "returnCustomMoney");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdIsNull() {
            addCriterion("interface_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdIsNotNull() {
            addCriterion("interface_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdEqualTo(String value) {
            addCriterion("interface_cust_id =", value, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdNotEqualTo(String value) {
            addCriterion("interface_cust_id <>", value, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdGreaterThan(String value) {
            addCriterion("interface_cust_id >", value, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("interface_cust_id >=", value, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdLessThan(String value) {
            addCriterion("interface_cust_id <", value, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdLessThanOrEqualTo(String value) {
            addCriterion("interface_cust_id <=", value, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdLike(String value) {
            addCriterion("interface_cust_id like", value, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdNotLike(String value) {
            addCriterion("interface_cust_id not like", value, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdIn(List<String> values) {
            addCriterion("interface_cust_id in", values, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdNotIn(List<String> values) {
            addCriterion("interface_cust_id not in", values, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdBetween(String value1, String value2) {
            addCriterion("interface_cust_id between", value1, value2, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdNotBetween(String value1, String value2) {
            addCriterion("interface_cust_id not between", value1, value2, "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentIsNull() {
            addCriterion("cust_sms_content is null");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentIsNotNull() {
            addCriterion("cust_sms_content is not null");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentEqualTo(String value) {
            addCriterion("cust_sms_content =", value, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentNotEqualTo(String value) {
            addCriterion("cust_sms_content <>", value, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentGreaterThan(String value) {
            addCriterion("cust_sms_content >", value, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentGreaterThanOrEqualTo(String value) {
            addCriterion("cust_sms_content >=", value, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentLessThan(String value) {
            addCriterion("cust_sms_content <", value, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentLessThanOrEqualTo(String value) {
            addCriterion("cust_sms_content <=", value, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentLike(String value) {
            addCriterion("cust_sms_content like", value, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentNotLike(String value) {
            addCriterion("cust_sms_content not like", value, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentIn(List<String> values) {
            addCriterion("cust_sms_content in", values, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentNotIn(List<String> values) {
            addCriterion("cust_sms_content not in", values, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentBetween(String value1, String value2) {
            addCriterion("cust_sms_content between", value1, value2, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentNotBetween(String value1, String value2) {
            addCriterion("cust_sms_content not between", value1, value2, "custSmsContent");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteIsNull() {
            addCriterion("confirm_minute is null");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteIsNotNull() {
            addCriterion("confirm_minute is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteEqualTo(Integer value) {
            addCriterion("confirm_minute =", value, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteNotEqualTo(Integer value) {
            addCriterion("confirm_minute <>", value, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteGreaterThan(Integer value) {
            addCriterion("confirm_minute >", value, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_minute >=", value, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteLessThan(Integer value) {
            addCriterion("confirm_minute <", value, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_minute <=", value, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteIn(List<Integer> values) {
            addCriterion("confirm_minute in", values, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteNotIn(List<Integer> values) {
            addCriterion("confirm_minute not in", values, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteBetween(Integer value1, Integer value2) {
            addCriterion("confirm_minute between", value1, value2, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andConfirmMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_minute not between", value1, value2, "confirmMinute");
            return (Criteria) this;
        }

        public Criteria andVenueIdIsNull() {
            addCriterion("venue_id is null");
            return (Criteria) this;
        }

        public Criteria andVenueIdIsNotNull() {
            addCriterion("venue_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenueIdEqualTo(Long value) {
            addCriterion("venue_id =", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdNotEqualTo(Long value) {
            addCriterion("venue_id <>", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdGreaterThan(Long value) {
            addCriterion("venue_id >", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdGreaterThanOrEqualTo(Long value) {
            addCriterion("venue_id >=", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdLessThan(Long value) {
            addCriterion("venue_id <", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdLessThanOrEqualTo(Long value) {
            addCriterion("venue_id <=", value, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdIn(List<Long> values) {
            addCriterion("venue_id in", values, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdNotIn(List<Long> values) {
            addCriterion("venue_id not in", values, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdBetween(Long value1, Long value2) {
            addCriterion("venue_id between", value1, value2, "venueId");
            return (Criteria) this;
        }

        public Criteria andVenueIdNotBetween(Long value1, Long value2) {
            addCriterion("venue_id not between", value1, value2, "venueId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Long value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Long value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Long value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Long value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Long> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Long> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Long value1, Long value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andPayIdLikeInsensitive(String value) {
            addCriterion("upper(pay_id) like", value.toUpperCase(), "payId");
            return (Criteria) this;
        }

        public Criteria andLinkManLikeInsensitive(String value) {
            addCriterion("upper(link_man) like", value.toUpperCase(), "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLikeInsensitive(String value) {
            addCriterion("upper(link_phone) like", value.toUpperCase(), "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkAddressLikeInsensitive(String value) {
            addCriterion("upper(link_address) like", value.toUpperCase(), "linkAddress");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLikeInsensitive(String value) {
            addCriterion("upper(link_code) like", value.toUpperCase(), "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLikeInsensitive(String value) {
            addCriterion("upper(link_email) like", value.toUpperCase(), "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkCreditNoLikeInsensitive(String value) {
            addCriterion("upper(link_credit_no) like", value.toUpperCase(), "linkCreditNo");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andConfirmUserLikeInsensitive(String value) {
            addCriterion("upper(confirm_user) like", value.toUpperCase(), "confirmUser");
            return (Criteria) this;
        }

        public Criteria andCancelUserLikeInsensitive(String value) {
            addCriterion("upper(cancel_user) like", value.toUpperCase(), "cancelUser");
            return (Criteria) this;
        }

        public Criteria andPayUserLikeInsensitive(String value) {
            addCriterion("upper(pay_user) like", value.toUpperCase(), "payUser");
            return (Criteria) this;
        }

        public Criteria andFinishUserLikeInsensitive(String value) {
            addCriterion("upper(finish_user) like", value.toUpperCase(), "finishUser");
            return (Criteria) this;
        }

        public Criteria andSendContentLikeInsensitive(String value) {
            addCriterion("upper(send_content) like", value.toUpperCase(), "sendContent");
            return (Criteria) this;
        }

        public Criteria andSendUserLikeInsensitive(String value) {
            addCriterion("upper(send_user) like", value.toUpperCase(), "sendUser");
            return (Criteria) this;
        }

        public Criteria andInterfaceOrderIdLikeInsensitive(String value) {
            addCriterion("upper(interface_order_id) like", value.toUpperCase(), "interfaceOrderId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdLikeInsensitive(String value) {
            addCriterion("upper(interface_id) like", value.toUpperCase(), "interfaceId");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordLikeInsensitive(String value) {
            addCriterion("upper(order_password) like", value.toUpperCase(), "orderPassword");
            return (Criteria) this;
        }

        public Criteria andInterfaceProdIdLikeInsensitive(String value) {
            addCriterion("upper(interface_prod_id) like", value.toUpperCase(), "interfaceProdId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLikeInsensitive(String value) {
            addCriterion("upper(order_code) like", value.toUpperCase(), "orderCode");
            return (Criteria) this;
        }

        public Criteria andPrintUserLikeInsensitive(String value) {
            addCriterion("upper(print_user) like", value.toUpperCase(), "printUser");
            return (Criteria) this;
        }

        public Criteria andPrintExcodeLikeInsensitive(String value) {
            addCriterion("upper(print_excode) like", value.toUpperCase(), "printExcode");
            return (Criteria) this;
        }

        public Criteria andSendContent1LikeInsensitive(String value) {
            addCriterion("upper(send_content1) like", value.toUpperCase(), "sendContent1");
            return (Criteria) this;
        }

        public Criteria andSendContent2LikeInsensitive(String value) {
            addCriterion("upper(send_content2) like", value.toUpperCase(), "sendContent2");
            return (Criteria) this;
        }

        public Criteria andPrintExcode2LikeInsensitive(String value) {
            addCriterion("upper(print_excode2) like", value.toUpperCase(), "printExcode2");
            return (Criteria) this;
        }

        public Criteria andAccountUserIdLikeInsensitive(String value) {
            addCriterion("upper(account_user_id) like", value.toUpperCase(), "accountUserId");
            return (Criteria) this;
        }

        public Criteria andProdDetailLikeInsensitive(String value) {
            addCriterion("upper(prod_detail) like", value.toUpperCase(), "prodDetail");
            return (Criteria) this;
        }

        public Criteria andAgentReturnUserIdLikeInsensitive(String value) {
            addCriterion("upper(agent_return_user_id) like", value.toUpperCase(), "agentReturnUserId");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLikeInsensitive(String value) {
            addCriterion("upper(order_memo) like", value.toUpperCase(), "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderFilesLikeInsensitive(String value) {
            addCriterion("upper(order_files) like", value.toUpperCase(), "orderFiles");
            return (Criteria) this;
        }

        public Criteria andSendmsgUserLikeInsensitive(String value) {
            addCriterion("upper(sendmsg_user) like", value.toUpperCase(), "sendmsgUser");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLikeInsensitive(String value) {
            addCriterion("upper(settle_type) like", value.toUpperCase(), "settleType");
            return (Criteria) this;
        }

        public Criteria andPriceCodexLikeInsensitive(String value) {
            addCriterion("upper(price_codex) like", value.toUpperCase(), "priceCodex");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIdLikeInsensitive(String value) {
            addCriterion("upper(order_source_id) like", value.toUpperCase(), "orderSourceId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLikeInsensitive(String value) {
            addCriterion("upper(member_id) like", value.toUpperCase(), "memberId");
            return (Criteria) this;
        }

        public Criteria andCustMemoLikeInsensitive(String value) {
            addCriterion("upper(cust_memo) like", value.toUpperCase(), "custMemo");
            return (Criteria) this;
        }

        public Criteria andAccountInnerMemoLikeInsensitive(String value) {
            addCriterion("upper(account_inner_memo) like", value.toUpperCase(), "accountInnerMemo");
            return (Criteria) this;
        }

        public Criteria andInnerMemoLikeInsensitive(String value) {
            addCriterion("upper(inner_memo) like", value.toUpperCase(), "innerMemo");
            return (Criteria) this;
        }

        public Criteria andAdjustLikeInsensitive(String value) {
            addCriterion("upper(adjust) like", value.toUpperCase(), "adjust");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLikeInsensitive(String value) {
            addCriterion("upper(apply_user_id) like", value.toUpperCase(), "applyUserId");
            return (Criteria) this;
        }

        public Criteria andInterfaceCustIdLikeInsensitive(String value) {
            addCriterion("upper(interface_cust_id) like", value.toUpperCase(), "interfaceCustId");
            return (Criteria) this;
        }

        public Criteria andCustSmsContentLikeInsensitive(String value) {
            addCriterion("upper(cust_sms_content) like", value.toUpperCase(), "custSmsContent");
            return (Criteria) this;
        }

        public Criteria customClauseSql(String value) {
            addCriterion("(" + value+ ")");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        private static final long serialVersionUID = 1L;

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