package com.havefunwith.CLI.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String[] args) {
        /*
            ==============
            Exercise 1
            ==============
            Print todays Date and Time using LocalDate and LocalDateTime
        */
        System.out.println(LocalDate.now());
        System.out.println("====");
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd | HH:mm:ss a")));
        System.out.println();
        /*
            ==============
            Exercise 2
            ==============
            Represent your date of birth using LocalDate
        */
        System.out.println(LocalDate.of(1989, Month.AUGUST, 8));

        /*
            ==============
            Exercise 3
            ==============
            Add 100 days to your date of birth and print it
        */
        System.out.println(LocalDate.of(1989, Month.AUGUST, 8).plusDays(100));

        /*
            ==============
            Exercise 4
            ==============
            Write a method that calculate age on any given date

            hint: hint: subtract todays date[year] - date[year]
        */
        System.out.println("Age :: " + calculateAge(1989, 8, 8));
    }

    private static int calculateAge(int year, int month, int day) {
        LocalDate currentDate = LocalDate.now();
        int age = (currentDate.getYear() - year) - 1;
        if (currentDate.getMonthValue() > month) {
            age+=1;
        } else {
            if (currentDate.getMonthValue()  == month) {
                if (currentDate.getDayOfMonth() > day)
                    age+=1;
            }
        }
        return age;
    }
}
