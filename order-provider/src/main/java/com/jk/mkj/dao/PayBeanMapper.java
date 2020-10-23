package com.jk.mkj.dao;

import com.jk.mkj.entity.PayBean;

public interface PayBeanMapper {
    int deleteByPrimaryKey(Integer payId);

    int insert(PayBean record);

    int insertSelective(PayBean record);

    PayBean selectByPrimaryKey(Integer payId);

    int updateByPrimaryKeySelective(PayBean record);

    int updateByPrimaryKey(PayBean record);
}