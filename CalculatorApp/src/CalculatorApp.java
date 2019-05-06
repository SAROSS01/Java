import java.util.Scanner;

public class CalculatorApp {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
		System.out.println("Calculator");
		System.out.println();
		System.out.println("Operations \n===========\n Additon: +\n Subtraction: -\n Multiplication: *\n Division: /\n");
		System.out.print("Enter operation: ");
		String operation = sc.next();
		
		switch (operation) {
		case "+":
			Computation.getAdd();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			break;
		case "-":
			Computation.getSubtract();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			break;
		case "*":
			Computation.getMultiply();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			break;
		case "/":
			Computation.getDivi();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			break;
		}
		
		if (choice.equalsIgnoreCase("n")) {
			
		}
	}
	}
}
