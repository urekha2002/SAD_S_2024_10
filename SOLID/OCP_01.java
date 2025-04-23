package SOLID;

public class OCP_01 {

    /*
     * TASK:
     * How to add a new discount type (customerType) without
     * violating OCP (Open/Closed Principle)?
     */
    
    public static class DiscountCalculator {
        public double calculateDiscount(String customerType, double amount) {
            if (customerType.equals("Regular")) {
                return amount * 0.1;
            }
            else if (customerType.equals("Premium")) {
                return amount * 0.2;
            }
            return 0.0;
        }
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double regularDiscount = calculator.calculateDiscount("Regular", 100.0);
        double premiumDiscount = calculator.calculateDiscount("Premium", 100.0);

        System.out.println("Regular Discount: " + regularDiscount);
        System.out.println("Premium Discount: " + premiumDiscount);
    }
}
