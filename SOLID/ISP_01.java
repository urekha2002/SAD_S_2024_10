package SOLID;

public class ISP_01 {

    /*
     * TASK:
     * This SimplePrinter is not a multi functional printer but a very
     * simple one.
     * Please fix this to obey the ISP (Interface Segregation Principle)!
     */
    
    public static interface Printer {
        void printDocument();
        void scanDocument();
        void faxDocument();    
    }

    public static class SimplePrinter implements Printer {
        @Override
        public void printDocument() {
            System.out.println("Sending document to the printer ...");
        }

        @Override
        public void scanDocument() {
            throw new UnsupportedOperationException("Unimplemented method 'scanDocument'");
        }

        @Override
        public void faxDocument() {
            throw new UnsupportedOperationException("Unimplemented method 'faxDocument'");
        }        
    }

    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.printDocument();
    }
}
