package hospital;

import actor.Person;

public class LabTestService extends Service {
    public LabTestService(String name, double fee, Person handler) {
        super(name, fee, handler);
    }
}