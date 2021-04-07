package com.cskt.service.impl;

import com.cskt.entity.ItripUserLinkUser;
import com.cskt.mapper.ItripUserLinkUserMapper;
import com.cskt.service.ItripUserLinkUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripUserLinkUserServiceImpl implements ItripUserLinkUserService{

    @Resource
    private ItripUserLinkUserMapper itripUserLinkUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripUserLinkUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripUserLinkUser record) {
        return itripUserLinkUserMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripUserLinkUser record) {
        return itripUserLinkUserMapper.insertSelective(record);
    }

    @Override
    public ItripUserLinkUser selectByPrimaryKey(Long id) {
        return itripUserLinkUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripUserLinkUser record) {
        return itripUserLinkUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripUserLinkUser record) {
        return itripUserLinkUserMapper.updateByPrimaryKey(record);
    }

}
