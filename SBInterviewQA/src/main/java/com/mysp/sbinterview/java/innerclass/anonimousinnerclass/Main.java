package com.mysp.sbinterview.java.innerclass.anonimousinnerclass;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.makePepperoniPizza();

        Pizza MargheritaPizza = new Pizza(){
            // we just have to open and close a curly brace
            // this is where we will put our new class's definition.
            // Here, we are creating an anonymous subclass of Pizza class.
            
        };
    }

}
