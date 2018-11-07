package org.edataserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.model.testStandard;
@Mapper
public interface TestStandardMapper {
    int deleteByPrimaryKey(String standardId);

    int insert(testStandard record);

    int insertSelective(testStandard record);

    testStandard selectByPrimaryKey(String standardId);

    int updateByPrimaryKeySelective(testStandard record);

    int updateByPrimaryKey(testStandard record);
}