package pl.migibud.javazaawansowanazadania.kolekcje.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        BookService bookService = new BookService();
        bookService.addBook(new Book("Harry Potter",35,1995, List.of(new Author("Piotr","Migaj","MALE")),Genre.FANTASY));
        bookService.addBook(new Book("Harry Potter",35,1995, List.of(new Author("Piotr","Migaj","MALE")),Genre.FANTASY));
        bookService.addBook(new Book("Harry Potter",35,1995, List.of(new Author("Piotr","Migaj","MALE")),Genre.CRIME));

        System.out.println(bookService.getBooks());
        System.out.println(bookService.findByGenre(Genre.ACTION).size());

    }

}
