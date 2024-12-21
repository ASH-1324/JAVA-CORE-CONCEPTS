package com.ash.java8.optional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<String> name = getName(1);
//        if (name.isPresent()) {
//            System.out.println(name.get());
//        }
//        name.ifPresent(System.out::println);

//        String string = name.isPresent() ? name.get() : "NA";
//        String string = name.orElse("NA");
//        System.out.println(string);

        Optional<String> optional = name.map(String::toUpperCase);//(x -> x.toUpperCase());
        optional.ifPresent(System.out::println);

    }

    private static Optional<String> getName(int id) {
        String name = "Ash";
        return Optional.ofNullable(name);
    }
}
