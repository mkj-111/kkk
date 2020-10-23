package com.jk.mkj.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class EmployeeBean {
    private Integer employeeId;

    private String employeeName;

    private Integer employeeTemp;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sdate;

    private Integer employeeJob;

    private String employeeInfo;

    private String empname;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Integer getEmployeeTemp() {
        return employeeTemp;
    }

    public void setEmployeeTemp(Integer employeeTemp) {
        this.employeeTemp = employeeTemp;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Integer getEmployeeJob() {
        return employeeJob;
    }

    public void setEmployeeJob(Integer employeeJob) {
        this.employeeJob = employeeJob;
    }

    public String getEmployeeInfo() {
        return employeeInfo;
    }

    public void setEmployeeInfo(String employeeInfo) {
        this.employeeInfo = employeeInfo == null ? null : employeeInfo.trim();
    }
}