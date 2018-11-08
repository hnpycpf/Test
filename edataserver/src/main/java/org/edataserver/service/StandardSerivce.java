package org.edataserver.service;


import java.util.Map;

import org.edataserver.entity.GetStandardList;
import org.edataserver.model.TestStandard;

public interface StandardSerivce {
    Map<String, Object> getAllStandards();

	Map<String, Object> input(TestStandard testStandard);

	Map<String, Object> getStandardTypeList();

	Map<String, Object> getStandardList(GetStandardList getStandardList);
	
}
