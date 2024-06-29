package com.mysp.sbinterview.java.record;

import java.util.Objects;

public class EmployeeClass {

    private final Integer employeeID;
    private final String employeeName;
    private final String department;

    // constructor to initialize the member variables
    public EmployeeClass(Integer employeeID, String employeeName, String department) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
    }

    // getters to fetch the values later
    public Integer getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    // a toString() method to be able to print the object
    @Override
    public String toString() {
        return "EmployeeClass{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    // equals() and hashCode() methods to compare 2 objects of this class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return Objects.equals(employeeID, that.employeeID) &&
                Objects.equals(employeeName, that.employeeName) &&
                Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, employeeName, department);
    }

}
