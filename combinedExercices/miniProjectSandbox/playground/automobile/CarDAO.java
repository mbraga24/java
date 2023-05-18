package com.havefunwith.combinedExercices.miniProjectSandbox.playground.automobile;

import java.util.HashSet;
import java.util.Objects;

public class CarDAO {

    private static Car[] cars;
    private int nextAvailableSlot = 0;
    private static final int CAPACITY = 100;

    /*
        === Fake database ===
        - It executes during class loading.
        - It can only use static variables.
        - It can not use this.
        - It executes only once during the entire execution of the program when
            the class loads into the memory.
     */
    static {
        cars = new Car[CAPACITY];
    }

    // Fake database save
    public boolean save(Car car) {
        cars[nextAvailableSlot] = car;
        ++nextAvailableSlot;
        return true;
    }

    // Fake database retrieve all
    public HashSet<Car> findAll() {
        HashSet<Car> carResponse = new HashSet<Car>();
        for (Car car : cars) {
            if (!Objects.isNull(car)) {
                carResponse.add(car);
            }
        }
        return carResponse;
    }

}
