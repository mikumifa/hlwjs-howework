package com.hlwjs.api.apiService;

import com.google.gson.JsonElement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-25 13:56
 **/
@FeignClient(value = "wxLoginApiServe",url ="https://api.weixin.qq.com/sns")
public interface WxLoginApiServe {
    @RequestMapping(value = "/jscode2session?appid=wx4fcd17271ae5180a&secret=b72d871abda270b859bcfdacf93645c8&js_code={code}&grant_type=authorization_code", method = RequestMethod.GET)
    String wxLogin(@PathVariable(value = "code") String code);

}
