package com.mysp.sbinterview.java.abstractclassmethod;

public abstract class Pizza {

    int pizzaSize;
    String pizzaToppings;

    public abstract void makePizza();

    public void bakePizza() {
        System.out.println("Baking the Pizza now!");
    }

}
