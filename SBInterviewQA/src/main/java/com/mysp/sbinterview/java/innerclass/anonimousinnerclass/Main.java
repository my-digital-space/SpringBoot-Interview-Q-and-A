package com.mysp.sbinterview.java.innerclass.anonimousinnerclass;

public class Main {

    public static void main(String[] args) {
//        Pizza pepperoniPizza = new Pizza();
//        pepperoniPizza.makeMyPizza();

        Pizza margheritaPizza = new Pizza() {
            // we just have to open and close a curly brace
            // this is where we will put our new class's definition.
            // Here, we are creating an anonymous subclass of Pizza class and overriding the method.
            @Override
            public void makeMyPizza() {
                System.out.println("Making a Margherita Pizza!");
            }
        };
        //margheritaPizza.makeMyPizza();

        Runnable myAnonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World from anonymous Runnable!");
            }
        };
        myAnonymousRunnable.run();

    }

}
