package com.hlwjs.api.service;

import com.hlwjs.api.entity.vo.WeatherVo;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 21:04
 **/
public interface WeatherService {
    /**
     * 获取天气数据
     * @param adcode
     * @return
     */
    WeatherVo getWeatherInfo(String adcode);
}
