package com.hlwjs.api.entity.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:32
 **/
@lombok.Data
public class Data implements Serializable {
    private Air air;
    @SerializedName("forecast_24h")
    private Forecast_24h forecast_24h;
    private Observe observe;
}
