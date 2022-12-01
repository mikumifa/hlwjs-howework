package com.hlwjs.api.entity.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:18
 **/
@Data
public class Air implements Serializable {
    private String aqi;
    private String aqi_level;
    private String aqi_name;
    private String co;
    private String no2;
    private String o3;
    private String pm10;
    @SerializedName("pm2.5")
    private String pm2_5;
    private String so2;
    private String update_time;
}
