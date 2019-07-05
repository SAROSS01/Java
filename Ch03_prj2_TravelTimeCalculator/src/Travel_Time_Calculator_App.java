import java.util.Scanner;

public class Travel_Time_Calculator_App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) { 
			System.out.println("Welcome to the Travel Time Calculator");
			System.out.println();
			
			System.out.println("Enter miles: ");
			Double x = sc.nextDouble();
			
			System.out.println("Enter miles per hour: ");
			Double y = sc.nextDouble();
			
			int hours = (int) (x / y);
			double minutes = ((x % y)/y) * 60;
			
			System.out.println("Estimated travel time");
			System.out.println("-----------------------");
			System.out.println("Hours:  " + hours);
			System.out.println("Minutes:  " + (int) minutes);
			System.out.print("Continue? (y/n): ");
			choice = sc.next();			
			
			
			
			
			
		}
	}
		

}
