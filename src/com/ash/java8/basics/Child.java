package com.ash.java8.basics;

@FunctionalInterface
public interface Child {

    public static final int a = 10;

    public void display();

    private void hello() {

    }

    static void m3() {
        System.out.println("inside m3");
    }

    default void same() {
        System.out.println("in child");
    }

//    public void m1();
}
