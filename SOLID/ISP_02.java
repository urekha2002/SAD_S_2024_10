package SOLID;

public class ISP_02 {
    
    /*
     * TASK:
     * Again, some classes are more simple than other.
     * Fix this without violating the ISP (Interface Segregation Principle)!
     */
    public static interface Worker {
        void work();
        void rest();        
    }

    public static class Developer implements Worker {
        @Override
        public void work() {
            System.out.println("Developer is coding ...");
        }

        @Override
        public void rest() {
            System.out.println("Developer is making a break!");
        }
    }

    public static class Robot implements Worker {
        @Override
        public void work() {
            System.out.println("Robot is working hard ...");
        }

        @Override
        public void rest() {
            throw new UnsupportedOperationException("Robot does not need a break!");
        }        
    }

    public static void workingCycle(Worker worker) {
        worker.work();
        worker.rest();
    }

    public static void main(String[] args) {
        workingCycle( new Developer() );
        workingCycle( new Robot() );        
    }
}
