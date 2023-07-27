package com.havefunwith.CLI.basics;

import java.util.Locale;

public class Enum {

   /*
        ==============
        Exercise 1
        ==============
        create enum to represent t-shirt sizes from small to extra large.
    */

    /*
        ==============
        Exercise 2
        ==============
        Remove the above enum from this class and put it as separate file.
        You should create a separate class of type enum
        Run this code and should print T Shirt Size: M
    */

    enum TShirtSizeInClass {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE
    }

    public static void main(String[] args) {

        System.out.println(String.format("T-shirt size from Class :: %s", TShirtSizeInClass.SMALL));
        System.out.println(String.format("T-shirt size from ENUM :: %s", TShirtSize.EXTRA_LARGE));

        /*
            ==============
            Exercise 2
            ==============s
            invoke .values() method on ThirstSize enum and loop through its values and while looping
            lowercase each value

            hint: while you loop through enums invoke .name() to convert enum to string. without it,
            you can't lowercase
        */
        int number = 1;
        for (TShirtSize size : TShirtSize.values()) {
            System.out.println(String.format("Shirt size %s :: %s", number, size.name().toLowerCase(Locale.ROOT)));
            number+=1;
        }


    }

}
