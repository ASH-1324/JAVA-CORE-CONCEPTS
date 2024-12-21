package com.ash.java8.basics;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = () -> "Ash";
        System.out.println(employee.getName());

    }

}
