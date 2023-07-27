package com.havefunwith.modules.demos.streams;

import java.util.Arrays;
import java.util.List;

public class MockData {

     private static List<Person> people = Arrays.asList(new Person("Michael", 18),
            new Person("Sarah", 19),
            new Person("Kayla", 15),
            new Person("July", 17),
             new Person("John", 19),
             new Person("Tim", 16),
             new Person("Victoria", 17),
             new Person("Victor", 19),
             new Person("Salma", 14),
             new Person("Kimberly", 17),
             new Person("Jordan", 19),
             new Person("Alex", 14),
             new Person("Jessica", 17),
             new Person("Monica", 12),
             new Person("Rachel", 13),
             new Person("Liz", 14),
             new Person("Elizabeth", 17),
             new Person("Brad", 17),
             new Person("Daniel", 14),
            new Person("Tom", 22));

    public static List<Person> getPeople() {
        return people;
    }

}
