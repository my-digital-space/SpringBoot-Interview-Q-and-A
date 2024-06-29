package com.mysp.sbinterview.java.record;

public class Main {

    public static void main(String[] args) {
        EmployeeClass employeeClass = new EmployeeClass(124, "John Doe", "IT");
        //System.out.println(employeeClass.getEmployeeName());

        EmployeeRecord employeeRecord = new EmployeeRecord(124, "Lisa Ray", "HR");
        //System.out.println(employeeRecord.employeeName());
        employeeRecord.printMyNonStaticMethod();
        EmployeeRecord.printMyStaticMethod();
    }

}
