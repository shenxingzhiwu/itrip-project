package com.cskt.service.impl;

import com.cskt.entity.ItripProductStore;
import com.cskt.mapper.ItripProductStoreMapper;
import com.cskt.service.ItripProductStoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripProductStoreServiceImpl implements ItripProductStoreService{

    @Resource
    private ItripProductStoreMapper itripProductStoreMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripProductStoreMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripProductStore record) {
        return itripProductStoreMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripProductStore record) {
        return itripProductStoreMapper.insertSelective(record);
    }

    @Override
    public ItripProductStore selectByPrimaryKey(Long id) {
        return itripProductStoreMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripProductStore record) {
        return itripProductStoreMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripProductStore record) {
        return itripProductStoreMapper.updateByPrimaryKey(record);
    }

}
