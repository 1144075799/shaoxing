package com.shaoxing.api.service.impl;

import com.shaoxing.api.dao.CommodityMapper;
import com.shaoxing.api.domain.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityMapper {

    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> findAllMessage() {
        return commodityMapper.findAllMessage();
    }
}
