package com.yiyi.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuzhe on 16/6/13.
 */
public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("hello");

        helloWorld.pringHello();

    }
}
