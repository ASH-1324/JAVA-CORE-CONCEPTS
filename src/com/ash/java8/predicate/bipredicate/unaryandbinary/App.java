package com.ash.java8.predicate.bipredicate.unaryandbinary;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
//  1st  UnaryOperator (child) = it is a special case of Function(parent) interface.

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(7));

//        more efficient code
//        IntUnaryOperator square = x -> x * x;
//        System.out.println(square.applyAsInt(6));

//  2nd   BinaryOperator (child) = it is special case of BiFunction(parent) interface

        BinaryOperator<String> length = (str1, str2) -> str1 + str2;
        System.out.println(length.apply("Ash", "max"));
    }
}
