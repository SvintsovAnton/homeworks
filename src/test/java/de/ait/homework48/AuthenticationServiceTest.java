package de.ait.homework48;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationServiceTest {


User user;
    AuthenticationService authenticationService;

    @Test
    void testAuthenticatePositive() {
        user = new User("User1","777777");
        authenticationService = new AuthenticationService();
        Assertions.assertTrue(authenticationService.authenticate("User1","777777"));
    }

    @Test
    void testAuthenticateNegativeWrongPassword(){
        user = new User("User1","777777");
        authenticationService = new AuthenticationService();
        Assertions.assertFalse(authenticationService.authenticate("User1","777775"));

    }

    @Test
    void testAuthenticateNegativeNonExistentUser(){
        user = new User("User1","777777");
        authenticationService = new AuthenticationService();
        Assertions.assertFalse(authenticationService.authenticate("User2","777777"));


    }

}