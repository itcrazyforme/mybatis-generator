package com.garlic.domain;

import java.util.ArrayList;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("ROLEID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("ROLEID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("ROLEID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("ROLEID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("ROLEID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("ROLEID like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("ROLEID not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("ROLEID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("ROLEID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("ROLEID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("ROLEID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidIsNull() {
            addCriterion("PARENTROLEID is null");
            return (Criteria) this;
        }

        public Criteria andParentroleidIsNotNull() {
            addCriterion("PARENTROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andParentroleidEqualTo(String value) {
            addCriterion("PARENTROLEID =", value, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidNotEqualTo(String value) {
            addCriterion("PARENTROLEID <>", value, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidGreaterThan(String value) {
            addCriterion("PARENTROLEID >", value, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTROLEID >=", value, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidLessThan(String value) {
            addCriterion("PARENTROLEID <", value, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidLessThanOrEqualTo(String value) {
            addCriterion("PARENTROLEID <=", value, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidLike(String value) {
            addCriterion("PARENTROLEID like", value, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidNotLike(String value) {
            addCriterion("PARENTROLEID not like", value, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidIn(List<String> values) {
            addCriterion("PARENTROLEID in", values, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidNotIn(List<String> values) {
            addCriterion("PARENTROLEID not in", values, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidBetween(String value1, String value2) {
            addCriterion("PARENTROLEID between", value1, value2, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andParentroleidNotBetween(String value1, String value2) {
            addCriterion("PARENTROLEID not between", value1, value2, "parentroleid");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("ROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("ROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("ROLENAME =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("ROLENAME <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("ROLENAME >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLENAME >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("ROLENAME <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("ROLENAME <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("ROLENAME like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("ROLENAME not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("ROLENAME in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("ROLENAME not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("ROLENAME between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("ROLENAME not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRoletypeIsNull() {
            addCriterion("ROLETYPE is null");
            return (Criteria) this;
        }

        public Criteria andRoletypeIsNotNull() {
            addCriterion("ROLETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRoletypeEqualTo(String value) {
            addCriterion("ROLETYPE =", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotEqualTo(String value) {
            addCriterion("ROLETYPE <>", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeGreaterThan(String value) {
            addCriterion("ROLETYPE >", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLETYPE >=", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLessThan(String value) {
            addCriterion("ROLETYPE <", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLessThanOrEqualTo(String value) {
            addCriterion("ROLETYPE <=", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLike(String value) {
            addCriterion("ROLETYPE like", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotLike(String value) {
            addCriterion("ROLETYPE not like", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeIn(List<String> values) {
            addCriterion("ROLETYPE in", values, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotIn(List<String> values) {
            addCriterion("ROLETYPE not in", values, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeBetween(String value1, String value2) {
            addCriterion("ROLETYPE between", value1, value2, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotBetween(String value1, String value2) {
            addCriterion("ROLETYPE not between", value1, value2, "roletype");
            return (Criteria) this;
        }

        public Criteria andOrgnoIsNull() {
            addCriterion("ORGNO is null");
            return (Criteria) this;
        }

        public Criteria andOrgnoIsNotNull() {
            addCriterion("ORGNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnoEqualTo(String value) {
            addCriterion("ORGNO =", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoNotEqualTo(String value) {
            addCriterion("ORGNO <>", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoGreaterThan(String value) {
            addCriterion("ORGNO >", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNO >=", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoLessThan(String value) {
            addCriterion("ORGNO <", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoLessThanOrEqualTo(String value) {
            addCriterion("ORGNO <=", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoLike(String value) {
            addCriterion("ORGNO like", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoNotLike(String value) {
            addCriterion("ORGNO not like", value, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoIn(List<String> values) {
            addCriterion("ORGNO in", values, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoNotIn(List<String> values) {
            addCriterion("ORGNO not in", values, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoBetween(String value1, String value2) {
            addCriterion("ORGNO between", value1, value2, "orgno");
            return (Criteria) this;
        }

        public Criteria andOrgnoNotBetween(String value1, String value2) {
            addCriterion("ORGNO not between", value1, value2, "orgno");
            return (Criteria) this;
        }

        public Criteria andAuthlevelIsNull() {
            addCriterion("AUTHLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAuthlevelIsNotNull() {
            addCriterion("AUTHLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAuthlevelEqualTo(Short value) {
            addCriterion("AUTHLEVEL =", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelNotEqualTo(Short value) {
            addCriterion("AUTHLEVEL <>", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelGreaterThan(Short value) {
            addCriterion("AUTHLEVEL >", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelGreaterThanOrEqualTo(Short value) {
            addCriterion("AUTHLEVEL >=", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelLessThan(Short value) {
            addCriterion("AUTHLEVEL <", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelLessThanOrEqualTo(Short value) {
            addCriterion("AUTHLEVEL <=", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelIn(List<Short> values) {
            addCriterion("AUTHLEVEL in", values, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelNotIn(List<Short> values) {
            addCriterion("AUTHLEVEL not in", values, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelBetween(Short value1, Short value2) {
            addCriterion("AUTHLEVEL between", value1, value2, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelNotBetween(Short value1, Short value2) {
            addCriterion("AUTHLEVEL not between", value1, value2, "authlevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelIsNull() {
            addCriterion("CHECKLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andChecklevelIsNotNull() {
            addCriterion("CHECKLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andChecklevelEqualTo(Short value) {
            addCriterion("CHECKLEVEL =", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotEqualTo(Short value) {
            addCriterion("CHECKLEVEL <>", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelGreaterThan(Short value) {
            addCriterion("CHECKLEVEL >", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelGreaterThanOrEqualTo(Short value) {
            addCriterion("CHECKLEVEL >=", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelLessThan(Short value) {
            addCriterion("CHECKLEVEL <", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelLessThanOrEqualTo(Short value) {
            addCriterion("CHECKLEVEL <=", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelIn(List<Short> values) {
            addCriterion("CHECKLEVEL in", values, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotIn(List<Short> values) {
            addCriterion("CHECKLEVEL not in", values, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelBetween(Short value1, Short value2) {
            addCriterion("CHECKLEVEL between", value1, value2, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotBetween(Short value1, Short value2) {
            addCriterion("CHECKLEVEL not between", value1, value2, "checklevel");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("DESCRIPT is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("DESCRIPT is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("DESCRIPT =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("DESCRIPT <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("DESCRIPT >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPT >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("DESCRIPT <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPT <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("DESCRIPT like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("DESCRIPT not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("DESCRIPT in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("DESCRIPT not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("DESCRIPT between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("DESCRIPT not between", value1, value2, "descript");
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