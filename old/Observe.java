package com.hlwjs.api.entity.dto;

import lombok.Data;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:32
 **/
@Data
public class Observe {
    private String degree;
    private String humidity;
    private String precipitation;
    private String pressure;
    private String update_time;
    private String weather;
    private String weather_code;
    private String weather_short;
    private String wind_direction;
    private String wind_power;
}
