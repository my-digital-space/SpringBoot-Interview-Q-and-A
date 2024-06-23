package com.mysp.sbinterview.multithread.createthread;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread: " + Thread.currentThread().getName());
//            if(i==1 && Thread.currentThread().getName().equals("Thread-0")){
//                throw new RuntimeException();
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
