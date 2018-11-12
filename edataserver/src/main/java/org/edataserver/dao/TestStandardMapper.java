package org.edataserver.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.edataserver.entity.GetStandardList;
import org.edataserver.model.TestStandard;
@Mapper
public interface TestStandardMapper {
    int deleteByPrimaryKey(String standardId);

    int insert(TestStandard record);

    int insertSelective(TestStandard record);

    TestStandard selectByPrimaryKey(String standardId);

    int updateByPrimaryKeySelective(TestStandard record);

    int updateByPrimaryKey(TestStandard record);

	List<Map<String,Object>> getAllStandards();

	//20181107-wh
	int input(TestStandard testStandard);

	List<Map<String, Object>> getStandardList(GetStandardList getStandardList);
	//20181108-wh
	List<Map<String, Object>> getStandardById(@Param("standardId")String standardId);


    
}