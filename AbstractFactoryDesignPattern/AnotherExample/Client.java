package AnotherExample;

public class Client {
    public static void main(String[] args) {
        AbstractFurnitureFactory factory = new VictorianFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.sitOn();
        chair.dimension();
        
        table.use();
        table.dimension();

        AbstractFurnitureFactory factory2 = new ModernFurnitureFactory();
        Chair chair2 = factory2.createChair();
        Table table2 = factory2.createTable();

        chair2.sitOn();
        chair2.dimension();

        table2.use();
        table2.dimension();

        //reference link: https://medium.com/@kalanamalshan98/abstract-factory-design-pattern-the-ultimate-guide-for-beginners-4b0f97694b00

    }
}
