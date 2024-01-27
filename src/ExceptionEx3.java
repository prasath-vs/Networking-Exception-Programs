public class ExceptionEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                // Attempt to parse each argument as an integer
                int value = Integer.parseInt(arg);
                sum += value;
            } catch (NumberFormatException e) {
                // Catch the exception if the argument is not a valid integer
                System.out.println("Invalid integer: " + arg);
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Invalid integers count: " + invalidCount);
    }
}

// give in command line 10 20 abc 30 40 xyz 50
