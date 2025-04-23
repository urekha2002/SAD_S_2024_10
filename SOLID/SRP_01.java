package SOLID;

import java.io.FileWriter;
import java.io.IOException;

public class SRP_01 {

    /*
     * TASK:
     * Please apply to the following class "User" the
     * SRP (Single Responsibility Principle)
     */

    public static class User {
        private String name;
        private String email;
    
        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }
        
        public String getEmail() {
            return email;
        }

        public void saveToFile() {
            try (FileWriter fileWriter = new FileWriter(name + ".txt")) {
                fileWriter.write("Name: " + name + "\n");
                fileWriter.write("Email: " + email + "\n");
                System.out.println("User data saved successfully!");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
            
    public static void main(String[] args) {
        User user = new User("Clemens", "clemens@company.com");
        user.saveToFile();
    }
}
