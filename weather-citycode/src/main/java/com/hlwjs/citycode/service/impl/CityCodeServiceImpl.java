package com.hlwjs.citycode.service.impl;

import com.hlwjs.citycode.dto.CityCode;
import com.hlwjs.citycode.mapper.CityCodeMapper;
import com.hlwjs.citycode.service.CityCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 21:45
 **/
@Service
public class CityCodeServiceImpl implements CityCodeService {
    @Resource
    private CityCodeMapper cityCodeMapper;
    @Override
    public CityCode getCityCode(String adcode){
        return cityCodeMapper.selectByPrimaryKey(adcode);
    }
}
