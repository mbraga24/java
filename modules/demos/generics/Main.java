package com.havefunwith.modules.demos.generics;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ========================
        // GENERICS
        // ========================
        System.out.println("========================");
        System.out.println("GENERICS");
        System.out.println("========================");

        Box<Phone> boxPhone = new Box<>();

        boxPhone.set(new Phone("225-546-4655"));

        System.out.println("boxPhone -- Phone: " + boxPhone.get());

        Box<Letter> boxLetter = new Box<>();

        boxLetter.set(new Letter("John"));

        System.out.println("boxLetter -- Letter: " + boxLetter.get());

        // ========================
        // BOUNDED TYPE PARAMETERS
        // ========================
        System.out.println("========================");
        System.out.println("BOUNDED TYPE PARAMETERS");
        System.out.println("========================");

        Integer[] iNumbers = {1, 2, 3};
        Double[] dNumbers = {1.0, 2.0, 3.0};

        System.out.println("Integer: " + countGreaterNumbers(iNumbers, 0));
        System.out.println("Double: " + countGreaterNumbers(dNumbers, 2.0));

        // ========================
        // UNBOUNDED WILDCARD
        // ========================
        System.out.println("========================");
        System.out.println("UNBOUNDED WILDCARD");
        System.out.println("========================");
        LocalDate unbDate1 = LocalDate.now();
        LocalDate unbDate2 = LocalDate.now();

        List<Integer> unbInt = Arrays.asList(1, 2, 3);
        List<Double> unbDoub = Arrays.asList(1.2, 2.4, 5.6);
        List<String> unbStr = Arrays.asList("John", "Peter", "Sarah");
        List<Object> unbDate = Arrays.asList(unbDate1.getDayOfMonth(), unbDate2.getDayOfWeek());

        print(unbInt);
        print(unbDoub);
        print(unbStr);
        print(unbDate);

        // ========================
        // UPPER BOUNDED WILDCARD
        // ========================
        System.out.println("========================");
        System.out.println("UPPER BOUNDED WILDCARD");
        System.out.println("========================");
        LocalDate uppDate1 = LocalDate.now();
        LocalDate uppDate2 = LocalDate.now();

        List<Integer> uppInt = Arrays.asList(1, 2, 3);
        List<Double> uppDoub = Arrays.asList(1.2, 2.4, 5.6);
//        List<String> uppStr = Arrays.asList("John", "Peter", "Sarah");
//        List<Object> uppDate = Arrays.asList(uppDate1.getDayOfMonth(), uppDate2.getDayOfWeek());

        printUpp(uppInt);
        printUpp(uppDoub);
//        printUpp(uppStr); // incompatible types: java.util.List<java.lang.String> cannot be converted to java.util.List<? extends java.lang.Number>
//        printUpp(uppDate); // incompatible types: java.util.List<java.lang.Object> cannot be converted to java.util.List<? extends java.lang.Number>

        // ========================
        // LOWER BOUNDED WILDCARD
        // ========================
        System.out.println("========================");
        System.out.println("LOWER BOUNDED WILDCARD");
        System.out.println("========================");
        LocalDate lowDate1 = LocalDate.now();
        LocalDate lowDate2 = LocalDate.now();

        List<Integer> lowInt = Arrays.asList(1, 2, 3);
//        List<Double> lowDoub = Arrays.asList(1.2, 2.4, 5.6);
//        List<String> lowStr = Arrays.asList("John", "Peter", "Sarah");
//        List<Object> lowDate = Arrays.asList(lowDate1.getDayOfMonth(), lowDate2.getDayOfWeek());

        printLow(lowInt);
//        printLow(lowDoub); // incompatible types: java.util.List<java.lang.Double> cannot be converted to java.util.List<? super java.lang.Integer>
//        printLow(lowStr); // incompatible types: java.util.List<java.lang.String> cannot be converted to java.util.List<? super java.lang.Integer>
//        printUpp(lowDate); // incompatible types: java.util.List<java.lang.Object> cannot be converted to java.util.List<? super java.lang.Integer>

    }

    // ========================
    // BOUNDED TYPE PARAMETERS
    // ========================
    static <T extends Comparable<T>> int countGreaterNumbers(T[] numbers, T number) {

        int count = 0;
        for (T n : numbers) {
            System.out.println("n.compareTo(number) :: " + n.compareTo(number));
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }

    // ========================
    // UNBOUNDED WILDCARD
    // ========================
    static void print(List<?> myList) {
        myList.forEach(el -> {
            System.out.println(el.getClass().getName() + ":: " + el);
        });
    }

    // ========================
    // UPPER BOUNDED WILDCARD
    // ========================
    static void printUpp(List<? extends Number> myList) {
        myList.forEach(el -> {
            System.out.println(el.getClass().getName() + ":: " + el);
        });
    }

    // ========================
    // LOWER BOUNDED WILDCARD
    // ========================
    static void printLow(List<? super Integer> myList) {
        myList.forEach(el -> {
            System.out.println(el.getClass().getName() + ":: " + el);
        });
    }

}
