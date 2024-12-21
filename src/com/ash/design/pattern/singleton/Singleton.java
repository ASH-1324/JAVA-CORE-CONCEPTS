package com.ash.design.pattern.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("in private constructor");
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void display(){
        System.out.println("inside display");
    }
}
