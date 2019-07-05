import java.util.Scanner;

public class AreaCalculatorApp {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Welcome to the Area Calculator");
		System.out.println();
		System.out.println("Calculate area of a circle, square, or rectangle? (c/s/r): ");
		String userShape = sc.nextLine();
		System.out.println();
		
		if (userShape.equalsIgnoreCase("c")) {
			System.out.print("Enter radius: ");
			Double rad = sc.nextDouble();
			Circle circle1 = new Circle(rad);
			System.out.println("The area of the Circle you entered is " + circle1.getArea());
		} else if (userShape.equalsIgnoreCase("s")) {
			System.out.println("Enter width: ");
			Double sW = sc.nextDouble(); 
			Square square1 = new Square(sW,sW);
			System.out.println("The area of the Square you entered is " + square1.getArea());
		} else {
			System.out.print("Enter width: ");
			Double rW = sc.nextDouble();
			System.out.print("Enter height: ");
			Double rH = sc.nextDouble();
			Rectangle rectangle1 = new Rectangle(rW,rH);
			System.out.println("The area of the Rectangle you entered is " + rectangle1.getArea() );
		}   
		
		System.out.print("Continue? (y/n): ");
		choice = sc.nextLine();
		}
	}
}
