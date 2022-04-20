package pl.migibud.exceptions.ex2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books;

    public BookRepository() {
        this.books = new ArrayList<>();
    }

    public boolean addBookToBookRepository(Book book){

        if (book!=null){
            books.add(book);
            return true;
        }
        return false;
    }

    public Book getBookFromBookRepository(String title) throws NoBookFoundException {

        return books.stream().filter(el->el.getTitle().equals(title)).findFirst().orElseThrow(()->new NoBookFoundException(title));

    }
}
