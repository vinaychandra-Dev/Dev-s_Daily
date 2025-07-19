import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public  static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("\t *** Sort Array ***");
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();

    }
}
