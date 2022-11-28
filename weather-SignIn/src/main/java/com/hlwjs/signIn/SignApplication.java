package com.hlwjs.signIn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-25 13:05
 **/
@SpringBootApplication
@MapperScan("com.hlwjs.signIn.mapper")
public class SignApplication {
    public static void main(String[] args) {
        SpringApplication.run(SignApplication.class);
    }
}
