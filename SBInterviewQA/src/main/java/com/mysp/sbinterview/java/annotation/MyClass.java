package com.mysp.sbinterview.java.annotation;

//@MyFirstCustomAnnotation
public class MyClass {

    @MySecondCustomAnnotation(numberOfInvocations = 4)
    public void myFirstMethod() {
        System.out.println("Hello World 1");
    }

    public void mySecondMethod() {
        System.out.println("Hello World 2");
    }

}
