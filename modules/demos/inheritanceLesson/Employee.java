package com.havefunwith.modules.demos.inheritanceLesson;

public class Employee {

    private String name;
    private int age;
    private String address;
    private String experience;

    public Employee(String name, int age, String address, String experience) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.experience = experience;
    }

    public void sayHi() {
        System.out.println("Hi my name is " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
