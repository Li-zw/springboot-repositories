package com.lzw.springbootdemo.service;

import com.lzw.springbootdemo.entity.Employee;

import java.util.List;

/**
 * @Author LZW
 * @Description
 * @Date 2022-04-09 21:14
 * @Version 1.0
 */

public interface EmployeeService {

    /**
     * 查询员工信息列表
     * @return
     */
    List<Employee> queryEmpList();

}
