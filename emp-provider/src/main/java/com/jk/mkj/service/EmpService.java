package com.jk.mkj.service;

import com.jk.mkj.entity.EmployeeBean;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/10/22
 */
public interface EmpService {
    List<EmployeeBean> select();

    void deleteemp(Integer id);

    EmployeeBean hui(Integer id);

    void save(EmployeeBean emp);
}
