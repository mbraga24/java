package com.havefunwith.CLI.car;

import com.havefunwith.CLI.booking.CarBooking;
import com.havefunwith.CLI.booking.CarBookingService;

import java.util.ArrayList;
import java.util.List;

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
    public List<Car> returnCars() {
        return carDao.getAllCars();
    }

    /**
     * Returns all electric cars - All cars with isElectric boolean set to true.
     * @return array of electric cars
     */
    public List<Car> returnElectricCars() {
        List<Car> electricCars = new ArrayList<Car>(this.returnNumberOfTotalCars());
        for (int i = 0; i < this.returnNumberOfTotalCars(); i++) {
            if (this.returnCars().get(i).getIsElectric() == true && this.returnCars().get(i).getAvailable() == true) {
                electricCars.add(this.returnCars().get(i));
            }
        }
        return electricCars; // O(n)
    }

    public List<Car> returnAvailableCars() {
        List<Car> availableCars = new ArrayList<>(returnCars().size());
        for (int i = 0; i < returnCars().size(); i++) {
            if (returnCars().get(i).getAvailable() == true) {
                availableCars.add(returnCars().get(i));
            }
        }
        return availableCars;
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
    public List<Car> returnAvailableCarsByBrand(Enum brand) {
        int countCars = countCarsByBrand(brand);
        List<Car> carsByBrand = new ArrayList<>();
        for (int i = 0; i < countCars; i++) {
            if (carDao.getAllCars().get(i).getBrand().equals(brand) && carDao.getAllCars().get(i).getAvailable() == true) {
                carsByBrand.add(carDao.getAllCars().get(i));
            }
        }
        return carsByBrand;
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
