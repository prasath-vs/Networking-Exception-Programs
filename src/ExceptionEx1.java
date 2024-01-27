// Custom exception for mark out of bounds
class MarkOutOfBoundsException extends Exception {
    public MarkOutOfBoundsException(String message) {
        super(message);
    }
}

// Custom exception for not valid input
class NotValidInputException extends Exception {
    public NotValidInputException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private String name;
    private int mark;
    private String result;

    // Constructor
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    // Method to find the result
    public void findResult() throws MarkOutOfBoundsException {
        if (mark < 0 || mark > 100) {
            throw new MarkOutOfBoundsException("Mark should be between 0 and 100");
        }

        if (mark < 40) {
            result = "Fail";
        } else {
            result = "Pass";
        }
    }

    // Method to validate input
    public void validateInput() throws NotValidInputException {
        if (name == null || name.trim().isEmpty() || mark < 0 || mark > 100) {
            throw new NotValidInputException("Invalid input for name or mark");
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public String getResult() {
        return result;
    }
}

// Main class to test exceptions
public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            // Test case with valid input
            Student student1 = new Student("John", 75);
            student1.validateInput();
            student1.findResult();
            System.out.println("Student Name: " + student1.getName() + ", Mark: " + student1.getMark() +
                    ", Result: " + student1.getResult());

            // Test case with invalid input
            Student student2 = new Student("", 110); // Invalid name and mark
            student2.validateInput(); // Should throw NotValidInputException
        } catch (NotValidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
