package com.hlwjs.citycode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 22:02
 **/

@SpringBootApplication
@MapperScan("com.hlwjs.citycode.mapper")
public class CityCodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(CityCodeApplication.class);
    }
}