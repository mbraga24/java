package com.havefunwith.modules.demos.datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "Coconut");
        myMap.put(2, "Orange Juice");
        myMap.put(3, "Paçoca");

        System.out.println("map: " + myMap);
        System.out.println("myMap.size(): " + myMap.size());
        System.out.println("myMap.get(1): " + myMap.get(1));
        System.out.println("myMap.get(2): " + myMap.get(2));
        System.out.println("myMap.containsKey(4): " + myMap.containsKey(4));
        System.out.println("myMap.keySet(): " + myMap.keySet());
        System.out.println("myMap.values(): " + myMap.values());
        System.out.println("myMap.remove(): " + myMap.remove(3));
        System.out.println("myMap.entrySet(): " + myMap.entrySet());

        System.out.println();

        myMap.entrySet().forEach(pair -> {
            System.out.println(pair.getKey() + " -- " + pair.getValue());
        });

        System.out.println();

        myMap.forEach((key, item) -> {
            System.out.println(key + " -- " + item);
        });

    }

}
