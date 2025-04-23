package SOLID;

public class OCP_02 {

    /*
     * TASK:
     * (classical task)
     * How to add other shapes without violating the OCP
     * (Open/Closed Principle)?
     * The interface/class/method bodies are empty by purpose
     * and there is no main provided.
     */
    
    public static abstract class Shape {
    }

    public static class Square extends Shape {
    }

    public static class Circle extends Shape {
    }

    public static class AreaCalculator {
        public double getArea(Shape shape) {
            double areaOfShape = 0.0;
            if (shape instanceof Square) {
                // calculate the area of a Square
                areaOfShape = 0.0;
            }
            else if (shape instanceof Circle) {
                // calculate the area of a Circle
                areaOfShape = 0.0;
            }
            return areaOfShape;
        }
    }
}
