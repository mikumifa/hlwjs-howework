package com.hlwjs.api.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.hlwjs.api.apiService.WxLoginApiServe;
import com.hlwjs.api.entity.dto.LoginInfo;
import com.hlwjs.api.entity.dto.TencentWeather;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-25 14:04
 **/
@RestController
public class LoginController {
    @Autowired
    private WxLoginApiServe wxLoginApiServe;
    private Gson gson;

    {
        gson=new Gson();
    }
    @RequestMapping("/wxLogin/{code}")
    public LoginInfo wxLogin(@PathVariable(value = "code") String code){
        String s = wxLoginApiServe.wxLogin(code);
        LoginInfo loginInfo = gson.fromJson(s,LoginInfo.class);
        return loginInfo;
    }

}
