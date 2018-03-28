package Task22;

public class Movie {

    private String name;
    private MovieInfo movieInfo;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MovieInfo getMovieInfo() {
        return movieInfo;
    }

    class MovieInfo {
        private int length;
        private String director;
        private String genre;

        public MovieInfo(int length, String director, String genre) {
            this.length = length;
            this.director = director;
            this.genre = genre;
        }

        public int getLength() {
            return length;
        }

        public String getDirector() {
            return director;
        }

        public String getGenre() {
            return genre;
        }
    }

}
