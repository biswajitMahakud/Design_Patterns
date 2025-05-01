package AnotherExample;

public class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a modern table.");
    }

    @Override
    public void dimension() {
        System.out.println("Modern table dimensions: 60x30x30 inches.");
    }
    
}
