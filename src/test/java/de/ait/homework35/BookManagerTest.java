package de.ait.homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookManagerTest {

    BookManager bookManager;


    Book uebungsbuchDeutsch = new Book("98785", "Großes Übungsbuch", "Lili Marlen");
    Book python = new Book("98784", "Python ist auch eine Sprache", "Mark Twen");


    @BeforeEach
    public void setUp() {
        bookManager = new BookManager();
    }

    @Test
    public void testAddNewBook() {
        Book java = new Book("97838362", "Java ist auch eine Insel", "Christian Ullenboom");
        bookManager.addBook(java);
        assertEquals(java, bookManager.findBookByISBN("97838362"));
    }

    @Test
    public void testAddOldBook(){
        Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
        bookManager.addBook(java);
        assertThrows(IllegalArgumentException.class,() -> { bookManager.addBook(java);});

    }


    @Test
    public void testfindBookByISBNPositive() {
        Book uebungsbuchDeutsch = new Book("98785", "Großes Übungsbuch", "Lili Marlen");
        bookManager.addBook(uebungsbuchDeutsch);
        assertEquals(uebungsbuchDeutsch, bookManager.findBookByISBN("98785"));
    }
    @Test
    public void testfindBookByISBNNegative() {
        Book uebungsbuchDeutsch = new Book("98785", "Großes Übungsbuch", "Lili Marlen");
        bookManager.addBook(uebungsbuchDeutsch);
        assertEquals(null, bookManager.findBookByISBN("97838362"));
    }

    @Test
    public void testRemoveBookByISBN(){
        Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
        Book uebungsbuchDeutsch = new Book("98785", "Großes Übungsbuch", "Lili Marlen");
bookManager.addBook(java);
bookManager.addBook(uebungsbuchDeutsch);
bookManager.removeBook("97838362");
assertEquals(null,bookManager.findBookByISBN("97838362"));
    }
    @Test
    public void testRemoveBookPositive() {
        Book java = new Book("97838362", "Java ist auch eine Insel", "Christian Ullenboom");
        Book uebungsbuchDeutsch = new Book("98785", "Großes Übungsbuch", "Lili Marlen");
        bookManager.addBook(java);
        bookManager.addBook(uebungsbuchDeutsch);
        assertEquals(true, bookManager.removeBook("97838362"));
    }
    @Test
    public void testRemoveBookNegative() {
       Book uebungsbuchDeutsch = new Book("98785", "Großes Übungsbuch", "Lili Marlen");
        bookManager.addBook(uebungsbuchDeutsch);
        assertEquals(false, bookManager.removeBook("97838362"));
    }

}
