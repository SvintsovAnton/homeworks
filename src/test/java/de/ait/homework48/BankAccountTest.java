package de.ait.homework48;

import de.ait.exceptions.CalculatorException;
import de.ait.exceptions.InsufficientFundsException;
import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private LogCaptor logCaptor = LogCaptor.forClass(BankAccount.class);

    BankAccount bankAccount;

    @BeforeEach
    void setUp(){
    }

    @Test
    void getBalance() {
        bankAccount = new BankAccount("1122","User1",350.0);
        Assertions.assertEquals(350.0,bankAccount.getBalance());
    }

    @Test
    void deposit() {
        bankAccount = new BankAccount("1123","User2",250.0);
        Assertions.assertTrue(bankAccount.deposit(1000));
        Assertions.assertEquals(1250.0,bankAccount.getBalance());
    }

    @Test
    void withdrawPositiv() {
        bankAccount = new BankAccount("1124","User3",500.0);
        Assertions.assertTrue(bankAccount.withdraw(400.0));
        Assertions.assertEquals(100.0,bankAccount.getBalance());
    }

    @Test
    void withdrawNegative() {
        bankAccount = new BankAccount("1124","User4",500.0);
        Assertions.assertFalse(bankAccount.withdraw(600.0));
    }


}