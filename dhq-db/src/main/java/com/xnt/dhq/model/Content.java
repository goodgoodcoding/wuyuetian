package com.xnt.dhq.model;

import java.io.Serializable;
import java.util.Date;

public class Content implements Serializable {
    private Long id;

    private Long typeId;

    private String title;

    private String description;

    private Date publishTime;

    private String publisher;

    private Integer status;

    private Integer acceptObject;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

       public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAcceptObject() {
        return acceptObject;
    }

    public void setAcceptObject(Integer acceptObject) {
        this.acceptObject = acceptObject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", publisher=").append(publisher);
        sb.append(", status=").append(status);
        sb.append(", acceptObject=").append(acceptObject);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}