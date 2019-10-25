package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Travel;
import com.example.demo.service.ITravelService;
import com.example.demo.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


/**
 * 游记
 */
@Controller
@RequestMapping("/travel")
@Transactional
public class TravelController {

    @Autowired
    private ITravelService travelService;

    /**
     * 创建旅拍
     */
    @CrossOrigin
    @RequestMapping(value = "/addTravel", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addTravel(@RequestBody Travel travel) {
        int i = 0;

        try {
            i = travelService.addTravel(travel);
        } catch (Exception e) {
            e.printStackTrace();
            return Utils.getJsonResponse(i);
        }
        return Utils.getJsonResponse(i);
    }


}
