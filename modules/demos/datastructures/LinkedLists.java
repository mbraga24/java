package com.havefunwith.modules.demos.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Nora"));
        linkedList.add(new Person("Samantha"));
        linkedList.add(new Person("Nathalie"));

        System.out.println("LL size: " + linkedList.size());
        System.out.println("LL get: " + linkedList.get(2));

        ListIterator<Person> personListIterator = linkedList.listIterator();

        while(personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    private static class Person {
        private String name;
        Person(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
