package com.hlwjs.citycode.controller;

import com.hlwjs.citycode.dto.CityCode;
import com.hlwjs.citycode.service.CityCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 21:50
 **/
@RestController
public class CityCodeController {
    @Autowired
    private CityCodeService cityCodeService;

    @RequestMapping(value = "/CityCodeByAdcode/{adcode}", method = RequestMethod.GET)
    public CityCode getByAdcode(@PathVariable("adcode") String adcode){

        return cityCodeService.getCityCode(adcode);
    }

}
