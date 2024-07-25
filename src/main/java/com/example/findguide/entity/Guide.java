package com.example.findguide.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "guide")
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guideid;
    private Integer userid;
    private String guideRegion;
    private String certificateType;
    private Double guideFee;

    public Integer getGuideid() {
        return guideid;
    }

    public void setGuideid(Integer guideId) {
        this.guideid = guideId;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getGuideRegion() {
        return guideRegion;
    }

    public void setGuideRegion(String guideRegion) {
        this.guideRegion = guideRegion;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public Double getGuideFee() {
        return guideFee;
    }

    public void setGuideFee(Double guideFee) {
        this.guideFee = guideFee;
    }
}
