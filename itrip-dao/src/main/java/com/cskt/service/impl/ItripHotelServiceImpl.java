package com.cskt.service.impl;

import com.cskt.entity.ItripHotel;
import com.cskt.mapper.ItripHotelMapper;
import com.cskt.service.ItripHotelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripHotelServiceImpl implements ItripHotelService{

    @Resource
    private ItripHotelMapper itripHotelMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripHotelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripHotel record) {
        return itripHotelMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripHotel record) {
        return itripHotelMapper.insertSelective(record);
    }

    @Override
    public ItripHotel selectByPrimaryKey(Long id) {
        return itripHotelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripHotel record) {
        return itripHotelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripHotel record) {
        return itripHotelMapper.updateByPrimaryKey(record);
    }

}
