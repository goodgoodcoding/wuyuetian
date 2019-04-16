package com.xnt.dhq.model;

import java.io.Serializable;

public class ChoiceQuestion implements Serializable {
    private Integer choiceId;

    private String choiceAnswer;

    private Integer grade;

    private String difficultyLevel;

    private String subject;

    private String knowledgePoint;

    private String score;

    private String choiceContent;

    private String firstchoice;

    private String secondchoice;

    private String thirdchoice;

    private String fourthchoice;

    private static final long serialVersionUID = 1L;

    public Integer getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Integer choiceId) {
        this.choiceId = choiceId;
    }

    public String getChoiceAnswer() {
        return choiceAnswer;
    }

    public void setChoiceAnswer(String choiceAnswer) {
        this.choiceAnswer = choiceAnswer;
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

    public String getChoiceContent() {
        return choiceContent;
    }

    public void setChoiceContent(String choiceContent) {
        this.choiceContent = choiceContent;
    }

    public String getFirstchoice() {
        return firstchoice;
    }

    public void setFirstchoice(String firstchoice) {
        this.firstchoice = firstchoice;
    }

    public String getSecondchoice() {
        return secondchoice;
    }

    public void setSecondchoice(String secondchoice) {
        this.secondchoice = secondchoice;
    }

    public String getThirdchoice() {
        return thirdchoice;
    }

    public void setThirdchoice(String thirdchoice) {
        this.thirdchoice = thirdchoice;
    }

    public String getFourthchoice() {
        return fourthchoice;
    }

    public void setFourthchoice(String fourthchoice) {
        this.fourthchoice = fourthchoice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", choiceId=").append(choiceId);
        sb.append(", choiceAnswer=").append(choiceAnswer);
        sb.append(", grade=").append(grade);
        sb.append(", difficultyLevel=").append(difficultyLevel);
        sb.append(", subject=").append(subject);
        sb.append(", knowledgePoint=").append(knowledgePoint);
        sb.append(", score=").append(score);
        sb.append(", choiceContent=").append(choiceContent);
        sb.append(", firstchoice=").append(firstchoice);
        sb.append(", secondchoice=").append(secondchoice);
        sb.append(", thirdchoice=").append(thirdchoice);
        sb.append(", fourthchoice=").append(fourthchoice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}