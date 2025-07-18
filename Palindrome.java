import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t *** Palindrome String ***");

        System.out.print("Enter The String :");

        String str = scanner.nextLine();

        System.out.println("The Entered String IS : " + str);

        String Reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(Reversed)) System.out.println("The Following String Is A Palindrome");
        else System.out.println("The Following String Is Not A Palindrome");

        scanner.close();
    }
}
