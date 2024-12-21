package com.ash.java8.lambdaexpression.comparator;

import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(15);

        System.out.println("Before sorting " + arrayList);

        arrayList.sort((a, b) -> b - a);

        System.out.println("After the sort in descending " + arrayList);
    }
}
