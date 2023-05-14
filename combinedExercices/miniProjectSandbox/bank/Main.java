package com.havefunwith.combinedExercices.miniProjectSandbox.bank;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {

        String CREDENTIALS = "2$%flaxintofg34bank-account36balance49authorized&fg$ergo%flax";

        BankAccount bankAccount = new BankAccount("Marlon", new BigDecimal(100.00), false);
        System.out.println(bankAccount.getBalance());
        BigDecimal firstWithdraw = bankAccount.withdraw(new BigDecimal(45.00));
        System.out.println("Withdraw: " + firstWithdraw);
        System.out.println("Balance: " + bankAccount.getBalance());
        BigDecimal secondWithdraw = bankAccount.withdraw(new BigDecimal(23));
        System.out.println("Withdraw: " + secondWithdraw);
        System.out.println("Balance: " + bankAccount.getBalance());

        bankAccount.setBalance(new BigDecimal(100.00)); // need credentials
        bankAccount.setBalance(new BigDecimal(100.00), "3423"); // wrong credentials
        bankAccount.setBalance(new BigDecimal(100.00), CREDENTIALS); // new balance set

        System.out.println("Balance: " + bankAccount.getBalance());
    }
}
