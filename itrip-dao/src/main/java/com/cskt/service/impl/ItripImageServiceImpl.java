package com.cskt.service.impl;

import com.cskt.entity.ItripImage;
import com.cskt.mapper.ItripImageMapper;
import com.cskt.service.ItripImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripImageServiceImpl implements ItripImageService{

    @Resource
    private ItripImageMapper itripImageMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripImage record) {
        return itripImageMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripImage record) {
        return itripImageMapper.insertSelective(record);
    }

    @Override
    public ItripImage selectByPrimaryKey(Long id) {
        return itripImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripImage record) {
        return itripImageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripImage record) {
        return itripImageMapper.updateByPrimaryKey(record);
    }

}
