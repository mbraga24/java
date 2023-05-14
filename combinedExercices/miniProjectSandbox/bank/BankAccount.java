package com.havefunwith.combinedExercices.miniProjectSandbox.bank;

import java.math.BigDecimal;

public class BankAccount {

    private String CREDENTIALS = "2$%flaxintofg34bank-account36balance49authorized&fg$ergo%flax";

    private String name;
    private BigDecimal balance;
    private Boolean hasOverdraft;

    public BankAccount() {}

    public BankAccount(String name, BigDecimal balance, Boolean hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public BigDecimal withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Overloading setBalance(BigDecimal, String) with a
     * no argument function.
     *
     * @param balance
     */
    public void setBalance(BigDecimal balance) {
        System.out.println("You need credentials to perform this action.");
    }

    public void setBalance(BigDecimal balance, String cred) {
        if (cred == this.CREDENTIALS) {
            this.balance = balance;
        } else {
            System.out.println("Your credentials are invalid to perform this action.");
        }
    }

    public Boolean getHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(Boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }
}
