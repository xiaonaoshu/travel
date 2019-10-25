package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

public class TitleCatalogTravel implements Serializable {
    private Integer id;

    private Integer travelId;

    private String titleName;

    private Integer position;

    private String address;

    private String strategy;

    private Integer positionState;

    private Integer travelExperienceId;

    //辅助字段

    private List<TitleDetails> titleDetails;

    private static final long serialVersionUID = 1L;

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPositionState() {
        return positionState;
    }

    public void setPositionState(Integer positionaState) {
        this.positionState = positionaState;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getTravelExperienceId() {
        return travelExperienceId;
    }

    public void setTravelExperienceId(Integer travelExperienceId) {
        this.travelExperienceId = travelExperienceId;
    }

    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public List<TitleDetails> getTitleDetails() {
        return titleDetails;
    }

    public void setTitleDetails(List<TitleDetails> titleDetails) {
        this.titleDetails = titleDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }
}