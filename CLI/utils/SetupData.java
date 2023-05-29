package com.havefunwith.CLI.utils;

import com.havefunwith.CLI.booking.CarBooking;
import com.havefunwith.CLI.booking.CarBookingService;
import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.car.CarService;
import com.havefunwith.CLI.enums.Brand;
import com.havefunwith.CLI.user.User;
import com.havefunwith.CLI.user.UserService;

import java.math.BigDecimal;

public class SetupData {

    public static void initialize() {
        // CARS
        Car teslaO = new Car("111", BigDecimal.valueOf(89.00), Brand.TESLA, true);
        Car teslaTw = new Car("222", BigDecimal.valueOf(109.00), Brand.TESLA, true);
        Car teslaTh = new Car("333", BigDecimal.valueOf(99.00), Brand.TESLA, true);
        Car audiO = new Car("0101", BigDecimal.valueOf(50.00), Brand.AUDI, false);
        Car audiTw = new Car("0202", BigDecimal.valueOf(44.00), Brand.AUDI, false);
        Car mercedes = new Car("0001", BigDecimal.valueOf(77.00), Brand.MERCEDES, false);
        // CARS END

        // USERS
        User tom = new User("100", "Tom", 24);
        User leon = new User("200", "Leon", 36);
        User betty = new User("300", "Betty", 28);
        // USERS END

        // CAR BOOKING
        CarBooking tomBookingO = new CarBooking(teslaO, tom);
        CarBooking tomBookingTw = new CarBooking(mercedes, tom);
        CarBooking leonBooking = new CarBooking(teslaTw, leon);
        CarBooking bettyBooking = new CarBooking(audiO, betty);
        // CAR BOOKING END

        // CLASS INSTANCES
        CarService carService = new CarService();
        UserService userService = new UserService();
        CarBookingService carBookingService = new CarBookingService();
        // CLASS INSTANCES END

        // CREATE CARS
        carService.createCar(teslaO);
        carService.createCar(teslaTw);
        carService.createCar(teslaTh);
        carService.createCar(audiO);
        carService.createCar(audiTw);
        carService.createCar(mercedes);
        // CREATE CARS END

        // CREATE USERS
        userService.createUser(tom);
        userService.createUser(betty);
        userService.createUser(leon);
        // CREATE USERS END

        // CREATE CAR BOOKING
        carBookingService.createCarBookingFromMain(tomBookingO);
        carBookingService.createCarBookingFromMain(tomBookingTw);
        carBookingService.createCarBookingFromMain(bettyBooking);
        carBookingService.createCarBookingFromMain(leonBooking);
        // CREATE CAR BOOKING END

        // DISPLAY
//        System.out.println("\n");
//        System.out.println("============== Cars ==============");
//        System.out.println(Arrays.toString(carService.returnCars()));
//        System.out.println("ELECTRIC CARS: " + Arrays.toString(carService.returnElectricCars()));
//        System.out.println("CARS BY REGISTRATION NUMBER -- (5678): " + carService.returnCarByRegNumber("5678"));
//        System.out.println("CARS AVAILABLE BY BRAND -- (TESLA): " + Arrays.toString(carService.returnAvailableCarsByBrand(Brand.TESLA)));
//
//        System.out.println("\n");
//        System.out.println("============== Users ==============");
//        System.out.println(Arrays.toString(userService.returnUsers()));
//
//        System.out.println("\n");
//        System.out.println("============== Car Bookings ==============");
//        System.out.println(Arrays.toString(carBookingService.returnCarBookings()));
//        System.out.println("CAR BOOKING BY USER ID -- (456): " + carBookingService.returnCarBookingByUserId("456"));
//        System.out.println("CAR BOOKING BY BOOKING ID -- (1001): " + carBookingService.returnCarBookingByBookingId("1001"));
    }
}
