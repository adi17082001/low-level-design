package design_patterns.factory;

public class ShapeFactory {
    Shape getShape(String input){
        switch(input){
            case "CIRCLE":
                return new Cricle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
