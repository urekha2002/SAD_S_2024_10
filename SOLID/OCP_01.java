package SOLID;

import java.util.HashMap;
import java.util.Map;


public class OCP_01 {

    public interface DiscountStrategy {
        double calculate(double amount);
    }

    public static class RegularDiscount implements DiscountStrategy {
        public double calculate(double amount) {
            return amount * 0.1;
        }
    }

    public static class PremiumDiscount implements DiscountStrategy {
        public double calculate(double amount) {
            return amount * 0.2;
        }
    }

    public static class NoDiscount implements DiscountStrategy {
        public double calculate(double amount) {
            return 0.0;
        }
    }

    public static class DiscountCalculator {
        private final Map<String, DiscountStrategy> strategies = new HashMap<>();

        public DiscountCalculator() {
            strategies.put("Regular", new RegularDiscount());
            strategies.put("Premium", new PremiumDiscount());
            strategies.put("None", new NoDiscount());
        }

        public double calculateDiscount(String customerType, double amount) {
            DiscountStrategy strategy = strategies.getOrDefault(customerType, new NoDiscount());
            return strategy.calculate(amount);
        }

       
        public void addStrategy(String customerType, DiscountStrategy strategy) {
            strategies.put(customerType, strategy);
        }
    }

   
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double regular = calculator.calculateDiscount("Regular", 100.0);
        double premium = calculator.calculateDiscount("Premium", 100.0);
        double unknown = calculator.calculateDiscount("VIP", 100.0);

        System.out.println("Regular Discount: " + regular);
        System.out.println("Premium Discount: " + premium);
        System.out.println("Unknown Type Discount (should be 0): " + unknown);
    }
}
