import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
				
				while (choice.equalsIgnoreCase("y")) {
					System.out.println("Welcome to the temperature Converter");
					System.out.print("Enter degrees in Fahrenheit: ");
					Double userDegrees = sc.nextDouble();
					
					Double rtrnCelsius = (double) Math.round(((userDegrees - 32) * 5/9) * 100)/100;
					System.out.print("Degrees in Celsius: " + rtrnCelsius +"\n");
				
					System.out.print("Continue? (y/n) ");
					choice = sc.next();
					
					
					
					
				}
	}

}
