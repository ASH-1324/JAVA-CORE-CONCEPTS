package com.ash;

import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
    public static void main(String[] args) {
        Predicate<String> check = temp -> temp.toLowerCase().charAt(0) == 'a';
        System.out.println(check.test("Ashraf"));

        Function<String, String> function1 = str -> str.toLowerCase().replace('a', 'x');

        System.out.println(function1.apply("Ashraf"));
    }
}
