package design_patterns.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape obj = shapeFactory.getShape("CIRCLE");
        obj.draw();
    }
}
