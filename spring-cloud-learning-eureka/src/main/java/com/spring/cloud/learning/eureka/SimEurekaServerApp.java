package com.spring.cloud.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SimEurekaServerApp  {
    public static void main(String[] args) {
        SpringApplication.run(SimEurekaServerApp.class, args);
    }
}