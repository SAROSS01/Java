import java.util.Scanner;

public class Computation {
	
	
	public static Double getAdd() { 
		Scanner sc = new Scanner(System.in);
		Double x = Console.getDouble(sc, "Enter a number: ");
		Double y = Console.getDouble(sc, "Enter a number: ");
		Double result = x + y;
		System.out.println(x + " + " + y + " = " + result );
		return result;
	}
	
	public static Double getSubtract() {
		Scanner sc = new Scanner(System.in);
		Double x = Console.getDouble(sc, "Enter a number: ");
		Double y = Console.getDouble(sc, "Enter a number: ");
		Double result = x - y;
		System.out.println(x + " - " + y + " = " + result);
		return result;
	}
	
	public static  Double getMultiply() {
		Scanner sc = new Scanner(System.in);
		Double x = Console.getDouble(sc, "Enter a number: ");
		Double y = Console.getDouble(sc, "Enter a number: ");
		Double result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		return result;
	}
	
	public static Double getDivi() {
		Scanner sc = new Scanner(System.in);
		Double x = Console.getDouble(sc, "Enter a number: ");
		Double y = Console.getDouble(sc, "Enter a number: ");
		Double result = x / y;
		System.out.println(x + " / " + y + " = " + result);
		return result;
	}
}