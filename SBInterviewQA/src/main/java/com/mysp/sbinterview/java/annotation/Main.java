package com.mysp.sbinterview.java.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

//    @SuppressWarnings("unused")
//    public Integer myInt = 10;

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

//        MyClass myClass = new MyClass();
//        if (myClass.getClass().isAnnotationPresent(MyFirstCustomAnnotation.class)) {
//            System.out.println("My custom annotation is present!");
//        }

        MyClass myClass = new MyClass();
        for (Method method : myClass.getClass().getMethods()) {
            if (method.isAnnotationPresent(MySecondCustomAnnotation.class)) {
                MySecondCustomAnnotation mySecondCustomAnnotation = method.getAnnotation(MySecondCustomAnnotation.class);
                for (int i = 0; i < mySecondCustomAnnotation.numberOfInvocations(); i++) {
                    method.invoke(myClass);
                }
            }
        }

        MySecondClass mySecondClass = new MySecondClass("Hello World", 4);
        for (Field field : mySecondClass.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MyThirdCustomAnnotation.class)) {
                Object myStrObject = field.get(mySecondClass);
                if (myStrObject instanceof String myStringValue) {
                    System.out.println(myStringValue);
                }
            }
        }

    }

}
