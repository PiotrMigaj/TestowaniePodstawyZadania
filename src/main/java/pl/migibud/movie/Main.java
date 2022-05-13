package pl.migibud.movie;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie.MovieCreator().setMovieTitle("Harry Potter").setMovieDirector("Piotr Migaj").createMovie();

        System.out.println(movie);

    }

}
