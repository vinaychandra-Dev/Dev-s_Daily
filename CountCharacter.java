import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print( "Enter a string:");
        String str = sc.nextLine(); // Example string

        System.out.print( "Enter the character to count:");
        String targetChar = sc.nextLine();
        char[] target = targetChar.toCharArray();// Character to count
        int count = 0;

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            if (c == target[0]) { // Compare with the target character
                count++; // Increment count if character matches
            }
        }

        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
    }
}
