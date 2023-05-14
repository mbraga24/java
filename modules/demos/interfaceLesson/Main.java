package com.havefunwith.modules.demos.interfaceLesson;

public class Main {

    public static void main(String[] args) {

        Vehicle electricScooter = new ElectricScooter(30);

        Vehicle bicycle = new Bicycle(20);

        Vehicle car = new Car(200);

        Vehicle[] vehicleArray = {electricScooter, bicycle, car};

        for (Vehicle v : vehicleArray) {
            System.out.println(v.getName());
            v.move(20);
            v.getCurrentSpeed();
            v.applyBreaks(10);
            System.out.println("************************");
        }
    }

}
