//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Create Employee objects
        Employee emp1 = new Employee("Alice", 30, "Developer");
        Employee emp2 = new Employee("Bob", 40, "Manager");
        Employee emp3 = new Employee("Charlie", 25, "Designer");

        // Print Employee details
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // Take input for n employees from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employee records do you want to store? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee #" + (i + 1) + ":");
            employees[i] = Employee.inputEmployeeFromUser();
        }
        System.out.println("\nEmployee details entered:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}