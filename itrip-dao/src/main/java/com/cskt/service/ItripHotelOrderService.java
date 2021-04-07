package com.cskt.service;

import com.cskt.entity.ItripHotelOrder;

public interface ItripHotelOrderService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelOrder record);

    int insertSelective(ItripHotelOrder record);

    ItripHotelOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotelOrder record);

    int updateByPrimaryKey(ItripHotelOrder record);

}
