package com.ash.java8.stream;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 2, 5, 4, 7, 6, 7, 8, 1, 3);

        List<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println(collect);
    }
}
