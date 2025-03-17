import java.util.Scanner;

public class Client{
    public static void main(String[] args) {
        // get Android Developer, UI Developer, Spring boot Developer
        Scanner sc = new Scanner(System.in);
        System.out.println("Type of Developer you want: ");
        String developerType = sc.nextLine();

        DeveloperAbstractFactory abstractFactory = DeveloperFactory.getDeveloper(developerType);
        Developer dev = abstractFactory.createDeveloper();
        System.out.println("Type of Developer: " + dev.getName());
        System.out.println("Salary: " + dev.getSalary());

        sc.close();
    }
}