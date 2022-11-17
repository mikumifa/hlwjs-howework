package com.hlwjs.citycode.service;

import com.hlwjs.citycode.dto.CityCode;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 21:39
 **/
public interface CityCodeService {
    public CityCode getCityCode(String adcode);
}
