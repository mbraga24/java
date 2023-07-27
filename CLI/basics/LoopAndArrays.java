package com.havefunwith.modules.basics;

import java.util.Arrays;
import java.util.Locale;

public class LoopAndArrays {
    public static void main(String[] args) {
        /*
            ==============
            Exercise 1
            ==============
            declare an empty integer array of length = 3
            print the contents to the console
        */

        int[] numbersOne = new int[3];
            for (int val : numbersOne) {
                System.out.println(val);
            }

        /*
            ==============
            Exercise 2
            ==============
            fill it with the number `4`
            print the array to the console
        */

        Arrays.fill(numbersOne, 4);
        for (int val : numbersOne) {
            System.out.println(val);
        }

         /*
            ==============
            Exercise 3
            ==============
            reassign the second value in the array to the number `17`
            print the array to the console
        */
    numbersOne[2] = 17;
        for (int val : numbersOne) {
            System.out.println(val);
        }

    /*
        ==============
        Exercise 4
        ==============
        What happens when you try to re assign index 5 to any integer?
    */
        int[] numbersTwo = {1, 2, 3, 4, 5};
        numbersTwo[5] = 2; // will throw an out of bounds exception -- java.lang.ArrayIndexOutOfBoundsException:

    /*
        ==============
        Exercise 5
        ==============
        declare and initialize a String array which holds the values "a", "b", "c" and "d"
        print the array to the console
    */
        String[] stringArr = {"a", "b", "c", "d"};
        for (String str : stringArr) {
            System.out.println(str);
        }
        /*
            ==============
            Exercise 6
            ==============
            using your answer from Q5 above, create a second array which is initialized using your original array
            hint: instead of using the `new` keyword, try simply giving the name of your original array
            change the value at index 0 of the new array to "z"
            print both of your arrays and compare

            What do you think the output will be?
        */
            String[] reassignArr = stringArr;
            reassignArr[0] = "z";
            for (String str : reassignArr) {
                System.out.println(str);
            }

    /*
        ==============
        Exercise 7
        ==============
        using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        change the value at index 0 of the new array to "z"
        print both of the arrays and compare

        Have a play about with the second argument. What happens if it's greater or less than the length of the initial array?
    */
        String[] arrCopy = Arrays.copyOf(reassignArr, reassignArr.length+10);
        arrCopy[0] = "w";
        for (String str : arrCopy) {
            System.out.println(str);
        }

        /*
            ==============
            Exercise 8
            ==============
            Create a `for` loop which prints each item in the array
        */

            String[] a = {"a", "b", "c", "d"};
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

        /*
            ==============
            Exercise 9
            ==============
            create a for loop which goes from 0 to 10
            print each value
        */
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }

        /*
            ==============
            Exercise 10
            ==============
            create a for loop which goes from 10 down to 0
            print each value
        */
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }

    /*
        ==============
        Exercise 11
        ==============
        create an array. Remember to manually set the size
        create a for loop which goes from 0 to 10, adding each value to an array
        print our array
    */
        int[] arrTwo = new int[11];
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i;
        }
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.println(i + " :: " + arrTwo[i]);
        }

    /*
        ==============
        Exercise 12
        ==============
        create an array of n numbers
        create a sum variable
        create a loop
        add each item to the sum value
        outside the loop print the total sum
    */
        int[] arrThree = {2,3,3,4,5};
        int sum = 0;
        for (int i = 0; i < arrThree.length; i++) {
            sum += arrThree[i];
        }
        System.out.println("sum :: " + sum);

        /*
            ==============
            Exercise 13
            ==============
            Create a loop that makes all words in an array uppercase, print the array
            Start with the array: ["i", "sure", "do", "love", "bees"]. Create a for loop which makes each word uppercase in the array.
            Print the contents of the array in the terminal.

            Hint: You could achieve this by either creating a second array which you add to, or by reassigning the values in the initial array.
        */

            String[] beeLover = {"i", "sure", "do", "love", "bees"};
            for (int i = 0; i < beeLover.length; i++) {
                String word = beeLover[i].toUpperCase(Locale.ROOT);
                beeLover[i] = word;
            }
            for (int i = 0; i < beeLover.length; i++) {
                System.out.println(beeLover[i]);
            }

        /*
            ==============
            Exercise 14
            ==============
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you can start at highest index.

            Output should be: hello how are you?. Note question mark at the end
        */

            String[] greeting = {"you", "are", "how", "hello"};
            String space = "";
            String questionMark = "";
            for (int i = greeting.length-1; i >= 0; i--) {
                if (i != greeting.length-1) space = " ";
                if (i == 0) questionMark = "?";
                System.out.print(space + greeting[i] + questionMark);
            }

          /*
            ==============
            Exercise 15
            ==============
            Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

            Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array by using the String[] numbers = input.slip(", ")
            - then loop.
            - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
        */
            String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            double result = 0.0;
            String[] numbers = input.split(", ");
            for (String number : numbers) {
                result += Double.parseDouble(number);
            }
            System.out.println("RESULT :: " + result);

        /*
            ==============
            Exercise 16
            ==============
            Write a program that takes arguments from the program args and loops through args and prints each item in args
            Compile using: javac and run using: java

            i.e. javac Exercise5.java | java Exercise5 foo bar baz
        */

            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] :: " + args[i]);
            }

        /*
            ==============
            Exercise 17
            ==============
            The same as the above exercise but through IntelliJ
            Go to the tabs at the top of intellij: Run -> Edit Configurations -> Program Arguments
            Add the values in the Program Arguments input field.

            i.e. javac Exercise5.java | java Exercise5 foo bar baz
        */
    }
}
