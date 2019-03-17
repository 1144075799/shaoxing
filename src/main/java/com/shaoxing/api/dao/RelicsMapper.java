package com.shaoxing.api.dao;

import com.shaoxing.api.domain.Relics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RelicsMapper {

    /**
     * 返回所有文物信息
     * @return
     */
    List<Relics> findAllRelics();

    /**
     *查找指定的名人
     * @return
     */
    Relics findOneRelics(@Param(value = "title") String title);

    /**
     * 模糊查询
     * @param title
     * @return
     */
    List<Relics> fuzzyFindRelics(@Param(value = "title") String title);


}
