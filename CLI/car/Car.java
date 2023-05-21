package com.havefunwith.CLI.car;

import com.havefunwith.CLI.enums.Brand;

import java.math.BigDecimal;

public class Car {

    private String regNumber;
    private BigDecimal rentalPricePerDay;
    private Brand brand;
    private Boolean isElectric;
    private Boolean isAvailable;

    public Car(String regNumber, BigDecimal rentalPricePerDay, Brand brand, Boolean isElectric) {
        this.regNumber = regNumber;
        this.rentalPricePerDay = rentalPricePerDay;
        this.brand = brand;
        this.isElectric = isElectric;
        this.isAvailable = true;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(BigDecimal rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(Boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", rentalPricePerDay=" + rentalPricePerDay +
                ", brand=" + brand +
                ", isElectric=" + isElectric +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
