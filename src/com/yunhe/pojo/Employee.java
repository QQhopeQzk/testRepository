package com.yunhe.pojo;

public class Employee {
    private int id;
    private String employeeNo;
    private String eName;
    private String deptName;
    private int eSalary;
    private String eAddress;

    public Employee() {
    }

    public Employee(int id, String employeeNo, String eName, String deptName, int eSalary, String eAddress) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.eName = eName;
        this.deptName = deptName;
        this.eSalary = eSalary;
        this.eAddress = eAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

}
