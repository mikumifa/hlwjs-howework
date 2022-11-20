package com.hlwjs.api.config;

import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;

/**
 * @program: weather-app
 * @description:
 * @author: Xie
 * @create: 2022-11-20 11:42
 **/
public class DecoderConfig {
    @Bean
    public Decoder customDecoder(){
        return new CustomFeignDecoder();
    }
}
