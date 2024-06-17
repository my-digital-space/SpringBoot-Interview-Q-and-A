package com.mysp.sbinterview.programs.streamapi.prog1;

import java.math.BigDecimal;

public class Employee {

    private Integer empID;
    private String empName;
    private String department;
    private BigDecimal salary;

    public Employee(Integer empID, String empName, String department, BigDecimal salary) {
        this.empID = empID;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
