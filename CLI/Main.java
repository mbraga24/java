package com.havefunwith.CLI;

import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.car.CarService;
import com.havefunwith.CLI.enums.Brand;

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

        Car tesla = new Car("1234", BigDecimal.valueOf(89.00), Brand.TESLA, true);
        Car audi = new Car("5678", BigDecimal.valueOf(50.00), Brand.AUDI, false);
        Car mercedes = new Car("91011", BigDecimal.valueOf(77.00), Brand.MERCEDES, false);

        System.out.println("TESLA : " + tesla);
        System.out.println("AUDI : " + audi);
        System.out.println("MERCEDES : " + mercedes);

        CarService carService = new CarService();

        carService.createCar(tesla);

        System.out.println(Arrays.toString(
                            Arrays.copyOf(carService.returnCars(),
                            carService.returnNumberOfTotalCars())));


    }

}
