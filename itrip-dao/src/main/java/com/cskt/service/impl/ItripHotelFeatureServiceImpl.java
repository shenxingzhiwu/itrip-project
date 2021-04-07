package com.cskt.service.impl;

import com.cskt.entity.ItripHotelFeature;
import com.cskt.mapper.ItripHotelFeatureMapper;
import com.cskt.service.ItripHotelFeatureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripHotelFeatureServiceImpl implements ItripHotelFeatureService{

    @Resource
    private ItripHotelFeatureMapper itripHotelFeatureMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripHotelFeatureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripHotelFeature record) {
        return itripHotelFeatureMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripHotelFeature record) {
        return itripHotelFeatureMapper.insertSelective(record);
    }

    @Override
    public ItripHotelFeature selectByPrimaryKey(Long id) {
        return itripHotelFeatureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripHotelFeature record) {
        return itripHotelFeatureMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripHotelFeature record) {
        return itripHotelFeatureMapper.updateByPrimaryKey(record);
    }

}
