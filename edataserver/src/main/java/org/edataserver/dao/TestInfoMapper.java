package org.edataserver.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.edataserver.entity.GetList;
import org.edataserver.entity.Performance;
import org.edataserver.entity.TestInfoVO;
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
    
    //2018-11-7
    
    List<Map<String, Object>> getTestTotal(Performance performance);

	List<Map<String, Object>> getRank(Performance performance);

	String input(TestInfoVO testStandardVO);

	List<Map<String, Object>> getList(GetList getList);

	List<Map<String, Object>> getDetail(@Param("testId")String testId);
	//wh
	List<Map<String, Object>> getResult(@Param("testId")String testId);

	List<Map<String, Object>> GeneralTestgetDetail(@Param("testId")String testId);
}