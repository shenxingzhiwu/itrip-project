package com.cskt.mapper;

import com.cskt.entity.ItripComment;

public interface ItripCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripComment record);

    int insertSelective(ItripComment record);

    ItripComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripComment record);

    int updateByPrimaryKey(ItripComment record);
}