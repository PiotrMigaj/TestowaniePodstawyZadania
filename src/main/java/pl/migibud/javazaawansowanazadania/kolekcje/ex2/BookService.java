package pl.migibud.javazaawansowanazadania.kolekcje.ex2;

import pl.migibud.javazaawansowanazadania.kolekcje.groupingby.Trade;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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

    public List<Book> findByYear(int yearOfRelease){
        return this.books.stream().filter(b->b.getYearOfRelease()<yearOfRelease).collect(Collectors.toList());
    }

//    public Book getMostExpensiveBook(){
//
//        Book mostExpensiveBook = this.books.get(0);
//        for (Book b: books) {
//            if (b.getPrice()>mostExpensiveBook.getPrice()){
//                mostExpensiveBook=b;
//            }
//        }
//        return mostExpensiveBook;
//    }

    public Book getMostExpensiveBook(){
        return this.books.stream().reduce((book, book2) -> {
            if (book.getPrice()>book2.getPrice()) {
                return book;
            }
            return book2;
        }).orElseThrow();
    }

    public Book getCheapestBook(){
        return this.books.stream().reduce((book, book2) -> {
            if (book.getPrice()>book2.getPrice()) {
                return book2;
            }
            return book;
        }).orElseThrow();
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors){
        return this.books.stream().filter(b->b.getAuthors().size()==2).collect(Collectors.toList());
    }

    public List<Book> sortByTitleAscending(){
        this.books.sort(Comparator.comparing(Book::getTitle));
        return this.books;
    }

    public List<Book> sortByTitleDescending(){
        this.books.sort(Comparator.comparing(Book::getTitle).reversed());
        return this.books;
    }

//    public List<Book> sortByTitleDescending(){
//        this.books.sort((b1,b2)->b2.getTitle().compareTo(b1.getTitle()));
//        return this.books;
//    }

    public boolean isBookInRepo(Book book){
        return this.books.contains(book);
    }

    public List<Book> findByAuthor(Author author){
        return this.books.stream().filter(book -> book.getAuthors().contains(author)).collect(Collectors.toList());
    }

//    public Map<Genre,String> getPairGenreAndTitle(){
//        Map<Genre,String> tmpMap = new HashMap<>();
//        for (Book b:this.books) {
//            tmpMap.put(b.getGenre(),b.getTitle());
//        }
//        return tmpMap;
//    }

    public Map<Genre,List<String>> getPairGenreAndTitle(){

        return this.books
                .stream()
                .collect(Collectors
                        .groupingBy(Book::getGenre,
                        Collectors.mapping(Book::getTitle,Collectors.toList())));
    }

    public PriorityQueue<Book> getPriorityQueueOfBooks(){
        return new PriorityQueue<>(this.books);
    }
}
