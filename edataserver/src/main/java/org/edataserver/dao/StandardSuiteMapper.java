package org.edataserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.model.StandardSuite;
@Mapper
public interface StandardSuiteMapper {
    int insert(StandardSuite record);

    int insertSelective(StandardSuite record);
}