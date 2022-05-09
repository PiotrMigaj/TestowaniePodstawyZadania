package pl.migibud.javazaawansowanazadania.kolekcje.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        BookService bookService = new BookService();
        bookService.addBook(new Book("Warry Potter 2",32,1995, List.of(new Author("Piotr","Migaj","MALE"),new Author("Anna","Migaj","Female")),Genre.FANTASY));
        bookService.addBook(new Book("Garry Potter",35,2010, List.of(new Author("Piotr","Migaj","MALE")),Genre.FANTASY));
        bookService.addBook(new Book("Marry Potter",35,1996, List.of(new Author("Piotr","Migaj","MALE")),Genre.CRIME));

//        System.out.println(bookService.getBooks());
//        System.out.println(bookService.findByGenre(Genre.ACTION).size());
//        System.out.println(bookService.findByYear(1999).size());
//        System.out.println(bookService.getMostExpensiveBook());
//        System.out.println(bookService.getCheapestBook());
//        System.out.println(bookService.findByNumberOfAuthors(2));
//        System.out.println(bookService.sortByTitleAscending());
//        System.out.println(bookService.sortByTitleDescending());
        System.out.println(bookService.findByAuthor(new Author("Piotr","Migaj","MALE")));

    }

}
