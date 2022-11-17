package com.hlwjs.api.controller;

import com.hlwjs.api.apiService.HelpApiService;
import com.hlwjs.api.entity.dto.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-18 00:13
 **/
@RestController
public class TestHelpApiController {
    @Autowired
    private HelpApiService helpApiService;
    @RequestMapping(value = "/test/help/{id}")
    Weather get(@PathVariable("id") String id){
        return helpApiService.todayWeather(id);

    }
}
