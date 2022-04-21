package pl.migibud.exceptions.ex2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books;

    public BookRepository() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public boolean addBookToBookRepository(Book book) {

        if (book != null) {
            int index = this.getIndexOfItemInArrayList(book);
            if (index == -1) {
                books.add(book);
                return true;
            }
            books.get(index).amount += book.amount;
            return true;

        }
        return false;
    }

    public Book getBookFromBookRepository(String title) throws NoBookFoundException {

        return books.stream().filter(el -> el.getTitle().equals(title)).findFirst().orElseThrow(() -> new NoBookFoundException(title));

    }

    public boolean removeBookFromRepository(Book book) throws NoBookFoundException, NoSuchAnAmountOfBooksException {

        if (book != null) {
            if (getIndexOfItemInArrayList(book) == -1) {
                System.out.println("There is no such book in the repository.");
                throw new NoBookFoundException(book.getTitle());
            }
            if (isOnlyOneTheSameBookInRepo(book)) {
                books.remove(getIndexOfItemInArrayList(book));
                return true;
            }
            if (books.get(getIndexOfItemInArrayList(book)).amount== book.amount) {
                books.remove(getIndexOfItemInArrayList(book));
                return true;
            }
            this.reduceAmountOfTheSameBookInRepo(book);
        }
        return false;
    }

    public int getIndexOfItemInArrayList(Book book) {
        return books.indexOf(book);
    }

    private boolean isOnlyOneTheSameBookInRepo(Book book) {

        Book tmpBook = books.get(getIndexOfItemInArrayList(book));
        return tmpBook.amount == 1 ? true : false;

    }

    private boolean reduceAmountOfTheSameBookInRepo(Book book) throws NoSuchAnAmountOfBooksException {

        Book tmpBook = books.get(getIndexOfItemInArrayList(book));

        if (tmpBook.amount< book.amount){
            throw new NoSuchAnAmountOfBooksException(book.getTitle());
        }
        tmpBook.amount-= book.amount;
        return true;
    }
}
