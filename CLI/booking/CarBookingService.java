package com.havefunwith.CLI.booking;

import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.car.CarService;
import com.havefunwith.CLI.user.User;
import com.havefunwith.CLI.user.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
     * @param userId
     * @param regNumber
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
        this.printBookingConfirmation(car, user, carBooking);
    }

    /**
     * Returns all car bookings.
     * @return CarBooking[]
     */
    public List<CarBooking> returnCarBookings() {
//        return Arrays.copyOf(carBookingDao.getAllCarBookings(), this.returnNumberOfTotalCarBookings());
        return carBookingDao.getAllCarBookings();
    }

    public List<CarBooking> returnCarBookingsByUser(String userId) {
        List<CarBooking> bookingsByUser = new ArrayList<>(this.returnNumberOfTotalCarBookings());
        for (int i = 0; i < this.returnNumberOfTotalCarBookings(); i++) {
            if (this.returnCarBookings().get(i).getUser().getId().equals(userId)) {
                bookingsByUser.add(this.returnCarBookings().get(i));
            }
        }
        return bookingsByUser;
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

    private void printBookingConfirmation(Car car, User user, CarBooking carBooking) {
        System.out.println("=> Car: " + car.getBrand() + "\n" +
                "--- Registration Number: " + car.getRegNumber() + ",\n" +
                "=> User: " + user.getFirstName() + "\n" +
                "--- User Id: " + user.getId() + "\n" +
                "=> Booking Details: \n" +
                "--- Day/Time: " + carBooking.getBookingTime() + "\n" +
                "--- Booking Confirmation: " + carBooking.getBookingId() + "\n" +
                "===============================================\n" +
                "            SUCCESSFULLY BOOKED!\n" +
                "===============================================");
    }
}
