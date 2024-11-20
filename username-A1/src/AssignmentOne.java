public class  AssignmentOne {
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
    }
}
