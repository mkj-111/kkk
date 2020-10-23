package com.jk.mkj.service;

import com.jk.mkj.entity.OrderBean;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/10/22
 */
public interface OrderService {

    List<OrderBean> findall();

    void deleteorder(Integer id);

    OrderBean findbyid(Integer id);

    void add(OrderBean order);
}
