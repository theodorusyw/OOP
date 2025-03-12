public class Movie {
    private String title;
    private String id;
    private Director director;

    public Movie(String title, String id, Director director) {
        this.title = title;
        this.id = id;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public Director getDirector() {
        return director;
    }
}