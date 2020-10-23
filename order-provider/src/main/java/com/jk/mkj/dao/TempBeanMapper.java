package com.jk.mkj.dao;

import com.jk.mkj.entity.TempBean;

public interface TempBeanMapper {
    int deleteByPrimaryKey(Integer tempId);

    int insert(TempBean record);

    int insertSelective(TempBean record);

    TempBean selectByPrimaryKey(Integer tempId);

    int updateByPrimaryKeySelective(TempBean record);

    int updateByPrimaryKey(TempBean record);
}