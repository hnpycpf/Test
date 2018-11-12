package org.edataserver.dao;

import java.util.Date;
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

	void input(TestInfoVO testStandardVO);

	List<Map<String, Object>> getList(GetList getList);

	org.edataserver.model.TestInfoVO getDetail(@Param("testId")String testId);
	//wh
	List<Map<String, Object>> getResult(@Param("testId")String testId);

	org.edataserver.model.TestInfoVO GeneralTestgetDetail(@Param("testId")String testId);


	List<Map<String, Object>> getTestList(@Param("userId")String userId, @Param("testType")String testType, @Param("startDate")Date startDate, @Param("endDate")Date endDate, @Param("keyWord")String keyWord,
			@Param("testMode")String testMode);
}