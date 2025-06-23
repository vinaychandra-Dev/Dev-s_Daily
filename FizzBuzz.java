package Exsercise_Problems;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE NUMBER :");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			if(i/3==0 && i/5==0 )System.out.println("FizzBuzz!");
			else if(i/3==0 && i/5!=0)System.out.println("Fizz!");
			else if(i/3!=0 && i/5==0)System.out.println("Buzz!");
			else System.out.println("THE NUMBER IS NOT MULTIPLE BY :"+i);
			
		}
		
		sc.close();
	}

}
