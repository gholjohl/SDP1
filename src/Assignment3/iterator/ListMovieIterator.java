package Assignment3.iterator;

import java.util.List;

public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;
    private int index;

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return index < movies.size();
    }

    @Override
    public String next() {
        return movies.get(index++);
    }
}
