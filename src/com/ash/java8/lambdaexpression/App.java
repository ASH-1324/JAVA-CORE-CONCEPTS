package com.ash.java8.lambdaexpression;

public class App {
    public static void main(String[] args) {
        Employee employee1 = () -> "Ash";
        System.out.println(employee1.getName());

        Employee employee2 = () -> "Max";
        System.out.println(employee2.getName());

        Employee employee3 = () -> "bob";
        System.out.println(employee3.getName());
    }
}
