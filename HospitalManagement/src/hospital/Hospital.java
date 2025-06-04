package hospital;

import actor.Patient;
import actor.Person;
import actor.Doctor;
import actor.Nurse;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final String name;
    private final String location;
    private final List<Person> staffList = new ArrayList<>();
    private final List<Patient> patientList = new ArrayList<>();

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addStaff(Person staff) {
        staffList.add(staff);
    }

    public void registerPatient(Patient patient) {
        patientList.add(patient);
    }

    public void generateDailyReport() {
        System.out.println("Hospital: " + name);
        System.out.println("Location: " + location);
        System.out.println("\nStaff:");
        for (Person staff : staffList) {
            if (staff instanceof Doctor) {
                System.out.println("- " + ((Doctor) staff).getDetails());
            } else if (staff instanceof Nurse) {
                System.out.println("- " + ((Nurse) staff).getDetails());
            }
        }
        System.out.println("   ");
        System.out.println("Registered Patients:");
        for (Patient p : patientList) {
            System.out.print(p.getReport());
        }
    }
}