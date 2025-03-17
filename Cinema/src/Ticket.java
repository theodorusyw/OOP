import java.util.List;

public class Ticket {
    private int id;
    private double price;
    private Customer customer;
    private boolean isPaid;

    public Ticket(int id, double price, Customer customer) {
        this.id = id;
        this.price = price;
        this.customer = customer;
        this.isPaid = true;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void displayTicketInfo() {
        System.out.println("        * Ticket ID: " + id + ", Price: $" + price + ", Customer: " + customer.getName() + ", Payment Status: " + (isPaid ? "Paid" : "Unpaid"));
    }

    public void displayCustomerTicketInfo() {
        System.out.println("    * Ticket ID: " + id + ", Price: $" + price + ", Status: " + (isPaid ? "Paid" : "Unpaid"));
    }
}