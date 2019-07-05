import java.text.NumberFormat;

public class CheckingAccount extends Account {
	
	private double fee;

	public CheckingAccount(double fee) {
		super();
		this.fee = fee;
	}

	public double getFee() {
		return (fee);
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public void subFee() {
		setBalance(getBalance() - fee);
	}
	
	public void balanceToString() {
		NumberFormat f = NumberFormat.getCurrencyInstance();
		System.out.println("Checking: " + f.format(getBalance()));
	}
	
	public String getStringFee() {
		NumberFormat f = NumberFormat.getCurrencyInstance();
		return f.format(fee);
	}

	
		
	}
	
	
	
	
	


