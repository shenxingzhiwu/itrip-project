package com.cskt.service.impl;

import com.cskt.entity.ItripUser;
import com.cskt.mapper.ItripUserMapper;
import com.cskt.service.ItripUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripUserServiceImpl implements ItripUserService{

    @Resource
    private ItripUserMapper itripUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripUser record) {
        return itripUserMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripUser record) {
        return itripUserMapper.insertSelective(record);
    }

    @Override
    public ItripUser selectByPrimaryKey(Long id) {
        return itripUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripUser record) {
        return itripUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripUser record) {
        return itripUserMapper.updateByPrimaryKey(record);
    }

}
