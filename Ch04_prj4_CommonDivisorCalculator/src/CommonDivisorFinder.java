import java.util.Scanner;

public class CommonDivisorFinder {
	static public void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Greatest Common Divisor Finder");
			System.out.println();
			System.out.print("Enter first number: ");
			int x = sc.nextInt();
			System.out.print("Enter the second number: ");
			int y = sc.nextInt();
			int divisor = 0;
			
			while (x != 0) {
				while (y >= x) {
					y -=x;
				}
			divisor = x;
			x = y;
			y = divisor;
		}	
		
		 // display result
        System.out.println("Greatest common divisor: " + divisor);
        System.out.println();

        // see if the user wants to continue
        System.out.print("Continue? (y/n): ");
        choice = sc.next();
        System.out.println();
    }
}

}
		
		
		
		
		
	
	


