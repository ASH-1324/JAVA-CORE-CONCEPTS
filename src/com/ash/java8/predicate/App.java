package com.ash.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {

//        Predicate it is boolean type method
//        Predicate<Integer> predicate = x -> x > 100;
//        Predicate<String> check = x -> x.toLowerCase().charAt(0) == 's';
//        System.out.println(predicate.test(1000));
//        System.out.println(check.test("Ashraf"));

//        Function it takes two argument
//        Function<String,Integer> getLength = x -> x.length();
//        System.out.println(getLength.apply("Ashraf"));

//        Function<Integer, Integer> function1 = x -> x*9;
//        System.out.println(function1.apply(2));
//
//        if we add two function by the help of andThen it makes another function
//        Function<Integer, Integer> function2 = x -> x*4;
//        System.out.println(function2.apply(2));
//        System.out.println(function1.andThen(function2).apply(2));

//        consumer method just consume the value
//        Consumer<String> stringConsumer = name -> System.out.println(name);
//        stringConsumer.accept("ashraf");
//
//        Consumer<List<Integer>> listConsumer1 = list -> {
//            for (Integer i : list) {
//                System.out.println(i + 10);
//            }
//        };
////        listConsumer.accept(Arrays.asList(1, 2, 3, 4));
//
//        Consumer<List<Integer>> listConsumer2 = list -> {
//            for (Integer i : list) {
//                System.out.println(i);
//            }
//        };
//
//        Consumer<List<Integer>> test = list -> {
//          for (Integer i : list){
//              System.out.println(i);
//          }
//        };
//
//        Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listConsumer1);
//        listConsumer.accept(Arrays.asList(1, 2, 3, 4));
//
//        listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1, 2, 3, 4));

        Supplier<Integer> supplier = () -> 5;
        System.out.println(supplier.get());
    }
}
