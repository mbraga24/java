package com.havefunwith.combinedExercices.exercise.ex00;

import java.util.*;

public class Dealership {

    private final int MAX_CAR_FOR_DISPLAY = 3;

    private Car[] cars;
    private Car car;
    private String name;
    private Random rand = new Random();


    {
        cars = new Car[MAX_CAR_FOR_DISPLAY];
    }

    public Dealership(String name) {
        this.name = name;
    }

    public Dealership(String name, Car car) {
        this(name);
        addToCapacity(car); // if capacity has been reached, code will stop here.
    }

    /**
     * Save new car in the cars array.
     *
     * @param car is the new car to be added to the cars array.
     */
    private void addToCapacity(Car car) {
        int arrayLength = cars.length;
        if (totalCarNumber() < MAX_CAR_FOR_DISPLAY) {
            for (int i = 0; i < arrayLength; i++) {
                if (Objects.isNull(cars[i])) {
                    cars[i] = car;
                    break;
                }
            }
        } else {
            throw new RuntimeException("We're sorry. We have exceeded the total number" +
                    " of cars that can be displayed.");
        }
    }

    /**
     * Count total number of cars.
     *
     * @return total count of cars in the cars array.
     */
    public int totalCarNumber() {
        int count = 0;
        for (Car car : cars) {
            if (!Objects.isNull(car)) count+=1;
        }
        return count;
    }

    /**
     * Print all the cars that match the manufacturer name.
     *
     * NOTE: The problem number 7 asked to return the first object that matched the
     * manufacturer name. I chose to print all the objects that match the manufacture
     * name instead.
     *
     * @param manufacturer
     */
    public void findCarByManufacturer(String manufacturer) {
        try {
            System.out.println();
            for (Car car : cars) {
                if (car.getManufacturer().equals(manufacturer)) {
                    System.out.println(car);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }

    public Car[] getCars() {
        return cars;
    }

    public Car getCar(int pos) {
        return this.cars[pos];
    }

    public void setCar(Car car) {
        addToCapacity(car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "cars=" + Arrays.toString(cars) +
                ", name='" + name + '\'' +
                '}';
    }
}
