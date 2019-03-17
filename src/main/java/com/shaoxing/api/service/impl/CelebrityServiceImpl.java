package com.shaoxing.api.service.impl;

import com.shaoxing.api.dao.CelebrityMapper;
import com.shaoxing.api.domain.Celebrity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelebrityServiceImpl implements CelebrityMapper {
    @Autowired
    private CelebrityMapper celebrityMapper;

    /**返回所有的名人信息**/
    @Override
    public List<Celebrity> findAllCelebrity(){
        return celebrityMapper.findAllCelebrity();
    }

    /**查找指定的名人**/
    @Override
    public Celebrity findOneCelebrity(String name){
        return celebrityMapper.findOneCelebrity(name);
    }

    /**模糊查询**/
    @Override
    public Celebrity fuzzyFindCelebrity(String name){
        return celebrityMapper.fuzzyFindCelebrity(name);
    }
}
