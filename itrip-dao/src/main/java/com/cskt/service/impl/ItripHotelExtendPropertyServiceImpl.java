package com.cskt.service.impl;

import com.cskt.entity.ItripHotelExtendProperty;
import com.cskt.mapper.ItripHotelExtendPropertyMapper;
import com.cskt.service.ItripHotelExtendPropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripHotelExtendPropertyServiceImpl implements ItripHotelExtendPropertyService{

    @Resource
    private ItripHotelExtendPropertyMapper itripHotelExtendPropertyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripHotelExtendPropertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripHotelExtendProperty record) {
        return itripHotelExtendPropertyMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripHotelExtendProperty record) {
        return itripHotelExtendPropertyMapper.insertSelective(record);
    }

    @Override
    public ItripHotelExtendProperty selectByPrimaryKey(Long id) {
        return itripHotelExtendPropertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripHotelExtendProperty record) {
        return itripHotelExtendPropertyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripHotelExtendProperty record) {
        return itripHotelExtendPropertyMapper.updateByPrimaryKey(record);
    }

}
