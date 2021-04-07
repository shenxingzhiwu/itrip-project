package com.cskt.service.impl;

import com.cskt.entity.ItripLabelDic;
import com.cskt.mapper.ItripLabelDicMapper;
import com.cskt.service.ItripLabelDicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripLabelDicServiceImpl implements ItripLabelDicService{

    @Resource
    private ItripLabelDicMapper itripLabelDicMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripLabelDicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripLabelDic record) {
        return itripLabelDicMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripLabelDic record) {
        return itripLabelDicMapper.insertSelective(record);
    }

    @Override
    public ItripLabelDic selectByPrimaryKey(Long id) {
        return itripLabelDicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripLabelDic record) {
        return itripLabelDicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripLabelDic record) {
        return itripLabelDicMapper.updateByPrimaryKey(record);
    }

}
