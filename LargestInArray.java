import java.util.Scanner;

public class LargestInArray {

//    public static void main(String[] args) {
//        int[] arr = {12, 34, 56, 78, 90, 23, 45};
//        int largest = findLargest(arr);
//        System.out.println("The largest number in the array is: " + largest);
//    }
//
//    public static int findLargest(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\t *** Largest in Array ***");

        System.out.println("Enter the number of elements in the array:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest number in the array is: " + largest);

    }

}

