package com.hlwjs.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: weather-app
 * @description: null
 * @author: Xie
 * @create: 2022-11-14 23:06
 **/
@SpringBootApplication
@EnableFeignClients(basePackages = "com.hlwjs.*")
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class);
    }
}
