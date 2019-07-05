import java.util.Scanner;

public class StudentRegistrationApp {
	public static void main(String[]args) {
		System.out.println("Student Registration Form");
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter first name:          ");
			String firstName = sc.nextLine();
		
			System.out.println("Enter last name:          ");
			String lastName = sc.nextLine();
		
			System.out.println("Enter your birthdate:          ");
			int birthDate = sc.nextInt();
			
			String passWord = firstName + "*" + birthDate; 
			
		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + passWord);
		
		
	}

}
