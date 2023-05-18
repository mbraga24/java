package com.havefunwith.combinedExercices.miniProjectSandbox.playground.garage;

import com.havefunwith.combinedExercices.miniProjectSandbox.playground.automobile.Car;
import com.havefunwith.combinedExercices.miniProjectSandbox.playground.person.Person;

public class GarageService {

    public void addCarToGarage(Car[] cars, Person person) {
        if (Garage.capacity > totalCarsToBeAdded(cars)) {
            System.out.println(new Garage(person, cars));
        } else {
            throw new RuntimeException("Garage capacity has been reached.\nSorry " + person.getFirstName().toUpperCase() + ", " +
                    "you're gonna have to try again later or go around the block to the next available garage center.");
        }
    }

    private int totalCarsToBeAdded(Car[] cars) {
        int count = 0;
        for (Car c : cars) {
            count++;
        }
        return count;
    }

}
