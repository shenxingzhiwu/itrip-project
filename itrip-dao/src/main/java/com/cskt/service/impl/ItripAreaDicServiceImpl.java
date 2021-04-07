package com.cskt.service.impl;

import com.cskt.entity.ItripAreaDic;
import com.cskt.mapper.ItripAreaDicMapper;
import com.cskt.service.ItripAreaDicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripAreaDicServiceImpl implements ItripAreaDicService{

    @Resource
    private ItripAreaDicMapper itripAreaDicMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripAreaDicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripAreaDic record) {
        return itripAreaDicMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripAreaDic record) {
        return itripAreaDicMapper.insertSelective(record);
    }

    @Override
    public ItripAreaDic selectByPrimaryKey(Long id) {
        return itripAreaDicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripAreaDic record) {
        return itripAreaDicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripAreaDic record) {
        return itripAreaDicMapper.updateByPrimaryKey(record);
    }

}
