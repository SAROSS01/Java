import java.util.Scanner;

public class AccountBalanceApp {
	
	public static void main(String[]args) {
		CheckingAccount checking = new CheckingAccount(1.00);
		SavingAccount savings = new SavingAccount(.01);
		displayBalances(checking,savings);
	}
	
	public static void displayBalances(CheckingAccount checking, SavingAccount savings) {
		System.out.println("Starting Balances");
		checking.balanceToString();
		savings.balanceToString();
		displayMenu1(checking, savings);
	}
	
	public static void displayMenu1(CheckingAccount checking, SavingAccount savings) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		checking.subFee();
		System.out.println("Enter the transactions for the month\n\n");
		while(choice.equalsIgnoreCase("y")) {
			String tranType = Console.getChoiceString(sc, "Withdrawl or deposit? (w/d):", "w", "d");
			String accountType = Console.getChoiceString(sc, "Checking or Savings? (c/s):", "c", "s");
			double amount = Console.getDouble(sc, "Amount?: ");
			applytransaction(checking, savings, tranType, accountType, amount);
			choice = Console.getChoiceString(sc, "Continue? (y/n): ", "y", "n");
			System.out.println("\n\n");
		}
		displayMenu2(checking, savings);
		System.out.println();
		System.out.println();
		displayMenu3(checking, savings);
		
		
	
		
	}
	
	public static void displayMenu2(CheckingAccount checking, SavingAccount savings){
		System.out.print("Monthly Payments and Fees\n"
						+ "Checking fee:			" + checking.getStringFee() + "\n"
						+ "Savings interest payment " + savings.getStringPayment());
	}
	
	public static void applytransaction(CheckingAccount checking, SavingAccount savings, String tranType, String accountType, double amount) {
		if(tranType.equalsIgnoreCase("w")) {
			if(accountType.equalsIgnoreCase("c")) {
				checking.withdraw(amount); 
			} else {
				savings.withdraw(amount);
				savings.addPayment();
			}
			
		} else { 
			if(accountType.equalsIgnoreCase("c")) {
				checking.deposit(amount);
			} else {
				savings.deposit(amount);
				savings.addPayment();
			}
		}
	}
	
	public static void displayMenu3(CheckingAccount checking, SavingAccount savings) {
		System.out.println("Final Balances");
		checking.balanceToString();
		savings.balanceToString();
	}
}
