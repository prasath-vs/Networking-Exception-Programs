// Custom exception for security violations
class SecurityException extends Exception {
    public SecurityException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    private String empCode;
    private String name;
    private int age;
    private int experience;

    // Constructor to initialize data members
    public Employee(String empCode, String name, int age, int experience) {
        this.empCode = empCode;
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    // Display method to print details
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("EmpCode: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience);
        System.out.println("------------------------");
    }

    // Check method to validate conditions
    public void check() throws SecurityException {
        // Check conditions
        if (empCode.length() != 6) {
            throw new SecurityException("Length of EmpCode should be exactly 6");
        }

        if (name.length() > 30) {
            throw new SecurityException("Maximum characters of name should be 30");
        }

        if (age < 18 || age > 58) {
            throw new SecurityException("Age should be between 18 and 58");
        }

        if (experience > (age - 18)) {
            throw new SecurityException("Experience cannot exceed age-18");
        }
    }
}

// Main class
public class ExceptionEx2 {
    public static void main(String[] args) {
        // Create objects for minimum 5 Employees
        Employee employee1 = new Employee("E12345", "John Doe", 25, 5);
        Employee employee2 = new Employee("E67890", "Jane Smith", 30, 8);
        Employee employee3 = new Employee("E45678", "Bob Johnson", 40, 15);
        Employee employee4 = new Employee("E11122", "Alice Brown", 22, 2);
        Employee employee5 = new Employee("E99999", "Charlie Green", 50, 25);

        try {
            // Invoke the check() method inside try block
            employee1.check();
            employee2.check();
            employee3.check();
            employee4.check();
            employee5.check();
        } catch (SecurityException e) {
            System.out.println("Security Exception: " + e.getMessage());
        } finally {
            // Invoke the display() methods for all employees inside finally block
            employee1.display();
            employee2.display();
            employee3.display();
            employee4.display();
            employee5.display();
        }
    }
}
