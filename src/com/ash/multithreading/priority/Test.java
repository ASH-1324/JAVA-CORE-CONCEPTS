package com.ash.multithreading.priority;

import static java.lang.Thread.MAX_PRIORITY;

public class Test implements Runnable {

    @Override
    public void run() {
        System.out.println("in run method");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new Thread(test);

        System.out.println("in main method");

        System.out.println(Thread.currentThread().getPriority());

        thread.setPriority(MAX_PRIORITY);

        thread.start();
//        System.out.println(Thread.currentThread().getPriority());
    }
}
