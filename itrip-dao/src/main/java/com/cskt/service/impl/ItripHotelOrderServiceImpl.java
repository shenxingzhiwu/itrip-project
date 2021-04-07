package com.cskt.service.impl;

import com.cskt.entity.ItripHotelOrder;
import com.cskt.mapper.ItripHotelOrderMapper;
import com.cskt.service.ItripHotelOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripHotelOrderServiceImpl implements ItripHotelOrderService{

    @Resource
    private ItripHotelOrderMapper itripHotelOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripHotelOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripHotelOrder record) {
        return itripHotelOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripHotelOrder record) {
        return itripHotelOrderMapper.insertSelective(record);
    }

    @Override
    public ItripHotelOrder selectByPrimaryKey(Long id) {
        return itripHotelOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripHotelOrder record) {
        return itripHotelOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripHotelOrder record) {
        return itripHotelOrderMapper.updateByPrimaryKey(record);
    }

}
