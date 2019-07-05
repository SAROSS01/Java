import java.util.Scanner;

public class PersonManagerApp {
	static public void main (String[]args) {
		System.out.println("Welcome to the Person Manager");
		System.out.println();
		
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String x = Console.getChoiceString("Create customer or employee? ", "c", "e");
			getUserInfo(sc, x);
			choice = Console.getChoiceString("Would you like to continue? ", "y", "n");
			
			
			
		}
	}
static public void getUserInfo(Scanner sc, String x) {
	if(x.equalsIgnoreCase("c")) {
		System.out.print("First name: ");
		String first = sc.nextLine();
		
		System.out.print("Last name: ");
		String last = sc.nextLine();
	
		System.out.println("Customer number: ");
		String customerN = sc.nextLine();
		
		Customer c = new Customer(first, last, customerN);
		System.out.println(c.toString());
	} else { 
		System.out.print("First name: ");
		String first = sc.nextLine();
		
		System.out.print("Last name: ");
		String last = sc.nextLine();
		
		System.out.print("SSN: ");
		String ssn = sc.nextLine();
		
		Employee e = new Employee(first, last, ssn);
		System.out.println(e.toString());
	}
	
	
	
	}
}
