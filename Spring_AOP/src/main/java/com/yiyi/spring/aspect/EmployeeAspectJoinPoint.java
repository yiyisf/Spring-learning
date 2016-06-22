package com.yiyi.spring.aspect;

import org.aspectj.lang.JoinPoint;

/**
 * Created by liuzhe on 2016/6/16.
 */
public class EmployeeAspectJoinPoint {

    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("xml配置带参数：" + joinPoint.toString());
    }

    public void logStringArguments(String name){
        System.out.println("单个string参数方法被调用，携带参数:" + name);
    }

}
