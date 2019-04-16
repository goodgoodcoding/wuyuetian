package com.xnt.dhq.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class ShopCourse implements Serializable {
    private Integer shopId;

    private Integer courseId;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endTime;

    private String classLocation;

    private String classTeacher;

    private Integer price;

    private Integer classCapacity;

    private static final long serialVersionUID = 1L;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getClassCapacity() {
        return classCapacity;
    }

    public void setClassCapacity(Integer classCapacity) {
        this.classCapacity = classCapacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopId=").append(shopId);
        sb.append(", courseId=").append(courseId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", classLocation=").append(classLocation);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", price=").append(price);
        sb.append(", classCapacity=").append(classCapacity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}