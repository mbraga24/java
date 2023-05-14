package com.havefunwith.modules.demos.abstractLesson;

/**
 * The purpose of an abstract class is to function as a BASE for subclasses.
 *
 * Encapsulate some common functionally in one place and let subclasses
 * implement differences.
 *
 * Avoid code duplication and increase reusability.
 *
 */
abstract public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * Default sound for all animals
     */
//    public void makeSound() {
//        System.out.println("Grrrrrrrrrrrrr!");
//    }

    // abstract class -- subclasses MUST create implementation.

    /**
     * Abstract methods
     *  - Have no method body.
     *  - Need to be inside abstract classes or interfaces.
     */
    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
