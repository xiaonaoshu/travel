package com.example.demo.mapper;

import com.example.demo.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 测试Mybatis
 */
@Repository
public interface TravelMapper {

    int addTravel(@Param("travel") Travel travel) throws Exception;

    int addPlayMethodTravel(List<PlayMethodTravel> playMethodTravels) throws Exception;

    int addSeasonInTravels(List<SeasonInTravel> seasonInTravels) throws Exception;

    int addTitleCatalogTravel(@Param("titleCatalogTravel") TitleCatalogTravel titleCatalogTravel) throws Exception;

    int addTitleDetails(@Param("titleDetails1") TitleDetails titleDetails1) throws Exception;

    void addTitleTextImgs(List<TitleTextImg> titleTextImgs) throws Exception;

}
