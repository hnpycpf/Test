package org.edataserver.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.edataserver.entity.Performance;

import java.util.List;
import java.util.Map;

@Mapper
public interface PerformanceDao {
	/**
	 * getTestTotal
	 * @param performance
	 * @return
	 */
	public List<Map<String, Object>> getTestTotal(Performance performance);
}
