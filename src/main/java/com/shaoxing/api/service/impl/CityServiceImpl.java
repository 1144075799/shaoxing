package com.shaoxing.api.service.impl;

import com.shaoxing.api.dao.CityMapper;
import com.shaoxing.api.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityMapper {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> findAllCity(){
        return cityMapper.findAllCity();
    }

    /**查找指定的名人**/
    @Override
    public City findOneCity(String title){
        return cityMapper.findOneCity(title);
    }

    /**模糊查询**/
    @Override
    public List<City> fuzzyFindCity(String title){
        return cityMapper.fuzzyFindCity(title);
    }

}
