package com.hlwjs.api.controller;

import com.google.gson.JsonElement;
import com.hlwjs.api.apiService.TencentApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:44
 **/
@RestController
public class TestTencentApiController {
    @Autowired
    private TencentApiService tencentApiService;
    @RequestMapping(value = "/weather/tx/{province}/{city}/{country}")
    String get(@PathVariable("province") String province, @PathVariable("city") String city, @PathVariable("country") String country){
        JsonElement weather = tencentApiService.getWeather(province, city, country);
        String s = weather.toString();
        System.out.println("weather"+s);
        return s;
    }
}
