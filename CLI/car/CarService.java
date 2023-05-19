package com.havefunwith.CLI.car;

public class CarService {

    private CarDAO carDao;

    public CarService() {
        this.carDao = new CarDAO();
    }

    public void createCar(Car car) {
        carDao.saveCar(car);
    }

    public Car[] returnCars() {
        return carDao.getAllCars();
    }

    public int returnNumberOfTotalCars() {
        int numberOfCars = 0;
        for (Car car : carDao.getAllCars()) {
            if (car != null) numberOfCars++;
        }
        return numberOfCars;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "carDao=" + carDao +
                '}';
    }
}
