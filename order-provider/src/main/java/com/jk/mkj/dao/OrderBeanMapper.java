package com.jk.mkj.dao;

import com.jk.mkj.entity.OrderBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderBeanMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderBean record);

    int insertSelective(OrderBean record);

    OrderBean selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderBean record);

    int updateByPrimaryKey(OrderBean record);

    List<OrderBean> findall();
}