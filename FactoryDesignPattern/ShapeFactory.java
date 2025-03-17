public class ShapeFactory {
    public static Shape getShape(String type){
        if(type.toLowerCase().equals("circle")){
            return new Circle();
        }else if(type.toLowerCase().equals("rectangle")){
            return new Rectangle();
        }else{
            return new Square();
        }
    }
}
