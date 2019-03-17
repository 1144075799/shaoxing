package com.shaoxing.api.dao;

import com.shaoxing.api.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityMapper {

    /**
     * 返回所有古城信息
     * @return
     */
    List<City> findAllCity();

    /**
     *查找指定的名人
     * @return
     */
    City findOneCity(@Param(value = "title") String title);

    /**
     * 模糊查询
     * @param title
     * @return
     */
    List<City> fuzzyFindCity(@Param(value = "title") String title);
}
