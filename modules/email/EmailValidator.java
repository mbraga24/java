package com.havefunwith.modules.email;

/*
    ==============
    Exercise 1
    ==============
    Create a package called email and inside create a class called EmailValidator with one public method.
    This method should accept a string and perform some validation checking.
    If the email does not contain the @ symbol for instance, return false; if the email is valid return true.
    Call this method from your Main method which should be outside the package you have just created
    Now change the your public method to private and try to run. What happens?
    Do the same but this time change your method to have no access modifier
 */
public class EmailValidator {

    public static boolean validateEmail(String email) {
        if (!email.contains("@")) {
            return false;
        }
        return true;
    }

}
