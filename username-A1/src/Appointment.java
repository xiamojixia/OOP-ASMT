public class Appointment {
    private int id ;
    private String name ;
    private String mobilephone ;
    private String preferredtime ;
    private String doctortype ;

    public Appointment() {
        this.id = 0;
        this.name = "None";
        this.mobilephone = "None";
        this.preferredtime = "None";
        this.doctortype = "None";
    }

    public Appointment(int id, String name,String mobilephone, String preferredtime, String doctortype) {
        this.id = id;
        this.name = name;
        this.mobilephone = mobilephone;
        this.preferredtime = preferredtime;
        this.doctortype = doctortype;
    }

    public void printAt() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mobile phone: " + mobilephone);
        System.out.println("Preferred time: " + preferredtime);
        System.out.println("Doctor type: " + doctortype);
    }

    public String getName() {
        return name;
    }

    public String getMobilephone() {
        return mobilephone;
    }
}
