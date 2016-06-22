package com.yiyi.spring.service;

import com.yiyi.spring.model.Employee;

/**
 * Created by liuzhe on 2016/6/16.
 */
public class EmployeeService {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
