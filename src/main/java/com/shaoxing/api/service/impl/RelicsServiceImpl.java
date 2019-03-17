package com.shaoxing.api.service.impl;

import com.shaoxing.api.dao.RelicsMapper;
import com.shaoxing.api.domain.Relics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class RelicsServiceImpl implements RelicsMapper {
    @Autowired
    private RelicsMapper relicsMapper;

    /**返回所有文物信息**/
    @Override
    public List<Relics> findAllRelics(){
        return relicsMapper.findAllRelics();
    }

    /**查找指定的名人**/
    @Override
    public Relics findOneRelics(String title){
        return relicsMapper.findOneRelics(title);
    }

    /**模糊查询**/
    @Override
    public List<Relics> fuzzyFindRelics(String title){
        return relicsMapper.fuzzyFindRelics(title);
    }
}
