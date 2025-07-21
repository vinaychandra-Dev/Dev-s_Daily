import java.util.Scanner;

public class ReversedNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\t *** Reversed Number ***");

        System.out.print("Enter The Number :");

        int num = sc.nextInt();

        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("The Reversed Number Is : " + reversedNum);

        sc.close();
    }
}
