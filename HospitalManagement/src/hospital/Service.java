package hospital;

import actor.Person;

public abstract class Service {
    private final String name;
    private final double fee;
    private final Person handler;

    public Service(String name, double fee, Person handler) {
        this.name = name;
        this.fee = fee;
        this.handler = handler;
    }

    public double getFee() {
        return fee;
    }

    public String getServiceDetails() {
        return name + " - Handled by " + handler.getName() + ", Fee: $" + fee;
    }
}