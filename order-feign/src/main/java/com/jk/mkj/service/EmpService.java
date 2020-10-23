package com.jk.mkj.service;

import com.jk.mkj.entity.EmployeeBean;
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
@FeignClient(value = "empprovider")
public interface EmpService {

    //查询
    @RequestMapping("select")
    public List<EmployeeBean> select();

    //回显
    @RequestMapping("hui")
    public EmployeeBean hui(@RequestParam Integer id);

    //新增
    @RequestMapping("save")
    public void save(@RequestBody EmployeeBean emp);

    //删除
    @RequestMapping("deleteemp")
    public void deleteemp(@RequestParam Integer id);
}
