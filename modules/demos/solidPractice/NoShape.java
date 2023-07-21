package com.havefunwith.modules.demos.solidPractice;

/*
    Liskov Substitution -
    Shape is the parent/super class, but NoShape cannot calculate the area. It cannot
    obey to the contract of the interface. Similarly, if Shape had several methods
    and NoShape could implement some but not others, therefore NoShape will never
    be substitutable by the base or parent class.
 */
public class NoShape implements Shape {

    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }

}
