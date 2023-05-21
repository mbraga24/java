package com.havefunwith.CLI.car;

/**
 * Default class only accessed within this package.
 */
class CarDAO {

    private static Car[] cars;
    private static int nextAvailableSlot = 0;
    private static final int CAPACITY = 5;

    static {
        cars = new Car[CAPACITY];
    }

    /**
     * Saves car.
     * @param car to be saved.
     */
    public void saveCar(Car car) {
        cars[nextAvailableSlot] = car;
        nextAvailableSlot++;
    }

    /**
     * Retrieve all cars.
     * @return array of cars.
     */
    public Car[] getAllCars() {
        return cars;
    }
}
