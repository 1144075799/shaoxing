package com.shaoxing.api.dao;


import com.shaoxing.api.domain.Swiper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SwiperMapper {


    /**
     * 水城轮播图
     * @return
     */
    List<Swiper> findAllWater();

    /**
     * 古城轮播图
     * @return
     */
    List<Swiper> findAllAncient();
}
