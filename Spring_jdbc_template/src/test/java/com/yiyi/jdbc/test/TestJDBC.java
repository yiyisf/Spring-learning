package com.yiyi.jdbc.test;

import com.yiyi.jdbc.model.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhe on 2016/6/20.
 */
public class TestJDBC {
    private ApplicationContext ctx = null;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate npjt;

    {
        ctx = new ClassPathXmlApplicationContext("Appconfig.xml");
        jdbcTemplate = ctx.getBean(JdbcTemplate.class);
        npjt = ctx.getBean(NamedParameterJdbcTemplate.class);

    }


    @Test
    public void testDatasource() throws SQLException {
        DataSource ds = ctx.getBean(DataSource.class);
        System.out.println(ds.getConnection());
    }


    /**
     * 测试insert / update
     */
    @Test
    public void testUpdate(){
        String sql = "UPDATE Employee set name = ? where id = ?";
        jdbcTemplate.update(sql, "yiyi", 155);

        String in = "insert into Employee (id, name, role) values(?,?,?)";

        jdbcTemplate.update(in, 101, "hh", "test101");
    }

    /**
     * 测试批量更新
     */
    @Test
    public void testBachUpdate() {
        List<Object[]> emps = new ArrayList<>();

        String sql = "insert into Employee (id, name, role) values(?,?,?)";
        emps.add(new Object[]{600, "600", "600 + 1"});
        emps.add(new Object[]{601, "601", "601 + 2"});
        emps.add(new Object[]{602, "602", "602 + 3"});


        jdbcTemplate.batchUpdate(sql, emps);
    }


    /**
     *
     *
     */

    @Test
    public <T> void searchObject(){
        /**
         * 以下sql语句可直接使用select *,需要calss中定义的属性与table中的列名一致，否则需要转换;
         */
        String sql = "select * from Employee where id = ?";

        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
//        Employee employee = jdbcTemplate.query(sql, rowMapper);
        Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, 101);
        System.out.println(employee);
    }

    @Test
    public void testSearchList(){
        String sql = "select * from Employee";

        RowMapper<Employee> rowmaper = new BeanPropertyRowMapper<>(Employee.class);
        List<Employee> emps = jdbcTemplate.query(sql, rowmaper);

        final int[] i = {0};
        System.out.println("共"+ emps.size() + "条记录！");
        emps.forEach(
//                System.out::println
//                (employee -> String.join(i, employee.getName()) )
                (e)->{
                    System.out.println(e.getId());
                }

        );

//        System.out.println(i.toString());
    }


    /**
     * 查询单列及取和
     */
    @Test
    public void searchSingleClum(){
        String sql = "select sum(id) from Employee";

        int sum = jdbcTemplate.queryForObject(sql, Integer.TYPE);

        System.out.println(sum);
    }


    /**
     * 测试使用namedParameterJdbcTemplate
     */
    @Test
    public void testNamedParameterJdbcTemplate(){
        String sql = "insert into Employee  values(:id, :name, :role)";

        Employee e = new Employee();
        e.setId(102);
        e.setName("test named");
        e.setRole("role");

        SqlParameterSource ps = new BeanPropertySqlParameterSource(e);
        npjt.update(sql,ps);


    }
}
