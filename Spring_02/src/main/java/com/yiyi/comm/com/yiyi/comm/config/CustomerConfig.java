package com.yiyi.comm.com.yiyi.comm.config;

import com.yiyi.comm.com.yiyi.comm.bean.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuzhe on 16/6/13.
 */
@Configuration
public class CustomerConfig {
    @Bean(name = "customer")
    public Customer customer(){
        return new Customer();
    }
}
