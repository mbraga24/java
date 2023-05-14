package com.havefunwith.modules.demos.inheritanceLesson;

public class Main {

    public static void main(String[] args) {

        String[] languages = {"Java", "JavaScript"};

        Programmer java = new Programmer(
                "Rod",
                30,
                "US",
                "Full Stack",
                languages
        );

        System.out.println(java);
        System.out.println(java.getName());
        System.out.println(java.getAge());
        System.out.println(java.getAddress());
        System.out.println(java.getExperience());
        java.writingCode();
        java.sayHi();
    }

}
