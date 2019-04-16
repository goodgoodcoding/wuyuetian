package com.xnt.dhq.model;

import java.util.ArrayList;
import java.util.List;

public class FillQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FillQuestionExample() {
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

        public Criteria andFillIdIsNull() {
            addCriterion("fill_id is null");
            return (Criteria) this;
        }

        public Criteria andFillIdIsNotNull() {
            addCriterion("fill_id is not null");
            return (Criteria) this;
        }

        public Criteria andFillIdEqualTo(Integer value) {
            addCriterion("fill_id =", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdNotEqualTo(Integer value) {
            addCriterion("fill_id <>", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdGreaterThan(Integer value) {
            addCriterion("fill_id >", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fill_id >=", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdLessThan(Integer value) {
            addCriterion("fill_id <", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdLessThanOrEqualTo(Integer value) {
            addCriterion("fill_id <=", value, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdIn(List<Integer> values) {
            addCriterion("fill_id in", values, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdNotIn(List<Integer> values) {
            addCriterion("fill_id not in", values, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdBetween(Integer value1, Integer value2) {
            addCriterion("fill_id between", value1, value2, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fill_id not between", value1, value2, "fillId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIsNull() {
            addCriterion("fill_answer is null");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIsNotNull() {
            addCriterion("fill_answer is not null");
            return (Criteria) this;
        }

        public Criteria andFillAnswerEqualTo(String value) {
            addCriterion("fill_answer =", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerNotEqualTo(String value) {
            addCriterion("fill_answer <>", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerGreaterThan(String value) {
            addCriterion("fill_answer >", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("fill_answer >=", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerLessThan(String value) {
            addCriterion("fill_answer <", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerLessThanOrEqualTo(String value) {
            addCriterion("fill_answer <=", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerLike(String value) {
            addCriterion("fill_answer like", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerNotLike(String value) {
            addCriterion("fill_answer not like", value, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIn(List<String> values) {
            addCriterion("fill_answer in", values, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerNotIn(List<String> values) {
            addCriterion("fill_answer not in", values, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerBetween(String value1, String value2) {
            addCriterion("fill_answer between", value1, value2, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andFillAnswerNotBetween(String value1, String value2) {
            addCriterion("fill_answer not between", value1, value2, "fillAnswer");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIsNull() {
            addCriterion("difficulty_level is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIsNotNull() {
            addCriterion("difficulty_level is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelEqualTo(String value) {
            addCriterion("difficulty_level =", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNotEqualTo(String value) {
            addCriterion("difficulty_level <>", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelGreaterThan(String value) {
            addCriterion("difficulty_level >", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("difficulty_level >=", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelLessThan(String value) {
            addCriterion("difficulty_level <", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelLessThanOrEqualTo(String value) {
            addCriterion("difficulty_level <=", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelLike(String value) {
            addCriterion("difficulty_level like", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNotLike(String value) {
            addCriterion("difficulty_level not like", value, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIn(List<String> values) {
            addCriterion("difficulty_level in", values, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNotIn(List<String> values) {
            addCriterion("difficulty_level not in", values, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelBetween(String value1, String value2) {
            addCriterion("difficulty_level between", value1, value2, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNotBetween(String value1, String value2) {
            addCriterion("difficulty_level not between", value1, value2, "difficultyLevel");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIsNull() {
            addCriterion("knowledge_point is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIsNotNull() {
            addCriterion("knowledge_point is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointEqualTo(String value) {
            addCriterion("knowledge_point =", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotEqualTo(String value) {
            addCriterion("knowledge_point <>", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointGreaterThan(String value) {
            addCriterion("knowledge_point >", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointGreaterThanOrEqualTo(String value) {
            addCriterion("knowledge_point >=", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLessThan(String value) {
            addCriterion("knowledge_point <", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLessThanOrEqualTo(String value) {
            addCriterion("knowledge_point <=", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLike(String value) {
            addCriterion("knowledge_point like", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotLike(String value) {
            addCriterion("knowledge_point not like", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIn(List<String> values) {
            addCriterion("knowledge_point in", values, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotIn(List<String> values) {
            addCriterion("knowledge_point not in", values, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointBetween(String value1, String value2) {
            addCriterion("knowledge_point between", value1, value2, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotBetween(String value1, String value2) {
            addCriterion("knowledge_point not between", value1, value2, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
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