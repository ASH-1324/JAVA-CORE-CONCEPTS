package com.ash.multithreading;

public class Test extends Thread {
    @Override
    public void run() {
        System.out.println("thread created");
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {

        System.out.println("in main method");

        Test test = new Test();

        test.start();
//        Thread thread = new Thread(test);
//
        System.out.println(Thread.currentThread());
        test.setName("ashraf");
//        thread.start();

//        (new Thread(new Test())).start();


//        (new Test()).start();
    }
}
