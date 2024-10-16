package Assignment3.iterator;

public class Main {
    public static void main(String[] args) {
        ListMovieCollection listMovieCollection = new ListMovieCollection();
        listMovieCollection.addMovie("Inception");
        listMovieCollection.addMovie("The Matrix");
        listMovieCollection.addMovie("Interstellar");

        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(3);
        arrayMovieCollection.addMovie("Titanic");
        arrayMovieCollection.addMovie("Avatar");
        arrayMovieCollection.addMovie("The Godfather");

        Iterator<String> listIterator = listMovieCollection.createIterator();
        System.out.println("Фильмы из списка:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        Iterator<String> arrayIterator = arrayMovieCollection.createIterator();
        System.out.println("\nФильмы из массива:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}
