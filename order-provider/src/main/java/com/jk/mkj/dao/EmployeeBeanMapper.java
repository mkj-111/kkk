package com.jk.mkj.dao;

import com.jk.mkj.entity.EmployeeBean;

public interface EmployeeBeanMapper {
    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeBean record);

    int insertSelective(EmployeeBean record);

    EmployeeBean selectByPrimaryKey(Integer employeeId);

    int updateByPrimaryKeySelective(EmployeeBean record);

    int updateByPrimaryKey(EmployeeBean record);
}