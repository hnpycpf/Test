package org.edataserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.edataserver.model.StandardInfo;
@Mapper
public interface StandardInfoMapper {
    int insert(StandardInfo record);

    int insertSelective(StandardInfo record);
}