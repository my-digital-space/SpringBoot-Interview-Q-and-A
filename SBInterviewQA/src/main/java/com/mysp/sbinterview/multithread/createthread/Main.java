package com.mysp.sbinterview.multithread.createthread;

public class Main {

    public static void main(String[] args) {
//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//
//        myThread1.start();
//        myThread2.start();

        for (int i = 0; i < 4; i++) {
            MyThread myThread = new MyThread();
            Thread newThread = new Thread(myThread);
            newThread.start();
        }
        //throw new RuntimeException();
    }

}
