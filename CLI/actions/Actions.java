package com.havefunwith.CLI.actions;

import com.havefunwith.CLI.booking.CarBookingService;
import com.havefunwith.CLI.car.CarService;
import com.havefunwith.CLI.user.UserService;
import com.havefunwith.CLI.utils.Utils;

import java.util.Scanner;

public class Actions {

    private static String userInput = "";
    private static UserService userService;
    private static CarService carService;
    private static CarBookingService carBookingService;
//    private static Actions actions;
    private static Scanner scanner;

    public Actions() {
        userService = new UserService();
        carService = new CarService();
        carBookingService = new CarBookingService();
//        actions = new Actions();
        scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        Integer[] numberOptions = {1, 2, 3, 4, 5, 6, 7};
        String[] textOptions = {"Book Car",
                "View All User Booked Cars",
                "View All Bookings",
                "View Available Cars",
                "View Available Electric Cars",
                "View All Users",
                "Exit"};

        for (int option = 0; option < 7; option++) {
            System.out.println(numberOptions[option] + ": " + textOptions[option]);
        }
    }

    public void triggerOption(String option) {
        switch (option) {
            case "1":
                System.out.println("Book a Car");
                System.out.println("==========");
                this.addUserId();
                this.addCarRegNumber();
                carBookingService.createCarBooking("300", "0202");
                break;
            case "2":
                System.out.println("View All Booked Cars By User");
                System.out.println("============================");
                Utils.display(carBookingService.returnCarBookingsByUser("100"));
                break;
            case "3":
                System.out.println("View all bookings");
                System.out.println("============================");
                Utils.display(carBookingService.returnCarBookings());
                break;
            case "4":
                System.out.println("View available cars");
                System.out.println("============================");
                Utils.display(carService.returnAvailableCars());
                break;
            case "5":
                System.out.println("View Available Electric Cars");
                System.out.println("============================");
                Utils.display(carService.returnElectricCars());
                break;
            case "6":
                System.out.println("View All Users");
                System.out.println("==============");
                Utils.display(userService.returnUsers());
                break;
            default:
                System.out.println("Exit.");
                break;
        }

    }

    public String collectUserInput() {
        int ascii = 0;
        char character = '\0';
        boolean isValidOption;
        do {
            isValidOption = true;
            this.displayOptions();
            System.out.println("Make a selection:");
            userInput = scanner.nextLine();

            if (userInput.length() > 1) isValidOption = false;
            if (isValidOption != false && userInput.length() > 0) {
                character = userInput.charAt(0);
                ascii = (int) character;
            }
            if (userInput.isEmpty() || userInput.isBlank()) {
                System.out.println();
                System.out.println("Input cannot be blank.");
                System.out.println("======================");
            } else if (ascii < 49 || ascii > 55) {
                System.out.println();
                System.out.println("Invalid option. Please use one of the options listed below:");
                System.out.println("===========================================================");
            }
        } while (userInput.isEmpty() || userInput.isBlank() || ascii < 49 || ascii > 55);
        return userInput;
    }

    private void addUserId() {
        System.out.println("Add user id");
    }

    private void addCarRegNumber() {
        System.out.println("Add car registration number");
    }

}
