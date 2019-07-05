import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal; 
import java.math.RoundingMode;
public class InterestCalculatorApp {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Welcome to the interest calculator");
		System.out.println();
		System.out.print("Enter loan amount: ");
		Double x = sc.nextDouble();
		System.out.print("Enter interest : ");
		Double y = sc.nextDouble();
		
		Double loanAmount = x;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(2);
		String loanAmountString = currency.format(loanAmount);
		
		Double interestRate = y;
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(3);
		String interestRateString = percent.format(interestRate);
		
		Double interest = x * y;
		String interestAsString = Double.toString(interest);
		BigDecimal interestAmount = new BigDecimal(interestAsString);
		interestAmount = interestAmount.setScale(2, RoundingMode.HALF_UP);
		NumberFormat currency2 = NumberFormat.getCurrencyInstance();
		String finalInterestAmount = currency2.format(interestAmount);
		
		System.out.println("Loan amount: " + loanAmountString);
		System.out.println("Interest rate: " + interestRateString);
		System.out.println("Interest: " + finalInterestAmount);
		System.out.println();
		System.out.print("Continue? (y/n)");
		choice = sc.next();
		
		
		
		
		
		
		
		
		
		
		
		}
	}

}
