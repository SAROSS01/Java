import java.text.NumberFormat;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class TipCalculatorApp {
	static public void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		NumberFormat percent = NumberFormat.getPercentInstance();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Cost of meal: ");
			Double x = sc.nextDouble();
			
			String xAsString = Double.toString(x);
			BigDecimal mealCost = new BigDecimal(xAsString);
			
			BigDecimal tip15 = new BigDecimal(".15");
			BigDecimal tip15Amount = mealCost.multiply(tip15)
										.setScale(2, RoundingMode.HALF_UP);
			BigDecimal total15 = mealCost.add(tip15Amount);
			
			BigDecimal tip20 = new BigDecimal(".20");
			BigDecimal tip20Amount = mealCost.multiply(tip20)
											.setScale(2, RoundingMode.HALF_UP);
			BigDecimal total20 = mealCost.add(tip20Amount);
			
			BigDecimal tip25 = new BigDecimal(".25");
			BigDecimal tip25Amount = mealCost.multiply(tip25)
										.setScale(2, RoundingMode.HALF_UP);
			BigDecimal total25 = mealCost.add(tip25Amount);
			
			System.out.println(percent.format(.15));
			System.out.println("Tip amount: " + currency.format(tip15Amount));
			System.out.println("Total amount: " + currency.format(total15));
			System.out.println();
			System.out.println(percent.format(.20));
			System.out.println("Tip amount: " + currency.format(tip20Amount));
			System.out.println("Total amount: " + currency.format(total20));
			System.out.println();
			System.out.println(percent.format(.25));
			System.out.println("Tip amount: " + currency.format(tip25Amount));
			System.out.println("Total amount: " + currency.format(total25));
			System.out.println();
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
			
			
			
		}
		
				
		
	
	}
	}