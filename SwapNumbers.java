import java.util.Scanner;

public class SwapNumbers {
    public  static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the second number (b): ");

        int b = sc.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping using arithmetic operations
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5 (15 - 10)
        a = a - b; // a becomes 10 (15 - 5)

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
