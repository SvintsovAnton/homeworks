package de.ait.homework48;

import de.ait.exceptions.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationService .class);

    static public boolean authenticate(String username, String password) {
        try {
            if (User.alluser.containsValue(username)) {
                String usercopy = User.alluser.get(password);
                if (usercopy==null){
                    throw new AuthenticationException("Incorrect password");
                }
                if (User.alluser.get(password).equals(username)) {
                    LOGGER.info("account exists, password is correct");
                    return true;
                } else {
                    throw new AuthenticationException("Incorrect password");
                }
            } else {
                throw new AuthenticationException("Such user does not exist");
            }
        } catch (AuthenticationException exception) {
            LOGGER.error(exception.getMessage());
            return false;
        }
    }}
