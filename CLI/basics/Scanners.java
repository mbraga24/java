package com.havefunwith.modules.basics;

import java.util.Locale;
import java.util.Scanner;

public class Scanners {

    enum divisibility {
        ODD,
        EVEN
    }

    public static void main(String[] args) throws InterruptedException {

        // Ask name -- nextLine()
//        System.out.println("Hello, what is your name?");
//        Scanner scanner1 = new Scanner(System.in);
//        String name = scanner1.nextLine();
//        System.out.println(String.format("Great to mee you, %s!", name));

        // Ask age -- nextInt()
//        Thread.sleep(2000);
//        System.out.println("How old are you?");
//        int age = scanner1.nextInt();
//        System.out.println(String.format("Oh, great! You don't look %s.", age));

        /*
            ==============
            Exercise 1
            ==============
            Take an input string from the user (from the terminal) and print it back out all
            in upper case.

            create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
            create a variable which is assigned to the value passed into the scanner from the terminal
            print this variable
        */
//        Scanner scanner2 = new Scanner(System.in);
//
//
//        System.out.println("User input: ");
//        String input = scanner2.nextLine();
//        System.out.println("You entered: " + input);

        /*
            ==============
            Exercise 2
            ==============
            Write a program that receives numbers as program arguments and prints to console if
            numbers are even or odd
            You might compile and run the program via command line or by editing configuration and
            pass program arguments
        */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please, enter any Natural number to check if it is even or odd:");
//        String input = scanner.nextLine();
//        System.out.println(isEvenOrOdd(input));

        /*
            ==============
            Exercise 3
            ==============
            Write a method that displays random joke to the user.
            Your program should stop displaying jokes when use inputs no.

            Example:
            Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
        */
        String input = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Want to hear a joke?");
            input = scanner.nextLine();
            Thread.sleep(1000);
            if (input.toLowerCase(Locale.ROOT).equals("yes"))
                tellJoke();
            else
                System.out.println("You're no fun. Goodbye!");
            Thread.sleep(1000);
        } while(input.toLowerCase(Locale.ROOT).equals("yes"));

    }

    private static void tellJoke() throws InterruptedException {
        System.out.println("What’s the best thing about Switzerland?");
        Thread.sleep(2000);
        System.out.println("I don't know, but the flag is a big plus.");
    }

    private static String isEvenOrOdd(String input) {
        int number = Integer.parseInt(input);
        if (number % 2 != 0) {
            return String.valueOf(divisibility.ODD);
        } else {
            return String.valueOf(divisibility.EVEN);
        }
    }
}
