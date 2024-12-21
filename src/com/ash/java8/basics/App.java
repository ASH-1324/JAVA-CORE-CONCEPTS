package com.ash.java8.basics;

public class App implements Child, Parent {
    public static void main(String[] args) {
        App app = new App();
        app.same();
    }

    @Override
    public void display() {

    }

    @Override
    public void same() {
        Child.super.same();
        System.out.println("main class implementation");
    }
}
