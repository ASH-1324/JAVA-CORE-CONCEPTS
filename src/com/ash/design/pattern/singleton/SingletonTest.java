package com.ash.design.pattern.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton1 = new Singleton();
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        singleton1.display();
//        singleton.display();
    }
}
