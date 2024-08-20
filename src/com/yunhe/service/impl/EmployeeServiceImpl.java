package com.yunhe.service.impl;

import com.yunhe.Util.RandomUtil;
import com.yunhe.dao.EmployeeDao;
import com.yunhe.dao.impl.EmployeeDaoImpl;
import com.yunhe.pojo.Employee;
import com.yunhe.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDaoImpl();
    @Override
    public void addEmployee(Employee employee) {
        while (true){
            String s = RandomUtil.getRandomString();
            Employee newEmployee =  employeeDao.selectByEmployeeNo(s);
            if(newEmployee == null){
                employee.setEmployeeNo(s);
                break;
            }
        }
        employeeDao.addEmployee(employee);
    }

    @Override
    public List<Employee> selectAllEmployees() {
        return employeeDao.selectAllEmployees();
    }

    /**
     * 根据员工编号修改员工薪水
     * @param employeeNo 员工编号
     * @param i 员工薪水
     */
    @Override
    public void updateEmployeeSalaryByEno(String employeeNo, int i) {
        employeeDao.updateEmployeeSalaryByEno(employeeNo,i);
    }

    /**
     * 根据员工编号查询员工信息
     * @param employeeNo  员工编号
     */
    @Override
    public boolean selectEmployeeByEno(String employeeNo) {
        Employee employee = employeeDao.selectByEmployeeNo(employeeNo);
        if(employee == null)
        {
            return false;
        }else {
            return true;
        }


    }
}
