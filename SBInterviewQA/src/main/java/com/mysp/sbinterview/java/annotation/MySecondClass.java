package com.mysp.sbinterview.java.annotation;

public class MySecondClass {

    @MyThirdCustomAnnotation
    String helloStr;
    Integer myInt;

    public MySecondClass(String helloStr, Integer myInt) {
        this.helloStr = helloStr;
        this.myInt = myInt;
    }
}
