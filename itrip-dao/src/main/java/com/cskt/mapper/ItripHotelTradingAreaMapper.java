package com.cskt.mapper;

import com.cskt.entity.ItripHotelTradingArea;

public interface ItripHotelTradingAreaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelTradingArea record);

    int insertSelective(ItripHotelTradingArea record);

    ItripHotelTradingArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotelTradingArea record);

    int updateByPrimaryKey(ItripHotelTradingArea record);
}