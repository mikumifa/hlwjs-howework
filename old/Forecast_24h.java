package com.hlwjs.api.entity.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:26
 **/
@Data
public class Forecast_24h implements Serializable {
    @SerializedName("0")
    private WeatherDay weatherDay_0;
    @SerializedName("1")
    private WeatherDay weatherDay_1;
    @SerializedName("2")
    private WeatherDay weatherDay_2;
    @SerializedName("3")
    private WeatherDay weatherDay_3;
    @SerializedName("4")
    private WeatherDay weatherDay_4;
    @SerializedName("5")
    private WeatherDay weatherDay_5;
    @SerializedName("6")
    private WeatherDay weatherDay_6;
    @SerializedName("7")
    private WeatherDay weatherDay_7;

}
