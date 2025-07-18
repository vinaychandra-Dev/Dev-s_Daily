import java.util.Scanner;

public class PrimeCheck {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t *** Prime Number Check ***");

        System.out.print("Enter The Number :");

        int num = scanner.nextInt();

        if(num%2!=0)System.out.println("The Following Number Is Prime");
        else System.out.println("The Following Number Is Not A Prime");

        scanner.close();
    }
}
