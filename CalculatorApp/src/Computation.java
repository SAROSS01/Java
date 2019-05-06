import java.util.Scanner;

public class Computation {
	
	
	public static void getAdd() { 
		Scanner sc = new Scanner(System.in);
		Double x = Console.getDouble(sc, "Enter a nuber: ");
		Double y = Console.getDouble(sc, "Enter a nuber: ");
		Double result = x + y;
		System.out.println(x + " + " + y + " = " + result );
	}
	
	public static void getSubtract() {
		Scanner sc = new Scanner(System.in);
		Double x = Console.getDouble(sc, "Enter a nuber: ");
		Double y = Console.getDouble(sc, "Enter a nuber: ");
		Double result = x - y;
		System.out.println(x + " - " + y + " = " + result);
	}
	
	public static void getMultiply() {
		Scanner sc = new Scanner(System.in);
		Double x = Console.getDouble(sc, "Enter a nuber: ");
		Double y = Console.getDouble(sc, "Enter a nuber: ");
		Double result = x * y;
		System.out.println(x + " * " + y + " = " + result);
	}
	
	public static void getDivi() {
		Scanner sc = new Scanner(System.in);
		Double x = Console.getDouble(sc, "Enter a nuber: ");
		Double y = Console.getDouble(sc, "Enter a nuber: ");
		Double result = x / y;
		System.out.println(x + " / " + y + " = " + result);
	}
}