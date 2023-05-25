package com.havefunwith.CLI.utils;

public class Utils {

    /**
     * Method uses generics to display objects from any given array.
     *
     * @param array
     * @param <T>
     */
    public static <T> void display(T[] array) {
        for (T item : array) {
            System.out.println(item.toString());
        }
    }

}
