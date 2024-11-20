import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) 
    {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1,"Bobby","15","Monday 08:00-11:00","Chief physician");
        GeneralPractitioner gp2 = new GeneralPractitioner(2,"XiaoShu","2","Tuesday 14:30-17:00","Physician");
        GeneralPractitioner gp3 = new GeneralPractitioner(3,"Suika","None","Friday 14:30-17:00","Physician");
        
        Specialist s1 = new Specialist(1,"Lin","7","Monday 14:30-17:00","Chief physician");
        Specialist s2 = new Specialist(2,"Chen","0","Every Weekday","Physician");

        System.out.println("------------------------------");
        gp1.printInfo();
        System.out.println("------------------------------");
        gp2.printInfo();
        System.out.println("------------------------------");
        gp3.printInfo();
        System.out.println("------------------------------");
        s1.printInfo();
        System.out.println("------------------------------");
        s2.printInfo();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        createAppointments(1, "Xia", "1234567890", "09:00", "General Practitioner");
        createAppointments(2, "Mo", "0987654321", "10:00", "General Practitioner");

        createAppointments(3, "Bianqu", "1122334455", "15:00", "Specialist");
        createAppointments(4, "Hai", "5566778899", "14:30", "Specialist");

        System.out.println("------------------------------");

        printExistingAppointments();

        cancelBooking("1234567890");

        System.out.println("------------------------------");

        printExistingAppointments();    
    }
private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void createAppointments(int id, String name, String mobilephone, String preferredtime, String doctortype) {
        if (name.isEmpty() || mobilephone.isEmpty() || preferredtime.isEmpty() || doctortype.isEmpty()) {
            System.out.println("Appointment failed: Your information is incomplete.");
            return;
        }
        Appointment newAppointment = new Appointment(id, name, mobilephone, preferredtime, doctortype);
        appointments.add(newAppointment);
        System.out.println(name + " appointment successful");
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("There are currently no appointments available.");
            return;
        }
        System.out.println("The current appointments are as follows:");
        for (Appointment appointment : appointments) {
            appointment.printAt();
            System.out.println("------------------------------");
        }
    }
    public static void cancelBooking(String mobilephone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilephone().equals(mobilephone)) {
                System.out.println("Successfully cancelled appointment: " + appointments.get(i).getName());
                appointments.remove(i);
                return;
            }
        }
        System.out.println("No corresponding appointment found.");
    }
}