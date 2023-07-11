package com.havefunwith.modules.demos.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    // FIFO - First In First Out

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Marcelo"));
        queue.add(new Person("Danyel"));
        queue.add(new Person("João"));

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue peek: " + queue.peek().toString());
        System.out.println("Queue poll: " + queue.poll().toString());
        System.out.println("Queue size: " + queue.size());

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
