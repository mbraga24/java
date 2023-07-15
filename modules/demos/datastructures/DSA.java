package com.havefunwith.modules.demos.datastructures;

import java.util.*;

public class DSA {

    public static void main(String[] args) {
        String[] numberList = {"1", "1", "1", "1", "3", "4", "5", "6", "7", "7", "7", "8", "8"};
        Map<String, Integer> occurrences = numberOfOccurrences(numberList);
        occurrences.entrySet().forEach(item -> {
            System.out.println(item.getKey()+ ": " + item.getValue());
        });
    }

    /**
     *
     * Exercise 1
     * Number Of Occurrences
     *
     * Given the following array of strings. String[] input = "1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8";
     * Find the number of occurrences for each element
     * Your method should return something like the following:
     * {
     *     "1": 4,
     *     "3": 1,
     *     "4": 1,
     *     "5": 1,
     *     "6": 1,
     *     "7": 3,
     *     "8": 2
     * }
     *
     * Think about the data structure that you should use
     *
     * Create a method. Think about the return type and parameters
     *
     */
    private static Map<String, Integer> numberOfOccurrences(String[] input) {
        Map<String, Integer> occurrences = new HashMap<>();
        for (String num : input) { // loop through the array
            if (!occurrences.containsKey(num)) { // check if item is already a key
                occurrences.put(String.valueOf(num), 1); // if not a key, add item as a key with the initial value of 1
                continue; // break out of this current iteration
            }
            int value = occurrences.get(num); // if item is already a key, get the value for that key
            value++; // increase the value of that key by 1
            occurrences.put(String.valueOf(num), value); // reassign the value for that key
        }
        return occurrences;
    }

}
