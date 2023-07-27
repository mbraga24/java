package com.havefunwith.modules.demos.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {


        System.out.println("=========================");
        System.out.println("IMPERATIVE APPROACH");
        System.out.println("=========================");
        System.out.println(imperativeApproach(MockData.getPeople()));
        System.out.println("Size():: " + imperativeApproach(MockData.getPeople()).size());

        System.out.println("=========================");
        System.out.println("DECLARATIVE APPROACH");
        System.out.println("=========================");
        System.out.println(declarativeApproach(MockData.getPeople()));
        System.out.println("Size():: " + declarativeApproach(MockData.getPeople()).size());

    }

    /*
        1. Find people age less or equal 18
        2. Then change implementation to find first 10 people
     */

    // IMPERATIVE
    public static List<Person> imperativeApproach(List<Person> people) {
        List<Person> youngPeople = new ArrayList<>();
        int limit = 8;
        for (Person p : people) {
            if (p.getAge() <= 18 && limit > 0) {
                youngPeople.add(p);
                limit--;
            }
        }
        return youngPeople;
    }

    /*
        allMatch
        anyMatch
     */

    public static List<Person> declarativeApproach(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() <= 18) // intermediate operator
                .limit(8) // intermediate operator
                .collect(Collectors.toList()); // terminal operator
    }


}
