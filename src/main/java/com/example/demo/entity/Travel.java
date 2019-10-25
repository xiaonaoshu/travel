package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class Travel implements Serializable {
    private Integer id;

    private Long departureTime;

    private Integer daysOfPlay;

    private Double perCapita;

    private String cover;

    private Double coverHight;

    private Double coverWidth;

    private String captionTitle;

    private Integer userId;

    private Integer praisePoints;

    private Integer collectionNumber;

    private Integer commentNumber;

    private Integer character;

    private Integer travelState;

    private Integer browseVolume;

    private String userName;

    private String userPhoto;

    private Integer userVip;

    private Integer shareNumber;

    private String address;

    private static final long serialVersionUID = 1L;

    //辅助字段
    //玩法的集合
    private List<PlayMethod> playMethods;
    //时节的集合
    private List<Season> seasons;
    //目录的集合
    private List<TitleCatalogTravel> titleCatalogTravels;

    private  List<ScenicSpot> scenicSpots;
}