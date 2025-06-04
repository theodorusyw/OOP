package main;

import actor.*;
import auth.*;
import hospital.*;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Siloam", "Jakarta");

        Doctor doctor = new Doctor("Dr. Maria", "Cardiologist", 12);
        Nurse nurse = new Nurse("Budi", "Night Shift");
        Patient patient = new Patient("John Doe", 30);

        hospital.addStaff(doctor);
        hospital.addStaff(nurse);
        hospital.registerPatient(patient);

        ILogin login = new BasicLogin("John", "1234");
        patient.setLoginSystem(login);

        Service heartCheck = new HealthCheckService("Heart Check", 500.0, doctor);
        Service bloodTest = new LabTestService("Blood Test", 150.0, nurse);

        patient.addService(heartCheck);
        patient.addService(bloodTest);

        patient.makePayment(new CreditCardPayment("John", "1234-5678-9876-5432"));

        hospital.generateDailyReport();
    }
}