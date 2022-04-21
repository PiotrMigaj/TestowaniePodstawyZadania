package pl.migibud.exceptions.ex2;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws NoBookFoundException, NoSuchAnAmountOfBooksException {

        BookRepository bookRepository = new BookRepository();

        bookRepository.addBookToBookRepository(new Book("00025","Harry Potter","J.K. Rowling",1));
        bookRepository.addBookToBookRepository(new Book("00025","Harry Potter","J.K. Rowling",3));
        bookRepository.addBookToBookRepository(new Book("00028","Lord of the Rings","J.K. Rowling",1));

        Iterator<Book> iterator = bookRepository.getBooks().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        bookRepository.removeBookFromRepository(new Book("00025","Harry Potter","J.K. Rowling",5));

        System.out.println();

        Iterator<Book> iterator2 = bookRepository.getBooks().iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }


//        Book book = bookRepository.getBookFromBookRepository("Harry Potter 2");
//        System.out.println(book);

    }

}
