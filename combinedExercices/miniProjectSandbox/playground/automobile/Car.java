package com.havefunwith.combinedExercices.miniProjectSandbox.playground.automobile;

import com.havefunwith.combinedExercices.miniProjectSandbox.playground.enums.CarBrand;

import java.math.BigDecimal;

public class Car {

    private CarBrand carBrand;
    private BigDecimal price;

    public Car(CarBrand carBrand, BigDecimal price) {
        this.carBrand = carBrand;
        this.price = price;
    }

    public CarBrand getBrand() {
        return carBrand;
    }

    public void setBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + carBrand + '\'' +
                ", price=" + price +
                '}';
    }
}
