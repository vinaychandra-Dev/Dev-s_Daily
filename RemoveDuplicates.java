import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String args[]) {

        int[] arr = {1, 2, 5, 5, 8, 8, 7, 6};

        System.out.println("\t *** Remove Duplicates from Array ***");

        System.out.print("Original Array: ");

        System.out.println(Arrays.toString(arr));

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }

        System.out.print("Array after removing duplicates: ");

        System.out.println(set);

    }
}
