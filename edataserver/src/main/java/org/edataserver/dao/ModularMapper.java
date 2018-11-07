package org.edataserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.model.Modular;
@Mapper
public interface ModularMapper {
    int deleteByPrimaryKey(String modularId);

    int insert(Modular record);

    int insertSelective(Modular record);

    Modular selectByPrimaryKey(String modularId);

    int updateByPrimaryKeySelective(Modular record);

    int updateByPrimaryKey(Modular record);
}