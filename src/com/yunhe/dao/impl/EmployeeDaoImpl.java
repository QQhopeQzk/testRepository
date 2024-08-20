package com.yunhe.dao.impl;

import com.yunhe.Util.JDBCUtil;
import com.yunhe.dao.EmployeeDao;
import com.yunhe.pojo.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private JdbcTemplate template =JDBCUtil.template;
    @Override
    public Employee selectByEmployeeNo(String s) {
        String sql ="select * from employee1 where employeeno = ?";
        try{
            return template.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class),s);
        }catch (Exception e){
            return null;
        }




    }

    @Override
    public void addEmployee(Employee employee) {
        String sql = "insert into employee1(employeeno,ename,deptname,esalary,eaddress) values(?,?,?,?,?)";
        template.update(sql,employee.getEmployeeNo(),employee.geteName(),employee.getDeptName(),employee.geteSalary(),employee.geteAddress());
    }

    @Override
    public List<Employee> selectAllEmployees() {
        String sql ="select * from employee1";
        return template.query(sql,new BeanPropertyRowMapper<>(Employee.class));

    }

    @Override
    public void updateEmployeeSalaryByEno(String employeeNo, int i) {
        String sql ="update employee1 set esalary = ? where employeeno = ?";
        template.update(sql,i,employeeNo);
    }
}
