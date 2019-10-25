package com.example.demo.entity;

import java.io.Serializable;

public class TitleTextImg implements Serializable {
    private Integer id;

    private String describe;

    private Integer state;

    private Double width;

    private Double height;

    private String img;

    private String txt;

    private Integer titleDetailsId;

    private  Integer travelExperienceId;

    private Integer position;

    private Integer positionState;

    private String address;

    private String strategy;


    private static final long serialVersionUID = 1L;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPositionState() {
        return positionState;
    }

    public void setPositionState(Integer positionState) {
        this.positionState = positionState;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getTitleDetailsId() {
        return titleDetailsId;
    }

    public Integer getTravelExperienceId() {
        return travelExperienceId;
    }

    public void setTravelExperienceId(Integer travelExperienceId) {
        this.travelExperienceId = travelExperienceId;
    }

    public void setTitleDetailsId(Integer titleDetailsId) {
        this.titleDetailsId = titleDetailsId;
    }
}