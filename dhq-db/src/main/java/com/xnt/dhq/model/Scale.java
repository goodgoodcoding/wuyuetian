package com.xnt.dhq.model;

import java.io.Serializable;
import java.util.Date;

public class Scale implements Serializable {
    private Integer scaleId;

    private String scaleName;

    private Integer scaleTypeid;

    private Integer designerId;

    private Date createTime;

    private Integer suitableAgestart;

    private Integer suitableAgeend;

    private String state;

    private Date modifyTime;

    private Integer organizationId;

    private String info;

    private String instruction;

    private static final long serialVersionUID = 1L;

    public Integer getScaleId() {
        return scaleId;
    }

    public void setScaleId(Integer scaleId) {
        this.scaleId = scaleId;
    }

    public String getScaleName() {
        return scaleName;
    }

    public void setScaleName(String scaleName) {
        this.scaleName = scaleName;
    }

    public Integer getScaleTypeid() {
        return scaleTypeid;
    }

    public void setScaleTypeid(Integer scaleTypeid) {
        this.scaleTypeid = scaleTypeid;
    }

    public Integer getDesignerId() {
        return designerId;
    }

    public void setDesignerId(Integer designerId) {
        this.designerId = designerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSuitableAgestart() {
        return suitableAgestart;
    }

    public void setSuitableAgestart(Integer suitableAgestart) {
        this.suitableAgestart = suitableAgestart;
    }

    public Integer getSuitableAgeend() {
        return suitableAgeend;
    }

    public void setSuitableAgeend(Integer suitableAgeend) {
        this.suitableAgeend = suitableAgeend;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scaleId=").append(scaleId);
        sb.append(", scaleName=").append(scaleName);
        sb.append(", scaleTypeid=").append(scaleTypeid);
        sb.append(", designerId=").append(designerId);
        sb.append(", createTime=").append(createTime);
        sb.append(", suitableAgestart=").append(suitableAgestart);
        sb.append(", suitableAgeend=").append(suitableAgeend);
        sb.append(", state=").append(state);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", info=").append(info);
        sb.append(", instruction=").append(instruction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}