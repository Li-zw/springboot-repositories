package com.lzw.springbootdemo.service.impl;

import com.lzw.springbootdemo.entity.Employee;
import com.lzw.springbootdemo.mapper.EmployeeMapper;
import com.lzw.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LZW
 * @Description
 * @Date 2022-04-09 21:15
 * @Version 1.0
 */
@Service // 一定要加上注解
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryEmpList() {
        List<Employee> employeeList = employeeMapper.queryEmpList();
        if(employeeList != null && !employeeList.isEmpty()){
            return employeeList;
        }
        return null;
    }
}
