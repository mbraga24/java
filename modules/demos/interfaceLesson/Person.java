package com.havefunwith.modules.demos.interfaceLesson;

public class Person {

    private String name;
//    private ElectricScooter electricScooter;
//    private Bicycle bicycle;
//    private Car car;
    private Vehicle[] vehicles;

    public Person(String name, Vehicle[] vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}
