package com.jk.mkj.service.Impl;

import com.jk.mkj.dao.EmployeeBeanMapper;
import com.jk.mkj.entity.EmployeeBean;
import com.jk.mkj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/10/22
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmployeeBeanMapper employeeBeanMapper;


    @Override
    public List<EmployeeBean> select() {
        return employeeBeanMapper.select();
    }

    @Override
    public void deleteemp(Integer id) {
         employeeBeanMapper.deleteByPrimaryKey(id);
    }

    @Override
    public EmployeeBean hui(Integer id) {
        return employeeBeanMapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(EmployeeBean emp) {
          if(emp.getEmployeeId()!=null){
              employeeBeanMapper.updateByPrimaryKey(emp);
          }else {
              employeeBeanMapper.insert(emp);
          }
    }
}
