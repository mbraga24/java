package com.havefunwith.combinedExercices.miniProjectSandbox.playground.automobile;

import java.util.Objects;

import static com.havefunwith.combinedExercices.miniProjectSandbox.playground.constants.Constants.*;

public class CarService {

    /*
        Before learning about testing and dependency injection, instantiating
        a DAO class either outside or inside a constructor class will suffice
        for now.
     */

    // Approach 1:
    // private CarDAO carDAO = new CarDAO();

    // Approach 2:
    private CarDAO carDAO;

    public CarService() {
        this.carDAO = new CarDAO();
    }

    public String addCar(Car car) {
        isValidPrice(car);
        isValidBrand(car);
        boolean response = carDAO.save(car);
        return BOXED + CAR_SAVED + NEXT_LINE + BOXED +
                POINT_TO_MESSAGE + SPACE + response + NEXT_LINE +
                POINT_TO_MESSAGE + SPACE + STATUS_PROP + CREATED + NEXT_LINE +
                BOXED;
    }

    public String findAllCars() {
        return BOXED + carDAO.findAll().toString() + NEXT_LINE + BOXED +
                POINT_TO_MESSAGE + SPACE + STATUS_PROP + SUCCESS + NEXT_LINE +
                BOXED;
    }

    private void isValidPrice(Car car) {
        System.out.println("car.getPrice() :: " + car.getPrice());
        if (Objects.isNull(car.getPrice())) {
            throw new IllegalArgumentException("Wrong input value for Car object");
        }
    }

    private void isValidBrand(Car car) {
        if (Objects.isNull(car.getBrand())) {
            throw new IllegalArgumentException("Wrong input value for Car object");
        }
    }

}
