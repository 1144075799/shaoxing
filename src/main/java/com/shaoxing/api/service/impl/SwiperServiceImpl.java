package com.shaoxing.api.service.impl;

import com.shaoxing.api.dao.SwiperMapper;
import com.shaoxing.api.domain.Swiper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwiperServiceImpl implements SwiperMapper {
    @Autowired
    private SwiperMapper swiperMapper;

    @Override
    public List<Swiper> findAllWater(){
        return swiperMapper.findAllWater();
    }

    @Override
    public List<Swiper> findAllAncient(){
        return swiperMapper.findAllAncient();
    }
}
