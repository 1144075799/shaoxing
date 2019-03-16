package com.shaoxing.api.controller;

import com.shaoxing.api.domain.Item;
import com.shaoxing.api.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;

    /**获取活动**/
    @CrossOrigin
    @RequestMapping(value = "/getActivity",method = RequestMethod.GET)
    public List<Item> getActivity(){
        List<Item> item=itemService.findAllItem();
        return item;
    }


}
