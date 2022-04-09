package com.lzw.springbootdemo.mapper;

import com.lzw.springbootdemo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author LZW
 * @Description
 * @Date 2022-04-09 20:46
 * @Version 1.0
 */
@Mapper
public interface EmployeeMapper {


    /**
     * 查询员工信息列表
     * @return
     */
    List<Employee> queryEmpList();

}
