public class UIDeveloper implements Developer{
    @Override
    public String getName() {
        //System.out.println("I'm a UI Developer!");
        return "UI DEVELOPER";
    }

    @Override
    public double getSalary() {
        //System.out.println("My salry is : " + 30000);
        return 30000;
    }
}
