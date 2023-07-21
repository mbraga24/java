package com.havefunwith.modules.demos.solidPractice;

public class Square implements Shape {

    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }

//    INTERFACE SEGREGATION - Interfaces should not force what other classes
//    can't do.
//    @Override
//    public double volume() {
//        return 0;
//    }

}
