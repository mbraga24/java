package com.havefunwith.modules.demos.datastructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<Ball> ball = new HashSet<Ball>();

        Ball blueBall = new Ball("Blue");

        ball.add(blueBall);
        ball.add(new Ball("Red"));
        ball.add(new Ball("Green"));

        // As long as the equals() and hashCode methods have been overriden,
        // duplicates will be ignored.
        ball.add(new Ball("Green")); // Duplicate

        System.out.println("Size: " + ball.size());
        System.out.println("Contains: " + ball.contains(blueBall));
        System.out.println("Remove blueBall: " + ball.remove(blueBall));
        System.out.println("New Size: " + ball.size());

    }

    private static class Ball {
        private String color;

        Ball(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }
}
