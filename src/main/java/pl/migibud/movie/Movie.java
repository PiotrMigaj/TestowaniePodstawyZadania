package pl.migibud.movie;

public class Movie {

    private String title;
    private String director;

    private Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public static class MovieCreator{

        private Movie movie;

        public MovieCreator() {
            this.movie = new Movie();
        }

        public MovieCreator setMovieTitle(String movieTitle){
            this.movie.setTitle(movieTitle);
            return this;
        }

        public MovieCreator setMovieDirector(String movieDirector){
            this.movie.setTitle(movieDirector);
            return this;
        }

        public Movie createMovie(){
            return this.movie;
        }


    }
}
