import java.util.Scanner;
public class ContactApp {
	

	public static void main (String [] args) {
		String choice = "y";
		Scanner sc = new Scanner (System.in);
		
		
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		String aName = Console.getRequiredString(sc, "Enter first name: ");
		String bName =  Console.getRequiredString(sc, "Enter last name: ");
		String iiMail =  Console.getRequiredString(sc, "Enter email: ");
		String pphone =  Console.getRequiredString(sc, "Enter phone: ");


		System.out.println(Contact.displayContact(aName, bName, iiMail, pphone));
		choice = Console. getChoiceString(sc, "Continue? (y/n): ",
	            "y", "n");
        System.out.println();

		
		
		}

	}

}