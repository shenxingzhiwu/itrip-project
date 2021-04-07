package com.cskt.service.impl;

import com.cskt.entity.ItripHotelTradingArea;
import com.cskt.mapper.ItripHotelTradingAreaMapper;
import com.cskt.service.ItripHotelTradingAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripHotelTradingAreaServiceImpl implements ItripHotelTradingAreaService{

    @Resource
    private ItripHotelTradingAreaMapper itripHotelTradingAreaMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripHotelTradingAreaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripHotelTradingArea record) {
        return itripHotelTradingAreaMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripHotelTradingArea record) {
        return itripHotelTradingAreaMapper.insertSelective(record);
    }

    @Override
    public ItripHotelTradingArea selectByPrimaryKey(Long id) {
        return itripHotelTradingAreaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripHotelTradingArea record) {
        return itripHotelTradingAreaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripHotelTradingArea record) {
        return itripHotelTradingAreaMapper.updateByPrimaryKey(record);
    }

}
