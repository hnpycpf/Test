package org.edataserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.model.TestInfo;
@Mapper
public interface TestInfoMapper {
    int deleteByPrimaryKey(String testId);

    int insert(TestInfo record);

    int insertSelective(TestInfo record);

    TestInfo selectByPrimaryKey(String testId);

    int updateByPrimaryKeySelective(TestInfo record);

    int updateByPrimaryKeyWithBLOBs(TestInfo record);

    int updateByPrimaryKey(TestInfo record);
}