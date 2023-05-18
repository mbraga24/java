package com.havefunwith.modules.demos.interfaceLesson;

public class Car implements Vehicle {

    private final String NAME = "Car";
    private int currentSpeed = 0;

    public Car() {}

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("Current speed: " + this.currentSpeed);
        this.currentSpeed += amount;
        System.out.println("Accelerating...");
        System.out.println("Speed of " + this.currentSpeed + " reached.");
    }

    @Override
    public void applyBreaks(int amount) {
        int speed = this.currentSpeed;
        int current = this.currentSpeed - amount;
        System.out.println("Breaks applied. Speed reduced from " + speed + " to " + current);
    }

    @Override
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double milesToKm() {
        System.out.println("Custom MILES TO KM for cars");
        return getCurrentSpeed() * 1.609;
    }


}
