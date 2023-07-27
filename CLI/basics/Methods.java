package com.havefunwith.modules.basics;

import java.util.Locale;

public class Methods {
    public static void main(String[] args) {

        // Warm up:
        double result = calculatePropertyYield(1_300, 250_000);
        System.out.printf("value :: %.2f %n", result);

        // Exercise 1:
        calculateSum(5, 10);

        // Exercise 2:
        System.out.println(negateNumber(5));
        System.out.println(negateNumber(-10));

        // Exercise 3:
        System.out.println("2 and 2 the same: " + isItTheSameNumber(2, 2));
        System.out.println("3 and 4 the same: " + isItTheSameNumber(3, 4));

        // Exercise 4:
        checkNumbers(3, 2);
        checkNumbers(2, 3);
        checkNumbers(2, 2);

        // Exercise 5:
        System.out.println(capitalizeFirstLetter("world!"));

        // Exercise 6:
        System.out.println(numberOfElements(new String[] {"one", "two", "three"}));

        // Exercise 7:
        printWordCount("Finished the last exercise.");
    }
    /*
        ==============
        Warm up
        ==============
        Write a method that calculates the rental yields.

        Example formula below:
        Your monthly rental income is: 1,300
        Your annual rental income is: 1,300 x 12 = 15,600
        You purchased the property for: 250,000
        Your rental yield is: (15,600 : 250,000) x 100 = 6.24%
    */
    public static double calculatePropertyYield(double rental, double propertyValue) {
        return (yearlyRental(rental) / propertyValue) * 100.0;
    }

    private static double yearlyRental(double rental) {
        return rental * 12;
    }

    /*
        ==============
        Exercise 1
        ==============
        Write a method which takes two numbers as arguments and prints their sum
        to the terminal.
    */
    private static void calculateSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    /*
        ==============
        Exercise 2
        ==============
        Write a method which takes a number as an argument and returns that number
        negated, e.g. passing 5 as an argument should return -5; passing -10 should return 10.
    */
    private static int negateNumber(int number) {
        return number * (-1);
    }

    /*
        ==============
        Exercise 3
        ==============
        Write a method which takes two numbers as arguments, checks if they are the same and returns
        the appropriate boolean value.

        You should check both possible outcomes here, i.e. that it returns true when it is supposed
        to and false when it is supposed to.
    */
    private static Boolean isItTheSameNumber(int num1, int num2) {
        if (num1 == num2)
            return true;
        else
            return false;
    }

    /*
        ==============
        Exercise 4
        ==============
        Write a method which takes two numbers as arguments and prints one of:

        "The first number is larger"
        "The second number is larger"
        "The numbers are equal"
        as appropriate.
    */
    private static void checkNumbers(int num1, int num2) {
        if (num1 > num2)
            System.out.println("The first number is larger");
        else if (num2 > num1)
            System.out.println("The second number is larger");
        else
            System.out.println("The numbers are equal");
    }

    /*
        ==============
        Exercise 5
        ==============
        Write a method which takes a string as an argument, capitalizes the first letter and returns
        the capitalized string.

        HINT: The .toUpperCase() method will capitalize the whole string. Investigate how to split
        the first letter from the string, capitalize that, then join the pieces back together
    */
    private static String capitalizeFirstLetter(String word) {
        String firstLetter = word.split("")[0];
        String[] remainingWord = word.split("");
        remainingWord[0] = firstLetter.toUpperCase(Locale.ROOT);
        return String.join("", remainingWord);
    }

    /*
        ==============
        Exercise 6
        ==============
        Write a method which takes an array of strings as an argument and returns the number
        of items in the array.
    */
    private static int numberOfElements(String[] list) {
        return list.length;
    }

    /*
        ==============
        Exercise 7
        ==============
        Write a method which takes a sentence as an argument, counts the number of words in the
        array and prints "The sentence contains X words".
    */
    private static void printWordCount(String phrase) {
        String[] words = phrase.split(" ");
        System.out.println("The sentence contains " + words.length + " words");
    }
}
