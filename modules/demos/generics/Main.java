package com.havefunwith.modules.demos.generics;

import org.w3c.dom.ls.LSOutput;

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

    }

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

}
