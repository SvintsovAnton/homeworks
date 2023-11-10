package de.ait.lombok;

import de.ait.homework43.BankAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {

    private static final Logger LOGGER = LoggerFactory.getLogger(Student.class);

    private String firstName;
    private String secondName;



    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        LOGGER.info("Student was created");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
