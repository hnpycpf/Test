package org.edataserver.service;


import java.util.Map;

import org.edataserver.model.TestStandard;

public interface StandardSerivce {

	Map<String, Object> input(TestStandard testStandard);

	Map<String, Object> getStandardTypeList();

	Map<String, Object> getAllStandards();

}
