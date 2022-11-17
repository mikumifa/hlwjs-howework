package com.hlwjs.api.controller;

import com.hlwjs.api.apiService.CityCodeApiService;
import com.hlwjs.api.apiService.HelpApiService;
import com.hlwjs.api.entity.dto.Weather;
import com.hlwjs.citycode.dto.CityCode;
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
public class TestCityApiController {
    @Autowired
    private CityCodeApiService cityCodeApiService;
    @RequestMapping(value = "/test/city/{id}")
    CityCode get(@PathVariable("id") String id){
        return cityCodeApiService.getByAdcode(id);

    }
}
