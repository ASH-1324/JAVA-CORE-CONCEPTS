package com.ash.multithreading.Deamon;

public class Test extends Thread {

    @Override
    public void run() {
        System.out.println("thread create");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().isDaemon());

    }

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("hello everyone");

//        (new Test()).start();
        Test test = new Test();
        test.setDaemon(true);
        System.out.println(test.isDaemon());
//        System.out.println(Thread.currentThread().getName());
        test.start();
//        System.out.println(test.isAlive());
    }
}
