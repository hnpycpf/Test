package org.edataserver.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.model.TestStandard;
@Mapper
public interface TestStandardMapper {
    int deleteByPrimaryKey(String standardId);

    int insert(TestStandard record);

    int insertSelective(TestStandard record);

    TestStandard selectByPrimaryKey(String standardId);

    int updateByPrimaryKeySelective(TestStandard record);

    int updateByPrimaryKey(TestStandard record);

	List<TestStandard> getAllStandards();

	//20181107-wh
	int input(TestStandard testStandard);
    
}