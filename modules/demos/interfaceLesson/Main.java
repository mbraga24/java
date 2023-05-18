package com.havefunwith.modules.demos.interfaceLesson;

public class Main {

    public static void main(String[] args) {

        Vehicle electricScooter = new ElectricScooter(30);

        Vehicle bicycle = new Bicycle(20);

        Vehicle car = new Car(200);

        Vehicle[] vehicles = {electricScooter, bicycle, car};

//        for (Vehicle v : vehicles) {
//            System.out.println(v.getName());
//            v.move(20);
//            v.getCurrentSpeed();
//            v.applyBreaks(10);
//            System.out.println("************************");
//        }

        Person john = new Person("John", vehicles);

        for (Vehicle v : john.getVehicles()) {
            System.out.println(v.getName());
        }

        System.out.println(car.getName() + " -- km: " + car.milesToKm());
        System.out.println(bicycle.getName() + " -- km: " + bicycle.milesToKm());
        System.out.println(Vehicle.INTERFACE_DESCRIPTION);
    }

}
