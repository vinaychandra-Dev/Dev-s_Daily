package Data_Types;

import java.util.ArrayList;
import java.util.Scanner;

public class To_Do_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\t *** TO-DO-LIST *** ");
		
		ArrayList<String> al = new ArrayList<>();
		
		int choice=0 , position;
		String Task;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			if(choice == 5) {
				System.out.println("\t EXIT'S! ");
			}else {
			System.out.println("\t  *** TO-DO-LIST OPERATIONS ***  ");
			System.out.println(" 1 : ADD THE TASK'S");
			System.out.println(" 2 : VEIW THE TASK'S");
			System.out.println(" 3 : UPDATE THE TASK'S ");
			System.out.println(" 4 : DELETE THE TASK");
			System.out.println(" 5 : EXIT!");
			System.out.println();
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : System.out.print("\t ENTER THE POSITION : ");
			         position = sc.nextInt();
			         System.out.println("\t ENTER THE TASK : ");
			         Task = sc.nextLine();
			         al.add(position-1, Task);
			         System.out.println();
			         break;
			         
			case 2 : System.out.println("\t THE TASK'S IN THE LIST ");
			        for(int i=0;i<al.size();i++) {
			        	
			        	String var = al.get(i);
	
			        	System.out.println("\t"+(i+1)+" : "+var);
			        }
			        System.out.println();
			        break;
			        	
			case 3 : System.out.print("\t ENTER THE TASK POSITION : ");
			         position = sc.nextInt();
			         System.out.print("\t ENTER THE NEW COMMENT : ");
			         Task = sc.nextLine();
			         al.set(position-1, Task);
			         System.out.println("\t THE LIST UPDATED! ");
			         System.out.println();
			         break;
			        	
			case 4 : System.out.print("\t ENTER THE TASK POSITION : ");
			         position = sc.nextInt();
			         al.remove(position-1);
			         System.out.println("\t THE TASK DELETED! ");
			         System.out.println();
			         break;
			         
			         default :
			        	 return;
			         
			}
			}
			
			sc.close();
		}
		
	}

}
