package com.shaoxing.api.controller;

import com.shaoxing.api.domain.City;
import com.shaoxing.api.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityServiceImpl cityService;

    /**获取所有古城的信息**/
    @CrossOrigin
    @RequestMapping(value = "/getCity",method = RequestMethod.GET)
    public List<City> getActivity(){
        List<City> cities=cityService.findAllCity();
        return cities;
    }

    /**获取指定的名人**/
    @CrossOrigin
    @RequestMapping(value = "/getCityInfo",method = RequestMethod.POST)
    public City getCelebrityInfo(@RequestBody City city){

        String title=city.getTitle();        //得到要查找的名人的名字

        city=cityService.findOneCity(title);

        return city;
    }

    /**模糊查询**/
    @CrossOrigin
    @RequestMapping(value = "/fuzzyFindCity",method = RequestMethod.POST)
    public List<City> fuzzyFindCelebrity(@RequestBody City city){
        String title=city.getTitle();        //得到要查找的名人的名字


        List<City> cityList=cityService.fuzzyFindCity(title);

        return cityList;
    }
}
