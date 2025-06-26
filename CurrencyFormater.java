package Exsercise_Problems;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t *** CURRENCY-FORMATER *** ");
		
		System.out.println("ENTER THE NUMBER : ");
		
		Double num = sc.nextDouble();
		
		int choice=0;
		
		while(true) {
			
			if(choice==9) {
				
				System.out.println("\t EXIT'S!");
			}
			else {
				System.out.println("CHOOSE THE COUNTRY :");
				System.out.println("1: UNITED STATES");
				System.out.println("2: INDIA ");
				System.out.println("3: CHINA");
				System.out.println("4: FRANCE");
				System.out.println("5: JAPAN");
				System.out.println("6: KOREA");
				System.out.println("7: GERMANY");
				System.out.println("8: UNITED KINGDOM");
				System.out.println("9: EXIT!");
				
				choice = sc.nextInt();
				
				switch(choice) {
				
				case 1:
					NumberFormat USnumberformat = NumberFormat.getCurrencyInstance(Locale.US);
					String formatusd = USnumberformat.format(num);
					System.out.println(num+"IN USD : "+formatusd);
					break;
					
				case 2:
					Locale INDIA = new Locale("en", "INDIA");
					NumberFormat INnumberformat = NumberFormat.getCurrencyInstance(INDIA);
					String formatindia = INnumberformat.format(num);
					System.out.println(num+"IN INR : "+formatindia);
					break;
					
				case 3:
					NumberFormat CHnumberformat = NumberFormat.getCurrencyInstance(Locale.CHINA);
					String formatchina = CHnumberformat.format(num);
					System.out.println(num+"IN yuan : "+formatchina);
					break;
					
				case 4:
					NumberFormat FRnumberformat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
					String formatfrance = FRnumberformat.format(num);
					System.out.println(num+"IN EURO : "+formatfrance);
					break;
					
				case 5:
					NumberFormat JPnumberformat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
					String formatjapan = JPnumberformat.format(num);
					System.out.println(num+"IN YEN : "+formatjapan);
					break;
					
				case 6:
					NumberFormat KOnumberformat = NumberFormat.getCurrencyInstance(Locale.KOREA);
					String formatkorea = KOnumberformat.format(num);
					System.out.println(num+"IN WON : "+formatkorea);
					break;
					
				case 7:
					NumberFormat GMnumberformat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
					String formatgermany = GMnumberformat.format(num);
					System.out.println(num+"IN EURO : "+formatgermany);
					break;
					
				case 8:
					NumberFormat UKnumberformat = NumberFormat.getCurrencyInstance(Locale.UK);
					String formatuk = UKnumberformat.format(num);
					System.out.println(num+"IN POUND : "+formatuk);
					break;
					
					default : return;
					
					
				
				}
				
			}
			sc.close();
			
		}
	}

}
