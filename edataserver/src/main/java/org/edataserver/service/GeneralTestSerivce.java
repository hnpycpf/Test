package org.edataserver.service;


import java.util.Date;
import java.util.List;
import java.util.Map;

import org.edataserver.entity.TestInfoVO;
import org.edataserver.model.StandardInfo;
import org.edataserver.model.TestStandard;

import com.alibaba.fastjson.JSONObject;

public interface GeneralTestSerivce {
	/**
	 * input
	 */

	void input(TestInfoVO testStandardVO);

	List<Map<String, Object>> getTestList(String userId, Integer currentPage, Integer rows, String testType,
			Date startDate, Date endDate, String keyWord, String testMode);

	Map<String, Object> getResult(String testId);

	Map<String, Object> getDetail(String testId);
}
