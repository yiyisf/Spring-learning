package com.yiyi.comm.com.yiyi.comm.config;

import com.yiyi.comm.com.yiyi.comm.bean.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by liuzhe on 16/6/13.
 */
@Configuration
@Import({CustomerConfig.class, EmployeeConfig.class, HelloConfig.class})
public class AppConfig {
}
