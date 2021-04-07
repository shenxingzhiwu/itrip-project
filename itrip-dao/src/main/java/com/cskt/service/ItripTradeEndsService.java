package com.cskt.service;

import com.cskt.entity.ItripTradeEnds;

public interface ItripTradeEndsService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripTradeEnds record);

    int insertSelective(ItripTradeEnds record);

    ItripTradeEnds selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripTradeEnds record);

    int updateByPrimaryKey(ItripTradeEnds record);

}
