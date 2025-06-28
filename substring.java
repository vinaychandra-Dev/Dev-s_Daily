package Data_Types;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner in = new Scanner(System.in);
		        String S = in.next();
		        int start = in.nextInt();
		        int end = in.nextInt();
		        System.out.println(S.substring(start, end));

		        in.close();
	}

}
