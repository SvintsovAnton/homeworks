package de.ait.homework48;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class User {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    private String username;
    private String password;


    static HashMap<String,String> alluser = new HashMap<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        alluser.put(password, username);
        LOGGER.info("username created and add in list");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
