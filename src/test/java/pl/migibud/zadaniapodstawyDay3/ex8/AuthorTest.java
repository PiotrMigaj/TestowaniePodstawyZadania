package pl.migibud.zadaniapodstawyDay3.ex8;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void shouldSurnameNotBeBlankAfterCreatingAuthor() {
        //given
        Author author = new Author("Migaj","PL");

        //then
        assertNotEquals(author.getSurname(),"");
    }
}