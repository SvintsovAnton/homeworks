package de.ait.homework40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {
    Bar bar;

    @BeforeEach
    void setUp() {
        bar = new Bar();
    }



    @Test
    void addDrinkPositive() {
        Drink cola = new Drink("Cola","alcohol-free",0.33);
        Assertions.assertTrue(bar.addDrink("222",cola));
        Assertions.assertTrue(bar.getListOfDrink().containsValue(cola));
    }

    @Test
    void addDrinkNegative() {
        Drink cola = new Drink("Cola","alcohol-free",0.33);
        Drink fanta = new Drink("Fanta","alcohol-free",0.5);
        bar.addDrink("111",fanta);
        Assertions.assertFalse(bar.addDrink("111",fanta));
        Assertions.assertEquals(1,bar.getListOfDrink().size());
    }

    @Test
    void getDrinkPositive() {
        Drink cola = new Drink("Cola","alcohol-free",0.33);
        bar.addDrink("111",cola);
        Assertions.assertEquals(cola,bar.getDrink("111"));
    }

    @Test
    void getDrinkNegative() {
        Drink fanta = new Drink("Fanta","alcohol-free",0.5);
        bar.addDrink("222",fanta);
        Assertions.assertNull(bar.getDrink("111"));
    }
}