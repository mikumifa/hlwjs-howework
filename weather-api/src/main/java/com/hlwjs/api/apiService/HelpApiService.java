package com.hlwjs.api.apiService;
import com.hlwjs.api.entity.dto.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 19:57
 **/
@FeignClient(name = "HelpWeatherAPi",url = "http://api.help.bj.cn")
public interface HelpApiService {
    @RequestMapping(value = "/apis/weather?id={id}", method = RequestMethod.GET)
    Weather todayWeather(@PathVariable("id") String id);
}
