package com.shaoxing.api.dao;

import com.shaoxing.api.domain.Celebrity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CelebrityMapper {

    /**
     * 返回所有的名人信息
     * @return
     */
    List<Celebrity> findAllCelebrity();

    /**
     *查找指定的名人
     * @return
     */
    Celebrity findOneCelebrity(@Param(value = "name") String name);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    List<Celebrity> fuzzyFindCelebrity(@Param(value = "name") String name);
}
