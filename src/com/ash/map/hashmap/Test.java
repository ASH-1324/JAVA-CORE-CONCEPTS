package com.ash.map.hashmap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ash", 19);
        map.put("max", 19);
        map.put("leo", 19);

        System.out.println(map);

//        long index = 107030 & (16-1);
//
//        System.out.println(index);
//
//        System.out.println("Aman".hashCode());
//        System.out.println("max".hashCode());
//        System.out.println("Ash".hashCode());
//        System.out.println("leo".hashCode());
    }
}
