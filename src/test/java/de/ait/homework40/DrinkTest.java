package de.ait.homework40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {
    Drink drink;

    @Test
    void constructorDrink(){
        drink = new Drink("Cola","alcohol-free",0.33);
        Assertions.assertEquals("Cola",drink.getName());
        Assertions.assertEquals("alcohol-free",drink.getType());
        Assertions.assertEquals(0.33,drink.getVolume());
    }

    @Test void getName() {
        drink = new Drink("Fanta","alcohol-free",0.5);
        Assertions.assertEquals("Fanta",drink.getName());
    }

    @Test
    void getType() {
        drink = new Drink("Fanta","alcohol-free",0.5);
        Assertions.assertEquals("alcohol-free",drink.getType());
    }

    @Test
    void getVolume() {
        drink = new Drink("Fanta","alcohol-free",0.5);
        Assertions.assertEquals(0.5,drink.getVolume());
    }
}