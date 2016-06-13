package com.yiyi.comm;

import com.yiyi.comm.com.yiyi.comm.bean.Customer;
import com.yiyi.comm.com.yiyi.comm.bean.Employee;
import com.yiyi.comm.com.yiyi.comm.bean.Hello;
import com.yiyi.comm.com.yiyi.comm.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuzhe on 16/6/13.
 */
public class App {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Hello pringHello = (Hello) context.getBean("hello");

        pringHello.printHello("from config\n");

        Customer customer = (Customer) context.getBean("customer");
        customer.printMsg("from Customer\n");

        Employee employee = (Employee) context.getBean("employee");
        employee.printMsg("from Employee\n");
    }
}
