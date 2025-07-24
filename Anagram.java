import java.util.Arrays;

public class Anagram {
    public static void main(String args[]){

        String str1 = "listen";
        String str2 = "silent";

        System.out.println("\t *** Anagram Check ***");

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);
        if(isAnagram) {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");

        }

    }
}
