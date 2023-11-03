package de.ait.homework44;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashSet;
import java.util.Set;

public class LibraryCatalog {

    private Set<Book> listOfBook = new HashSet();

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryCatalog.class);

    public Set<Book> getListOfBook() {
        return listOfBook;
    }

    public boolean addBook(Book newBook) {
        if (newBook == null) {
            LOGGER.error("Book is no exist");
            return false;
        }
        for (Book book : listOfBook) {
            if (book.equals(newBook)) {
                LOGGER.error("Book \"{}\" is already in list", newBook.getName());
                return false;
            }

        }
        listOfBook.add(newBook);
        LOGGER.info("Book \"{}\" added", newBook.getName());
        return true;
    }


    public boolean removeBook(Book deleteBook)
    {
if(listOfBook.contains(deleteBook)){
    LOGGER.info("Book \"{}\" deleted",deleteBook.getName());
    listOfBook.remove(deleteBook);
    return  true;
}
LOGGER.error("Book \"{}\" is no exsist",deleteBook.getName());
return false;
    }

    public Book findBookByTitle(String titleBook){
        for (Book book: listOfBook){
            if (book.getName().equals(titleBook)){
                LOGGER.info("Book \"{}\" provided",titleBook);
                return book;
            }
        }
        LOGGER.error("Book \"{}\" not found", titleBook);
        return null;
    }

    public String listAllBooks(){
        String listAllBook = " ";
        for (Book book: listOfBook){
            listAllBook= listAllBook+book.toString();
        }
        return listAllBook;
    }


}
