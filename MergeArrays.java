import java.util.Arrays;

public class MergeArrays {
    public static void main(String args[]) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        System.out.println("\t *** Merge Two Arrays ***");
        System.out.print("Array 1: ");

        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array 2: ");

        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] mergedArray = MergedArray(arr1, arr2);

        System.out.println("Merged Array: ");

        System.out.print(Arrays.toString(mergedArray));

    }


    public static int[] MergedArray(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }
        return merged;

    }
}
