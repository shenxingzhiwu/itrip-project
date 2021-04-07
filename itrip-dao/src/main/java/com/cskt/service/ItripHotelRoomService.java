package com.cskt.service;

import com.cskt.entity.ItripHotelRoom;

public interface ItripHotelRoomService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelRoom record);

    int insertSelective(ItripHotelRoom record);

    ItripHotelRoom selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotelRoom record);

    int updateByPrimaryKey(ItripHotelRoom record);

}
