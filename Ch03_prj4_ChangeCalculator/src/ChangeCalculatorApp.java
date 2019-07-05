import java.util.Scanner;

public class ChangeCalculatorApp {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0;
			
			System.out.println("Enter number of cents (0-99): ");
			int cents1 = sc.nextInt();
			
			int q = cents1 / 25;
			quarter += q;
			int cents2 = cents1 % 25;
			
			int d = cents2 / 10;
			dime += d;
			int cents3 = cents2 % 10;
			
			int n = cents3 / 5;
			nickel += n;
			int cents4 = cents3 % 5;
			
			int p = cents4 / 1;
			penny += p;
			
			System.out.println("Quarters: " + quarter);
			System.out.println("Dimes: " + dime);
			System.out.println("Nickles: " + nickel);
			System.out.println("Pennies: " + penny);
			System.out.println();
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
			
		}
		
	
	}
}
