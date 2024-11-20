public class GeneralPractitioner extends HealthProfessional {
    private String dateofvisit ;
    private String physicianlevel ;

    public GeneralPractitioner() {
        super() ;
        this.dateofvisit = "None" ;
        this.physicianlevel = "None" ;
    }

    public GeneralPractitioner(int id, String name, String workage, String dateofvisit, String physicianlevel) {
        super(id, name, workage) ;
        this.dateofvisit = dateofvisit ;
        this.physicianlevel = physicianlevel ;
    }

    @Override
    public void printInfo() {
        System.out.println("Physician type: General practitioner");
        super.printInfo() ;
        System.out.println("Date of visit : " + dateofvisit);
        System.out.println("Physician level : " + physicianlevel);
    }
}
