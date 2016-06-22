package com.yiyi.spring.dao;


import com.yiyi.spring.model.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by liuzhe on 2016/6/14.
 */
public class EmplyeeDaoImpl implements EmployeeDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Employee employee) {
        String qury = "insert into Employee(id, name, role) values(?, ?, ?)";

        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(qury);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getRole());
            ps.execute();
            connection.commit();
//            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Employee readById(int id) {
        String selectQuey = "select * from Employee where id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Employee emp = null;
        try {
            conn = dataSource.getConnection();
            ps = conn.prepareStatement(selectQuey);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                emp = new Employee();
                emp.setId(id);
                emp.setName(rs.getString("name"));
                emp.setRole(rs.getString(3));
            }
            System.out.println("read: " + emp.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return emp;
    }

    @Override
    public List<Employee> readAll() {

        System.out.println("read all.......");
        return null;
    }

}
