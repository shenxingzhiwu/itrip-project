package com.cskt.service;

import com.cskt.entity.ItripComment;

public interface ItripCommentService{


    int deleteByPrimaryKey(Long id);

    int insert(ItripComment record);

    int insertSelective(ItripComment record);

    ItripComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripComment record);

    int updateByPrimaryKey(ItripComment record);

}
