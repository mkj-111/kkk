package com.jk.mkj.service.Impl;

import com.jk.mkj.dao.OrderBeanMapper;
import com.jk.mkj.entity.OrderBean;
import com.jk.mkj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/10/22
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderBeanMapper orderBeanMapper;


    @Override
    public List<OrderBean> findall() {
        return orderBeanMapper.findall();
    }

    @Override
    public void deleteorder(Integer id) {
        orderBeanMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OrderBean findbyid(Integer id) {
        return orderBeanMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(OrderBean order) {
        if(order.getOrderId()==null){
            orderBeanMapper.insert(order);
        }else{
            orderBeanMapper.updateByPrimaryKey(order);
        }
    }
}
