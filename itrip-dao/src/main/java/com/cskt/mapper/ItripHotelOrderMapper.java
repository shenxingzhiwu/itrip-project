package com.cskt.mapper;

import com.cskt.entity.ItripHotelOrder;

public interface ItripHotelOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelOrder record);

    int insertSelective(ItripHotelOrder record);

    ItripHotelOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotelOrder record);

    int updateByPrimaryKey(ItripHotelOrder record);
}