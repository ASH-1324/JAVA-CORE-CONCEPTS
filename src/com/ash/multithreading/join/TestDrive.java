package com.ash.multithreading.join;

public class TestDrive extends Thread{
    @Override
    public void run() {
        System.out.println("Test drive starting.........");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Test drive completed..........");
    }
}
