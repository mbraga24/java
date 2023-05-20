package com.havefunwith.CLI;

import com.havefunwith.CLI.booking.CarBooking;
import com.havefunwith.CLI.booking.CarBookingService;
import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.car.CarService;
import com.havefunwith.CLI.enums.Brand;
import com.havefunwith.CLI.user.User;
import com.havefunwith.CLI.user.UserService;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Notes when done:
 *
 * 1) Fix BigDecimal: 89.00 instead of 89.0
 * 2) Add Default Access Modifier where is needed
 * 3) Change returnUser and returnCarBookings to return the proper array from their service classes
 */
public class Main {

    public static void main(String[] args) {

        // CARS
        Car tesla = new Car("1234", BigDecimal.valueOf(89.00), Brand.TESLA, true);
        Car audi = new Car("5678", BigDecimal.valueOf(50.00), Brand.AUDI, false);
        Car mercedes = new Car("91011", BigDecimal.valueOf(77.00), Brand.MERCEDES, false);

        // USERS
        User tom = new User("123", "Tom", 24);
        User betty = new User("456", "Betty", 28);
        // USERS END

        // CAR BOOKING
        CarBooking tomBooking = new CarBooking(tesla, tom);
        CarBooking bettyBooking = new CarBooking(audi, betty);
        // CAR BOOKING END

        // CLASS INSTANCES
        CarService carService = new CarService();
        UserService userService = new UserService();
        CarBookingService carBookingService = new CarBookingService();
        // CLASS INSTANCES END

        // CREATE CARS
        carService.createCar(tesla);
        // CREATE CARS END

        // CREATE USERS
        userService.createUser(tom);
        userService.createUser(betty);
        // CREATE USERS END

        // CREATE CAR BOOKING
        carBookingService.createCarBooking(tomBooking);
        carBookingService.createCarBooking(bettyBooking);
        // CREATE CAR BOOKING END

        // DISPLAY
        System.out.println("\n");
        System.out.println("============== Cars ==============");
        System.out.println(Arrays.toString(carService.returnCars()));
        System.out.print("ELECTRIC CARS: " + Arrays.toString(carService.returnElectricCars()));

        System.out.println("\n");
        System.out.println("============== Users ==============");
        System.out.println(Arrays.toString(
                            Arrays.copyOf(userService.returnUsers(),
                                    userService.returnNumberOfTotalUsers())));

        System.out.println("\n");
        System.out.println("============== Car Bookings ==============");
        System.out.println(Arrays.toString(
                            Arrays.copyOf(carBookingService.returnCarBookings(),
                                        carBookingService.returnNumberOfTotalCarBookings())));
    }

}
