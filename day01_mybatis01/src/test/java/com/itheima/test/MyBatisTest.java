package com.itheima.test;


import com.itheima.dao.EmployeeDao;
import com.itheima.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @autor WangGY
 * @create 2020-04-19  20:46
 */
public class MyBatisTest {
    public static void main(String[] args) throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession openSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = openSession.getMapper(EmployeeDao.class);
        Employee employee = employeeDao.getEmpById(3);
        System.out.println(employee);
    }
}
