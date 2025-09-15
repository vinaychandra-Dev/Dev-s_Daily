import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {

        int num, factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t *** Factorial ***");

        System.out.print("Enter The Number :");

        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            factorial *= i;
        }
        System.out.println("The Factorial Of " + num + " is :" + factorial);

        scanner.close();
    }
} 