package com.lzw.springbootdemo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author LZW
 * @Description
 * @Date 2022-04-08 22:40
 * @Version 1.0
 */
@Data
public class Employee {


    private int empid;
    private String ename;
    private String job;
    private int mgr;
    @JsonFormat(locale = "zh", pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date hiredate;
    private double sal;
    private double comm;
    private int deptno;
}
