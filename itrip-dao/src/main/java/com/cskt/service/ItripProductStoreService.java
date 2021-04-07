package com.cskt.service;

import com.cskt.entity.ItripProductStore;

public interface ItripProductStoreService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripProductStore record);

    int insertSelective(ItripProductStore record);

    ItripProductStore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripProductStore record);

    int updateByPrimaryKey(ItripProductStore record);

}
