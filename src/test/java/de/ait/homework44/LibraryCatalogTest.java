package de.ait.homework44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryCatalogTest {
    LibraryCatalog libraryCatalog;

    @BeforeEach
    void setUp() {
        libraryCatalog= new LibraryCatalog();
        Book ubitperesmeshnika = new Book("Убить пересмешника","Харпер Ли","0987-252-252");
        Book gordostiprdubejdenie = new Book("Гордость и предубеждение","Джейн Остен","0987-252-252");
        Book dnevnikannifrank = new Book("Дневник Анны Франк","Анна Франк","0987-252-811");
        Book utopiya1984 = new Book("1984","Джордж Оруэлл","0987-252-777");
        Book garriPotter = new Book("Гарри Поттер и философский камень","Джоан Роулинг","0987-252-258");
        Book vlastelinkolec = new Book("Властелин колец","Толкин","0987-252-020");
    }



    @Test
    void addBookPositive() {
        Book ubitperesmeshnika = new Book("Убить пересмешника","Харпер Ли","0987-252-252");
        Assertions.assertTrue(libraryCatalog.addBook(ubitperesmeshnika));
        Assertions.assertTrue(libraryCatalog.getListOfBook().contains(ubitperesmeshnika));
    }

    @Test
    void addBookNegative() {
        Book ubitperesmeshnika = new Book("Убить пересмешника","Харпер Ли","0987-252-252");
        libraryCatalog.addBook(ubitperesmeshnika);
        Assertions.assertFalse(libraryCatalog.addBook(ubitperesmeshnika));

    }
    @Test
    void addBookNegativeNull() {
        Book ubitperesmeshnika = null;
        Assertions.assertFalse(libraryCatalog.addBook(ubitperesmeshnika));
        Assertions.assertFalse(libraryCatalog.getListOfBook().contains(ubitperesmeshnika));
    }

    @Test
    void removeBookPositive() {
        Book gordostiprdubejdenie = new Book("Гордость и предубеждение","Джейн Остен","0987-252-252");
        libraryCatalog.addBook(gordostiprdubejdenie);
        Assertions.assertTrue(libraryCatalog.removeBook(gordostiprdubejdenie));
        Assertions.assertFalse(libraryCatalog.getListOfBook().contains(gordostiprdubejdenie));
    }

    @Test
    void removeBookNegative() {
        Book gordostiprdubejdenie = new Book("Гордость и предубеждение","Джейн Остен","0987-252-252");
        Book dnevnikannifrank = new Book("Дневник Анны Франк","Анна Франк","0987-252-811");
        libraryCatalog.addBook(gordostiprdubejdenie);
        Assertions.assertFalse(libraryCatalog.removeBook(dnevnikannifrank));
    }

    @Test
    void findBookByTitlePositive() {
        Book utopiya1984 = new Book("1984","Джордж Оруэлл","0987-252-777");
        Book garriPotter = new Book("Гарри Поттер и философский камень","Джоан Роулинг","0987-252-258");
        libraryCatalog.addBook(utopiya1984);
        Assertions.assertEquals(utopiya1984,libraryCatalog.findBookByTitle("1984"));
    }
    @Test
    void findBookByTitleNegative() {
        Book utopiya1984 = new Book("1984","Джордж Оруэлл","0987-252-777");
        Book garriPotter = new Book("Гарри Поттер и философский камень","Джоан Роулинг","0987-252-258");
        libraryCatalog.addBook(utopiya1984);
        Assertions.assertEquals(null,libraryCatalog.findBookByTitle("Гарри Поттер и философский камень"));
    }


    @Test
    void getListOfBook() {
        Book vlastelinkolec = new Book("Властелин колец","Толкин","0987-252-020");
        libraryCatalog.addBook(vlastelinkolec);
        Assertions.assertEquals("  Book{name='Властелин колец', author='Толкин', ISBN='0987-252-020'}",libraryCatalog.listAllBooks());
    }
}