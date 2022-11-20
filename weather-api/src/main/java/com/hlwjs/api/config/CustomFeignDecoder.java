package com.hlwjs.api.config;

import com.google.gson.GsonBuilder;
import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;
import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-19 23:02
 **/
public class CustomFeignDecoder implements Decoder {
    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        return new GsonDecoder().decode(response,type);
    }
}
