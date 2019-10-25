package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.mapper.TravelMapper;
import com.example.demo.service.ITravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class TravelService implements ITravelService {

    @Autowired
    private TravelMapper travelMapper;

    public int addTravel(Travel travel) throws Exception {
        int i;
        //设置默认值点赞，评论，收藏
        travel.setPraisePoints(0);
        travel.setCollectionNumber(0);
        travel.setCommentNumber(0);
        travel.setShareNumber(0);
        //设置默认状态为审核中 0审核中，1审核通过
        travel.setTravelState(0);
        //设置旅拍的浏览量
        travel.setBrowseVolume(0);
        try {
            i = travelMapper.addTravel(travel);
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 5001;
        }
        //添加旅拍的玩法的所属资产
        //添加玩法的中间表的字段
        List<PlayMethod> playMethods = travel.getPlayMethods();
        if (playMethods != null && playMethods.size() != 0) {
            List<PlayMethodTravel> playMethodTravels = new ArrayList<>();
            for (PlayMethod playMethod : playMethods) {
                PlayMethodTravel playMethodTravel = new PlayMethodTravel();
                playMethodTravel.setPlayMethodId(playMethod.getId());
                playMethodTravel.setTravelId(travel.getId());
                playMethodTravels.add(playMethodTravel);
            }
            try {
                i = travelMapper.addPlayMethodTravel(playMethodTravels);
            } catch (Exception e) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return 5002;
            }
        }
        //时节中间表
        List<Season> seasons = travel.getSeasons();
        if (seasons != null && seasons.size() != 0) {
            List<SeasonInTravel> seasonInTravels = new ArrayList<>();
            for (Season season : seasons) {
                SeasonInTravel seasonInTravel = new SeasonInTravel();
                seasonInTravel.setSeasonId(season.getId());
                seasonInTravel.setTravelId(travel.getId());
                seasonInTravels.add(seasonInTravel);
            }
            try {
                i = travelMapper.addSeasonInTravels(seasonInTravels);
            } catch (Exception e) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return 5003;
            }
        }
        //获取目录表格
        List<TitleCatalogTravel> titleCatalogTravels = travel.getTitleCatalogTravels();
        if (titleCatalogTravels != null && titleCatalogTravels.size() != 0) {
            for (TitleCatalogTravel titleCatalogTravel : titleCatalogTravels) {
                //遍历出所有的目录的集合
                titleCatalogTravel.setTravelId(travel.getId());
                //将数据插入到数据库中并自动生成id
                try {
                    i = travelMapper.addTitleCatalogTravel(titleCatalogTravel);
                } catch (Exception e) {
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    return 5004;
                }
                List<TitleDetails> titleDetails = titleCatalogTravel.getTitleDetails();
                if (titleDetails != null && titleDetails.size() != 0) {
                    for (TitleDetails titleDetails1 : titleDetails) {
                        titleDetails1.setTitleCatalogTravelId(titleCatalogTravel.getId());
                        try {
                            i = travelMapper.addTitleDetails(titleDetails1);
                        } catch (Exception e) {
                            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                            return 5005;
                        }
                        List<TitleTextImg> titleTextImgs = titleDetails1.getTitleTextImgs();
                        if (titleTextImgs != null && titleTextImgs.size() != 0) {
                            for (TitleTextImg titleTextImg : titleTextImgs) {
                                titleTextImg.setTitleDetailsId(titleDetails1.getId());
                            }
                            try {
                                travelMapper.addTitleTextImgs(titleTextImgs);
                            } catch (Exception e) {
                                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                                return 5006;
                            }
                        }
                    }
                }
            }
        }
        return 2000;
    }

}
