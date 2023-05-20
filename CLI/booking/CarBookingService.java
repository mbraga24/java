package com.havefunwith.CLI.booking;

import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.user.User;

public class CarBookingService {

    private CarBookingDAO carBookingDao;

    public CarBookingService() {
        this.carBookingDao = new CarBookingDAO();
    }

    public void createCarBooking(CarBooking carBooking) {
        carBookingDao.saveCarBooking(carBooking);
    }

    public CarBooking[] returnCarBookings() {
        return carBookingDao.getAllCarBookings();
    }

    public int returnNumberOfTotalCarBookings() {
        int totalCarBooking = 0;
        for (CarBooking cb : carBookingDao.getAllCarBookings()) {
            if (cb != null) totalCarBooking++;
        }
        return totalCarBooking;
    }



}
