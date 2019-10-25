package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

public class TitleDetails implements Serializable {
    private Integer id;

    private Integer titleCatalogTravelId;

    private String desc;

    //辅助字段
    private List<TitleTextImg> titleTextImgs;

    private static final long serialVersionUID = 1L;

    public List<TitleTextImg> getTitleTextImgs() {
        return titleTextImgs;
    }

    public void setTitleTextImgs(List<TitleTextImg> titleTextImgs) {
        this.titleTextImgs = titleTextImgs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTitleCatalogTravelId() {
        return titleCatalogTravelId;
    }

    public void setTitleCatalogTravelId(Integer titleCatalogTravelId) {
        this.titleCatalogTravelId = titleCatalogTravelId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}