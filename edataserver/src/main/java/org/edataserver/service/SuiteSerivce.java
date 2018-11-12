package org.edataserver.service;


import java.util.Map;

import org.edataserver.entity.GetSuitList;
import org.edataserver.model.Suite;

public interface SuiteSerivce {
	Map<String, Object> input(Suite suite);

	Map<String, Object> getDetail(String sutiId);

	Map<String, Object> update(Suite suite);

	Map<String, Object> getSuitById(String standardId);

	Map<String, Object> delete(String suitId);

	Map<String, Object> getSuitList(GetSuitList getSuitList);

}
