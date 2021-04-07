package com.cskt.mapper;

import com.cskt.entity.ItripOrderLinkUser;

public interface ItripOrderLinkUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripOrderLinkUser record);

    int insertSelective(ItripOrderLinkUser record);

    ItripOrderLinkUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripOrderLinkUser record);

    int updateByPrimaryKey(ItripOrderLinkUser record);
}