package com.yunhe.dao;

import com.yunhe.pojo.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee selectByEmployeeNo(String s);

    void addEmployee(Employee employee);

    List<Employee> selectAllEmployees();

    void updateEmployeeSalaryByEno(String employeeNo, int i);
}
