package com.havefunwith.modules.basics;

import static java.lang.Integer.parseInt;

public class ExceptionHandling {

    private static final String SPACE = " ";

    public static void main(String[] args) {

        System.out.println("=========== EXERCISE 1 ===========\n");
        /*
            ==============
            Exercise 1
            ==============
            write a program that converts program arguments to an integer
            if value cannot be converted to int store them somewhere
            calculate sum for numbers that can be converted to an integer
            finally print the numbers that cannot be converted to an int
            example: java com.amigoscode.exercises.week_two_wed.exercises.Exercise 6 1 2 a b foo 3
            output: Sum: 6 and a, b, foo are not numbers.
        */

        // My solution
        try {
            String result = convertArgumentsToIntAndAdd("6 1 2 a b foo 3");
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Exception :: " + e.getMessage());
        }

        System.out.println("\n=========== EXERCISE 2 ===========\n");
        /*
            ==============
            Exercise 2
            ==============
            run the below code to see what error you get
            then surround it with try catch block and catch the exception that was thrown.
            Inside catch the catch block print "cannot divide by 0"
        */

        exerciseTwo();
    }

    public static String convertArgumentsToIntAndAdd(String arg) throws NumberFormatException {
        String[] argValues = arg.split(" ");
        String notANumber = "";
        int sum = 0;
          for (int i = 0; i < argValues.length; i++) {
              char charAt = argValues[i].charAt(0);
              if (charAt >= 65 && charAt <= 90 || charAt >= 97 && charAt <= 122) {
                  if (!notANumber.isEmpty()) notANumber += ",";
                  notANumber += SPACE.concat(String.valueOf(argValues[i]));
              } else {
                  sum += parseInt(argValues[i]);
              }
          }
          return String.format("Sum: %d and%s are not numbers", sum, notANumber);
    }

    public static void exerciseTwo() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception :: " + e.getMessage() + " - cannot divide by 0");
        }
    }
}
