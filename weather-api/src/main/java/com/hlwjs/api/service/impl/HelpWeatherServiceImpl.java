package com.hlwjs.api.service.impl;

import com.hlwjs.api.apiService.CityCodeApiService;
import com.hlwjs.api.entity.dto.Weather;
import com.hlwjs.api.entity.vo.WeatherVo;
import com.hlwjs.api.service.WeatherService;
import com.hlwjs.citycode.dto.CityCode;
import com.hlwjs.citycode.service.CityCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hlwjs.api.apiService.HelpApiService;
import tk.mybatis.mapper.common.base.BaseSelectMapper;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 21:13
 **/
@Service
public class HelpWeatherServiceImpl implements WeatherService {
    /**
     * 根据adcode获取天气数据
     * @param adcode
     * @return
     */
    @Autowired
    private CityCodeApiService cityCodeApiService;
    @Autowired
    private HelpApiService helpApiService;
    @Override
    public WeatherVo getWeatherInfo(String adcode) {

        CityCode cityCode=cityCodeApiService.getByAdcode(adcode);
        Weather weather = helpApiService.todayWeather(adcode);
        return toWeatherVo(weather,cityCode);
    }
    private  WeatherVo toWeatherVo(Weather weather, CityCode cityCode){
        WeatherVo vo = new WeatherVo();
        vo.setLocation(cityCode.getCityCn());
        vo.setWeather(weather.getWeather());
        vo.setCityID(cityCode.getCityId());
        return vo;
    }
}
