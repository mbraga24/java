package com.havefunwith.CLI;

import com.havefunwith.CLI.actions.Actions;
import com.havefunwith.CLI.booking.CarBooking;
import com.havefunwith.CLI.booking.CarBookingService;
import com.havefunwith.CLI.car.Car;
import com.havefunwith.CLI.car.CarService;
import com.havefunwith.CLI.enums.Brand;
import com.havefunwith.CLI.user.User;
import com.havefunwith.CLI.user.UserService;
import com.havefunwith.CLI.utils.SetupData;
import com.havefunwith.CLI.utils.Utils;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Notes when done:
 *
 * 1) Fix BigDecimal: 89.00 instead of 89.0
 * 2) Able to create and delete a user - must delete all CarBookings associated with the user first
 * 3) Generate user ID on user creation
 * 4) Create returnCarBookingsByUser()
 */
public class Main {

    private static String userInput = "";

    public static void main(String[] args) {
        SetupData.initialize();
        do {
            userInput = Actions.collectUserInput();
            Actions.triggerOption(userInput);
        } while (!userInput.equals("7"));
    }

}
