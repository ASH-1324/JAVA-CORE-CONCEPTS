package com.ash.java8.methodandconstructorrefrence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class App {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Ash", "Max", "Tony", "stark");
//
////        for (String str : list){
////            System.out.println(str);
////        }
//
//        list.forEach(System.out::println);
//    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("ash", "max", "alex");

        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());

        System.out.println(collect);
    }
}
