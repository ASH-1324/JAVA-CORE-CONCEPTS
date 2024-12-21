package com.ash.java8.predicate.bipredicate;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class App {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> even = (x, y) -> x % 2 == 0 || y % 2 == 0;
        System.out.println(even.test(9, 7));

        BiFunction<String, String, Integer> length = (str1, str2) -> str1.length() + str2.length();
        System.out.println(length.apply("Ash", "max"));

        BiConsumer<String, Integer> get = (str, x) -> System.out.println(str + " " + x);
        get.accept("ash", 17);
    }
}
