import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies;

    public Cinema() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Movie added to cinema: " + movie.getTitle());
    }

    public void rentMovie(Viewer viewer, Movie movie) {
        movies.remove(movie);
        viewer.rentMovie(movie);
        System.out.println(viewer.getName() + "rented: " + movie.getTitle());
    }

    public void returnMovie(Viewer viewer, Movie movie) {
        movies.add(movie);
        System.out.println(viewer.getName() + "returned: " + movie.getTitle());
    }

    public void displayAvailableMovies() {
        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("ID: " + movie.getId());
            System.out.println("Director: " + movie.getDirector().getName());
            System.out.println("Biography: " + movie.getDirector().getBio());
        }
    }
}