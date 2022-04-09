package com.lzw.springbootdemo.controller;

import com.lzw.springbootdemo.entity.Employee;
import com.lzw.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author LZW
 * @Description
 * @Date 2022-04-09 21:23
 * @Version 1.0
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("queryEmpList")
    public List<Employee> queryEmpList() {
        List<Employee> employees = employeeService.queryEmpList();
        return employees;
    }


}
