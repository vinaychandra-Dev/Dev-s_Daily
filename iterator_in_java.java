package Data_Types;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class iterator_in_java {

	    static Iterator func(ArrayList mylist) {
	        Iterator it = mylist.iterator();
	        while (it.hasNext()) {
	            Object element = it.next();
	            if (element instanceof String && element.equals("###")) { // Check for the delimiter string
	                break; // Stop iterating once "###" is found
	            }
	        }
	        return  it; // Return the iterator positioned after "###"
	    }

	    public static void main(String[] args) {
	        // The main method provided by HackerRank for testing
	        ArrayList mylist = new ArrayList();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("ENTER THE SIZE N & M :");
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        System.out.println("ENTER THE ELEMENTS OF INTEGER TYPE :");
	        for (int i = 0; i < n; i++) {
	            mylist.add(sc.nextInt());
	        }
	        mylist.add("###"); // Adding the delimiter
	        System.out.println("ENTER THE ELEMENTS OF STRING TYPE :");
	        for (int i = 0; i < m; i++) {
	            mylist.add(sc.next());
	        }

	        Iterator it = (Iterator) func(mylist);
	        while (it.hasNext()) {
	            Object element = it.next();
	            System.out.println((String) element);
	        }
	    }
}

