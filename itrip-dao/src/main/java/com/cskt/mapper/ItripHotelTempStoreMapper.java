package com.cskt.mapper;

import com.cskt.entity.ItripHotelTempStore;

public interface ItripHotelTempStoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelTempStore record);

    int insertSelective(ItripHotelTempStore record);

    ItripHotelTempStore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotelTempStore record);

    int updateByPrimaryKey(ItripHotelTempStore record);
}