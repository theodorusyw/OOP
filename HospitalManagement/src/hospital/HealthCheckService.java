package hospital;

import actor.Person;

public class HealthCheckService extends Service {
    public HealthCheckService(String name, double fee, Person handler) {
        super(name, fee, handler);
    }
}