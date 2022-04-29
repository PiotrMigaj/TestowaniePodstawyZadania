package pl.migibud.generics.ex4;

public class Main {

    public static void main(String[] args) {

        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addElementToLibrary(new Book("Harry Potter","J.K. Rowling"));

        System.out.println(bookLibrary.toString());

        Library<? super MediaContent> mediaContentLibrary = new Library<>();
        mediaContentLibrary.addElementToLibrary(new Book("Harry Potter", "J.K. Rowling"));
        mediaContentLibrary.addElementToLibrary(new Movie("Kogel Mogel", "Ktoś tam"));

        //mediaContentLibrary.getTList().get(1) instanceof Movie;

        System.out.println(mediaContentLibrary.getTList().get(1));







    }

}
