package com.ash.java8.lambdaexpression.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomSorting {
    public static void main(String[] args) {
        Student tony = new Student(400, "tony");
        Student ash = new Student(300, "Ash");
        Student max = new Student(200, "max");
        Student stark = new Student(100, "stark");

        ArrayList<Student> students = new ArrayList<>();
        students.add(tony);
        students.add(ash);
        students.add(max);
        students.add(stark);

        List<Student> list = Arrays.asList(tony, ash, max, stark);
        System.out.println(list);

        students.sort((a, b) -> Integer.compare(b.getId(), a.getId()));
        System.out.println(students);

        students.sort((a,b) -> (b.getName().compareTo(a.getName())));
        System.out.println(students);
    }
}
