package pl.migibud.classandinterfaces.ex2;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie.MovieCreator()
                .createMovie();

        System.out.println(movie);


    }
}
