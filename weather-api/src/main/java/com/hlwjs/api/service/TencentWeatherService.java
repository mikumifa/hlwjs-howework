package com.hlwjs.api.service;

import com.hlwjs.api.entity.dto.TencentWeather;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:39
 **/
public interface TencentWeatherService {
    TencentWeather getWeatherInfo(String province, String city, String country);
}
