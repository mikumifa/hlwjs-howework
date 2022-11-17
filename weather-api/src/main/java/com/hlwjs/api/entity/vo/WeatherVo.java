package com.hlwjs.api.entity.vo;

import lombok.Data;

import java.lang.ref.SoftReference;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 19:59
 **/
@Data
public class WeatherVo {
    private String location;//城市名称
    private String weather;//天气状况
    private String cityID;//城市ID
//    private String status; //反馈代码 0成功
//    private String msg; //反馈信息
//    private String cityen;//城市名称英文
//    private String citycode;//城市编码
//    private String temp;//实时温度
//    private String tempf;//华氏温度
//    private String wd;//风向
//    private String wden;//风向英文
//    private String wdforce;//风力
//    private String wdspd;//风速
//    private String uptime;//更新时间
//    private String weatheren;//天气状况英文
//    private String weatherimg;//天气状况图标
//    private String stp;//气压
//    private String wisib;//能见度
//    private String humidity;//湿度
//    private String prcp;//降雨
//    private String prcp24h;//24小时降雨量
//    private String aqi;//AQI
//    private String pm25;//PM2.5
//    private String today;//今天日期
}
