package com.havefunwith.modules.demos.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Maps {

    public static void main(String[] args) {

        workingWithMaps();

        System.out.println("===============================");
        System.out.println("    HASHCODE & HASHFUNCTION    ");
        System.out.println("===============================");

        Map<Person, Pet> prsnPet = new HashMap<>();

        prsnPet.put(new Person("Michael"), new Pet("Cat"));

        System.out.println(new Person("Michael").hashCode());
        System.out.println(new Person("Michael").hashCode());
        System.out.println(prsnPet.get(new Person("Michael")));
    }

    private static void workingWithMaps() {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "Coconut");
        myMap.put(2, "Orange Juice");
        myMap.put(3, "Paçoca");

        System.out.println("map: " + myMap);
        System.out.println("myMap.size(): " + myMap.size());
        System.out.println("myMap.get(1): " + myMap.get(1));
        System.out.println("myMap.get(2): " + myMap.get(2));
        System.out.println("myMap.containsKey(4): " + myMap.containsKey(4));
        System.out.println("myMap.keySet(): " + myMap.keySet());
        System.out.println("myMap.values(): " + myMap.values());
        System.out.println("myMap.remove(): " + myMap.remove(3));
        System.out.println("myMap.entrySet(): " + myMap.entrySet());

        System.out.println();

        myMap.entrySet().forEach(pair -> {
            System.out.println(pair.getKey() + " -- " + pair.getValue());
        });

        System.out.println();

        myMap.forEach((key, item) -> {
            System.out.println(key + " -- " + item);
        });
    }

    private static class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static class Pet {
        private String pet;

        Pet(String pet) {
            this.pet = pet;
        }

        @Override
        public String toString() {
            return "Pet{" +
                    "pet='" + pet + '\'' +
                    '}';
        }
    }

}
