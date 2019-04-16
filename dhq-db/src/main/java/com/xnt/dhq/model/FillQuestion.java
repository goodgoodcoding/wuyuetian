package com.xnt.dhq.model;

import java.io.Serializable;

public class FillQuestion implements Serializable {
    private Integer fillId;

    private String fillAnswer;

    private Integer grade;

    private String difficultyLevel;

    private String subject;

    private String knowledgePoint;

    private String score;

    private String fillContent;

    private static final long serialVersionUID = 1L;

    public Integer getFillId() {
        return fillId;
    }

    public void setFillId(Integer fillId) {
        this.fillId = fillId;
    }

    public String getFillAnswer() {
        return fillAnswer;
    }

    public void setFillAnswer(String fillAnswer) {
        this.fillAnswer = fillAnswer;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getKnowledgePoint() {
        return knowledgePoint;
    }

    public void setKnowledgePoint(String knowledgePoint) {
        this.knowledgePoint = knowledgePoint;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getFillContent() {
        return fillContent;
    }

    public void setFillContent(String fillContent) {
        this.fillContent = fillContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fillId=").append(fillId);
        sb.append(", fillAnswer=").append(fillAnswer);
        sb.append(", grade=").append(grade);
        sb.append(", difficultyLevel=").append(difficultyLevel);
        sb.append(", subject=").append(subject);
        sb.append(", knowledgePoint=").append(knowledgePoint);
        sb.append(", score=").append(score);
        sb.append(", fillContent=").append(fillContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}