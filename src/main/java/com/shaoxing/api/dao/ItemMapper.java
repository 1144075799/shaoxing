package com.shaoxing.api.dao;

import com.shaoxing.api.domain.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {


    /**
     * 返回所有的项目
     * @return
     */
    List<Item> findAllItem();




}
