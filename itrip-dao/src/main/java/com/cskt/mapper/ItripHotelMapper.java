package com.cskt.mapper;

import com.cskt.entity.ItripHotel;

public interface ItripHotelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotel record);

    int insertSelective(ItripHotel record);

    ItripHotel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotel record);

    int updateByPrimaryKey(ItripHotel record);
}