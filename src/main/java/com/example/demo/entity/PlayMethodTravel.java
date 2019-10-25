package com.example.demo.entity;

import java.io.Serializable;

public class PlayMethodTravel implements Serializable {
    private Integer id;

    private Integer playMethodId;

    private Integer travelId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayMethodId() {
        return playMethodId;
    }

    public void setPlayMethodId(Integer playMethodId) {
        this.playMethodId = playMethodId;
    }

    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }
}