import java.util.Scanner;

public class GCD {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\t *** GCD of Two Numbers ***");

        System.out.print("Enter First Number : ");

        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");

        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of Two Numbers is : " + a);
        sc.close();
    }
}
