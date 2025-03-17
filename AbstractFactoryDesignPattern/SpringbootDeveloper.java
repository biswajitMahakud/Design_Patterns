public class SpringbootDeveloper implements Developer {
    @Override
    public String getName() {
        //System.out.println("I'm a Spring boot Developer!");
        return "SPRINGBOOT DEVELOPER";
    }

    @Override
    public double getSalary() {
        //System.out.println("My salry is : " + 80000);
        return 80000;
    }
}
