package com.havefunwith.CLI.basics;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<Color> colors = new HashSet<>();

        colors.add(new Color("blue"));
        colors.add(new Color("blue"));
        colors.add(new Color("red"));
        colors.add(new Color("yellow"));

        System.out.println("Colors size: " + colors.size());

    }

    private static class Color {
        private String name;

        Color(String name) {
            this.name = name;
        }

        /**
         * hashCode needs to be overriden in order to work with
         * equals.
         *
         * @return
         */
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        /**
         * equals needs to be overriden in order to properly maintain
         * unique elements in the set.
         * @param obj
         * @return
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Color color = (Color) obj;
            return Objects.equals(name, color.name);
        }

//        @Override
//        public boolean equals(Object obj) {
//            return super.equals(obj);
//        }
    }

}
