package com.ash.multithreading.join;

public class MedicalTest extends Thread {
    @Override
    public void run() {
        System.out.println("Medical checkup starting..........");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Medical checkup completed...............");
    }
}
