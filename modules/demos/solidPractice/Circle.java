package com.havefunwith.modules.demos.solidPractice;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(getRadius(), 2);
    }

//    INTERFACE SEGREGATION - Interfaces should not force classes to implement what they
//    can't do.
//    @Override
//    public double volume() {
//        return 0;
//    }
}
