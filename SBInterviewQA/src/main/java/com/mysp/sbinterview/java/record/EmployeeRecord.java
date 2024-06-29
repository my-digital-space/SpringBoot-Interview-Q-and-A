package com.mysp.sbinterview.java.record;

public record EmployeeRecord(Integer employeeID, String employeeName, String department) {
    // Error: Instance field is not allowed in record
    // they must be defined in the above list of components.
    // private String employeeAddress;

    // this can have static variables
    private static final String MY_NAME = "Jonny";

    // compact constructor
    public EmployeeRecord {
        // employee ID should not be a negative value
        if (employeeID < 0) {
            throw new IllegalArgumentException("employeeID should not be a negative value!");
        }
    }

//    public EmployeeRecord(Integer employeeID, String employeeName, String department) {
//        // employee ID should not be a negative value
//        if (employeeID < 0) {
//            throw new IllegalArgumentException("employeeID should not be a negative value!");
//        }
//
//        this.employeeID = employeeID;
//        this.employeeName = employeeName;
//        this.department = department;
//    }

    // non-static method
    public void printMyNonStaticMethod() {
        System.out.println("Non-Static method: name in upper case: " + employeeName.toUpperCase());
    }

    // static method
    public static void printMyStaticMethod() {
        System.out.println("Non-Static method: name in lower case: " + MY_NAME.toLowerCase());
    }

}
