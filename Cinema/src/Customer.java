import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int age;
    private List<Ticket> tickets;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.tickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void displayCustomerInfo() {
        System.out.println("- Name: " + name + ", Age: " + age);
        System.out.println("  Tickets:");
        if (tickets.isEmpty()) {
            System.out.println("    No tickets booked.");
        } else {
            for (Ticket ticket : tickets) {
                ticket.displayCustomerTicketInfo();
            }
        }
    }
}