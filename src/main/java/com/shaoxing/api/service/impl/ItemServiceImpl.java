package com.shaoxing.api.service.impl;

import com.shaoxing.api.dao.ItemMapper;
import com.shaoxing.api.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemMapper{
    @Autowired
    private ItemMapper itemMapper;

    /**返回所有的项目**/
    @Override
    public List<Item> findAllItem(){
        return itemMapper.findAllItem();
    }



}
