package com.jk.mkj.controller;

import com.jk.mkj.entity.OrderBean;
import com.jk.mkj.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 毛康健
 * @description 订单
 * @create 2020/10/22
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;


    //查询
    @RequestMapping("findall")
    @HystrixCommand(fallbackMethod = "selectfail")
    public String findall(Model model){
        List<OrderBean> list = orderService.findall();
        model.addAttribute("order",list);
        return "order/ordershow";
    }
    public String selectfail(Model model){
        return "error/error";
    }

    //删除
    @RequestMapping("deletebyid")
    @HystrixCommand(fallbackMethod = "deletefail")
    public String deletebyid(Integer id){
        orderService.deleteorder(id);
        return "redirect:findall";
    }
    public String deletefail(Integer id){
        return "error/error";
    }

    //回显
    @RequestMapping("findbyid")
    @HystrixCommand(fallbackMethod = "findfail")
    public String findbyid(Integer id,Model model){
        OrderBean order = orderService.findbyid(id);
        model.addAttribute("order",order);
        return "order/addorder";
    }
    public String findfail(Integer id,Model model){
        return "error/error";
    }
    //新增
    @RequestMapping("add")
    @HystrixCommand(fallbackMethod = "addfail")
    public String add(OrderBean order){
        orderService.add(order);
        return "redirect:findall";
    }
    public String addfail(OrderBean order){
        return "error/error";
    }
    //跳转新增
    @RequestMapping("toadd")
    public String toadd(Model model){
        model.addAttribute("order",new OrderBean());
        return "order/addorder";
    }

    //跳转员工
    @RequestMapping("toemp")
    public String toemp(){
        return "emp/empshow";
    }
}
