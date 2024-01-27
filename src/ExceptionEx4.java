import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter a set of floating-point values. Enter a non-number to exit.");

        int chances = 2;
        while (chances > 0) {
            try {
                System.out.print("Enter a number: ");
                double inputValue = scanner.nextDouble();
                sum += inputValue;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.nextLine(); // Clear the buffer
                chances--;
            }
        }

        System.out.println("Sum of valid input values: " + sum);
        scanner.close();
    }
}
