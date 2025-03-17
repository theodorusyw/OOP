import java.util.ArrayList;
import java.util.List;

public class Showtime {
    private String time;
    private String date;
    private Movie movie;
    private List<Ticket> tickets;

    public Showtime(String time, String date, Movie movie) {
        this.time = time;
        this.date = date;
        this.movie = movie;
        this.tickets = new ArrayList<>();
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void displayShowtimeInfo() {
        System.out.println("    - Movie: " + movie.getTitle());
        System.out.println("      Time: " + time + ", Date: " + date);
        System.out.println("      Tickets:");
        if (tickets.isEmpty()) {
            System.out.println("        No tickets booked yet.");
        } else {
            for (Ticket ticket : tickets) {
                ticket.displayTicketInfo();
            }
        }
    }
}