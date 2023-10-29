package de.ait.homework42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportsmanTest {

    Sportsman arnold;


    @BeforeEach
    void setUp() {
        arnold = new Sportsman("Arnold Nowak",30,"pull-up",89);
    }

    @Test
    void Constructor(){
        Assertions.assertEquals("Arnold Nowak",arnold.getName());
        Assertions.assertEquals(30,arnold.getAge());
        Assertions.assertEquals("pull-up",arnold.getSport());
        Assertions.assertEquals(89,arnold.getRecords());
    }

    @Test
    void updateRecordPositive() {
        arnold.updateRecord(93);
        Assertions.assertEquals(93,arnold.getRecords());
    }

    @Test
    void updateRecordNegative() {
        arnold.updateRecord(85);
        Assertions.assertEquals(89,arnold.getRecords());
    }


    @Test
    void getName() {
        Assertions.assertEquals("Arnold Nowak",arnold.getName());

    }

    @Test
    void setName() {
        arnold.setName("Arnold Noowak");
        Assertions.assertEquals("Arnold Noowak",arnold.getName());
    }

    @Test
    void getAge() {
        Assertions.assertEquals(30,arnold.getAge());
    }

    @Test
    void setAge() {
        arnold.setAge(31);
        Assertions.assertEquals(31,arnold.getAge());
    }

    @Test
    void getSport() {
        Assertions.assertEquals("pull-up",arnold.getSport());
    }

    @Test
    void setSport() {
        arnold.setSport("floor push-ups");
        Assertions.assertEquals("floor push-ups",arnold.getSport());
    }

    @Test
    void getRecords() {
        Assertions.assertEquals(89,arnold.getRecords());
    }

    @Test
    void setRecords() {
        arnold.setRecords(80);
        Assertions.assertEquals(80,arnold.getRecords());
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Sportsman{name='Arnold Nowak', age=30, sport='pull-up', records=89}",arnold.toString());
    }


    @Test
    void isEligibleForCompetitionPositive() {
        Assertions.assertTrue(arnold.isEligibleForCompetition(18,60));
    }

    @Test
    void isEligibleForCompetitionNegative() {
        Assertions.assertFalse(arnold.isEligibleForCompetition(18,28));
    }

}