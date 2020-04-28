package com.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 武帅
 * @date 2020/4/28 17:12
 * @description
 */
@RestController
public class DemoController {


    @RequestMapping("info")
    public String info(){
        System.out.println("hello world");
        return "hello";
    }



}
