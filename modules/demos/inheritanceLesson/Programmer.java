package com.havefunwith.modules.demos.inheritanceLesson;

public class Programmer extends Employee {

    private String[] programmingLanguages;

    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writingCode() {
        /*
            We can invoke sayHi() from Employee without the keyword 'super'.
            However, if you have another method in the child class with the
            same name, you need to specify you want to use the method from
            Employee (parent class) by using the keyword 'super'.
         */
        super.sayHi();
        System.out.println("Writing some code!");
    }

    public void sayHi() {
        System.out.println("Hello again from " + getName());
    }

}
