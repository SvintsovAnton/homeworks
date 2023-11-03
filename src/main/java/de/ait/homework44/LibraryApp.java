package de.ait.homework44;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LibraryApp {
    public static void main(String[] args) {


        // Create store of books
        ArrayList<Book> store = new ArrayList<>();

        Book ubitperesmeshnika = new Book("Убить пересмешника","Харпер Ли","0987-252-252");
        Book gordostiprdubejdenie = new Book("Гордость и предубеждение","Джейн Остен","0987-252-252");
        Book dnevnikannifrank = new Book("Дневник Анны Франк","Анна Франк","0987-252-811");
        Book utopiya1984 = new Book("1984","Джордж Оруэлл","0987-252-777");
        Book garriPotter = new Book("Гарри Поттер и философский камень","Джоан Роулинг","0987-252-258");
        Book vlastelinkolec = new Book("Властелин колец","Толкин","0987-252-020");
        store.add(ubitperesmeshnika);
        store.add(gordostiprdubejdenie);
        store.add(dnevnikannifrank);
        store.add(utopiya1984);
        store.add(garriPotter);
        store.add(vlastelinkolec);

        LibraryCatalog libraryCatalog = new LibraryCatalog();

        boolean flag = true;
        while (flag){
            System.out.println("Hello user, select Menu");
            System.out.println("1-add book");
            System.out.println("2-remove book");
            System.out.println("3-find book by title");
            System.out.println("4 - get list all books");
            System.out.println("0 -exit");
            int choice = new java.util.Scanner(System.in).nextInt();
            if (choice==1){
                System.out.println("select the book you want to add");
                int addindex=0;
                for (Book bookStore:store){
                    System.out.println("Book : "+bookStore.getName()+" Author: "+bookStore.getAuthor()+". Number "+addindex);
                    addindex++;
                }
                System.out.println("Entry number of book:");
                int choiceAddBook = new java.util.Scanner(System.in).nextInt();
                if (choiceAddBook<=addindex) {
                    libraryCatalog.addBook(store.get(choiceAddBook));
                } else if (choiceAddBook>addindex){
                 System.out.println("This book is not exist");}
            } else if (choice==2) {
                for (Book bookDeleted: libraryCatalog.getListOfBook()){
                    System.out.println("Book: "+bookDeleted.getName()+" "+bookDeleted.getAuthor());
                }
                System.out.println("Which book do you want to delete?. Write title:");
                String titledelite = new java.util.Scanner(System.in).nextLine();
                libraryCatalog.removeBook(libraryCatalog.findBookByTitle(titledelite));
            }
            else if (choice==3){
                System.out.println("Entry title of book: ");
                String titlefind = new java.util.Scanner(System.in).nextLine();
                libraryCatalog.findBookByTitle(titlefind);
            } else if (choice ==4) {
                System.out.println(libraryCatalog.getListOfBook());
            } else if (choice==0) {
                flag =false;
            }
            else {
                System.out.println("you entered an incorrect value");
            }
        }

    }
}
