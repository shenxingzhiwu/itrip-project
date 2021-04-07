package com.cskt.service;

import com.cskt.entity.ItripImage;

public interface ItripImageService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripImage record);

    int insertSelective(ItripImage record);

    ItripImage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripImage record);

    int updateByPrimaryKey(ItripImage record);

}
