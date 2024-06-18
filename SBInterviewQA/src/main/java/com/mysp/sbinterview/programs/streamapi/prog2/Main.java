package com.mysp.sbinterview.programs.streamapi.prog2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Product> productList = getProductsList();

        // Calculate the total inventory
        int totalInventory = productList.stream()
                .mapToInt(Product::getInventoryCount)
                .sum();

        // Print the total inventory
        System.out.println("Total Inventory: " + totalInventory);
    }

    private static List<Product> getProductsList() {
        return Arrays.asList(
                new Product(1, new BigDecimal("29.99"), 100),
                new Product(2, new BigDecimal("49.99"), 200),
                new Product(3, new BigDecimal("19.99"), 150),
                new Product(4, new BigDecimal("99.99"), 50),
                new Product(5, new BigDecimal("9.99"), 300)
        );
    }


}
