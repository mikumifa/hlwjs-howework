package com.hlwjs.api.entity.dto;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:25
 **/
@Data
public class WeatherDay {
    private String day_weather;
    private String day_weather_code;
    private String day_weather_short;
    private String day_wind_direction;
    private String day_wind_direction_code;
    private String day_wind_power;
    private String day_wind_power_code;
    private String max_degree;
    private String min_degree;
    private String night_weather;
    private String night_weather_code;
    private String night_weather_short;
    private String night_wind_direction;
    private String night_wind_direction_code;
    private String night_wind_power;
    private String night_wind_power_code;
    private Date time;
}
