public class HealthProfessional {
    private int id ;
    private String name ;
    private String workage ;

    public HealthProfessional() {
        this.id = 0;
        this.name = "xxx";
        this.workage = "0 year";
    }
    
    public HealthProfessional(int id, String name, String workage) {
        this.id = id;
        this.name = name;
        this.workage = workage;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Work age: " + workage);
    }
}
