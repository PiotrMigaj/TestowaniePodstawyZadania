package pl.migibud.testowanieZadaniaSDA.ex6;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Book> booksInBasket;

    public Basket(){
        booksInBasket = new ArrayList<>();
    }

    public ArrayList<Book> getBooksInBasket() {
        return booksInBasket;
    }

    public boolean addBookToBasket(Book book){
        if (book!=null){
            booksInBasket.add(book);
            return true;
        }
        return false;
    }


}
