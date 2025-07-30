    import java.util.*;
public class comparator {
        boolean compare(int a , int b){
            return a == b;
        }

        boolean compare(String a, String b){
            if(a == null || b == null){
                return false;
            }
            return a.equals(b);
        }

        boolean compare(int[] a , int[] b){
            if(a == null || b == null || a.length != b.length){
                return false;
            }
            for(int i = 0; i < a.length; i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
    }

    class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            comparator comp = new comparator();

            int testCases = Integer.parseInt(scan.nextLine());
            while(testCases-- > 0){
                int condition = Integer.parseInt(scan.nextLine());
                switch(condition){
                    case 1:
                        String s1 = scan.nextLine().trim();
                        String s2 = scan.nextLine().trim();
                        System.out.println(comp.compare(s1, s2) ? "Same" : "Different");
                        break;

                    case 2:
                        int num1 = scan.nextInt();
                        int num2 = scan.nextInt();
                        System.out.println(comp.compare(num1, num2) ? "Same" : "Different");
                        if(scan.hasNextLine()) scan.nextLine(); // consume remaining newline
                        break;

                    case 3:
                        int[] array1 = new int[scan.nextInt()];
                        int[] array2 = new int[scan.nextInt()];
                        for(int i = 0; i < array1.length; i++){
                            array1[i] = scan.nextInt();
                        }
                        for(int i = 0; i < array2.length; i++){
                            array2[i] = scan.nextInt();
                        }
                        System.out.println(comp.compare(array1, array2) ? "Same" : "Different");
                        if(scan.hasNextLine()) scan.nextLine(); // consume remaining newline
                        break;

                    default:
                        System.err.println("Invalid input.");
                }
            }
            scan.close();
        }
    }

}
