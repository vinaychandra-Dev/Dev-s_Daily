package streams;

import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
	   final String arr[] = {"ROCK","PAPER","SCISSORS"};
	   
	   int ROCK = 0;
	   int PAPER = 1;
	   int SCISSORS =2;
	   
	   System.out.println("ROCK PAPER SCISSORS ::"+"\n");
		
		System.out.println("ROCK[0]      :"+"\n" +"PAPER[1]     :"+"\n"+"SCISSORS[2]  :");
		
		int response = scanner.nextInt();
		
		int index = random.nextInt(0, arr.length);
		
		System.out.print("THE COMPUTER CHOICE : " );
		System.out.print(arr[index]+"\n");
		
		if(response> index && response==ROCK && index ==SCISSORS) {
			
			System.out.println("YOU WON (ROCK BEATS SCISSORS)");
			
		}else if(response >index && response==PAPER && index==ROCK){
			
			System.out.println("YOU WON (PAPER BEATS ROCK)");
			
		}else if(response>index && response==SCISSORS && index==PAPER) {
			System.out.println("YOU WON (SCISSORS BEATS PAPER)");
		}else if(response<index && response==ROCK && index==PAPER){
			System.out.println("YOU LOOSE ");
		}else if(response<index && response==PAPER && index==SCISSORS) {
			
			System.out.println("YOU LOOSE");
		}else if(response<index &&response==SCISSORS && index==ROCK) {
			
			System.out.println("YOU LOOSE");
		}
		else if(response==index) {
			System.out.println("DRAW  :RETRY!!!!");
		}
		scanner.close();
	}

}
