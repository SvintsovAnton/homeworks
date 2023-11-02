package de.ait.homework43;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private String owner;
    private double balance;

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        LOGGER.info(getOwner()+" topped up his account with "+amount+" euros");
        this.setBalance(this.getBalance()+amount);

    }

    public boolean withdraw(double amount){
        if(amount>this.getBalance()){
            LOGGER.error(this.getOwner()+"’s account does not have "+(amount-this.getBalance())+ " euros enough to withdraw "+amount+" euros");
            return  false;
        } else {LOGGER.info(getOwner()+" withdrew "+amount+" euros from his account");
            this.setBalance(this.getBalance()-amount);
            return true;
        }
    }

    public double checkBalance(){
        LOGGER.debug(this.getOwner()+"'s account balance is "+this.getBalance()+" euros");
        return this.getBalance();
    }

}
