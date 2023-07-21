package com.havefunwith.modules.demos.solidPractice;

public class Cube implements Shape, ThreeDShape {

    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return getLength() * getLength();
    }

    @Override
    public double volume() {
        return 0;
    }
}
