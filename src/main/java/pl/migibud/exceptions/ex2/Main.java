package pl.migibud.exceptions.ex2;

public class Main {

    public static void main(String[] args) throws NoBookFoundException {

        BookRepository bookRepository = new BookRepository();

        bookRepository.addBookToBookRepository(new Book("00025","Harry Potter","J.K. Rowling"));

        Book book = bookRepository.getBookFromBookRepository("Harry Potter 2");
        System.out.println(book);

    }

}
