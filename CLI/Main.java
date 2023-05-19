package com.havefunwith.CLI;

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
 */
public class Main {



    public static void main(String[] args) {

//        CARS
        Car tesla = new Car("1234", BigDecimal.valueOf(89.00), Brand.TESLA, true);
        Car audi = new Car("5678", BigDecimal.valueOf(50.00), Brand.AUDI, false);
        Car mercedes = new Car("91011", BigDecimal.valueOf(77.00), Brand.MERCEDES, false);

//        USERS
        User tom = new User("123", "Tom", 24);
        User betty = new User("456", "Betty", 28);

        System.out.println("TESLA : " + tesla);
        System.out.println("AUDI : " + audi);
        System.out.println("MERCEDES : " + mercedes);

        // INSTANCES OF CLASSES
        CarService carService = new CarService();
        UserService userService = new UserService();

        // CREATE CARS
        carService.createCar(tesla);

        // CREATE USERS
        userService.createUser(tom);
        userService.createUser(betty);

        // DISPLAY
        System.out.println();
        System.out.println(Arrays.toString(
                            Arrays.copyOf(carService.returnCars(),
                                    carService.returnNumberOfTotalCars())));

        System.out.println(Arrays.toString(
                            Arrays.copyOf(userService.returnUsers(),
                                    userService.returnNumberOfTotalUsers())));

    }

}
