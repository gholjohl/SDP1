package Assignment3.iterator;

public class ArrayMovieCollection {
    private String[] movies;
    private int count;

    public ArrayMovieCollection(int size) {
        movies = new String[size];
        count = 0;
    }

    public void addMovie(String movie) {
        if (count < movies.length) {
            movies[count++] = movie;
        }
    }

    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);
    }
}