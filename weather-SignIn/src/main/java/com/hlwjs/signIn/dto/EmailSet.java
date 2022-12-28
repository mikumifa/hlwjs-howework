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
public class EmailSet implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String wechatOpenid;
    private String email;
    private String city;
    private String province;
    private String country;
}
