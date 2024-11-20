public class Specialist extends HealthProfessional {
    private String dateofvisit ;
    private String physicianlevel ;

    public Specialist() {
        super() ;
        this.dateofvisit = "None" ;
        this.physicianlevel = "None" ;
    }

    public Specialist(int id, String name, String workage, String dateofvisit, String physicianlevel) {
        super(id, name, workage) ;
        this.dateofvisit = dateofvisit ;
        this.physicianlevel = physicianlevel ;
    }

    @Override
    public void printInfo() {
        super.printInfo() ;
        System.out.println("Date of visit : " + dateofvisit);
        System.out.println("Physician level : " + physicianlevel);
    }
}
