package pl.migibud.testowanieZadaniaSDA.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {




    @Test
    void isBookInBasketAfterAdding(){

        //given
        Book book = new Book("Harry Potter","J.K. Rowling",30);
        Basket basket = new Basket();

        //when
        basket.addBookToBasket(book);

        //then
        assertEquals(book,basket.getBooksInBasket().get(0));
        assertEquals(1,basket.getBooksInBasket().size());
    }

}