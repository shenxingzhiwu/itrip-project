package com.cskt.service.impl;

import com.cskt.entity.ItripOrderLinkUser;
import com.cskt.mapper.ItripOrderLinkUserMapper;
import com.cskt.service.ItripOrderLinkUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripOrderLinkUserServiceImpl implements ItripOrderLinkUserService{

    @Resource
    private ItripOrderLinkUserMapper itripOrderLinkUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripOrderLinkUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripOrderLinkUser record) {
        return itripOrderLinkUserMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripOrderLinkUser record) {
        return itripOrderLinkUserMapper.insertSelective(record);
    }

    @Override
    public ItripOrderLinkUser selectByPrimaryKey(Long id) {
        return itripOrderLinkUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripOrderLinkUser record) {
        return itripOrderLinkUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripOrderLinkUser record) {
        return itripOrderLinkUserMapper.updateByPrimaryKey(record);
    }

}
