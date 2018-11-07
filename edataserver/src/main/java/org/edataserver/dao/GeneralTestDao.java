package org.edataserver.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface GeneralTestDao {
	/**
	 * input
	 */
	List<Map<String, Object>> input(String testMode,String testName,String testType,String testSkill,String testContent);
	
}
