package com.cskt.service;

import com.cskt.entity.ItripHotelExtendProperty;

public interface ItripHotelExtendPropertyService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelExtendProperty record);

    int insertSelective(ItripHotelExtendProperty record);

    ItripHotelExtendProperty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripHotelExtendProperty record);

    int updateByPrimaryKey(ItripHotelExtendProperty record);

}
