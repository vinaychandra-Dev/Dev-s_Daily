import java.util.Locale;
import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String args[]) {
        int vowels = 0, consonants = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t *** Vowel and Consonant Count ***");
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        str = str.toLowerCase(Locale.ROOT);

        for(char c : str.toCharArray()){

            if(Character.isLetter(c)) {
                if("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
        sc.close();
    }
}
