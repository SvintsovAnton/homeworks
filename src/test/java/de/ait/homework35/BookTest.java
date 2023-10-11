package de.ait.homework35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void testConstructorBook(){
        Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
assertEquals("97838362",java.getIsbn());
assertEquals("Java ist auch eine Insel",java.getTitle());
assertEquals("Christian Ullenboom",java.getAuthor());
    }

@Test
    public void testGetISBNBook(){
    Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
    assertEquals("97838362",java.getIsbn());
}

    @Test
    public void testSetISBNBook(){
        Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
        java.setIsbn("00000");
        assertEquals("00000",java.getIsbn());
    }
    @Test
    public void testGetTitleBook(){
        Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
        assertEquals("Java ist auch eine Insel",java.getTitle());
    }

    @Test
    public void testSetTitelBook(){
        Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
        java.setTitle("Java Java");
        assertEquals("Java Java",java.getTitle());
    }

    @Test
    public void testGetAuthorBook(){
        Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
        assertEquals("Christian Ullenboom",java.getAuthor());
    }

    @Test
    public void testSetAuthorBook(){
        Book java = new Book("97838362","Java ist auch eine Insel","Christian Ullenboom");
        java.setAuthor("Java Programist");
        assertEquals("Java Programist",java.getAuthor());
    }


}
