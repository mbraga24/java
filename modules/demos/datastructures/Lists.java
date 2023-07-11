package com.havefunwith.modules.demos.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        System.out.println("Colors size: " + colors.size());
        System.out.println("Is there blue? " + colors.contains("blue"));
        System.out.println("Is there green? " + colors.contains("green"));
        System.out.println(colors);

        System.out.println("=== Enhanced Loop ===");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("=== ForEach Loop ===");
        colors.forEach(color -> {
            System.out.println(color);
        });
        System.out.println("=== Traditional For Loop ===");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }

}
