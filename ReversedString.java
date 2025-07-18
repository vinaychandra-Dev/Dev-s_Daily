import java.util.Scanner;

public class ReversedString {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t *** Reversed String ***");

        System.out.print("Enter The String :");

        String str = scanner.nextLine();

        System.out.println("The Original String Is : "+str);

        StringBuffer sb = new StringBuffer(str);

        System.out.println("The Reversed String Is : "+sb.reverse());

        scanner.close();

    }
}
