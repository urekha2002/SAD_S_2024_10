package SOLID;

public class LSP_02 {

    public static abstract class Bird {
        public abstract void move();
    }

    public interface Flyable {
        void fly();
    }

    public static class Sparrow extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }

        @Override
        public void move() {
            fly();
        }
    }

    public static class Penguin extends Bird {
        @Override
        public void move() {
            System.out.println("The penguin is swimming...");
        }
    }

   
