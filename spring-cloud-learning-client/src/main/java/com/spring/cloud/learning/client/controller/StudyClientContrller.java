package com.spring.cloud.learning.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/st")
public class StudyClientContrller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/d", method = RequestMethod.GET)
    @ResponseBody
    public Object getData(){
       return restTemplate.getForEntity("http://eureka-server/study/getData", String.class);
    }
}
