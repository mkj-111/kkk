package com.jk.mkj.controller;

import com.jk.mkj.entity.OrderBean;
import com.jk.mkj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 毛康健
 * @description 订单
 * @create 2020/10/22
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    //查询
    @RequestMapping("findall")
    public List<OrderBean>findall(){
        return orderService.findall();
    }

    //删除
    @RequestMapping("deleteorder")
    public void deleteorder(@RequestParam Integer id){
        orderService.deleteorder(id);
    }

    //回显
    @RequestMapping("findbyid")
    public OrderBean findbyid(@RequestParam Integer id){
        return orderService.findbyid(id);
    }

    //新增
    @RequestMapping("add")
    public void add(@RequestBody OrderBean order){
        orderService.add(order);
    }

}
