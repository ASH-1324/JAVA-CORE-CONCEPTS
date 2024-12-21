package com.ash.multithreading.join;

public class OfficerSignature extends Thread{
    @Override
    public void run() {
        System.out.println("Officer verifying a process.........");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Officer verification is completed.........");
    }
}
