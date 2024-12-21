package com.ash.multithreading.sleep;

public class Test {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(i);
        }
    }
}
