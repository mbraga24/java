package com.havefunwith.modules.basics;

public class ArraysConditionalMethods {
    public static void main(String[] args) {
        /*
            ==============
            Exercise 1
            ==============
            Write a method that reverses any String and print to console
            Input should be a string
            Output should be reversed input
        */
        System.out.println(reverseString("hello"));;
    }

    private static String reverseString(String str) {
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length/2; i++) {
            String box = strArray[strArray.length-1-i];
            strArray[strArray.length-1-i] = strArray[i];
            strArray[i] = box;
        }
        return String.join("", strArray);
    }
}
