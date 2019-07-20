package com.spring.cloud.learning.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/study")
public class StudyInfoController {

    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    public Map<String, String> getStudyData() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("phone", "12345798");

        return map;
    }
}
