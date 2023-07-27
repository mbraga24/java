package com.havefunwith.CLI.basics;

import java.util.Locale;

public class GettingStarted {
        public static void main(String[] args) {

        /*
            ==============
            Exercise 1
            ==============
            Original exercise. What is wrong with the code below?
            static void main(String args) {
                System.out.println("Fixed");
              }
         */

        // Bugs fixed.
        // public static void main(String[] args) {
        //      System.out.println("Fixed");
        //      }

        /*
            Create a class called Compile.java with the following code
            public class Exercise {
                public static void main(String[] args) {
                    System.out.println("I can compile and run from the terminal. Hooray 🎉");
                }
            }
        */

       /*
            ==============
            Exercise 2
            ==============
            Write a program that compares two numbers. Use any comparison operator
            Create 3 variables.
            2 variables to store both numbers and 1 variable store the result
            Print the result
        */
        int myVarOne = 5;
        int myVarTwo = 10;
        int result = myVarOne + myVarTwo;

        System.out.println(result);

        /*
            ==============
            Exercise 3
            ==============
            Write a program that compares two String contents.
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */

        String dogs = "dogs";
        String cats = "cats";
        Boolean isItADog = dogs == cats;

        System.out.println(isItADog);

        /*
            ==============
            Exercise 4
            ==============
            Write a program that transform "Marlon" to "MARLON"
         */
        String myName1 = "Marlon";

        System.out.println(myName1.toUpperCase(Locale.ROOT));

        /*
            ==============
            Exercise 5
            ==============
            Write a program that transform "marlon" to "Marlon"
         */
        String myName2 = "marlon";

        String firstLetter = myName2.substring(0, 1);
        String restOfTheWord = myName2.substring(1);

        System.out.println(firstLetter + restOfTheWord);

        /*
            ==============
            Exercise 6
            ==============
            Write a program that compares two numbers. i.e x > y
            Create 3 variables.
            2 to store both numbers and 1 to store the result
            Print the result
        */

        int numberOne = 5;
        int numberTwo = 10;
        boolean resultComparison = numberOne > numberTwo;

        System.out.println(resultComparison);
        }
}
