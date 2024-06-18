package com.mysp.sbinterview.programs.streamapi.prog1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        List<Employee> employeeList = getEmployeeList();

        // Filter employees with age > 55
        List<Employee> filteredEmployees = employeeList.stream()
                .filter(employee -> employee.getAge() > 55)
                .toList();

        // Print the filtered employees
        filteredEmployees.forEach(employee ->
                System.out.println("Employee ID: " + employee.getEmpID() +
                        ", Name: " + employee.getEmpName() +
                        ", Department: " + employee.getDepartment() +
                        ", Salary: " + employee.getSalary() +
                        ", Age: " + employee.getAge()));
    }

    private static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee(
                1, "Name 1", "HR Department", BigDecimal.valueOf(100.00), 55);
        Employee employee2 = new Employee(
                2, "Name 2", "HR Department", BigDecimal.valueOf(300.00), 60);
        Employee employee3 = new Employee(
                3, "Name 3", "IT Department", BigDecimal.valueOf(600.00), 35);
        Employee employee4 = new Employee(
                4, "Name 4", "HR Department", BigDecimal.valueOf(200.00), 62);
        Employee employee5 = new Employee(
                5, "Name 5", "IT Department", BigDecimal.valueOf(400.00), 42);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        return employeeList;
    }


}
