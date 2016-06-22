package com.yiyi.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by liuzhe on 2016/6/16.
 */
@Aspect
@Component
public class EmployeeAspect {

    @Before("getNamePoint()")
    public void getNameAdvice(){
        System.out.println("getname be called....");
    }

    @Before("setNamePoint()")
    public void setNameAdvice(){
        System.out.println("readall method be called...");
    }


    @Before("execution(* com.yiyi.spring.service.*.get*())")
    public void getAllAdvice(){
        System.out.println("get all advice...");
    }


    @Pointcut("execution(public String getName())")
    public void getNamePoint(){}

    @Pointcut("execution(public * readAll())")
    public void setNamePoint(){}
}
