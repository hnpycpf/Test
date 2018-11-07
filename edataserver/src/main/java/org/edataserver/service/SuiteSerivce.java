package org.edataserver.service;


import java.util.Map;

import org.edataserver.model.Suite;

public interface SuiteSerivce {
	Map<String, Object> input(Suite suite);

}
