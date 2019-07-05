import java.util.Scanner;

public class RectangleCalculator {
	public static void main(String[]args) {
		// display a welcome message
		System.out.println("Welcome to the rectangular area and perimeter calculator");
		System.out.println(); // print a blank line
	
		// get the input from the user
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			
			System.out.print("Enter Width: ");
			double width = sc.nextDouble();
			
			double perimeter = 2 * length + 2 * width;
			double area = length * width;
			
			String message =	"Area: " + area + "\n" +
								"Perimeter: " + perimeter;
			System.out.println(message);
			
			System.out.print("Continue? y/n: ");
			choice = sc.next();
			System.out.println();
		}
		
		
	}

}
