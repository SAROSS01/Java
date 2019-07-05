import java.text.NumberFormat;

public class SavingAccount extends Account  {

	private double rate;
	private double payment;
	
	public SavingAccount(double rate) {
		super();
		this.rate = rate;
		this.payment = 0;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	public void addPayment() {
		setPayment(rate * getBalance());
		setBalance(getPayment() + getBalance());
	}
	
	public void balanceToString() {
		NumberFormat f = NumberFormat.getCurrencyInstance();
		System.out.println("Savings: " + f.format(getBalance()));
	}
	
	public String getStringPayment() {
		NumberFormat f = NumberFormat.getCurrencyInstance();
		return f.format(payment);
		
	}
	
	
	
	
	}


