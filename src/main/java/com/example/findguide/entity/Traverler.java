package com.example.findguide.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "traveler")
public class Traverler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer travelId;
    private String userid;

    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
