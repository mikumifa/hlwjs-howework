package com.hlwjs.signIn.controller;

import com.hlwjs.signIn.dto.EmailSet;
import com.hlwjs.signIn.dto.UserSignInfo;
import com.hlwjs.signIn.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-25 12:06
 **/
@RestController

public class SignController {
    @Autowired
    private SignService signService;
    @RequestMapping(value = "/GetUserSignInfoByopenId/{openId}",method = RequestMethod.GET)
    public UserSignInfo getByOpenid(@PathVariable("openId") String openId){
        return signService.getByOpenId(openId);
    }
    @RequestMapping(value = "/SignInByopenId/{openId}",method = RequestMethod.POST)
    public void signInByopenId(@PathVariable("openId") String openId){
        signService.signInByopenId(openId);
    }
    @RequestMapping(value = "/SetBasicInfo.do",method = RequestMethod.POST)
    public void setBasicInfo(UserSignInfo userSignInfo){
        signService.setBasicInfo(userSignInfo);
    }
    @RequestMapping(value = "/SetEmail/{id}/{email}/{province}/{city}/{country}",method = RequestMethod.POST)
    public void setBasicInfo(@PathVariable("id") String id,@PathVariable("email") String email,@PathVariable("province") String province,@PathVariable("city") String city,@PathVariable("country") String country){
        signService.setEmailSet(id,email,province,city,country);
    }
    @RequestMapping(value = "/addNewUser.do",method = RequestMethod.PUT)
    public void addUser(UserSignInfo userSignInfo){
        signService.addUser(userSignInfo);
    }
}
