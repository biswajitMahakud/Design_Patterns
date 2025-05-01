package AnotherExample;

public class VictorianTable implements Table {
    @Override
    public void use() {
        System.out.println("Using Victorian Table");
    }

    @Override
    public void dimension() {
        System.out.println("Victorian Table Dimension: 6ft x 3ft");
    }
    
}
