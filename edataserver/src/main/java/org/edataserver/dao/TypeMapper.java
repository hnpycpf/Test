package org.edataserver.dao;

import java.util.List;
import java.util.Map;

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

	List<Map<String, Object>> getStandardTypeList();
}