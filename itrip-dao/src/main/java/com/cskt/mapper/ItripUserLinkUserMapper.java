package com.cskt.mapper;

import com.cskt.entity.ItripUserLinkUser;

public interface ItripUserLinkUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripUserLinkUser record);

    int insertSelective(ItripUserLinkUser record);

    ItripUserLinkUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripUserLinkUser record);

    int updateByPrimaryKey(ItripUserLinkUser record);
}