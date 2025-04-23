package SOLID;

public class DIP_02 {

    /*
     * TASK:
     * The class Employee violates the DIP (Dependency Inversion Principle).
     * Fix this!
     */
    
    public static interface Notification {
        void doNotify();
    }

    public static class EmailNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via email!");
        }
    }

    public static class Employee {
        private EmailNotification emailNotification;

        // Dependency Injection (again) composition
        public Employee(EmailNotification emailNotification) {
            this.emailNotification = emailNotification;
        }
    
        public void notifyEmployee() {
            emailNotification.doNotify();
        }
    }

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        Employee employee = new Employee(emailNotification);
        employee.notifyEmployee();
    }
}
