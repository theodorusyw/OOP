package actor;

public class Doctor extends Person {
    private final String specialization;
    private final int experience;

    public Doctor(String name, String specialization, int experience) {
        super(name);
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    public String getDetails() {
        return "Doctor: " + getName() + ", Specialization: " + specialization + ", Experience: " + experience + " years";
    }
}