package AnotherExample;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }

    @Override
    public void dimension() {
        System.out.println("Victorian chair dimensions: 40x40x100 cm.");
    }
    
}
