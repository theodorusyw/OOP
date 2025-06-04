package actor;

import auth.ILogin;
import hospital.Service;
import hospital.IPayment;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private final int age;
    private ILogin loginSystem;
    private final List<Service> services = new ArrayList<>();
    private double totalPaid = 0;

    public Patient(String name, int age) {
        super(name);
        this.age = age;
    }

    public void setLoginSystem(ILogin loginSystem) {
        this.loginSystem = loginSystem;
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void makePayment(IPayment payment) {
        double total = services.stream().mapToDouble(Service::getFee).sum();
        payment.pay(total);
        totalPaid = total;
    }

    public String getReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(getName()).append(" (Age: ").append(age).append(")\n");
        sb.append("  Services:\n");
        for (Service service : services) {
            sb.append("    * ").append(service.getServiceDetails()).append("\n");
        }
        sb.append("  Total Paid: $").append(totalPaid).append("\n");
        return sb.toString();
    }
}