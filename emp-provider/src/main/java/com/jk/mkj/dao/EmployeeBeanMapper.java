package com.jk.mkj.dao;

import com.jk.mkj.entity.EmployeeBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeBeanMapper {
    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeBean record);

    int insertSelective(EmployeeBean record);

    EmployeeBean selectByPrimaryKey(Integer employeeId);

    int updateByPrimaryKeySelective(EmployeeBean record);

    int updateByPrimaryKey(EmployeeBean record);

    List<EmployeeBean> select();
}