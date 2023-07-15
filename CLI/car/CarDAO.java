package com.havefunwith.CLI.car;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    private static List<Car> cars;
    private static int nextAvailableSlot = 0;
    private static final int CAPACITY = 10;

    static {
        cars = new ArrayList<>(CAPACITY);
    }

    /**
     * Saves car.
     * @param car to be saved.
     */
    public void saveCar(Car car) {
        cars.add(car);
        nextAvailableSlot++;
    }

    /**
     * Retrieve all cars.
     * @return array of cars.
     */
    public List<Car> getAllCars() {
        return cars;
    }
}
