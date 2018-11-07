package org.edataserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.model.Suite;
@Mapper
public interface SuiteMapper {
    int deleteByPrimaryKey(String id);

    int insert(Suite record);

    int insertSelective(Suite record);

    Suite selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Suite record);

    int updateByPrimaryKeyWithBLOBs(Suite record);

    int updateByPrimaryKey(Suite record);
}