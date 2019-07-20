package com.spring.cloud.learning.consul.controller;

import com.spring.cloud.learning.consul.config.StudentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StudentController {


    @Autowired
    private StudentConfig studentConfig;

    @RequestMapping("/myname")
    @ResponseBody
    public Object testHello() {
        System.out.println("my name is : " );
        return studentConfig;
    }

    @RequestMapping("/config")
    public String testConfig() {
        System.out.println(studentConfig.toString());
        return studentConfig.toString();
    }
}
