import java.util.List;
import java.util.ArrayList;

public class Cinema {
    private String name;
    private String location;
    private List<Employee> employees;
    private List<Hall> halls;
    private List<Customer> customers;

    public Cinema(String name, String location) {
        this.name = name;
        this.location = location;
        this.employees = new ArrayList<>();
        this.halls = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void displayCinemaInfo() {
        System.out.println("Cinema: " + name);
        System.out.println("Location: " + location);
        System.out.println("\nEmployees:");
        for (Employee employee : employees) {
            System.out.println("- Name: " + employee.getName() + ", Role: " + employee.getPosition());
        }

        System.out.println("\nHalls:");
        for (Hall hall : halls) {
            hall.displayHallInfo();
        }

        System.out.println("\nCustomer:");
        for (Customer customer : customers) {
            customer.displayCustomerInfo();
        }
    }
}
