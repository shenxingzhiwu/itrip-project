package com.cskt.service;

import com.cskt.entity.ItripHotelFeature;

public interface ItripHotelFeatureService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelFeature record);

    int insertSelective(ItripHotelFeature record);

    ItripHotelFeature selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotelFeature record);

    int updateByPrimaryKey(ItripHotelFeature record);

}
