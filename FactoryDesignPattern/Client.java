
/*
 * 3. Shape Drawing Application
Problem: You are developing a drawing application where users can draw Circle, Rectangle, or Square.
Solution: Use a factory to create the required shape dynamically.
 */

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        //get square shape
        //get circle, rectangle
        Shape shape;
        System.out.println("Type of shape you want: ");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        shape = ShapeFactory.getShape(type);
        shape.drawShape();

        sc.close();
    }
}