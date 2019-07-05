
public class Account implements Balanceable, Withdrawable, Depositable {
	
	private double balance;
	

	public Account() {
		this.balance = 1000;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
		
	}

	@Override
	public double getBalance() {
		
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
		
	}
	
	

}
