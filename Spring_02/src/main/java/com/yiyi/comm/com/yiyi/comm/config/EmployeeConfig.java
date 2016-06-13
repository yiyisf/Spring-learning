package com.yiyi.comm.com.yiyi.comm.config;

import com.yiyi.comm.com.yiyi.comm.bean.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuzhe on 16/6/13.
 */
@Configuration
public class EmployeeConfig {
    @Bean(name = "employee")
    public Employee employee(){
        return new Employee();
    }
}
