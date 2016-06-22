package com.yiyi.spring.dao;


import com.yiyi.spring.model.Employee;

import java.util.List;

/**
 * Created by liuzhe on 2016/6/14.
 */
public interface EmployeeDAO {
    /**
     *     保存数据.
     */
    public void save(Employee employee);

    public void update(Employee employee);

    public void deleteById(int id);

    public Employee readById(int id);

    public List<Employee> readAll();
}
