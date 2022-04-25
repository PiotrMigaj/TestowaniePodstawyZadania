package pl.migibud.classandinterfaces.ex2;

public class Movie {

    private String title;
    private String creator;
    private int yearOfProduction;
    private String genre;
    private String publisher;

    private Movie(){}

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", creator='" + creator + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public static class MovieCreator{

        private Movie movie;

        public MovieCreator(){
            this.movie = new Movie();
        }

        public MovieCreator setMovieTitle(String title){
            this.movie.title=title;
            return this;
        }

        public MovieCreator setMovieCreator(String creator){
            this.movie.creator=creator;
            return this;
        }

        public MovieCreator setMovieYearOfProduction(int yearOfProduction){
            this.movie.yearOfProduction=yearOfProduction;
            return this;
        }

        public MovieCreator setMovieGenre(String genre){
            this.movie.genre=genre;
            return this;
        }

        public MovieCreator setMoviePublisher(String publisher){
            this.movie.publisher=publisher;
            return this;
        }

        public Movie createMovie(){
            return this.movie;
        }
    }

}
