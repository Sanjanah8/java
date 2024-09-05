interface Appointment {
    void bookAppointment(String patientName);
    void cancelAppointment(String patientName);
    String getAppointmentDetails();
}

class GeneralPhysician implements Appointment {
    private String details = "General Physician: Available for general health issues.";

    @Override
    public void bookAppointment(String patientName) {
        System.out.println("Appointment booked with General Physician for " + patientName);
    }

    @Override
    public void cancelAppointment(String patientName) {
        System.out.println("Appointment cancelled with General Physician for " + patientName);
    }

    @Override
    public String getAppointmentDetails() {
        return details;
    }
}

class Dentist implements Appointment {
    private String details = "Dentist: Available for dental issues.";

    @Override
    public void bookAppointment(String patientName) {
        System.out.println("Appointment booked with Dentist for " + patientName);
    }

    @Override
    public void cancelAppointment(String patientName) {
        System.out.println("Appointment cancelled with Dentist for " + patientName);
    }

    @Override
    public String getAppointmentDetails() {
        return details;
    }
}

public class HealthcareAppointmentSystem {
    public static void main(String[] args) {
        Appointment physician = new GeneralPhysician();
        physician.bookAppointment("Alice");
        System.out.println(physician.getAppointmentDetails());
        physician.cancelAppointment("Alice");

        Appointment dentist = new Dentist();
        dentist.bookAppointment("Bob");
        System.out.println(dentist.getAppointmentDetails());
        dentist.cancelAppointment("Bob");
    }
}
