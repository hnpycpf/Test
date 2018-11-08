package org.edataserver.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.entity.TestInfoVO;
import org.edataserver.model.StandardInfo;
@Mapper
public interface StandardInfoMapper {
	
    int insert(StandardInfo record);

    int insertSelective(StandardInfo record);
    /**
     * getAllStandards
     * @return
     */
	List<Map<String, Object>> getAllStandards();

	void input(TestInfoVO testStandardVO);
}