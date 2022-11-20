package com.hlwjs.api.controller;

import com.hlwjs.api.entity.dto.TencentWeather;
import com.hlwjs.api.service.TencentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 21:04
 **/
@RestController//@RestController 如果只是接口，那么就用 RestController 来注解.
public class WeatherController {

    @Autowired//@Service或者@Controller或@Component或@Repository注解之后，spring的组件扫描就会自动发现它，并且会将其初始化为spring应用上下文中的bean。
    private TencentWeatherService tencentWeatherService;
    @GetMapping(value = "/get.do")//处理get请求的映射-->@GetMapping
    public TencentWeather get(String province, String city, String country){

        return tencentWeatherService.getWeatherInfo(province, city, country);

    }

}
