package Exsercise_Problems;

import java.util.Calendar;
import java.util.Scanner;

public class Day_Of_The_Week {
	
	public static String findDay(int day,int month ,int year) {
		
		Calendar calender = Calendar.getInstance();
		
		calender.set(year, month-1, day);  //THIS CALENDER AIN'T GEORGIAN SO WE HAVE TO -1 FROM THE MONTH
		
		int FindDay = calender.get(calender.DAY_OF_WEEK);
		
		switch(FindDay) {
		
		case 1 :
			return "SUNDAY";
		case 2 :
			return "MONDAY";
		case 3 :
			return "TUESDAY";
		case 4 :
			return "WEDNESDAY";
		case 5 :
			return "THURSDAY";
		case 6 :
			return "FRIDAY";
		case 7 :
			return "SATURDAY";
			
			default :
				return "INVALID OPTION!";
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
		Day_Of_The_Week obj = new Day_Of_The_Week();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t"+"*** WEEK-DAY FINDER ***"+"\t");
		System.out.println();
		
		System.out.print("ENTER THE DAY : ");
		
	    int day = sc.nextInt();
	    
	    System.out.print("ENTER THE MONTH : ");
		
		int month = sc.nextInt();
		
		System.out.print("ENTER THE YEAR : ");
		
		int year = sc.nextInt();
		
		System.out.print("THE DAY OF THE WEEK IS :"+obj.findDay(day, month, year));
		
		
		sc.close();

	}

}
