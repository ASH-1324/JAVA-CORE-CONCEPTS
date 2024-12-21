package com.ash.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(15, "max"));
        personList.add(new Person(10, "ironman"));
        personList.add(new Person(12, "Ash"));


        personList.sort(new NameComparator());
//        personList.sort(new NameComparator());
        System.out.println("Custom sorting in ASCENDING order by name");
        for (Person person : personList) {
            System.out.println(person.getName());
        }

        System.out.println("===========================");

        System.out.println("Custom sorting in DESCENDING order by age");
        personList.sort(new AgeComparator());
        for (Person person : personList){
            System.out.println(person.getAge());
        }
    }
}
