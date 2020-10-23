package com.jk.mkj.controller;

import com.jk.mkj.entity.EmployeeBean;
import com.jk.mkj.service.EmpService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/10/22
 */
@RestController
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;
    //查询
    @RequestMapping("select")
    @HystrixCommand(fallbackMethod = "selectfail")
    public List select(){
        return empService.select();
    }
    public List selectfail(){
        List<String> strings = new ArrayList<>();
        strings.add("报错");
        return strings;
    }

    @RequestMapping("aaa")
    public String aaa(){
        return "USVB腶";
    }

    //删除
    @RequestMapping("deleteemp")
    public void deletemp(Integer id){
        empService.deleteemp(id);
    }

    //回显
    @RequestMapping("hui")
    public EmployeeBean hui(Integer id){
        return empService.hui(id);
    }

    //新增
    @RequestMapping("save")
    public void save(EmployeeBean emp){
        empService.save(emp);
    }

}
