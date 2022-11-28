package com.hlwjs.api.entity.dto;

import lombok.Data;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-25 15:38
 **/
@Data
public class LoginInfo {
    private String openid;
    private String session_key;
}
