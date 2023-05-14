package com.havefunwith.modules.demos.inheritanceLesson;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int age, String address, String experience, int teamSize) {
        super(name, age, address, experience);
        this.teamSize = teamSize;
    }

    public void report() {
        System.out.println("Writing team report.");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                '}';
    }
}
