package com.mysp.sbinterview.java.innerclass;

public class OuterClass {

    String messageOuter = "Hello World from Outer Class";

    public void printMessageOuter() {
        System.out.println(messageOuter);
    }

    public void printMessageOuterWithInnerClass() {
        class MyLocalInnerClass {
            String messageLocalInner = "Hello World from Local Inner Class";
            public void printMessageInner() {
                System.out.println(messageLocalInner);
            }
        }
        MyLocalInnerClass myLocalInnerClass = new MyLocalInnerClass();
        myLocalInnerClass.printMessageInner();
    }

    public static class InnerClass {
        String messageInner = "Hello World from Inner Class";

        public void printMessageInner() {
            System.out.println(messageInner);
        }
    }

}
