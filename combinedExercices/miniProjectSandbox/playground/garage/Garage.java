package com.havefunwith.combinedExercices.miniProjectSandbox.playground.garage;

import com.havefunwith.combinedExercices.miniProjectSandbox.playground.automobile.Car;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.person.Person;

import java.util.Arrays;

public class Garage {

    public static int capacity = 3;
    private Person person;
    private Car[] carsParked;

    public Garage(Person person, Car[] carsParked) {
        this.person = person;
        this.carsParked = carsParked;
        addToCapacity(carsParked);
    }

    private void addToCapacity(Car[] carsParked) {
        int totalCars = carsParked.length;
        while (totalCars > 0) {
            capacity--;
            totalCars--;
        }
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Car[] getCarsParked() {
        return carsParked;
    }

    public void setCarsParked(Car[] carsParked) {
        this.carsParked = carsParked;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "person=" + person +
                ", carsParked=" + Arrays.toString(carsParked) +
                '}';
    }
}
