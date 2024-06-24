package com.mysp.sbinterview.java.lambda;

public class Main {

    public static void main(String[] args) {
        //CustomerDetails customerDetails = new CustomerDetails();
        //customerDetails.printCustomerName();
        Customer customerLambda = (title) -> title + "John Doe";

        printName(customerLambda);
    }

    static void printName(Customer customer) {
        String fullName = customer.printCustomerName("Mr. ");
        System.out.println(fullName);
    }

}
