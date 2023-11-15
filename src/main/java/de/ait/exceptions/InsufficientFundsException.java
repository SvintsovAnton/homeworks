package de.ait.exceptions;

public class InsufficientFundsException extends RuntimeException{

    public InsufficientFundsException(double balance,double amount){
        System.out.println("There is not enough money to withdraw "+amount+" euros.  In your account "+balance+" euros.");
        }
}
