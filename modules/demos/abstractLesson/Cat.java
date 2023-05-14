package com.havefunwith.modules.demos.abstractLesson;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    // Before using abstract method
//    @Override
//    public void makeSound() {
//        super.makeSound();
//    }

    @Override
    public void makeSound() {
        System.out.println("Meeeoooww");
    }
}
