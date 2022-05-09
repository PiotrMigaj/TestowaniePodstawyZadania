package pl.migibud.javazaawansowanazadania.kolekcje.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public boolean addBook(Book book){
        if (book!=null){
            return books.add(book);
        }
        return false;
    }

    public boolean removeBook(Book book){
        if (book!=null){
            return books.remove(book);
        }
        return false;
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public List<Book> findByGenre(Genre genre){
        return this.books.stream().filter(b->b.getGenre()==genre).collect(Collectors.toList());
    }

}
