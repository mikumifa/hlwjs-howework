package com.hlwjs.signIn.service;

import com.hlwjs.signIn.dto.EmailSet;
import com.hlwjs.signIn.dto.UserSignInfo;


/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-25 12:09
 **/
public interface SignService {
    public UserSignInfo getByOpenId(String openId);
    public void signInByopenId(String openId);
    public void setBasicInfo(UserSignInfo userSignInfo);
    public void addUser(UserSignInfo userSignInfo);
    public void setEmailSet(String id,String email,String province,String city,String country);
}
