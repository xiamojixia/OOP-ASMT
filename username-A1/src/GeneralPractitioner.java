public class GeneralPractitioner extends HealthProfessional {
    private String dateofvisit ;

    public GeneralPractitioner() {
        super() ;
        this.dateofvisit = "no date" ;
    }

    public GeneralPractitioner(int id, String name, String workage, String dateofvisit) {
        super(id, name, workage) ;
        this.dateofvisit = dateofvisit ;
    }

    @Override
    public void printInfo() {
        super.printInfo() ;
        System.out.println("Date of visit : " + dateofvisit);
    }
}
