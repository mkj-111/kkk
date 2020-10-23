package com.jk.mkj.controller;

import com.jk.mkj.entity.EmployeeBean;
import com.jk.mkj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 毛康健
 * @description 员工
 * @create 2020/10/22
 */
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    //查询
    @RequestMapping("select")
    public List<EmployeeBean>select(){
        return empService.select();
    }

    //删除
    @RequestMapping("deleteemp")
    public void deletemp(@RequestParam Integer id){
        empService.deleteemp(id);
    }

    //回显
    @RequestMapping("hui")
    public EmployeeBean hui(@RequestParam Integer id){
        return empService.hui(id);
    }

    //新增
    @RequestMapping("save")
    public void save(@RequestBody EmployeeBean emp){
        empService.save(emp);
    }

}
