import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\t *** Armstrong Number Check ***");

        int num, sum =0, temp;

        System.out.println("Enter The Number :");

        num = sc.nextInt();
        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, String.valueOf(num).length());
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }


    }
}
