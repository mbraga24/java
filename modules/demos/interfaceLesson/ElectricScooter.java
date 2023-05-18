package com.havefunwith.modules.demos.interfaceLesson;

public class ElectricScooter implements Vehicle {

    private final String NAME = "Electric Scooter";
    private int currentSpeed;

    public ElectricScooter() {}

    public ElectricScooter(int currentSpeed) {
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
}
