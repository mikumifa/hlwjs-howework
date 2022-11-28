package com.hlwjs.signIn.dto;
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
 * @create: 2022-11-25 12:11
 **/
@Data
@Table(name="wxUser")
public class UserSignInfo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String wechatOpenid;
    private String nickName;
    private String avatarUrl;
    private String gender;
    private String city;
    private String province;
    private String country;
    private String continuitySignDays="0";
    private String lastSignTime;
}
