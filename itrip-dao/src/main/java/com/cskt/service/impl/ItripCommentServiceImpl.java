package com.cskt.service.impl;

import com.cskt.entity.ItripComment;
import com.cskt.mapper.ItripCommentMapper;
import com.cskt.service.ItripCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripCommentServiceImpl implements ItripCommentService{

    @Resource
    private ItripCommentMapper itripCommentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripComment record) {
        return itripCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripComment record) {
        return itripCommentMapper.insertSelective(record);
    }

    @Override
    public ItripComment selectByPrimaryKey(Long id) {
        return itripCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripComment record) {
        return itripCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripComment record) {
        return itripCommentMapper.updateByPrimaryKey(record);
    }

}
