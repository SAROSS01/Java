import java.util.Scanner;
import java.text.NumberFormat;
public class FactorialCalculatorApp {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) { 
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();
		System.out.print("Enter an integer that's greater than 0 and less than 25: ");
		int x = sc.nextInt();
		long f = 1;
			 for(int i = 1; i <= x; i++) {
				  f = f * i;
				   
			}
		NumberFormat number = NumberFormat.getNumberInstance();	
		System.out.println(number.format(f));
		System.out.println("Would you like to continue? (y/n) ");
		choice = sc.next();
		
		}
	}
}
