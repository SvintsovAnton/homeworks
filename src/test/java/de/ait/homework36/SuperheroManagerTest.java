package de.ait.homework36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SuperheroManagerTest {

    SuperheroManager superheroManager;

    @BeforeEach
    public void SetUp() {
        superheroManager = new SuperheroManager();
    }

    @DisplayName("add a new object")
    @Test
    public void testAddNewSuperhero() {
        Superhero robinhood = new Superhero("Робин Гуд", 3, 25);
        superheroManager.addSuperhero(robinhood);
        Assertions.assertEquals(true, superheroManager.listOfSuperheroes.contains(robinhood));
    }

    @DisplayName("add adding an existing object")
    @Test
    public void testAddOldSuperhero() {
        Superhero robinhood = new Superhero("Робин Гуд", 3, 25);
        Superhero robinhoodOld = new Superhero("Робин Гуд", 5, 45);
        superheroManager.addSuperhero(robinhood);
        superheroManager.addSuperhero(robinhoodOld);
        Assertions.assertEquals(false, superheroManager.listOfSuperheroes.contains(robinhoodOld));
    }

    @DisplayName("remove an existing object")
    @Test
    public void testRemoveSuperheroPositiv() {
        Superhero robinhood = new Superhero("Робин Гуд", 3, 25);
        Superhero robinhoodOld = new Superhero("Робин Гуд Старый", 5, 45);
        superheroManager.addSuperhero(robinhood);
        superheroManager.addSuperhero(robinhoodOld);
        Assertions.assertEquals("Супергерой удачно удалён", superheroManager.removeSuperhero("Робин Гуд Старый"));
    }


    @DisplayName("remove a non-existent object")
    @Test
    public void testRemoveSuperheroNegativ() {
        Assertions.assertEquals(null, superheroManager.removeSuperhero("Робин Гуд"));
    }

    @DisplayName("get an existing object ")
    @Test
    public void testGetSuperheroPositive() {
        Superhero robinhood = new Superhero("Робин Гуд", 3, 25);
        Superhero robinhoodOld = new Superhero("Робин Гуд Старый", 5, 45);
        superheroManager.addSuperhero(robinhood);
        superheroManager.addSuperhero(robinhoodOld);
        Assertions.assertEquals(robinhood, superheroManager.getSuperhero("Робин Гуд"));
    }

    @DisplayName("get a non-existent object ")
    @Test
    public void testGetSuperheroNegative() {
        Superhero robinhoodOld = new Superhero("Робин Гуд Старый", 5, 45);
        superheroManager.addSuperhero(robinhoodOld);
        Assertions.assertEquals(null, superheroManager.getSuperhero("Робин Гуд"));
    }

    @DisplayName("returns a list without objects")
    @Test
    public void testGetAllSuperherousEmpty() {
        Assertions.assertEquals(" ", superheroManager.getAllSuperheroes());
    }

    @DisplayName("returns a list with one object")
    @Test
    public void testGetAllSuperherousWithOneObject() {
        Superhero robinhoodOld = new Superhero("Робин Гуд Старый", 5, 45);
        superheroManager.addSuperhero(robinhoodOld);
        Assertions.assertEquals("  Имя: [Робин Гуд Старый], Сила: [5], Возраст: [45].", superheroManager.getAllSuperheroes());
    }

    @DisplayName("returns a list with two objects")
    @Test
    public void testGetAllSuperherousWithTwoObjects() {
        Superhero robinhood = new Superhero("Робин Гуд", 3, 25);
        Superhero robinhoodOld = new Superhero("Робин Гуд Старый", 5, 45);
        superheroManager.addSuperhero(robinhood);
        superheroManager.addSuperhero(robinhoodOld);
        Assertions.assertEquals("  Имя: [Робин Гуд], Сила: [3], Возраст: [25]. Имя: [Робин Гуд Старый], Сила: [5], Возраст: [45].", superheroManager.getAllSuperheroes());
    }

    @DisplayName("update superhero information by name.")
    @Test
    public void testUpdateSuperheroPositiv() {
        Superhero robinhood = new Superhero("Робин Гуд", 3, 25);
        Superhero robinhoodOld = new Superhero("Робин Гуд Старый", 5, 45);
        superheroManager.addSuperhero(robinhood);
        superheroManager.updateSuperhero("Робин Гуд", robinhoodOld);
        Assertions.assertEquals("Робин Гуд Старый", superheroManager.listOfSuperheroes.get(0).getName());

    }

    @DisplayName("update superhero information by misspelled name")
    @Test
    public void testUpdateSuperheroNegativ() {
        Superhero robinhood = new Superhero("Робин Гуд", 3, 25);
        Superhero robinhoodOld = new Superhero("Робин Гуд Старый", 5, 45);
        superheroManager.addSuperhero(robinhood);
        superheroManager.updateSuperhero("Супермэн", robinhoodOld);
        Assertions.assertEquals("Робин Гуд", superheroManager.listOfSuperheroes.get(0).getName());

    }


}
