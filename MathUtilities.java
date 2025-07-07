import java.util.Scanner;

public class MathUtilities {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative input not allowed");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation: add, subtract, multiply, divide, factorial");
        String operation = scanner.next();

        try {
            if (operation.equals("factorial")) {
                System.out.print("Enter a number: ");
                int n = scanner.nextInt();
                System.out.println("Result: " + factorial(n));
            } else {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();

                switch (operation) {
                    case "add":
                        System.out.println("Result: " + add(a, b));
                        break;
                    case "subtract":
                        System.out.println("Result: " + subtract(a, b));
                        break;
                    case "multiply":
                        System.out.println("Result: " + multiply(a, b));
                        break;
                    case "divide":
                        System.out.println("Result: " + divide(a, b));
                        break;
                    default:
                        System.out.println("Unknown operation.");
                }
            }
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}