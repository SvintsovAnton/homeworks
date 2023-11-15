package de.ait.homework48;

import de.ait.exceptions.InsufficientFundsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    private  String accountNumber;
    private String ownerNumber;
    private double balance;

    public BankAccount(String accountNumber, String ownerNumber, double balance) {
        this.accountNumber = accountNumber;
        this.ownerNumber = ownerNumber;
        this.balance = balance;
        LOGGER.info("account created. Owner: {}",getOwnerNumber());
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        this.setBalance(getBalance()+amount);
        LOGGER.info("{}'s balance has been replenished",getOwnerNumber());
        return true;
    }

    public boolean withdraw(double amount){
        try{
        if (amount<=getBalance()){
            this.setBalance(getBalance()-amount);
            LOGGER.info("money were withdrawn from the {}'s balance");
            return true;
        } else {
            throw new InsufficientFundsException(getBalance(),amount);
        } }
        catch (InsufficientFundsException exception){
            LOGGER.error("There is not enough money in account {} to withdraw money.",getOwnerNumber());
            return false;
        }
    }




}
