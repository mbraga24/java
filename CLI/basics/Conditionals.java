package com.havefunwith.modules.basics;

import java.util.Locale;

public class Conditionals {

    public static void main(String[] args) {

        /*
            ==============
            Exercise 1
            ==============
            create an integer variable
            create a second integer variable
            create an `if` statement which compares the two variables and prints to the console
                if they are equal
        */
        int justAnIntVar = 5;
        int justAnotherIntVar = 6;
        if (justAnIntVar == justAnotherIntVar) {
            System.out.println("I won't print.");
        }
        System.out.println("Told ya!");

        /*
            In this exercise, please use the shortened form of declaring a
            String-type variable (e.g. String myString = "Hello!")

            ==============
            Exercise 2
            ==============
            create a string variable
            create a second string variable which has the same value as the first
            create an `if` statement which compares the two variables and prints to the console
                if they are equal
        */
        String hi = "Hi";
        String hi2 = "Hi";
        if (hi == hi2) {
            System.out.println("They ARE equal!");
        }

        /*
            Repeat the same exercise as above, but this time ensure that you are creating a new
            string object for both variables (e.g. String myString = new String("Hello!"))

            ==============
            Exercise 3
            ==============
            create an string variable using the `new` keyword
            create a second string variable which has the same value as the first, again using the
                `new` keyword
            create an `if` statement which compares the two variables and prints to the console if
                they are equal

            => How strange. We have two variables that are being assigned the same String value
                but they aren't equal? Why is this?

            => Try changing your answer to instead use the .equals() method. Does this change how
                your code behaves at all?

                Explanation ::
                We can use == operators for reference comparison (address comparison) and .equals() method
                for content comparison. In simple words, == checks if both objects point to the same memory
                location whereas .equals() evaluates to the comparison of values in the objects.
        */
        String hello = new String("Hello");
        String hello2 = new String("Hello");
        if (hello == hello2) {
            System.out.println("Are they equal?");
        }
        if (hello.equals(hello2)) {
            System.out.println("I guess these are equal.");
        }

        /*
            Similar to Question 1, now create an if statement which checks if one Integer value is
            greater than the other. Include an else statement here for if the condition is not satisfied.

            ==============
            Exercise 4
            ==============
            create two `int` variables. Assign them values
            create an `if` statement which compares whether one value is greater than the other
            print something to the console if the condition is met
            create an `else` statement which prints to the console if the above condition is NOT met
         */
            int num2 = 5;
            int num3 = 6;

            if (num2 > num3) {
                System.out.println("They are equal.");
            } else {
                System.out.println("They are NOT equal.");
            }

        /*
            Expanding on your answer to Question 4, create a third Integer value and modify your if
            statement to check if the first value is greater than the second and less than the third.

            ==============
            Exercise 5
            ==============
            create three `int` variables. Assign them values with the first value sitting between the other two
            create an `if` statement which compares whether the first value is greater than the second AND
                less than the third
            print something to the console if the condition is met
            create an `else` statement which prints to the console if the above condition is NOT met
         */
            int num4 = 6;
            int num5 = 3;
            int num6 = 10;

            if (num4 > num5 && justAnIntVar < num6) {
                System.out.println("Checks!");
            } else {
                System.out.println("Not this time.");
            }

        /*

            Modify your answer to Question 5 to instead use an OR operator. Play with the values assigned
            to your three variables, noting how the behaviour changes.

            ==============
            Exercise 6
            ==============
         */
            int num7 = -1;
            int num8 = 3;
            int num9 = 10;

            if (num7 > num8 || num7 < num9) {
                System.out.println("Checks!");
            } else {
                System.out.println("Not this time.");
            }

        /*
            In this example, we're going to try something a tad more involved. Let's make an
            if statement which checks if a String starts with a specified character. In this example,
            try using the .charAt() method which can be applied to strings within your if statement.
            Bear in mind that this method will yield a Character-type value, which will need to be
            compared against another Character within the condition. To create an inline variable of
            Character type, try using single quotes ' instead of double quotes ".

            ==============
            Exercise 7
            ==============
            create a String variable and assign it a value
            create an `if` statement which grabs the first letter of your word and compares it against
                a Character value
            print something to the console if the condition is met

            => Can you think of a way to make this check case insensitive?
         */
        String greetings1 = "Hello!";
        if (greetings1.toLowerCase(Locale.ROOT).charAt(0) == 'h') {
            System.out.println("They are indeed the same character");
        }

        /*
            In this final example, let's go one more step further and introduce a for loop to our
            previous answer. The idea is to use a for loop to check if the provided character is
            present at any point within our word.

            ==============
            Exercise 8
            ==============
            create a String variable and assign it a value
            create a `for` loop which wraps around your answer from Question 7
            modify your `if` statement to check the character at each index
            Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
            print something to the console if the condition is met

            => Once you get this working, try replacing using a word which contains your provided character
                multiple times (if you haven't already). How does your application behave? Do you have any
                unintended behaviour?

            => If you do have some unintended behaviors, such as additional printed statements, how could
                you fix them?

            => Hint: The break keyword
         */
            String greetings2 = "Opposite!";
            for (int i = 0; i < greetings2.length(); i++) {
                if (greetings2.toLowerCase(Locale.ROOT).charAt(i) == 'o') {
                    System.out.println("Found letter :: " + greetings2.toLowerCase(Locale.ROOT).charAt(i));
                    break;
                }
            }

        /*
            ==============
            Exercise 9
            ==============
            create a for loop which goes from 0 to 20
            print each even value
         */

        for(int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number :: " + i + " found.");
            }
        }

    }
}
