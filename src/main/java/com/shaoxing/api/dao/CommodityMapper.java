package com.shaoxing.api.dao;

import com.shaoxing.api.domain.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper {

    /**
     * 返回所有的数据
     */
    List<Commodity> findAllMessage();
}
