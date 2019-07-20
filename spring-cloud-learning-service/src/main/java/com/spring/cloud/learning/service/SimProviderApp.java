package com.spring.cloud.learning.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SimProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(SimProviderApp.class, args);
    }
}
