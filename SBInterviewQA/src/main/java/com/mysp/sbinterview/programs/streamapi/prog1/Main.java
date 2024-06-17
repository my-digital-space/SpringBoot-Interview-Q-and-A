package com.mysp.sbinterview.programs.streamapi.prog1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = getEmployeeList();

        Map<String, BigDecimal> totalSalariesByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.reducing(
                                BigDecimal.ZERO,
                                Employee::getSalary,
                                BigDecimal::add
                        )
                ));

        totalSalariesByDepartment.forEach((department, totalSalary) ->
                System.out.println("Department: " + department + ", Total Salary: " + totalSalary));
    }

    private static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee(
                1, "Name 1", "HR Department", BigDecimal.valueOf(100.00));
        Employee employee2 = new Employee(
                1, "Name 2", "HR Department", BigDecimal.valueOf(300.00));
        Employee employee3 = new Employee(
                1, "Name 3", "IT Department", BigDecimal.valueOf(600.00));
        Employee employee4 = new Employee(
                1, "Name 4", "HR Department", BigDecimal.valueOf(200.00));
        Employee employee5 = new Employee(
                1, "Name 5", "IT Department", BigDecimal.valueOf(400.00));

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        return employeeList;
    }


}
