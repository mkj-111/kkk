package com.jk.mkj.service;

import com.jk.mkj.entity.OrderBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/10/22
 */
@FeignClient(value = "orderprovider")
public interface OrderService {

    //查询
    @RequestMapping("findall")
    public List<OrderBean>findall();

    //删除
    @RequestMapping("deleteorder")
    public void deleteorder(@RequestParam Integer id);

    //回显
    @RequestMapping("findbyid")
    public OrderBean findbyid(@RequestParam Integer id);

    //新增
    @RequestMapping("add")
    public void add(@RequestBody OrderBean order);
}
