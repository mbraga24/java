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
     * @return array of cars.
     */
    public Car[] returnCars() {
        return Arrays.copyOf(carDao.getAllCars(), this.returnNumberOfTotalCars());
    }

    /**
     * Returns all electric cars - All cars with isElectric boolean set to true.
     * @return array of electric cars.
     */
    public Car[] returnElectricCars() {
        int length = carDao.getAllCars().length;
        Car[] electricCars; // O(n)
        electricCars = Arrays.copyOf(carDao.getAllCars(), this.returnNumberOfTotalCars()); // O(n)
        int carCount = 0;
        for (int i = 0; i < electricCars.length; i++) { // O(n)
            if (electricCars[i].getIsElectric() == true) {
                electricCars[i] = electricCars[i];
                carCount++;
            }
        }
        return Arrays.copyOf(electricCars, carCount); // O(n)
    }

    /**
     * Returns total number of cars.
     * @return integer.
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
     * @param regNumber to search car.
     * @return car.
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
     * @param brand to search cars.
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
