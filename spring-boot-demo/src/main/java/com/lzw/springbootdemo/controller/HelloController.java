package com.lzw.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LZW
 * @Description
 * @Date 2022-04-08 19:39
 * @Version 1.0
 */

@RestController // 等同于 @Controller + @ResponseBody
public class HelloController {

    @GetMapping("hello") // @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

}
