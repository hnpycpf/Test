package org.edataserver.service;


import java.util.List;
import java.util.Map;

import org.edataserver.entity.Performance;

public interface PerformanceSerivce {
	Map<String, Object> getTestTotal(Performance performance);

}
