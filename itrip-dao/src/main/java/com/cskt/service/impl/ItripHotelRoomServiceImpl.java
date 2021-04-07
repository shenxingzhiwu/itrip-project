package com.cskt.service.impl;

import com.cskt.entity.ItripHotelRoom;
import com.cskt.mapper.ItripHotelRoomMapper;
import com.cskt.service.ItripHotelRoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItripHotelRoomServiceImpl implements ItripHotelRoomService {

    @Resource
    private ItripHotelRoomMapper itripHotelRoomMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripHotelRoomMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripHotelRoom record) {
        return itripHotelRoomMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripHotelRoom record) {
        return itripHotelRoomMapper.insertSelective(record);
    }

    @Override
    public ItripHotelRoom selectByPrimaryKey(Long id) {
        return itripHotelRoomMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripHotelRoom record) {
        return itripHotelRoomMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripHotelRoom record) {
        return itripHotelRoomMapper.updateByPrimaryKey(record);
    }

}
