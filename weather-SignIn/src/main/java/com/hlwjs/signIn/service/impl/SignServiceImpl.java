package com.hlwjs.signIn.service.impl;

import com.hlwjs.signIn.dto.UserSignInfo;
import com.hlwjs.signIn.mapper.SignMapper;
import com.hlwjs.signIn.service.SignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-25 12:27
 **/
@Service
public class SignServiceImpl implements SignService {
    @Resource
    private SignMapper signMapper;

    @Override
    public UserSignInfo getByOpenId(String openId) {
        UserSignInfo userSignInfo = signMapper.selectByPrimaryKey(openId);
        if(userSignInfo==null) {
            userSignInfo = new UserSignInfo();
            userSignInfo.setWechatOpenid(openId);
            addUser(userSignInfo);
        }
        userSignInfo = signMapper.selectByPrimaryKey(openId);
        return userSignInfo;
    }
    @Override
    public void signInByopenId(String openId) {
        UserSignInfo userSignInfo = signMapper.selectByPrimaryKey(openId);
        int past=Integer.valueOf(userSignInfo.getContinuitySignDays());
        userSignInfo.setContinuitySignDays(String.valueOf(past+1));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//注意月和小时的格式为两个大写字母
        Date date = new Date();//获得当前时间
        String time = df.format(date);//将当前时间转换成特定格式的时间字符串，这样便可以插入到数据库中
        userSignInfo.setLastSignTime(time);
        signMapper.updateByPrimaryKey(userSignInfo);
    }
    @Override
    public void setBasicInfo(UserSignInfo userSignInfo) {
        UserSignInfo sqluserSignInfo = signMapper.selectByPrimaryKey(userSignInfo.getWechatOpenid());
        sqluserSignInfo.setCity(userSignInfo.getCity());
        sqluserSignInfo.setCountry(userSignInfo.getCountry());
        sqluserSignInfo.setGender(userSignInfo.getGender());
        sqluserSignInfo.setAvatarUrl(userSignInfo.getAvatarUrl());
        sqluserSignInfo.setProvince(userSignInfo.getProvince());
        sqluserSignInfo.setNickName(userSignInfo.getNickName());
        signMapper.updateByPrimaryKey(sqluserSignInfo);
    }

    @Override
    public void addUser(UserSignInfo userSignInfo) {
        signMapper.insertSelective(userSignInfo);
    }
}
