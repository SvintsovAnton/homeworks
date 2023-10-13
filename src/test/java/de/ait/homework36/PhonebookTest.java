package de.ait.homework36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhonebookTest {

    Phonebook phonebook;


    @BeforeEach
    public void setUp() {
        phonebook = new Phonebook();
    }

    @Test
    public void testAddValidContact() {
        Contact contactAnton = new Contact("Anton", "0771555555");
        phonebook.addContact(contactAnton);
        Assertions.assertEquals(contactAnton, phonebook.findContactByName("Anton"));
    }


    @Test
    public void testAddDuplicateContact() {
        Contact contactAnna1 = new Contact("Anna", "0791888777");
        Contact contactAnna2 = new Contact("Anna", "0791888999");
        phonebook.addContact(contactAnna1);
        Assertions.assertEquals(false, phonebook.addContact(contactAnna2));
    }

    @Test
    public void testAddNullContact() {
        Assertions.assertEquals(false, phonebook.addContact(null));
    }

    @Test
    public void testDeleteExistingContact() {
        Contact contactBogdan = new Contact("Bogdan", "0792777777");
        phonebook.addContact(contactBogdan);
        phonebook.deleteContact("Bogdan");
        Assertions.assertEquals(null, phonebook.findContactByName("Bogdan"));
    }

    @Test
    public void testDeleteNonexistentContact() {
        Assertions.assertEquals(false, phonebook.deleteContact("Bogdana"));

    }

    @Test
    public void testFindExistingContact() {
        Contact contactCilvia = new Contact("Silvia", "079987848");
        phonebook.addContact(contactCilvia);
        Assertions.assertEquals(contactCilvia, phonebook.findContactByName("Silvia"));
    }

    @Test
    public void testFindNonexistentContact() {
        Contact contactChristina = new Contact("Christina", "079894844");
        phonebook.addContact(contactChristina);
        Assertions.assertEquals(null, phonebook.findContactByName("Silvia"));
    }

}
