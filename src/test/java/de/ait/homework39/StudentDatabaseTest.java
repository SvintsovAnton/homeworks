package de.ait.homework39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDatabaseTest {

    StudentDatabase studentDatabase;

    @BeforeEach
    void SetUp() {
        studentDatabase = new StudentDatabase();
    }

    @DisplayName("addStudent successfully adds a student")
    @Test
    void addStudentPositive() {
        Student anna = new Student("Anna", 20);
        studentDatabase.addStudent(anna);
        Assertions.assertEquals(true, studentDatabase.containsStudent(anna));
    }

    @DisplayName("addStudent did not add duplicates.")
    @Test
    void addStudentNegative() {
        Student anna = new Student("Anna", 20);
        Assertions.assertEquals(false, studentDatabase.containsStudent(anna));
    }

    @DisplayName("RemoveStudent successfully removes the student.")
    @Test
    void removeStudentPositive() {
        Student anna = new Student("Anna", 20);
        Student anton = new Student("Anton", 21);
        studentDatabase.addStudent(anna);
        studentDatabase.addStudent(anton);
        studentDatabase.removeStudent(anton);
        Assertions.assertEquals(false, studentDatabase.containsStudent(anton));

    }

    @DisplayName("RemoveStudent does nothing if the student is not in the database.")
    @Test
    void removeStudentNegative() {
        Student anna = new Student("Anna", 20);
        Student anton = new Student("Anton", 21);
        studentDatabase.addStudent(anna);
        studentDatabase.removeStudent(anton);
        Assertions.assertEquals(false, studentDatabase.removeStudent(anton));
    }

    @DisplayName("containsStudent returns true for an existing student.")
    @Test
    void containsStudentPositiv() {
        Student anna = new Student("Anna", 20);
        studentDatabase.addStudent(anna);
        Assertions.assertEquals(true, studentDatabase.containsStudent(anna));
    }

    @DisplayName("containsStudent returns false for a non-existent student.")
    @Test
    void containsStudentNegative() {
        Student anna = new Student("Anna", 20);
        Student anton = new Student("Anton", 21);
        studentDatabase.addStudent(anna);
        Assertions.assertEquals(false, studentDatabase.containsStudent(anton));
    }
}