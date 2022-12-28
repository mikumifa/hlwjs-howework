package com.hlwjs.api.apiService;

import com.google.gson.JsonElement;

import com.hlwjs.api.config.DecoderConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 20:03
 **/
@FeignClient(name = "TencentWeatherAPi",url = "https://wis.qq.com/weather",configuration = DecoderConfig.class)
public interface TencentApiService {
@RequestMapping(value = "/common?source=pc&weather_type=observe|forecast_24h|air|index|tips&province={province}&city={city}&county={country}", method = RequestMethod.GET)
JsonElement getWeather(@PathVariable("province") String province, @PathVariable("city") String city, @PathVariable("country") String country);
}
