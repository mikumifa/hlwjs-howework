package com.hlwjs.api.controller;

import com.hlwjs.api.entity.vo.WeatherVo;
import com.hlwjs.api.service.HelpWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 20:59
 **/
@RestController//@RestController 如果只是接口，那么就用 RestController 来注解.
public class WeatherApiController {
    @Autowired//@Service或者@Controller或@Component或@Repository注解之后，spring的组件扫描就会自动发现它，并且会将其初始化为spring应用上下文中的bean。
    private HelpWeatherService weatherService;
    @RequestMapping(value = "/get")//处理get请求的映射-->@GetMapping
    public WeatherVo get(String adcode){
        return weatherService.getWeatherInfo(adcode);
    }

}
