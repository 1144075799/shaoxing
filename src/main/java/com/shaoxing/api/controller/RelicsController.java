package com.shaoxing.api.controller;

import com.shaoxing.api.domain.Relics;
import com.shaoxing.api.service.impl.RelicsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RelicsController {
    @Autowired
    private RelicsServiceImpl relicsService;

    /**获取所有文物的信息**/
    @CrossOrigin
    @RequestMapping(value = "/getRelics",method = RequestMethod.GET)
    public List<Relics> getActivity(){
        List<Relics> relics=relicsService.findAllRelics();
        return relics;
    }

    /**获取指定的名人**/
    @CrossOrigin
    @RequestMapping(value = "/getRelicsInfo",method = RequestMethod.POST)
    public Relics getCelebrityInfo(@RequestBody Relics relics){

        String title=relics.getTitle();        //得到要查找的名人的名字

        relics=relicsService.findOneRelics(title);

        return relics;
    }

    /**模糊查询**/
    @CrossOrigin
    @RequestMapping(value = "/fuzzyFindRelics",method = RequestMethod.POST)
    public List<Relics> fuzzyFindCelebrity(@RequestBody Relics relics){
        String title=relics.getTitle();        //得到要查找的名人的名字


        List<Relics> relicsList=relicsService.fuzzyFindRelics(title);

        return relicsList;
    }
}
