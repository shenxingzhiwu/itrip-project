package com.cskt.service;

import com.cskt.entity.ItripOrderLinkUser;

public interface ItripOrderLinkUserService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripOrderLinkUser record);

    int insertSelective(ItripOrderLinkUser record);

    ItripOrderLinkUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripOrderLinkUser record);

    int updateByPrimaryKey(ItripOrderLinkUser record);

}
