package actor;

public class Nurse extends Person {
    private final String shift;

    public Nurse(String name, String shift) {
        super(name);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public String getDetails() {
        return "Nurse: " + getName() + ", Shift: " + shift;
    }
}