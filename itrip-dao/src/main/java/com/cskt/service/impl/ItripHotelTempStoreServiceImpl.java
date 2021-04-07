package com.cskt.service.impl;

import com.cskt.entity.ItripHotelTempStore;
import com.cskt.mapper.ItripHotelTempStoreMapper;
import com.cskt.service.ItripHotelTempStoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripHotelTempStoreServiceImpl implements ItripHotelTempStoreService{

    @Resource
    private ItripHotelTempStoreMapper itripHotelTempStoreMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripHotelTempStoreMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripHotelTempStore record) {
        return itripHotelTempStoreMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripHotelTempStore record) {
        return itripHotelTempStoreMapper.insertSelective(record);
    }

    @Override
    public ItripHotelTempStore selectByPrimaryKey(Long id) {
        return itripHotelTempStoreMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripHotelTempStore record) {
        return itripHotelTempStoreMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripHotelTempStore record) {
        return itripHotelTempStoreMapper.updateByPrimaryKey(record);
    }

}
