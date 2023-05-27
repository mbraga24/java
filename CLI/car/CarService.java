package com.havefunwith.CLI.car;

import com.havefunwith.CLI.booking.CarBooking;
import com.havefunwith.CLI.booking.CarBookingService;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CarService {

    private CarDAO carDao;

    public CarService() {
        this.carDao = new CarDAO();
    }

    public void createCar(Car car) {
        carDao.saveCar(car);
    }

    /**
     * Returns all cars.
     * @return cars
     */
    public Car[] returnCars() {
        return Arrays.copyOf(carDao.getAllCars(), this.returnNumberOfTotalCars());
    }

    /**
     * Returns all electric cars - All cars with isElectric boolean set to true.
     * @return array of electric cars
     */
    public Car[] returnElectricCars() {
        Car[] electricCars = new Car[this.returnNumberOfTotalCars()];
        int index = 0;
        for (int i = 0; i < this.returnNumberOfTotalCars(); i++) {
            if (this.returnCars()[i].getIsElectric() == true && this.returnCars()[i].getAvailable() == true) {
                electricCars[index] = this.returnCars()[i];
                index++;
            }
        }
        return Arrays.copyOf(electricCars, index); // O(n)
    }

    public Car[] returnAvailableCars() {
        Car[] availableCars = new Car[returnCars().length];
        int index = 0;
        for (int i = 0; i < returnCars().length; i++) {
            if (returnCars()[i].getAvailable() == true) {
                availableCars[index] = returnCars()[i];
                index++;
            }
        }
        return Arrays.copyOf(availableCars, index);
    }

    /**
     * Returns total number of cars.
     * @return int
     */
    public int returnNumberOfTotalCars() {
        int totalCars = 0;
        for (Car car : carDao.getAllCars()) {
            if (car != null) totalCars++;
        }
        return totalCars;
    }

    /**
     * Return car by registration number.
     * @param regNumber
     * @return Car
     */
    public Car returnCarByRegNumber(String regNumber) {
        for (Car car : carDao.getAllCars()) {
            if (car.getRegNumber().equals(regNumber)) {
                return car;
            }
        }
        // System.out.println("Car not found with the registration number " + regNumber + " :: " + e.getMessage());
        return null;
    }

    /**
     * Return all available cars.
     * @param brand
     * @return Cars
     */
    public Car[] returnAvailableCarsByBrand(Enum brand) {
        int countCars = countCarsByBrand(brand);
        Car[] carsByBrand = new Car[countCars];
        int index = 0;
        for (int i = 0; i < countCars; i++) {
            if (carDao.getAllCars()[i].getBrand().equals(brand) && carDao.getAllCars()[i].getAvailable() == true) {
                carsByBrand[index] = carDao.getAllCars()[i];
                index++;
            }
        }
        return Arrays.copyOf(carsByBrand, index);
    }

    /**
     * Count cars to create arrays based on the number of cars of that brand.
     * @param brand
     * @return int
     */
    private int countCarsByBrand(Enum brand) {
        int countCars = 0;
        for (Car car : carDao.getAllCars()) {
            if (car.getBrand().equals(brand)) countCars++;
        }
        return countCars;
    }

    public void setCarUnavailable(Car car) {
        car.setAvailable(false);
    }

    @Override
    public String toString() {
        return "CarService{" +
                "carDao=" + carDao +
                '}';
    }
}
