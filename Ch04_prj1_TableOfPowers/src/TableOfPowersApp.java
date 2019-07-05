import java.util.Scanner;

public class TableOfPowersApp {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Squares and Cubes table");
			System.out.println();
			System.out.println("Enter an integer: ");
			
			int integer = sc.nextInt();
			String row = "";
			
			for (int x = 1; x <= integer; x++) {
				int squared = x * x;
				int cubed = x * x * x;
				row += x + "             " + squared + "             " + cubed + "\n";
			}
			
			System.out.println("Number        Squared        Cubed");
			System.out.println("=====        =======        =====");
			System.out.println(row);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
		}
		
	
	}
}
