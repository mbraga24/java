package com.havefunwith.modules.demos.interfaceLesson;

public interface Vehicle {

    // CONSTANTS
    String INTERFACE_DESCRIPTION = "VEHICLE is an interface with all the common actions that can be performed by" +
            " a vehicle";

    // ABSTRACT METHODS - Will not have implementation
    void move(int amount);
    void applyBreaks(int amount);
    int getCurrentSpeed();
    String getName();

    // DEFAULT METHODS - Will have implementation
    default double milesToKm() {
        return getCurrentSpeed() * 1.609;
    }

}
