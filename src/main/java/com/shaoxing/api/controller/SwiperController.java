package com.shaoxing.api.controller;

import com.shaoxing.api.domain.Swiper;
import com.shaoxing.api.service.impl.SwiperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SwiperController {
    @Autowired
    private SwiperServiceImpl swiperService;

    /**获取所有水池轮播图**/
    @CrossOrigin
    @RequestMapping(value = "/getWaterSwiper",method = RequestMethod.GET)
    public List<Swiper> getWaterSwiper(){
        List<Swiper> swipers=swiperService.findAllWater();
        return swipers;
    }

    /**获取所有古城的信息**/
    @CrossOrigin
    @RequestMapping(value = "/getAncientSwiper",method = RequestMethod.GET)
    public List<Swiper> getAncientSwiper(){
        List<Swiper> swipers=swiperService.findAllAncient();
        return swipers;
    }

}
