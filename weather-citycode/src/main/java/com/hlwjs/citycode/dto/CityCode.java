package com.hlwjs.citycode.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-15 21:34
 **/
@Data
@Table(name="CityCode")
public class CityCode implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cityId;
    private String cityEn;
    private String cityCn;
    private String countryCode;
    private String countryEn;
    private String countryCn;
    private String provinceCn;
    private String adminDistrictEn;
    private String adminDistrictCn;
    private String latitude;
    private String longitude;
    private String provinceEn;
    private String adCode;
}
