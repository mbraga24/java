package com.havefunwith.CLI.booking;

import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.user.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class CarBooking {

    private String bookingId;
    private Car car;
    private User user;
    private String bookingTime;
    private boolean isCanceled;
    private static AtomicInteger seq;

    static {
        seq = new AtomicInteger();
    }

    public CarBooking(Car car, User user) {
        this.bookingId = String.valueOf(1000 + seq.incrementAndGet());
        this.car = car;
        this.user = user;
        this.bookingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("M/dd/yyyy | HH:mm:ss a"));
    }

    public CarBooking() {}

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    @Override
    public String toString() {
        return "CarBooking{" +
                "bookingId='" + bookingId + '\'' +
                ", car=" + car +
                ", user=" + user +
                ", bookingTime=" + bookingTime +
                ", isCanceled=" + isCanceled +
                '}';
    }
}
