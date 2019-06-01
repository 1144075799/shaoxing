package com.shaoxing.api.controller;

import com.shaoxing.api.domain.Commodity;
import com.shaoxing.api.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommodityController {
    @Autowired
    private CommodityServiceImpl commodityService;

    /**获取所有数据**/
    @CrossOrigin
    @RequestMapping(value = "/getCommodity",method = RequestMethod.GET)
    public List<Commodity> getCommodity(){
        System.out.println("发起请求");
        List<Commodity> commodities=commodityService.findAllMessage();
        return commodities;
    }
}
