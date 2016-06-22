package com.yiyi.spring;

import com.yiyi.spring.dao.EmployeeDAO;
import com.yiyi.spring.dao.EmplyeeDaoImpl;
import com.yiyi.spring.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuzhe on 2016/6/16.
 */
public class App {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        EmployeeService ems = ctx.getBean("employeeservice", EmployeeService.class);
        System.out.println(ems.getEmployee().getName());

        ems.getEmployee().setName("你好");

        EmployeeDAO emp = ctx.getBean("employeedao", EmployeeDAO.class);

        emp.readAll();

    }
}
