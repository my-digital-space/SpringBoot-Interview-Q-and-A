package com.mysp.sbinterview.java.innerclass;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        //outerClass.printMessageOuter();
        outerClass.printMessageOuterWithInnerClass();

        // OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        // OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        // innerClass.printMessageInner();
    }

}
