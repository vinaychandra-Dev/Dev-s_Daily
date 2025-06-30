package Exsercise_Problems;

import java.util.Scanner;

public class Anagrams {
	
	static Boolean IsAnagram(String a , String b) {
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		Boolean result = false;
		
		StringBuilder sb = new StringBuilder(b);
		
		if(a.length() == b.length()) {
			
			for(int i=0;i<a.length();i++) {
				for(int j=0;j<sb.length();j++) {
					
					if(a.charAt(i)==sb.charAt(j)) {
						sb.deleteCharAt(j);
						if(i==a.length()-1 && sb.length()==0) {
							result = true;
							break;
							
						}
						break;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
	

		System.out.println("*** ANAGRAM CHECKER ***");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRINGS :");
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		Boolean result = IsAnagram(a , b);
		System.out.println((result) ? "ANAGRAM " : " NOT ANAGRAM ");
		
	}

}
