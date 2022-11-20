package com.hlwjs.api.service.impl;

import com.google.gson.*;
import com.hlwjs.api.apiService.TencentApiService;
import com.hlwjs.api.entity.dto.TencentWeather;
import com.hlwjs.api.service.TencentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:12
 **/
@Service
public class TencentApiServiceImpl implements TencentWeatherService {
    /**
     * @param province
     * @param city
     * @param country
     * @return
     */
    @Autowired
    private TencentApiService tencentApiService;
    private Gson gson;

    {
        gson=new Gson();
    }
    public TencentWeather getWeatherInfo(String province, String city, String country) {

        JsonElement weather = tencentApiService.getWeather(province, city, country);
        String s = weather.toString();
        System.out.println(s);

        TencentWeather tencentWeather = gson.fromJson(s, TencentWeather.class);
        System.out.println(tencentWeather);
        return  tencentWeather;
    }


}
