package org.edataserver.dao;

import org.edataserver.entity.Modular;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface ModularDao {
	public List<Map<String, Object>> getAllStandards();
}
