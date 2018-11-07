package org.edataserver.service;


import java.util.List;
import java.util.Map;

import org.edataserver.model.StandardInfo;
import org.edataserver.model.TestStandard;

public interface GeneralTestSerivce {
	/**
	 * input
	 */
	List<TestStandard> getAllStandards();
}
