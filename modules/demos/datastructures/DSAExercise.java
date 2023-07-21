package com.havefunwith.modules.demos.datastructures;

import java.util.*;

public class DSAExercise {

    public static void main(String[] args) {
        /*
            Exercise 1
            Number Of Occurrences
         */
        System.out.println("==========================");
        System.out.println("Exercise 1");
        System.out.println("Number of Occurrences");
        System.out.println("==========================");

        String[] numberList = {"1", "2", "1", "1", "3", "4", "5", "6", "7", "7", "7", "8", "8"};
        Map<String, Integer> occurrences = numberOfOccurrences(numberList);
        for (String element : occurrences.keySet()) {
            System.out.println(element + ": " + occurrences.get(element));
        }

        /*
            Exercise 2
            Most Number Of Occurrences
         */
        System.out.println("==========================");
        System.out.println("Exercise 2");
        System.out.println("Number of Most Occurrences");
        System.out.println("==========================");

        System.out.println(mostNumberOfOccurrences(numberList));

        /*
            Exercise 3
            Parenthesis Checker
         */
        System.out.println("==========================");
        System.out.println("Exercise 3");
        System.out.println("Parenthesis Checker");
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("Exercise 3");
        System.out.println("Parenthesis Checker");
        System.out.println("==========================");
        String testBkt1 = "[]"; // true
        String testBkt2 = "[[]"; // false
        String testBkt3 = "[{[]}]"; // true
        String testBkt4 = "[{[}]"; // false
        String testBkt5 = "[{{[(){}]}}[]{}{{(())}}]"; // true
        String testBkt6 = "[{{[(){}]}}[]}{{(())}}]"; // false
        String testBkt7 = "[{{}}[]{}{{(())}}]"; // true
        String testBkt8 = "[{}{}{{()}}]"; // true
        String testBkt9 = "[{}{{}}]"; // true
        String testBkt10 = "[{{}}]"; // true
        String testBkt11 = "[{}]"; // true
        String testBkt12 = "[{})]"; // false
        String testBkt13 = ""; // true

        System.out.println("testBkt1: " + isBalanced(testBkt1));
        System.out.println("testBkt2: " + isBalanced(testBkt2));
        System.out.println("testBkt3: " + isBalanced(testBkt3));
        System.out.println("testBkt4: " + isBalanced(testBkt4));
        System.out.println("=================================");
        System.out.println("testBkt5: " + isBalanced(testBkt5));
        System.out.println("testBkt6: " + isBalanced(testBkt6));
        System.out.println("testBkt7: " + isBalanced(testBkt7));
        System.out.println("testBkt8: " + isBalanced(testBkt8));
        System.out.println("testBkt9: " + isBalanced(testBkt9));
        System.out.println("testBkt10: " + isBalanced(testBkt10));
        System.out.println("testBkt11: " + isBalanced(testBkt11));
        System.out.println("testBkt12: " + isBalanced(testBkt12));
        System.out.println("testBkt13: " + isBalanced(testBkt13));
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
            Map<String, Integer> occurrencesMap = new HashMap<>();
            for (String element : input) {
                occurrencesMap.put(element, occurrencesMap.getOrDefault(element, 0) + 1);
            }
            return occurrencesMap;
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

        int mostOccurrences = 0;
        String result = "";
        for (String num : numberOfOccurrences.keySet()) { // O(b)
            int count = numberOfOccurrences.get(num);
            if (count > mostOccurrences) {
                mostOccurrences = count;
                result = num;
            }
        }
        return result;
    }

    /**
     * Exercise 3
     * Parenthesis Checker Given the following inputs
     *
     * String brackets = "[{{[(){}]}}[]{}{{(())}}]";
     * String brackets = "[{{}}[]{}{{(())}}]";
     * String brackets = "[{}{}{{()}}]";
     * String brackets = "[{}{{}}]";
     * String brackets = "[{{}}]";
     * String brackets = "[{}]";
     * String brackets = "";
     *
     * Check if the following parenthesis are balanced. i.e
     *
     * [] - true
     * [[] - false
     * ({[]}) - true
     * ({[}) - false
     *
     * for each corresponding opening bracket there is a closing bracket
     *
     * Think about which data structure you should use, implement the following
     * method and write unit tests
     *
     * public boolean isBalanced(String input) {
     *     return false;
     * }
     */
    private static boolean isBalanced(String input) {
        // declare and initialize a Stack DS of Characters
        Stack<Character> stackBracket = new Stack<>();
        char[] charArray = input.toCharArray();
        if (charArray.length == 0) {
            return false;
        }

        // loop through the given input by accessing each Character of the string
        for (char bracket : charArray) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stackBracket.push(bracket);
            } else {
                if (stackBracket.isEmpty()) {
                    return false;
                }
                char pop = stackBracket.pop();
                if (bracket == '(' && pop != ')' ||
                    bracket == '[' && pop != ']' ||
                    bracket == '{' && pop != '}') {
                    return false;
                }
            }
        }
        return stackBracket.isEmpty();
    }

}
