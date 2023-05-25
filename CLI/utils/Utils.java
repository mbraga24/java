package com.havefunwith.CLI.utils;

public class Utils {

    public static <T> void display(T[] array) {
        for (T item : array) {
            System.out.println(item.toString());
        }
    }

}
