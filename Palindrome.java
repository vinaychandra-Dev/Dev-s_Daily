package Exsercise_Problems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** PALINDROME CHECKER ***");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING ");
		
		String var1 = sc.nextLine();
		
		
		StringBuilder sb = new StringBuilder(var1);
		
		String var2 = sb.reverse().toString();
		
		if(var1.equalsIgnoreCase(var2)){
			System.out.println("THE STRING IS PALINDROME ");
		}
		else{
			System.out.println("THE STRING IS NOT A PALINDROME ");
			
		}

	}

}
