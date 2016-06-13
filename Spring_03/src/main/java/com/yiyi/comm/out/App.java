package com.yiyi.comm.out;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuzhe on 16/6/13.
 */
public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        PrintHelper printer = (PrintHelper) context.getBean("PrintHelper");

        printer.print();
    }
}
