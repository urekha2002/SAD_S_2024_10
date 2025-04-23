package SOLID;

public class LSP_02 {
    
    /*
     * TASK:
     * The polymorphic function move expect the same behaviour
     * for all birds, but this isn't the case.
     * Fix this to obey the LSP (Liskov Substitution Principle)!
     */

    public static class Bird {
        public void fly() {
            System.out.println("The bird is flying...");
        }
    }

    public static class Sparrow extends Bird {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }
    }

    public static class Penguin extends Bird {
        @Override
        public void fly() {
            throw new UnsupportedOperationException("Penguins can't fly :(");
        }
    }

    public static void move(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        move(new Sparrow());
        move(new Penguin());
    }
}
