package com.itheima.dao;

import com.itheima.domain.Employee;

/**
 * @autor WangGY
 * @create 2020-04-19  20:09
 */
public interface EmployeeDao {
    /**
     * 根据员工id查询员工
     * @param id
     * @return
     */
    public Employee getEmpById(Integer id);
}
