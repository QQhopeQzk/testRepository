package com.yunhe.service;

import com.yunhe.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    List<Employee> selectAllEmployees();

    void updateEmployeeSalaryByEno(String employeeNo, int i);

    boolean selectEmployeeByEno(String employeeNo);
}
