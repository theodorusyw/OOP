import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String name;
    private List<Movie> rentedMovies;

    public Viewer(String name) {
        this.name = name;
        this.rentedMovies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void rentMovie(Movie movie) {
        rentedMovies.add(movie);
    }

    public boolean returnMovie(Movie movie) {
        return rentedMovies.remove(movie);
    }

    public void displayRentedMovies() {
        for (Movie movie : rentedMovies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("ID: " + movie.getId());
            System.out.println("Director: " + movie.getDirector().getName());
            System.out.println("Biography: " + movie.getDirector().getBio());
        }
    }
}