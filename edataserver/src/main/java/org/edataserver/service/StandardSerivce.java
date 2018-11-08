package org.edataserver.service;


import java.util.Map;

import org.edataserver.entity.GetStandardList;
import org.edataserver.model.TestStandard;

public interface StandardSerivce {

	Map<String, Object> input(TestStandard testStandard);

	Map<String, Object> getStandardTypeList();

	Map<String, Object> getStandardList(GetStandardList getStandardList);

	Map<String, Object> getStandardById(String standardId);

	Map<String, Object> update(TestStandard testStandard);

	Map<String, Object> delete(String standardId);

	Map<String, Object> getAllStandards();

	
}
