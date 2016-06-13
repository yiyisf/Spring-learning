package com.yiyi.comm.com.yiyi.comm.config;

import com.yiyi.comm.com.yiyi.comm.bean.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuzhe on 16/6/13.
 */
@Configuration
public class HelloConfig {
    @Bean(name = "hello")
    public Hello hello(){
        return new Hello.HelloImpl();
    }
}
