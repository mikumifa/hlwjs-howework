package com.hlwjs.api.apiService;

import com.hlwjs.citycode.dto.CityCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-17 22:31
 **/

@FeignClient(name = "CityCodeApi",url = "localhost:12345")
public interface CityCodeApiService {
    @RequestMapping(value="/CityCodeByAdcode/{adcode}",method = RequestMethod.GET)
    CityCode getByAdcode(@PathVariable("adcode") String adcode);
}
