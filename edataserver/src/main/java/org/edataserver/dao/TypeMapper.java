package org.edataserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.model.Type;
@Mapper
public interface TypeMapper {
    int deleteByPrimaryKey(String typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}