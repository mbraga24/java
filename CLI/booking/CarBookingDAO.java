package com.havefunwith.CLI.booking;

import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.user.User;

public class CarBookingDAO {

    private static CarBooking[] carBookings;
    private static int nextAvailableSlot = 0;
    private static int CAPACITY = 100;

    static {
        carBookings = new CarBooking[CAPACITY];
    }

    public void saveCarBooking(CarBooking carBooking) {
//        if (carBookings.length >= 0) {
            carBookings[nextAvailableSlot] = carBooking;
            nextAvailableSlot++;
//        }
    }

    // GETTERS AND SETTER

    public static CarBooking[] getAllCarBookings() {
        return carBookings;
    }
}
