package org.edataserver.service;


import java.util.List;
import java.util.Map;

public interface GeneralTestSerivce {
	/**
	 * input
	 */
	Map<String, Object> input(String testMode,String testName,String testType,String testSkill,String testContent,List<String> standard);
}
