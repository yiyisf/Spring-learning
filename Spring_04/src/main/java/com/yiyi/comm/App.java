package com.yiyi.comm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuzhe on 16/6/13.
 */
public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("customerBean.xml");

        Custormer custormer = (Custormer) context.getBean("customer");

        System.out.println(custormer.toString());

        Custormer custormer1 = (Custormer) context.getBean("customer");
        custormer1.setPerson(new Person("你好", 20));

        System.out.println(custormer1);
    }
}
