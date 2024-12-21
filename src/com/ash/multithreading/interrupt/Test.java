package com.ash.multithreading.interrupt;

import java.util.HashSet;

public class Test extends Thread{
    @Override
    public void run() {
        System.out.println(interrupted());
        System.out.println(interrupted());
        System.out.println(interrupted());

//        System.out.println(isInterrupted());
//        System.out.println(isInterrupted());
//        System.out.println(isInterrupted());

        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.start();
        test.interrupt();
    }
}
