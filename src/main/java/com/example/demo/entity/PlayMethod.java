package com.example.demo.entity;

import java.io.Serializable;

public class PlayMethod implements Serializable {
    private Integer id;

    private String playMethodName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayMethodName() {
        return playMethodName;
    }

    public void setPlayMethodName(String playMethodName) {
        this.playMethodName = playMethodName == null ? null : playMethodName.trim();
    }
}