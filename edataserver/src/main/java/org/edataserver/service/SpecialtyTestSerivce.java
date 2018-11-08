package org.edataserver.service;


import java.util.List;
import java.util.Map;

import org.edataserver.entity.GetList;

public interface SpecialtyTestSerivce {
    Map<String, Object> getAllStandards();

	Map<String, Object> getList(GetList getList);

	Map<String, Object> getDetail(String testId);

}
