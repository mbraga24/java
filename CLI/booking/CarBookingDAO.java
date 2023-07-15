package com.havefunwith.CLI.booking;

import java.util.ArrayList;
import java.util.List;

public class CarBookingDAO {

    private static List<CarBooking> carBookings;
    private static int nextAvailableSlot = 0;
    private static int CAPACITY = 100;

    static {
        carBookings = new ArrayList<>(CAPACITY);
    }

    /**
     * Saves car.
     * @param carBooking to be saved.
     */
    public void saveCarBooking(CarBooking carBooking) {
//        if (carBookings.length >= 0) {
            carBookings.add(carBooking);
            nextAvailableSlot++;
//        }
    }

    public static List<CarBooking> getAllCarBookings() {
        return carBookings;
    }
}
