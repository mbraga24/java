package com.havefunwith.CLI.booking;

import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.car.CarService;
import com.havefunwith.CLI.user.User;
import com.havefunwith.CLI.user.UserService;

import java.util.Arrays;

public class CarBookingService {

    private CarBookingDAO carBookingDao;
    private User user;
    private UserService userService;
    private CarService carService;

    public CarBookingService() {
        this.carBookingDao = new CarBookingDAO();
        this.user = new User();
        this.carService = new CarService();
        this.userService = new UserService();
    }

    /**
     * Create car booking from main class for testing.
     * @param carBooking
     */
    public void createCarBookingFromMain(CarBooking carBooking) {
        carService.setCarUnavailable(carBooking.getCar());
        carBookingDao.saveCarBooking(carBooking);
    }

    /**
     * Create car booking from CLI.
     * @param carBooking
     */
    public void createCarBooking(String userId, String regNumber) {
        User user = null;
        Car car = null;

        for (User u : userService.returnUsers()) {
            if (u.getId().equals(userId)) user = u;
        }

        for (Car c : carService.returnCars()) {
            if (c.getRegNumber().equals(regNumber)) car = c;
        }

        CarBooking carBooking = new CarBooking(car, user);

        carService.setCarUnavailable(carBooking.getCar());
        carBookingDao.saveCarBooking(carBooking);
        System.out.println(carBooking);
        System.out.println("CAR BOOKING COMPLETED");
    }

    /**
     * Returns all car bookings.
     * @return CarBooking[]
     */
    public CarBooking[] returnCarBookings() {
        return Arrays.copyOf(carBookingDao.getAllCarBookings(), this.returnNumberOfTotalCarBookings());
    }

    public CarBooking[] returnCarBookingsByUser(String userId) {
        CarBooking[] bookingsByUser = new CarBooking[this.returnNumberOfTotalCarBookings()];
        int index = 0;
        for (int i = 0; i < this.returnNumberOfTotalCarBookings(); i++) {
            if (this.returnCarBookings()[i].getUser().getId().equals(userId)) {
                bookingsByUser[index] = this.returnCarBookings()[i];
                index++;
            }
        }
        return Arrays.copyOf(bookingsByUser, index);
    }

    /**
     * Returns total number of bookings.
     * @return int
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
     * @param userId
     * @return CarBooking
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
     * Returns car booking related to the given car booking id.
     * @param carBooking
     * @return CarBooking
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
