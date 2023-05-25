package com.havefunwith.CLI.actions;

import com.havefunwith.CLI.user.UserService;
import com.havefunwith.CLI.utils.Utils;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Actions {

    private UserService userService;

    public Actions() {
        userService = new UserService();
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
        switch (Integer.parseInt(option)) {
            case 1:
                System.out.println("Book car");
                break;
            case 2:
                System.out.println("View all user booked cars");
                break;
            case 3:
                System.out.println("View all bookings");
                break;
            case 4:
                System.out.println("View available cars");
                break;
            case 5:
                System.out.println("View available electric cars");
                break;
            case 6:
                Utils.display(userService.returnUsers());
//                System.out.println(Arrays.toString(userService.returnUsers()));;
                break;
            default:
                System.out.println("Invalid input choice.");
                break;
        }

    }

}
