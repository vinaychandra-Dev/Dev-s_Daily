import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt(); // Example value for n

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();  // Example value for m

        System.out.println("Multiples of " + m + " up to " + n + ":");
        for (int i = 1; i <= n; i++) {
//            if (i % m == 0) {
//                System.out.print(i + " ");
//            }
            int multiple = m * i;
                System.out.println(m+" X "+i+" = "+multiple);

        }
    }
}
