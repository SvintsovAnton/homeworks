package de.ait.homework46;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class UserPassValidator {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserPassValidator.class);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username =  scan.next();

        try {
            username.charAt(0);
            System.out.println("Username: "+username);
        } catch (IndexOutOfBoundsException exception){
            System.out.println("Name is empty");
            LOGGER.error("Username is empty");
        }
    }
}
