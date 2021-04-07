package com.cskt.mapper;

import com.cskt.entity.ItripProductStore;

public interface ItripProductStoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripProductStore record);

    int insertSelective(ItripProductStore record);

    ItripProductStore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripProductStore record);

    int updateByPrimaryKey(ItripProductStore record);
}