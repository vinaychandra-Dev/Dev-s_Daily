import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person);

        person.setName("Bob");
        person.setAge(25);
        System.out.println(person);

        System.out.println("Enter the name and age of a new person:");

        Scanner scanner = new Scanner(System.in);

        String newName = scanner.nextLine();
        int newAge = scanner.nextInt();
        Person newPerson = new Person(newName, newAge);
        System.out.println("New Person Created: " + newPerson);
        scanner.close();


    }


}
