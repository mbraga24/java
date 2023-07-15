package com.havefunwith.modules.demos.datastructures;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class DSA {

    public static void main(String[] args) {
        /*
            Exercise 1
            Number Of Occurrences
         */
        System.out.println("==========================");
        System.out.println("Exercise 1");
        System.out.println("Number of Occurrences");
        System.out.println("==========================");

        String[] numberList = {"1", "1", "1", "1", "3", "4", "5", "6", "7", "7", "7", "8", "8"};
        Map<String, Integer> occurrences = numberOfOccurrences(numberList);
        occurrences.entrySet().forEach(item -> {
            System.out.println(item.getKey()+ ": " + item.getValue());
        });

        /*
            Exercise 2
            Most Number Of Occurrences
         */
        System.out.println("==========================");
        System.out.println("Exercise 2");
        System.out.println("Number of Most Occurrences");
        System.out.println("==========================");

        System.out.println(mostNumberOfOccurrences(numberList));
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
     * Time Complexity: O(a)
     * Space Complexity: O(a)
     *
     */
    private static Map<String, Integer> numberOfOccurrences(String[] input) {
        Map<String, Integer> occurrences = new HashMap<>();
        for (String num : input) { // loop through the array -- O(a)
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

    /**
     * Exercise 2
     * Most Number Of Occurrences
     *
     * Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
     * Find the element that has the most number of occurrences
     * Your method should return something like the 1 since it occurs 4 times
     * Think about the data structure that you should use
     * Create a method. Think about the return type and parameters
     * Write unit tests for your method
     *
     * Time Complexity: O(a*b)
     * Space Complexity: O(a)
     *
     */
    private static String mostNumberOfOccurrences(String[] input) {
        Map<String, Integer> numberOfOccurrences = numberOfOccurrences(input); // O(a)

        AtomicInteger occurrence = new AtomicInteger();
        AtomicReference<String> keyMaster = new AtomicReference<String>();
        numberOfOccurrences.forEach((key, value) -> { // O(b)
            if (occurrence.get() < value) {
                occurrence.set(value);
                keyMaster.set(key);
            }
        });
        return keyMaster.get() + ": " + occurrence.get();
    }

}
