package com.ash.multithreading.yield;

public class Test implements Runnable {
    @Override
    public void run() {

        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new Thread(test);

        thread.start();
        Thread.yield();

        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
