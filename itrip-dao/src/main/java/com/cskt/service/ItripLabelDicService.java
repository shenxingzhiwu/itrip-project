package com.cskt.service;

import com.cskt.entity.ItripLabelDic;

public interface ItripLabelDicService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripLabelDic record);

    int insertSelective(ItripLabelDic record);

    ItripLabelDic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripLabelDic record);

    int updateByPrimaryKey(ItripLabelDic record);

}
