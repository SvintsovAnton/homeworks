package de.ait.homework43;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount antonAccount;
    BankAccount annaAccount;


    @BeforeEach
    void setUp() {
        antonAccount = new BankAccount("Anton",5000.0);
        annaAccount = new BankAccount("Anna",300.0);
    }

    @Test
    void deposit() {
       LogCaptor logCaptor = LogCaptor.forClass(BankAccount.class);
       logCaptor.setLogLevelToInfo();
        antonAccount.deposit(1000.0);
        Assertions.assertEquals(6000.0,antonAccount.getBalance());

        String expectedInfoMessage = "Anton topped up his account with 1000.0 euros";
        Assertions.assertTrue(logCaptor.getInfoLogs().contains(expectedInfoMessage));


    }

    @Test
    void withdrawPositive() {
        Assertions.assertTrue(antonAccount.withdraw(500.0));
        Assertions.assertEquals(4500.0,antonAccount.getBalance());
    }

    @Test
    void withdrawNegative() {
        Assertions.assertFalse(annaAccount.withdraw(400.0));
    }

    @Test
    void checkBalance() {Assertions.assertEquals(5000.0,antonAccount.checkBalance());
        Assertions.assertEquals(300.0,annaAccount.checkBalance());
    }
}