package com.cskt.service;

import com.cskt.entity.ItripAreaDic;

public interface ItripAreaDicService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripAreaDic record);

    int insertSelective(ItripAreaDic record);

    ItripAreaDic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripAreaDic record);

    int updateByPrimaryKey(ItripAreaDic record);

}
