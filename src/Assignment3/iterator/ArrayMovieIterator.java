package Assignment3.iterator;

public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int index;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return index < movies.length;
    }

    @Override
    public String next() {
        return movies[index++];
    }
}
