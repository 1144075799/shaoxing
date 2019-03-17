package com.shaoxing.api.controller;

import com.shaoxing.api.domain.Celebrity;
import com.shaoxing.api.service.impl.CelebrityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CelebrityController {
    @Autowired
    private CelebrityServiceImpl celebrityService;

    /**获取所有名人的信息**/
    @CrossOrigin
    @RequestMapping(value = "/getCelebrity",method = RequestMethod.GET)
    public List<Celebrity> getActivity(){
        List<Celebrity> celebrityList=celebrityService.findAllCelebrity();
        return celebrityList;
    }

    /**获取指定的名人**/
    @CrossOrigin
    @RequestMapping(value = "/getCelebrityInfo",method = RequestMethod.POST)
    public Celebrity getCelebrityInfo(@RequestBody Celebrity celebrity){

        String name=celebrity.getName();        //得到要查找的名人的名字

        celebrity=celebrityService.findOneCelebrity(name);

        return celebrity;
    }

    /**模糊查询**/
    @CrossOrigin
    @RequestMapping(value = "/fuzzyFindCelebrity",method = RequestMethod.POST)
    public List<Celebrity> fuzzyFindCelebrity(@RequestBody Celebrity celebrity){
        String name=celebrity.getName();        //得到要查找的名人的名字

        System.out.println(name);

        List<Celebrity> celebrityList=celebrityService.fuzzyFindCelebrity(name);

        return celebrityList;
    }


}
