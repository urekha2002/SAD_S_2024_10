package SOLID;

public class LSP_01 {

    /*
     * TASK:
     * (classical example)
     *
     * The Square class does not behave like a Rectangle when
     * setting the width and/or height. Please fix this to obey
     * the LSP (Liskov Substitution Principle).
     */
    
    public static class Rectangle {
        protected int width;
        protected int height;

        public Rectangle(int width, int height) {
            setWidth(width);
            setHeight(height);
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getArea() {
            return width * height;
        }
    }

    public static class Square extends Rectangle {
        public Square(int width) {
            super(width, width);
        }

        @Override
        public void setWidth(int width) {
            this.width = width;
            this.height = width;
        }

        @Override
        public void setHeight(int height) {
            this.width = height;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Square square = new Square(0);
        square.setWidth(5);
        System.out.println("Square Area: " + square.getArea());
    }
}
