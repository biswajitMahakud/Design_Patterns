package AnotherExample;

public class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }

    @Override
    public void dimension() {
        System.out.println("Modern chair dimensions: 18x18x36 inches.");
    }
}
