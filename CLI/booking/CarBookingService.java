package com.havefunwith.CLI.booking;

import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.car.CarService;
import com.havefunwith.CLI.user.User;

import java.util.Arrays;

public class CarBookingService {

    private CarBookingDAO carBookingDao;
    private User user;
    private CarService carService;

    public CarBookingService() {
        this.carBookingDao = new CarBookingDAO();
        this.user = new User();
        this.carService = new CarService();
    }

    /**
     * Create car booking.
     * @param carBooking to be created.
     */
    public void createCarBooking(CarBooking carBooking) {
        carService.setCarUnavailable(carBooking.getCar());
        carBookingDao.saveCarBooking(carBooking);
    }

    /**
     * Returns all car bookings.
     * @return array of CarBooking.
     */
    public CarBooking[] returnCarBookings() {
        return Arrays.copyOf(carBookingDao.getAllCarBookings(), this.returnNumberOfTotalCarBookings());
    }

    /**
     * Returns total number of bookings.
     * @return integer.
     */
    public int returnNumberOfTotalCarBookings() {
        int totalCarBooking = 0;
        for (CarBooking cb : carBookingDao.getAllCarBookings()) {
            if (cb != null) totalCarBooking++;
        }
        return totalCarBooking;
    }

    /**
     * Returns car booking related to the given user id.
     * @param userId to search for car booking.
     * @return Car booking.
     */
    public CarBooking returnCarBookingByUserId(String userId) {
        for (CarBooking cb : carBookingDao.getAllCarBookings()) {
            if (cb.getUser().getId().equals(userId)) {
                return cb;
            }
        }
        // System.out.println("Car booking not found with the user id " + userId + " :: " + e.getMessage());
        return null;
    }

    /**
     * Returns car booking related to the given car bookind id.
     * @param carBooking to search for car booking.
     * @return Car booking.
     */
    public CarBooking returnCarBookingByBookingId(String carBooking) {
        for (CarBooking cb : carBookingDao.getAllCarBookings()) {
            if (cb.getBookingId().equals(carBooking)) {
                return cb;
            }
        }
        // System.out.println("Car booking not found with the booking id " + carBooking + " :: " + e.getMessage());
        return null;
    }
}
