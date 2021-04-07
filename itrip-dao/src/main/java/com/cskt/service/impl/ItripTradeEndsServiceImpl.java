package com.cskt.service.impl;

import com.cskt.entity.ItripTradeEnds;
import com.cskt.mapper.ItripTradeEndsMapper;
import com.cskt.service.ItripTradeEndsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripTradeEndsServiceImpl implements ItripTradeEndsService{

    @Resource
    private ItripTradeEndsMapper itripTradeEndsMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripTradeEndsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripTradeEnds record) {
        return itripTradeEndsMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripTradeEnds record) {
        return itripTradeEndsMapper.insertSelective(record);
    }

    @Override
    public ItripTradeEnds selectByPrimaryKey(Long id) {
        return itripTradeEndsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripTradeEnds record) {
        return itripTradeEndsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripTradeEnds record) {
        return itripTradeEndsMapper.updateByPrimaryKey(record);
    }

}
