package org.edataserver.service;


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
	List<TestStandard> getAllStandards();

	JSONObject input(TestInfoVO testStandardVO);
}
