package com.ash.java8.basics;

@FunctionalInterface
public interface Parent {
    public void display();

    static void m1() {
        System.out.println("inside m1");
    }

    default void same() {
        System.out.println("in parent");
    }
}
