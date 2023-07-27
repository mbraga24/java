package com.havefunwith.CLI.basics;
import com.havefunwith.modules.email.EmailValidator;

public class EmailValidatorMainClass {

    public static void main(String[] args) {
        System.out.println(EmailValidator.validateEmail("myName@email.com"));
        System.out.println(EmailValidator.validateEmail("myNameemail.com"));
    }

}
