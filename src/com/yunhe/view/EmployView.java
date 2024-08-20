package com.yunhe.view;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.yunhe.Util.RandomUtil;
import com.yunhe.pojo.Employee;
import com.yunhe.service.EmployeeService;
import com.yunhe.service.impl.EmployeeServiceImpl;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployView {
    private Scanner sc =new Scanner(System.in);
    private EmployeeService employeeService = new EmployeeServiceImpl();
    public void printMenu() {
        while (true) {
            System.out.println("---------------------员工信息管理系统---------------------");
            System.out.println("1. 添加员工信息");
            System.out.println("2. 查询所有员工信息");
            System.out.println("3. 根据员工编号修改员工工资");
            System.out.println("4、退出");
            System.out.println("请输入您的选择：");
            String commentStr = sc.nextLine();
            int comment = Integer.parseInt(commentStr);
            switch (comment){
                case 1:
                    AddEmployView();
                    break;
                case 2:
                    SelectAllEmployeesView();
                    break;
                case 3:
                    UpdateEmployeeSalaryByEnoView();
                    break;
                case 4:
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }


    }

    private void UpdateEmployeeSalaryByEnoView() {
        System.out.println("------------------根据员工编号修改员工工资---------------");
        System.out.println("请输入员工编号：");
        String employeeNo;
        while (true){
            employeeNo = sc.nextLine();
            boolean b = employeeService.selectEmployeeByEno(employeeNo);
            if(!b){
                System.out.println("该员工不存在,请重新输入员工编号：");
            }else {
                break;
            }
        }
        System.out.println("请输入员工工资：");
        String salary = sc.nextLine();
        int i = Integer.parseInt(salary);
        employeeService.updateEmployeeSalaryByEno(employeeNo,i);
    }

    private void SelectAllEmployeesView() {
        System.out.println("------------------全部员工信息---------------");
        //调用service层方法
        List<Employee> list =  employeeService.selectAllEmployees();
        for (Employee employee : list) {
            System.out.println("员工姓名:"+employee.geteName());
            System.out.println("员工编号:"+employee.getEmployeeNo());
            System.out.println("员工工资:"+employee.geteSalary());
            System.out.println("员工地址:"+employee.geteAddress());
            System.out.println("部门名称:"+employee.getDeptName());
            System.out.println("----------------------------------------------------");
        }
    }

    private void AddEmployView() {
        System.out.println("------------------员工添加信息页面---------------");
        Employee employee = new Employee();
        employee.setEmployeeNo(RandomUtil.getRandomString());
        System.out.println("请输入员工姓名：");
        String name = sc.nextLine();
        employee.seteName(name);
        System.out.println("请输入部门名称：");
        String department = sc.nextLine();
        employee.setDeptName(department);
        System.out.println("请输入员工工资：");
        String salary = sc.nextLine();
        int i = Integer.parseInt(salary);
        employee.seteSalary(i);
        System.out.println("请输入员工地址：");
        String address = sc.nextLine();
        employee.seteAddress(address);
        employeeService.addEmployee(employee);
    }

}
